package com.jonasaqua.microblog.entry.persistence;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
public class Entry {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private Date date;
    private String content;

    public Entry(String title, Date date, String content) {
        this.title = title;
        this.date = date;
        this.content = content;
    }
}
