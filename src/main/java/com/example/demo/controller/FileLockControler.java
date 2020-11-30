package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Paths;

@Controller
public class FileLockControler {
    @GetMapping("/")
    public String show() {
        return "home";
    }
    @PostMapping("/")
    public String lock(@RequestParam("file") MultipartFile file, Model model ) throws IOException {

        String realpath= Paths.get(file.getResource().getURI()).toAbsolutePath().toString();
     // Suppose there is file name bd.png at D drive, so
        // I need location like D:\\bd.png
        System.out.println(realpath);
        return "home";
    }
}
