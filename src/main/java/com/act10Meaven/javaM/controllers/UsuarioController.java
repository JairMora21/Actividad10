package com.act10Meaven.javaM.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @RequestMapping("/prueba")
    public  String prueba(){
        return "prueba";
    }
}
