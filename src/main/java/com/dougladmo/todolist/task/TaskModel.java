package com.dougladmo.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "TB_TASKS")
public class TaskModel {
    // ID
    // user
    // descrição
    // titulo
    // data inicio
    // data de termino
    // Prioridade
    
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
     
    @Column(unique = true)
    private String username;
    private String description;

    @Column(length = 100)
    private String title;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private String priority;

    @CreationTimestamp
    private LocalDateTime createdAt;
   
    private UUID idUser;

}
