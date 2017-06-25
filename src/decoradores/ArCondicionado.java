package decoradores;

import bean.CarroPrototipo;

/**
 * Created by arthur
 * Padrão Decorator
 * Classe decorador concreto
 */
public class ArCondicionado extends CarroDecorado {

  public ArCondicionado(CarroPrototipo carro) {
    super(carro);
  }

  @Override
  public void montar() {
    System.out.println("Carro com Ar Condicionado!");
  }

}
