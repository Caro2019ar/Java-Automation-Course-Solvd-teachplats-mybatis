package org.teachplats.controller;

import org.teachplats.service.UserServiceImp;

public class UserController {
    private final static UserServiceImp userServiceImp = new UserServiceImp();

    public static void main(String[] args) {
        // userServiceImp.listAll();//ok
//        userServiceImp.searchById(6l); //ok
        userServiceImp.deleteById(4l);//  Cannot delete or update a parent row: a foreign key constraint fails (`teachdb`.`UsersCourses`, CONSTRAINT `fk_Users_has_Courses_Users1` FOREIGN KEY (`users_id`) REFERENCES `Users` (`id`))
    }
}
