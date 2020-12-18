package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PostController {

    @GetMapping(value = "/post")
    public String index(){
        return "post";
    }

}
