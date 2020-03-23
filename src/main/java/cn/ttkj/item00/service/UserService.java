package cn.ttkj.item00.service;

import cn.ttkj.item00.model.User;
import cn.ttkj.item00.util.MessageUtil;

public interface UserService {

	/**
	 * 登录
	 * @param param
	 * @return
	 */
	MessageUtil login(String... param);
	
	
	/**
	 * 注册
	 * @param user
	 * @return
	 */
	User register(User user);
	
	
	
	
}
