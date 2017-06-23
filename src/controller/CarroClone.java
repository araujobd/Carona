/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.Carro;

/**
 * @author cainan
 * Padrão Prototype
 */
public class CarroClone extends Carro{

  public CarroClone(String placa, String modelo, String marca, String cor) {
    super(placa, modelo, marca, cor);
  }

  @Override
  public Carro clonar(String placa, String modelo, String marca, String cor) {
    return new CarroClone(placa, modelo, marca, cor);
  }
    
}
