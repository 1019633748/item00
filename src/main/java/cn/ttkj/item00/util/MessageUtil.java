package cn.ttkj.item00.util;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MessageUtil {

	private String code;
	
	private String msg;
	
	public MessageUtil msg(String code,String msg) {
		return new MessageUtil(code, msg);
	}
	
}
