package ru.vicpas.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class FilmController {

    @GetMapping("/")
    public String getIndex(){
        return "films";
    }

//    @RequestMapping("/film")
//    public String getWelcome(){
//        return "editPage";
//    }
//
//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public ModelAndView allFilms() {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("films");
//        return modelAndView;
//    }
//
//
//
//    @RequestMapping(value = "/edit", method = RequestMethod.GET)
//    public ModelAndView editPage() {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("editPage");
//        return modelAndView;
//    }
}