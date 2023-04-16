package org.example.mymavenassignment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebAppController {

    @GetMapping("/webapp")
    public String getMessage() {
        return "Hello, World!";
    }
}
