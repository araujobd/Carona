package bean;

import interfaces.UsuarioInterface;

/**
 * Created by bruno on 22/06/17.
 */
public class Cliente extends Usuario implements UsuarioInterface{

  @Override
  public String logarUsuario() {
    return "Cliente logado!";
  }
}
