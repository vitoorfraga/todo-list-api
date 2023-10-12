package br.com.vitorfraga.todolist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")

public class UserController {

  @Autowired // => Define que o spring irá gerenciar todo o ciclo de vida do Repositório.
  private IUserRepository userRepository;

  // => Método de cadastro:
  @PostMapping("/")
  public UserModel create(@RequestBody UserModel userModel) {
    var userCreated = this.userRepository.save(userModel);
    return userCreated;
  }
}
