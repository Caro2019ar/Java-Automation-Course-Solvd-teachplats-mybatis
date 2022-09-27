package org.teachplats.controller;

import org.teachplats.service.UserServiceImp;

public class UserController {
    private final static UserServiceImp userServiceImp = new UserServiceImp();

    public static void main(String[] args) {
        userServiceImp.listAll();//ok
    }
}
