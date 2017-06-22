package dao;

import java.util.List;

/**
 * Created by bruno on 22/06/17.
 */
public abstract class DAO<T> {

  abstract void adicionar(T objeto);
  abstract void atualizar(T objeto);
  abstract void remover(T objeto);
  abstract T buscar(int id);
  abstract List<T> listar();
}
