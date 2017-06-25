/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;

import bean.Carro;
import bean.CarroPrototipo;
import controller.LoginUsuario;
import decoradores.Airbag;
import decoradores.ArCondicionado;
import decoradores.CarroDecorado;
import decoradores.Seguro;
import decoradores.VidroEletrico;
import log.Log;

/**
 * @author cainan
 * 
 */
public class Principal {
  public static void main(String[] args){
    // Singleton
    Log log = null;
    log = Log.getInstancia();
    log.escreve();
    
    //Strategy + (facade & singleton) [encapsulados]
    LoginUsuario u1 = new LoginUsuario("cliente");
    log.escreve();
    LoginUsuario u2 = new LoginUsuario("motorista");
    log.escreve();
    LoginUsuario u3 = new LoginUsuario("nenhum dos dois");
    log.escreve();
    
    //Carro
    ArrayList<CarroPrototipo> carros = new ArrayList<CarroPrototipo>();
    CarroPrototipo carro = new CarroPrototipo();
        
    //setando carro
    carro.setPlaca("QWE1234");
    carro.setMarca("BMW");
    carro.setModelo("M3");
    carro.setCor("Branca");
    
    //adicionando no arrayList
    carros.add(carro.clonar(carro));
    
    //setando outro carro
    carro.setPlaca("ABC0000");
    carro.setMarca("Gallardo");
    carro.setModelo("Lamborghini");
    carro.setCor("Rosa-Chock");
    
    carros.add(carro.clonar(carro));
    
    for (Carro c : carros) {
      System.out.println("Placa: " + c.getPlaca()
                      + "\nMarca: " + c.getMarca()
                      + "\nModelo: " + c.getModelo()
                      + "\nCor: " + c.getCor() + "\n");
    }
    
    //Decorando os carros
    //Decorando o BMW com Airbag e Vidros Elétricos
    System.out.println(carros.get(0).getModelo());
    CarroDecorado decorado = new Airbag(carros.get(0));
    decorado.montar();
    decorado = new VidroEletrico(carros.get(0));
    decorado.montar();
    
    System.out.println("\n\n" + carros.get(1).getModelo());
    decorado = new ArCondicionado(carros.get(1));
    decorado.montar();
    decorado = new Seguro(carros.get(1));
    decorado.montar();
  }
}

