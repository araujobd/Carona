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

  public static UsuarioDAO getInstance() {
    if (INSTANCE == null)
      INSTANCE = new UsuarioDAO();
    return INSTANCE;
  }

  @Override
  public void adicionar(Usuario usuario) {
    System.out.println("Adicionando usuário\n");
  }

  @Override
  void atualizar(Usuario usuario) {
    System.out.println("Editando um usuário\n");
  }

  @Override
  void remover(Usuario usuario) {
    System.out.println("Removendo usuário\n");
  }

  @Override
  void buscar(int id) {
    System.out.println("Procurando usuário com o id\n");
  }

  @Override
  void listar() {
    System.out.println("Listando todos os usuários do banco!\n");
  }
}
