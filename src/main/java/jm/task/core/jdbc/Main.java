package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Ivan","Beliy", (byte) 26);
        userService.saveUser("Vadim","Ponomarenko", (byte) 35);
        userService.saveUser("Petr","Antonov", (byte) 45);
        userService.saveUser("Artem","Novak", (byte) 15);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();

        Util.closeCon(UserDaoJDBCImpl.getConnection());
    }
}
