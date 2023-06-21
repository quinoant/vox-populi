package com.voxpopuli.journals.user.Models;


import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.voxpopuli.journals.journals.Models.Journal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "user")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private long user_id;

  @OneToMany(cascade = CascadeType.ALL)
  private Set<Journal> journals = new HashSet<>();

  private String username;
  private String password;
  private String firstName;
  private String lastName;

  public User() {
  }

  public void addJournals(Journal journal){
    journals.add(journal);
  }

  public Set<Journal> getJournals() {
    return journals;
  }

  public long getUser_id() {
    return this.user_id;
  }

  public void setUser_id(long userID) {
    this.user_id = userID;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void remove(User user){
    
  }
}