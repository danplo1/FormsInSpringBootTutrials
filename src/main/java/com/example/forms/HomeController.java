package com.example.forms;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Daniel_D'AGE on 07.06.2018.
 */
@Controller
public class HomeController {


    //localhost:8080

    @GetMapping("/")
    public String home(){

    return "home";

    }

    @GetMapping("/generate")
    public String generate (@RequestParam String name,
                            @RequestParam String surname,
                            ModelMap modelMap){
        // przekazanie do widoku HTML
        modelMap.addAttribute("name", name);
        modelMap.addAttribute("surname", surname);

        return "generate";

    }

}
