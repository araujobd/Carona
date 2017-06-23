package decoradores;

import interfaces.CarroInterface;

public class VidroEletrico extends CarroDecorado {

  public VidroEletrico(CarroInterface carro) {
    super(carro);
    // TODO Auto-generated constructor stub
  }
  
  @Override
  public void montar() {
    System.out.println("Carro com Vidros Elétricos!");
  }

}
