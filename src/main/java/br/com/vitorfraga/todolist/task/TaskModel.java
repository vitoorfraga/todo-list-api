package br.com.vitorfraga.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data // Getters e Setters
@Entity(name = "tb_tasks")
public class TaskModel {
  
  @Id
  @GeneratedValue(generator = "UUID")
  private UUID id;

  private String description;

  @Column(length = 50) // Limita o tamanho do title para 50 caracteres
  private String title;
  private LocalDateTime startAt;
  private LocalDateTime entAt;
  private String priority;

  @CreationTimestamp
  private LocalDateTime createdAt;

  private UUID idUser;
}
