package com.jonasaqua.microblog.entry.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entry")
public class EntryController {
    @GetMapping
    public String getSampleEntry() {
        return "Hello, world!";
    }
}
