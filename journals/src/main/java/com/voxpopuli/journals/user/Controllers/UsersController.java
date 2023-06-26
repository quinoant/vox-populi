package com.voxpopuli.journals.user.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.voxpopuli.journals.journals.Models.Journal;
import com.voxpopuli.journals.journals.Models.JournalRepository;
import com.voxpopuli.journals.user.Models.User;
import com.voxpopuli.journals.user.Models.UserRepository;

@RestController
@RequestMapping("/api/v1/users")
public class UsersController {

    @Autowired
    private JournalRepository journalRepository;

    @Autowired
    private UserRepository userRepository;

    /**
     * lists all users
     * @return - all users
     */
    @GetMapping
    public List<User> list(){
        return userRepository.findAll();
    }

    /**
     * Gets all journals anonymousized
     * @return - every journal
     */
    @GetMapping("/allJournals")
    public List<Journal> get(){
        return journalRepository.findAll();
    }

    /**
     * Makes a user
     * @param user - the request body to make that user
     */
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody User user){
        userRepository.save(user);
    }

    /**
     * Gets info about a specific user
     * @param id
     * @return - that specific user obj
     */
    @GetMapping("/{id}")
    public User get(@PathVariable("id") long id){
        return userRepository.getReferenceById(id);
    }

    /**
     * Adds a journal to a user, since journals as of now can only be added
     * to users this works great
     * @param id
     * @param journal
     */
    @PostMapping("/addJournal/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void addJournal(@PathVariable("id") long id,@RequestBody Journal journal){
        User user =  userRepository.getReferenceById(id);
        user.addJournals(journal);
        journalRepository.save(journal);
    }

    /**
     * Adds a anonymous jounal
     * @param journal - journal to add
     */
    @PostMapping("/addAnonJournal")
    @ResponseStatus(HttpStatus.OK)
    public void addAnonymousJournal(@RequestBody Journal journal){
        journalRepository.save(journal);
    }

    /**
     * Gets all of a specific users journals
     * @param id - a users specific id number
     * @return all of a users journals
     */
    @GetMapping("/getJournals/{id}")
    public Set<Journal> getUserJournals(@PathVariable("id") long id){
        User user =  userRepository.getReferenceById(id);
        return user.getJournals();
    }
}

