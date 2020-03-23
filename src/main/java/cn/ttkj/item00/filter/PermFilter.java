package cn.ttkj.item00.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;

import cn.ttkj.item00.util.JwttUtil;
import io.jsonwebtoken.Claims;

@WebFilter
public class PermFilter implements Filter{

	private static String URI = "URI";
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		
		HttpServletResponse httpServletResponse = (HttpServletResponse) response;
		
		System.out.println(URI+": "+httpServletRequest.getRequestURI()); //打印请求地址
		
		String token = httpServletRequest.getHeader("token"); //获取token
		System.out.println("token: "+ token);
		
		Claims claims = JwttUtil.parseJwt(token);  
		
		if(claims==null) {
			httpServletResponse.sendError(HttpStatus.UNAUTHORIZED.value());
		}else {
			chain.doFilter(httpServletRequest, httpServletResponse);
		}
		

	}

	
	
}
