package decoradores;

import bean.CarroPrototipo;

/**
 * Created by arthur
 * Padrão Decorator
 * Classe decorador concreto
 */
public class Airbag extends CarroDecorado {

  public Airbag(CarroPrototipo carro) {
    super(carro);
  }

  @Override
  public void montar() {
    System.out.println("Carro com AirBag!!");
  }

}
