/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.Cliente;
import bean.Motorista;
import interfaces.UsuarioInterface;

/**
 *
 * @author cainan
 */
public class LoginUsuario {
  private UsuarioInterface user;
    
  public LoginUsuario(String usuario){
    usuario = usuario.toLowerCase();
    if(usuario == "cliente"){
      user = new Cliente();
      System.out.println(user.logarUsuario());
    }else if(usuario == "motorista"){
      user = new Motorista();
      System.out.println(user.logarUsuario());
    }else
      System.out.println("Usuário inválido. Você precisa ser 'cliente' ou 'motorista' !");
  }
}
