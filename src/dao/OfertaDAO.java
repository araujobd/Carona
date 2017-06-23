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

  public static DAO<Oferta> getInstance() {
    if (INSTANCE == null)
      INSTANCE = new OfertaDAO();
    return INSTANCE;
  }

  @Override
  void adicionar(Oferta oferta) {
//    oferta.add(usuario);
    System.out.println("Adicionando oferta:" + oferta);
  }

  @Override
  void atualizar(Oferta oferta) {
//    int i;
//    for (i=0; i < oferta.size(); i++)
//      if (oferta.get(i).getLogin().contentEquals(oferta.getLogin()))
//        ofertas.set(i, oferta);
    System.out.println("Editando uma oferta: " + oferta);
  }

  @Override
  void remover(Oferta oferta) {
//    ofertas.remove(usuario);
    System.out.println("Removendo oferta: " + oferta);
  }

  @Override
  void buscar(int id) {
//    for (Ofertas oferta : ofertas)
//      if (usuario.getLogin().contentEquals(String.valueOf(id)))
//        return usuario;
    System.out.println("Procurando oferta com o id = " + id);
  }

  @Override
  void listar() {
    System.out.println("Listando todos as ofertas do banco!");
  }
}
