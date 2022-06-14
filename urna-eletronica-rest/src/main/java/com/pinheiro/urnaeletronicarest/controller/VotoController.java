package com.pinheiro.urnaeletronicarest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VotoController {

    @GetMapping(path = "/api/statusVoto")

    public String check(){
        return "online";
    }

}
