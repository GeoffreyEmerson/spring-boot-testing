package com.teamtreehouse.giflib.controller;

import com.teamtreehouse.giflib.model.Gif;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@Controller
public class GifController {

    @RequestMapping("/")
    public String listGifs() {
        return "home"; // used by thymeleaf view resolver to find html file
    }

    @RequestMapping("/gif")
    public String gifDetails(ModelMap modelMap) {
        Gif gif = new Gif("compiler-bot", LocalDate.of(2015,2,13), "Chris Ramacciotti", true);
        modelMap.put("gif",gif);
        return "gif-details";
    }

}
