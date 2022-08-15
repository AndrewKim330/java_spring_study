package dataSelector.web.userInfo;

import dataSelector.domain.userInfo.UserInfo;
import dataSelector.domain.userInfo.dao.UserInfoDao;
import dataSelector.domain.userInfo.dao.mysql.UserInfoMysqlDao;
import dataSelector.domain.userInfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("db.properties");

        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("12345");
        userInfo.setPassword("11134234");
        userInfo.setUserName("Kim");

        UserInfoDao userInfoDao = null;

        if(dbType.equals("ORACLE")){
             userInfoDao = new UserInfoOracleDao();
        } else if (dbType.equals("MYSQL")) {
            userInfoDao = new UserInfoMysqlDao();
        }
        else {
            System.out.println("db error");
            return;
        }

        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);


    }
}
