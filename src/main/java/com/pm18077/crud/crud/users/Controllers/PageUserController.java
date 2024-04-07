package com.pm18077.crud.crud.users.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PageUserController {
    
    @GetMapping("/users")

    public String listUsers(Model model){
        return "list-users";
    }
    
}