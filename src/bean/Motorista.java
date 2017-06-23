package bean;

/**
 * Created by bruno on 22/06/17.
 */
public class Motorista extends Usuario implements UsuarioInterface{

  private String carro;

    @Override
    public String logarUsuario() {
        return "Motorista logado!";
    }

}
