package com.pm18077.crud.crud.users.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pm18077.crud.crud.users.entities.User;
import com.pm18077.crud.crud.users.repository.UserRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping("/")
public class PageUserController {
    
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public String listUsers(Model model){
        model.addAttribute("users", userRepository.findAll());
        return "list-users";
    }

    @GetMapping("/nuevo")
    public String formularioNuevoUsuario(Model model){
        model.addAttribute("usuario", new User());
        return "form-user";
    }

    @PostMapping("/nuevo")
    public String guardarUser(@ModelAttribute User user) {
        userRepository.save(user);
        return "redirect:/users";
    }
    
}