package com.jonasaqua.microblog.entry.service;

import com.jonasaqua.microblog.entry.persistence.Entry;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class EntryService {
    public Entry[] getAllEntries() {
        Entry[] entries = new Entry[3];
        entries[0] = new Entry("Title1", new Date(), "Content 1");
        entries[1] = new Entry("Title2", new Date(), "Content 2");
        entries[2] = new Entry("Title3", new Date(), "Content 3");
        return entries;
    }
}
