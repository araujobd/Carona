package decoradores;

import bean.CarroPrototipo;

public class Seguro extends CarroDecorado {

  public Seguro(CarroPrototipo c) {
    super(c);
  }

  @Override
  public void montar() {
      System.out.println("Carro com Seguro contra Danos/Roubo!!");
  }

}
