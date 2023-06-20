
package com.example.demo.controller;

//como agreglar el problema de cros: https://www.youtube.com/watch?v=ZkSO_wW2Wuw

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping({""})
public class Controller {
    
    @GetMapping("")
    public String holamundo() {
        return "Ejemplo, hola mundo";
    }
    
}
