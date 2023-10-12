package br.com.vitorfraga.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interface é um modelo/contrato dentro da aplicação. Temos os métodos mas não temos as implementações dos métodos.
 * Em uma interface só temos a representação dos métodos.
 */

public interface IUserRepository extends JpaRepository<UserModel, UUID>{
  UserModel findByUserName(String userName);
}
