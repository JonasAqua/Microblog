package com.jonasaqua.microblog.entry.rest;

import com.jonasaqua.microblog.entry.persistence.Entry;
import com.jonasaqua.microblog.entry.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/entry")
public class EntryController {
    EntryService service;

    @Autowired
    public EntryController(EntryService service) {
        this.service = service;
    }

    @GetMapping
    public List<Entry> getAll() {
        return service.getAllEntries();
    }

    @PostMapping
    public Entry post(@RequestBody Entry entry) {
        return service.postEntry(entry.getTitle(), entry.getContent());
    }

    @GetMapping("/{id}")
    public Entry getById(@PathVariable(name = "id") Long id) {
        return service.getEntry(id);
    }
}
