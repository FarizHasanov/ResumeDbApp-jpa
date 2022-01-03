package com.mycompany.main;

import com.company.dao.inter.UserDaoInter;
import com.company.entity.User;

public class Main {

    public static void main(String[] args) throws Exception {
        UserDaoInter dao = Context.instanceUserDao();
        dao.removeUser(8);
    }
}
