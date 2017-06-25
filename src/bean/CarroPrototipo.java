/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import bean.Carro;

/**
 * @author cainan
 * Padrão Prototype
 * Classe protótipo
 */
public class CarroPrototipo extends Carro{

  public CarroPrototipo(Carro carro) {
    super(carro);
    // TODO Auto-generated constructor stub
  }

  public Carro clonar(CarroPrototipo carro) {
    return new CarroPrototipo(carro);
  }

}
