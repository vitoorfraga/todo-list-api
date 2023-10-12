package br.com.vitorfraga.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 *  Modificadores: public | private | protected
 *  Tipo: class | interface | enum ....
 */


 @RestController
 @RequestMapping("/user")

public class UserController {
  

  // => Método de cadastro:
  @PostMapping("/")
  public void create(@RequestBody UserModel userModel) {
    System.out.println(userModel.name);
  }
}
