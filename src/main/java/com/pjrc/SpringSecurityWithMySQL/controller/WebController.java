package com.pjrc.SpringSecurityWithMySQL.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
   
    @RequestMapping(value={"/","home"})
        public String home(){
            return "home";
        }
   
    @RequestMapping(value={"/teacher"})
    public String teacher(){
        return "teacher";
    }
    
    @RequestMapping(value={"/student"})
    public String student(){
        return "student";
    }
  
    @RequestMapping(value="/admin")
    public String admin(){
        return "admin";
    }
   
    @RequestMapping(value={"/login"})
    public String login(){
        return "login";
    }
   
   
    @RequestMapping(value="/403")
    public String Error403(){
        return "403";
    }
}