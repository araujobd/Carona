package bean;

/**
 * Created by arthur on 6/22/17.
 * Padrão Singleton
 */
public class Log {
    private static Log control = null;

    private Log(){

    }

    public static Log getInstancia(){
        if(control == null){
            control = new Log();
            System.out.println("Instância Criada");
        }
        return control;
    }
}
