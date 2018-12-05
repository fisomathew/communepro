package com.commune.communepro.pboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/pboard")
public class PBoardController {

    @RequestMapping("/user")
    public ModelAndView userIndex(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user/user_index.html");
        return modelAndView;
    }


}
