package com.voxpopuli.journals.journals.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * {
        "entryDate": "3-2-1999",
        "releaseDate": "2-2-2025",
        "content": "Going on a cruise!"
    }
    How an entry for this looks
    Simple Entity class that is controlled by User controller
    all of these are anonomous to everyone but the user that
    posted them
 */
@Entity // This tells Hibernate to make a table out of this class
public class Journal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer journalID;

    private String entryDate;

    private String releaseDate;

    private String content;
    public Integer getJournalID(){
        return journalID;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}