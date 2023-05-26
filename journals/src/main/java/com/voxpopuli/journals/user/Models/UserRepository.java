package com.voxpopuli.journals.user.Models;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voxpopuli.journals.user.Models.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends JpaRepository<User, Long> {

}
