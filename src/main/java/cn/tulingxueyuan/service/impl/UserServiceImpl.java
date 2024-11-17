package cn.tulingxueyuan.service.impl;

import cn.tulingxueyuan.dao.IUserDao;
import cn.tulingxueyuan.service.IUserService;

public class UserServiceImpl  implements IUserService {
  private IUserDao dao;

  @Override
  public void getUser() {
    dao.getUser();
  }

  public void setDao(IUserDao dao) {
    this.dao = dao;
  }
}
