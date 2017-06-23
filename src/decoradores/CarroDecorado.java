package decoradores;

import interfaces.CarroInterface;


/*
 * Created by arthur
 * Padrão Decorator
 */
public abstract class CarroDecorado implements CarroInterface {
  
  private CarroInterface carro;
  

  public CarroDecorado(CarroInterface carro) {
    this.carro = carro;
  }
  
  public void montar(){
    this.carro.montar();
  }
}