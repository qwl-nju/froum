package com.qwlnju.forum.controller;

import com.qwlnju.forum.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
public class IndexController {

    @RequestMapping(path = {"/","/index","/home"})
    public  String index(){
        return "home";
    }

    @RequestMapping(path = {"/profile/{id}"})
    @ResponseBody
    public String profile(@PathVariable("id") String id, @RequestParam(value="key") String key){
        return "input is id = " + id + "key =" + key;
    }

    @RequestMapping(path = {"/template"})
    public  String template(Model model){
        model.addAttribute("var","qw");
        List<String> list = Arrays.asList(new String[]{"q1","q2","q3"});
        model.addAttribute("list",list);
        User user = new User("Lee");
        model.addAttribute("user",user);
        return "template";
    }
}
