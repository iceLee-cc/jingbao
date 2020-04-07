package com.iflytek.controller;

import com.iflytek.domain.User;
import com.iflytek.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/getUser")
    public String SelectAllUser(Model model){
        List<User> list=userService.selectAllUser();
        System.out.println(list);
        model.addAttribute("list",list);
        return  "showAllUser";
    }
    @RequestMapping("/insertStu")
    public String insertStu(User user){
        return "insertUser";
    }
    @RequestMapping("/addUser")
    public String insertUser(User user){
        userService.addStu(user);
        return "success";
    }
    @RequestMapping("/delUser")
    public String deleteUser(int id){
        userService.delStu(id);
        return "success";
    }
    @RequestMapping("/updateUser")
    public String updateUser(User user,Model model,@RequestParam(value = "id", required = true) int id){
        User user1=userService.selectStuById(id);
        model.addAttribute("user",user1);
        return "updateUser";
    }
    @RequestMapping("/doupdateUser")
    public String doupdate(User user){
        System.out.println("111111"+user);
        userService.updateUser(user);
        System.out.println("222222"+user);
        return "success";
    }
}
