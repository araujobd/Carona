package decoradores;

import interfaces.CarroInterface;

public class Airbag extends CarroDecorado {

  public Airbag(CarroInterface carro) {
    super(carro);
    // TODO Auto-generated constructor stub
  }

  @Override
  public void montar() {
    System.out.println("Carro seguro!!");
  }

}
