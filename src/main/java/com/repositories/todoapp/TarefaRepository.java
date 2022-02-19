package com.repositories.todoapp;

import com.entities.todoapp.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends JpaRepository<Long, Tarefa> {

}
