package decoradores;

import bean.CarroPrototipo;

/**
 * Created by arthur
 * Padrão Decorator
 * Classe decorador concreto
 */
public class VidroEletrico extends CarroDecorado {

  public VidroEletrico(CarroPrototipo carro) {
    super(carro);
  }
  
  @Override
  public void montar() {
    System.out.println("Carro com Vidros Elétricos!");
  }

}
