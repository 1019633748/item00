package cn.ttkj.item00.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class LoginController{

    @PostMapping("login")
    public String login(String username,String password){
        System.out.println(200);
        return "123";
    }

}