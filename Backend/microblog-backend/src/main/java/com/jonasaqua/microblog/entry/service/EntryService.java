package com.jonasaqua.microblog.entry.service;

import com.jonasaqua.microblog.entry.persistence.Entry;
import com.jonasaqua.microblog.entry.persistence.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EntryService {
    EntryRepository repository;

    @Autowired
    public EntryService(EntryRepository repository) {
        this.repository = repository;
    }

    public List<Entry> getAllEntries() {
        return repository.findAll();
    }

    public Entry postEntry(String title, String content) {
        Entry entry = new Entry(title, new Date(), content);
        return repository.save(entry);
    }
}
