package ru.khegay.springMVC.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name",required = false) String name,
                            @RequestParam(value = "surname",required = false) String surname){

        if(name==null && surname==null){}else {
        System.out.println("Hello "+name+" "+surname);}

        return "first/hello";
    }

    @GetMapping("/goodbuy")
    public String goodBuyPage(){
        return "first/goodbuy";
    }
}
