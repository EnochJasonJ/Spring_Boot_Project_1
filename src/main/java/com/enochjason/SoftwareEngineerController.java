package com.enochjason;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/v1/software-engineers")
public class SoftwareEngineerController {

    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    @GetMapping
    public List<SoftwareEngineer> getEngineers() {
        return List.of(
                new SoftwareEngineer(
                        1,
                        "Enoch",
                        "js, Node, React, Tailwindcss"),
                new SoftwareEngineer(
                        2,
                        "Jason",
                        "C++, Python, Java"));
    }
}
