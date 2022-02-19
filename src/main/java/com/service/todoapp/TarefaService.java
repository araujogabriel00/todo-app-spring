package com.service.todoapp;

import com.entities.todoapp.Tarefa;
import com.entities.todoapp.UserApp;
import com.repositories.todoapp.TarefaRepository;

import java.util.List;

public interface TarefaService {

     Tarefa addNovaTarefa(Tarefa tarefa);
     Tarefa deleteTarefa(Long id);
     Tarefa alterTarefa(String descricao, String prioridade);
     Tarefa tarefaConcluida(String concluida);
     List<Tarefa> listTarefaPendentes(UserApp user);


}
