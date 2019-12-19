package com.jonasaqua.microblog.exceptions;

import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
@NoArgsConstructor
public class EntryNotFoundException extends NoSuchEntityException {
    public EntryNotFoundException(Long entryId) {
        super("Entry", entryId);
    }
}
