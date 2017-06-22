package dao;

import bean.Usuario;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bruno on 22/06/17.
 */
public class UsuarioDAO extends DAO<Usuario> {

  private static UsuarioDAO INSTANCE = null;

  private List<Usuario> usuarios;

  private UsuarioDAO() {
    usuarios = new ArrayList<>();
  }

  public static DAO<Usuario> getInstance() {
    if (INSTANCE == null)
      INSTANCE = new UsuarioDAO();
    return INSTANCE;
  }

  @Override
  void adicionar(Usuario usuario) {
    usuarios.add(usuario);
  }

  @Override
  void atualizar(Usuario usuario) {
    int i;
    for (i=0; i<usuarios.size(); i++)
      if (usuarios.get(i).getLogin().contentEquals(usuario.getLogin()))
        usuarios.set(i, usuario);
  }

  @Override
  void remover(Usuario usuario) {
    usuarios.remove(usuario);
  }

  @Override
  Usuario buscar(int id) {
    for (Usuario usuario : usuarios)
      if (usuario.getLogin().contentEquals(String.valueOf(id)))
        return usuario;
    return null;
  }

  @Override
  List<Usuario> listar() {
    return usuarios;
  }
}
