package br.com.vitorfraga.todolist.user;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import at.favre.lib.crypto.bcrypt.BCrypt;

@RestController
@RequestMapping("/user")

public class UserController {

  @Autowired // => Define que o spring irá gerenciar todo o ciclo de vida do Repositório.
  private IUserRepository userRepository;

  // => Método de cadastro:
  @PostMapping("/")
  public ResponseEntity create(@RequestBody UserModel userModel) {
    var user = this.userRepository.findByUserName(userModel.getUserName());

    if(user != null) {
      System.out.println("Usuário já existente");
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuário já existente");
    };
    
    // => Criptograda a senha do usuário
    var passwordHashred = BCrypt.withDefaults().hashToString(12, userModel.getPassword().toCharArray());
    
    userModel.setPassword(passwordHashred);

    var userCreated = this.userRepository.save(userModel);
    return ResponseEntity.status(HttpStatus.ACCEPTED).body(userCreated);
  }
}
