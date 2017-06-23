package dao;

import bean.Usuario;

/**
 * Created by bruno on 22/06/17.
 * Padrões Facade, Singleton, TemplateMethod (concreto)
 */
public class UsuarioDAO extends DAO<Usuario> {

  private static UsuarioDAO INSTANCE = null;
  
  private UsuarioDAO(){
  }

  public static DAO<Usuario> getInstance() {
    if (INSTANCE == null)
      INSTANCE = new UsuarioDAO();
    return INSTANCE;
  }

  @Override
  void adicionar(Usuario usuario) {
//    usuarios.add(usuario);
    System.out.println("Adicionando usuário:" + usuario);
  }

  @Override
  void atualizar(Usuario usuario) {
//    int i;
//    for (i=0; i<usuarios.size(); i++)
//      if (usuarios.get(i).getLogin().contentEquals(usuario.getLogin()))
//        usuarios.set(i, usuario);
    System.out.println("Editando um usuário: " + usuario);
  }

  @Override
  void remover(Usuario usuario) {
//    usuarios.remove(usuario);
    System.out.println("Removendo usuário: " + usuario);
  }

  @Override
  void buscar(int id) {
//    for (Usuario usuario : usuarios)
//      if (usuario.getLogin().contentEquals(String.valueOf(id)))
//        return usuario;
    System.out.println("Procurando usuário com o id = " + id);
  }

  @Override
  void listar() {
    System.out.println("Listando todos os usuários do banco!");
  }
}
