package cn.tulingxueyuan.dao.impl;

import cn.tulingxueyuan.dao.IUserDao;

public class OracleUserDao implements IUserDao {

  public OracleUserDao() {
    System.out.println("OracleUserDao已加载");
  }

  @Override
  public void getUser() {
    System.out.println("oracle user");
  }
}
