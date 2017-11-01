package com.qwlnju.froum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController {

    @RequestMapping(path = {"/","/index"})
    public  String index(){
        return "index";
    }

    @RequestMapping(path = {"/profile/{id}"})
    @ResponseBody
    public String profile(@PathVariable("id") String id, @RequestParam(value="key") String key){
        return "input is id = " + id + "key =" + key;
    }
}