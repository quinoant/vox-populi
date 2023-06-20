package com.voxpopuli.journals.journals.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity // This tells Hibernate to make a table out of this class
@Table(name = "journal")
public class Journal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long journal_id;

    // @ManyToOne
    // @JoinColumn(name = "user_id")
    // private long user_id;

    private String entryDate;

    private String releaseDate;

    private String content;

    // public long getUserID() {
    //     return user_id;
    // }

    // public void setUserID(long userID) {
    //     this.user_id = userID;
    // }

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