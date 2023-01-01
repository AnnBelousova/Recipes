package com.recipesite.recipes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class infoController {

    @GetMapping("/")
    public String appRunStr(){
        return "App is running!";
    }

    @GetMapping("/info")
    public String myInfo(){
        String strInfo = "Анна Белоусова," +
                "Проект: Рецепты," +
                "В проекте будет список рецептов," +
                "Дата создания:01.01.2023";
        return strInfo;
    }
}
