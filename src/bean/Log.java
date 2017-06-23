package bean;

/**
 * Created by arthur on 6/22/17.
 * Padrão Singleton
 */
public class Log {
  private static Log INSTANCE = null;

  private Log(){

  }

  public static Log getInstancia(){
    if(INSTANCE == null){
      INSTANCE = new Log();
      System.out.println("Instância Criada");
    }
    return INSTANCE;
  }
}
