package dao;

import bean.Oferta;

/**
 * Created by cainan
 * Update by arthur
 * Padrões Facade, Singleton, TemplateMethod (concreto)
 */
public class OfertaDAO extends DAO<Oferta> {

  private static OfertaDAO INSTANCE = null;
  
  private OfertaDAO(){
  }

  public static OfertaDAO getInstance() {
    if (INSTANCE == null)
      INSTANCE = new OfertaDAO();
    return INSTANCE;
  }

  @Override
  void adicionar(Oferta oferta) {
//    oferta.add(usuario);
    System.out.println("Adicionando oferta!\n");
  }

  @Override
  void atualizar(Oferta oferta) {
//    int i;
//    for (i=0; i < oferta.size(); i++)
//      if (oferta.get(i).getLogin().contentEquals(oferta.getLogin()))
//        ofertas.set(i, oferta);
    System.out.println("Editando uma oferta!\n");
  }

  @Override
  void remover(Oferta oferta) {
//    ofertas.remove(usuario);
    System.out.println("Removendo oferta!\n");
  }

  @Override
  void buscar(int id) {
//    for (Ofertas oferta : ofertas)
//      if (usuario.getLogin().contentEquals(String.valueOf(id)))
//        return usuario;
    System.out.println("Procurando oferta com o id\n");
  }

  @Override
  void listar() {
    System.out.println("Listando todos as ofertas do banco!\n");
  }
}
