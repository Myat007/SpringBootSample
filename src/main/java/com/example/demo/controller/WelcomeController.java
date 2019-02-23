/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Myat Min
 */
@Controller
public class WelcomeController {
    @GetMapping("/welcome")
    @ResponseBody
    public String welcome(){
        return "Welcome Spring Boot from Net Bean";
    }
    
}
