package br.com.vitorfraga.todolist.user;

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
public class UserModel {
  
  private String userName;
  private String name;
  private String password;



}
