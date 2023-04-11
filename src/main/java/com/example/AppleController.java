/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;   

/**
 *
 * @author jithin123
 */
@RestController
@RequestMapping("message")
public class AppleController {
    
    @GetMapping("{id}")
    public String getMessage(@PathVariable int id){
        return "Message from apple : " + id;
    }
    
}
