package com.example.gticslab420200814.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

@RequestMapping(value="/home",method= RequestMethod.GET)
public class HomeController {

    @GetMapping(value="")
    public String home(){
        return "home";
    }






}
