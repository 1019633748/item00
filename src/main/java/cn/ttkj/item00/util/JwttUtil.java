package cn.ttkj.item00.util;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwttUtil {

    private static String KEY_STRING = "AAAABBBBBBBBDCCCCC";//key

    private static Long TTLMILLIS = 1000 * 60l *60;//TTL

    public static String createJwt(String userId,String role){
        SignatureAlgorithm sa = SignatureAlgorithm.HS256;
        long curMillis = System.currentTimeMillis();
        Map<String,Object> claims = new HashMap<String,Object>();
        claims.put("userid", userId);
        claims.put("role", role);
        String jwt = Jwts.builder()
            .setClaims(claims)
            .signWith(sa, KEY_STRING)
            .setExpiration(new Date(curMillis+TTLMILLIS))
            .compact();
        return jwt;
    }

    public static Claims parseJwt(String jwt){
        Claims c = null;
        try {
            c = Jwts.parser().setSigningKey(KEY_STRING).parseClaimsJws(jwt).getBody();
        } catch (Exception e) {
            
        }
        return c;
    }

	/*
	 * public static void main(String[] args) {
	 * System.out.println(createJwt("userId", "role")); }
	 */
}