package br.com.vitorfraga.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * # Quando definimos uma classe como private, precisamos definir tambem como poderemos acessar eles.
 * 
 * Getters:
 * Utilizamos quando queremos usar uma propriedade.
 * 
 * Setters:
 * Utilizamos quando queremos definir o valor de uma propriedade.
 * 
 * # Lombok - Biblioteca para definir automaticamente getters e setters para nossas propriedades.
 */

@Data // Getters e Setters
@Entity(name = "tb_users")
public class UserModel {

  @Id
  @GeneratedValue(generator = "UUID")
  private UUID id;

  private String userName;
  private String name;
  private String password;

  @CreationTimestamp
  private LocalDateTime createdAt;

}
