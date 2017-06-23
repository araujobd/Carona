/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import controller.LoginUsuario;

/**
 *
 * @author cainan
 */
public class Principal {
    public static void main(String[] args){
        LoginUsuario u1 = new LoginUsuario("cliente");
        LoginUsuario u2 = new LoginUsuario("motorista");
        LoginUsuario u3 = new LoginUsuario("nenhum dos dois");
    }
}
