package com.wyhello.chat.dao;

import java.util.List;

import com.wyhello.chat.pojo.User;

public interface UserDAO{
	
	/**
	*  把User对象中的数据保存到数据库
	*  @param user 封装了用户数据库的对象
	*/
	public void save(User user);

	public void delete(Integer id);

	public void update(User user);

	public List<User> getUserAll();

	public User getUserById(Integer id);
	/**
	 * 验证用户身份
	 * @param username 用户名
	 * @param password 口令
	 * @return 合法的用户对象
	 */
	public User validateUser(String username, String password);

}