package com.jonasaqua.microblog.entry.service;

import com.jonasaqua.microblog.entry.persistence.Entry;
import com.jonasaqua.microblog.entry.persistence.EntryRepository;
import com.jonasaqua.microblog.exceptions.EntryNotFoundException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class EntryServiceTest {
    @Mock
    private EntryRepository entryRepositoryMock;

    private EntryService entryService;

    @Before
    public void setUp() {
        this.entryService = new EntryService(entryRepositoryMock);
    }

    @Test(expected = EntryNotFoundException.class)
    public void getEntryWithNonexistentIdThrowsEntryNotFoundException() {
        // given
        Long id = 42l;
        given(entryRepositoryMock.findById(id)).willReturn(Optional.empty());

        // when
        Entry entry = entryService.getEntry(id);
    }
}