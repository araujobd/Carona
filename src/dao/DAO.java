package dao;

/**
 * Created by bruno on 22/06/17.
 * Padrão Template Method
 */
public abstract class DAO<T> {

  abstract void adicionar(T objeto);
  abstract void atualizar(T objeto);
  abstract void remover(T objeto);
  abstract void buscar(int id);
  abstract void listar();
}
