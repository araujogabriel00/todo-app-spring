package com.repositories.todoapp;

import com.entities.todoapp.UserApp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAppRepository extends JpaRepository<Long, UserApp> {

}
