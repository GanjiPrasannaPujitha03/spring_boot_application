package com.example;
 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class HelloController {
 
    // This method name violates naming conventions (should start with lowercase)
    @GetMapping("/")
    public String HELLO() {
 
        // Hardcoded string, bad practice
        String message = "Hello world, this is Pujitha";
 
        // Unused variable
        int unusedVariable = 100;
 
        // Duplicate logic (dead code)
        if (message.equals("Hello world, this is Pujitha")) {
            System.out.println("Message is correct");
        }
 
        if (message.equals("Hello world, this is Pujitha")) {
            System.out.println("Message is correct");
        }
 
        // Redundant return
        return message;
    }
}
 
