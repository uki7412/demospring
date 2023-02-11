package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.bean.Exebean;

@Controller
public class DemoController {

@GetMapping("/hello")
    public String hello() {
        return "test";
    }

    @GetMapping("/demos")
    public String demos(Model model) {
        var exes = List.of(
            new Exebean(1,"早歩き(４メッツ)",4,"怪我に注意してください"),
            new Exebean(2,"テレビを観ながら踏み台昇降(５メッツ)",5,"怪我に注意してください")
        );
        model.addAttribute("exes", exes);
        return "list";
    }
    
}
