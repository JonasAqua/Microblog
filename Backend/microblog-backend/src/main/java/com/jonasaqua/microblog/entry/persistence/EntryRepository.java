package com.jonasaqua.microblog.entry.persistence;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EntryRepository extends CrudRepository<Entry, Long> {
    List<Entry> findAll();
}
