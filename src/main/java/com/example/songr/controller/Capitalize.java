package com.example.songr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Locale;

@Controller
public class Capitalize {
        @GetMapping("/Capitalize/{text}")
        public static String CapitalizeController(@PathVariable(value="text") String text , Model modelOne) {
           modelOne.addAttribute("upper",text.toUpperCase());
            return "Capitalize";
        }
    }
