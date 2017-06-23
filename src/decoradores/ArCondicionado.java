package decoradores;

import interfaces.CarroInterface;

public class ArCondicionado extends CarroDecorado {

  public ArCondicionado(CarroInterface carro) {
    super(carro);
  }

  @Override
  public void montar() {
    System.out.println("Carro com Ar Condicionado!");
  }

}
