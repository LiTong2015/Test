package com.wyhello.chat.dao;

import java.util.List;

import com.wyhello.chat.pojo.User;

public interface UserDAO{
	
	/**
	*  ��User�����е����ݱ��浽���ݿ�
	*  @param user ��װ���û����ݿ�Ķ���
	*/
	public void save(User user);

	public void delete(Integer id);

	public void update(User user);

	public List<User> getUserAll();

	public User getUserById(Integer id);
	/**
	 * ��֤�û����
	 * @param username �û���
	 * @param password ����
	 * @return �Ϸ����û�����
	 */
	public User validateUser(String username, String password);

}