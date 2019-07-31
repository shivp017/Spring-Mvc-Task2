package com.stackroute.controller;

import com.stackroute.config.UserConfig;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @RequestMapping(value = "/")
    public String greeting(ModelMap map){
        return "index";
    }
    @RequestMapping(value = "/")
    public String success(@RequestParam("username")String username,@RequestParam("password")String passsword, ModelMap map){
        UserConfig userConfig=new UserConfig();
userConfig.getClass();
        map.addAttribute("user",userConfig);
        return "success";
    }

}