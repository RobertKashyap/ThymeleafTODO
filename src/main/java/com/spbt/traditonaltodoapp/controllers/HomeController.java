package com.spbt.traditonaltodoapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spbt.traditonaltodoapp.services.TodoItemService;

@Controller
public class HomeController {

        @Autowired
        private TodoItemService todoItemService;
        

        @GetMapping("/")
        public ModelAndView index(){
            //UI object of spring MVC
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.addObject("todoItems", todoItemService.getAll());
            return modelAndView;// look for templates index.html
        }
}
