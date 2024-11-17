package cn.tulingxueyuan.dao.impl;

import cn.tulingxueyuan.dao.IUserDao;

public class MysqlUserDao implements IUserDao {

  public MysqlUserDao() {
    System.out.println("MysqlUserDao已加载");
  }
  @Override
  public void getUser() {
    System.out.println("mysql user");
  }
}
