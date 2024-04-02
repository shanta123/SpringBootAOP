package org.example.service;

import org.example.Beans.UserConfig;

public class UserService {
    UserConfig userConfig;

    //Create a Bean by injecting in Default constructor
    public UserService(UserConfig userConfig){
        this.userConfig = userConfig;
    }
}
