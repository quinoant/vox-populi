package com.voxpopuli.journals.journals.Models;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voxpopuli.journals.journals.Models.Journal;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface JournalRepository extends JpaRepository<Journal, Long> {

}
