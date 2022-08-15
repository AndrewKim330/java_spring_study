package dataSelector.domain.userInfo.dao.mysql;

import dataSelector.domain.userInfo.UserInfo;
import dataSelector.domain.userInfo.dao.UserInfoDao;

public class UserInfoMysqlDao implements UserInfoDao {

    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into MySQL DB userID = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update into MySQL DB userID = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete from MySQL DB userID = " + userInfo.getUserId());
    }
}
