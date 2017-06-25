package decoradores;

import bean.CarroPrototipo;

/**
 * Created by arthur
 * Padrão Decorator
 * Classe decorador
 */
public abstract class CarroDecorado extends CarroPrototipo{
  
  public CarroDecorado(CarroPrototipo c){
    super(c);
  }

  public abstract void montar();
}