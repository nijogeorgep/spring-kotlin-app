package com.cloudwalkers.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HomeController {

    @GetMapping("/")
    fun helloKotlin(): String {
        return "redirect:index"
    }
}
