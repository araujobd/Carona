/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import bean.Log;
import controller.LoginUsuario;

/**
 *
 * @author cainan
 */
public class Principal {
  public static void main(String[] args){
    Log log = null;
    log = Log.getInstancia();
    log.escreve();
    LoginUsuario u1 = new LoginUsuario("cliente");
    log.escreve();
    LoginUsuario u2 = new LoginUsuario("motorista");
    log.escreve();
    LoginUsuario u3 = new LoginUsuario("nenhum dos dois");
    log.escreve();
  }
}
