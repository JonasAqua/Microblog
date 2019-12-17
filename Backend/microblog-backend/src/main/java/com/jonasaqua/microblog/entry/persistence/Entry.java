package com.jonasaqua.microblog.entry.persistence;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Entry {
    String title;
    Date date;
    String content;
}
