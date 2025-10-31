package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    //显示全部用户
    @GetMapping("/")
    public String viewHomePage(Model model){
        List<User> listUsers = userService.getAllUsers();
        model.addAttribute("listUsers", listUsers);
        return "index";
    }

    //显示添加用户表单
    @GetMapping("/showNewUserForm")
    public String showNewUserForm(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "new_user";
    }

    //保存新用户
    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("user") User user){
        userService.saveUser(user);
        return "redirect:/";
    }

    //显示编辑用户表单
    @GetMapping("/showFormForUpdate/{id}")
        public String showForUpdate(@PathVariable(value = "id") long id, Model model){
            User user = userService.getUserById(id);
            model.addAttribute("user", user);
            return "update_user";
        }
    

    //删除用户
    @GetMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable(value = "id") long id){
        userService.deleteUser(id);
        return "redirect:/";
    }
}
