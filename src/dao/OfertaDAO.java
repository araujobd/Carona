/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Oferta;

/**
 *
 * @author cainan
 */
public class OfertaDAO extends DAO<Oferta>{

    @Override
    void adicionar(Oferta oferta) {
        System.out.println("Criando oferta de carona: ");
    }

    @Override
    void atualizar(Oferta oferta) {
        System.out.println("Alterando oferta de carona: ");
    }

    @Override
    void remover(Oferta oferta) {
        System.out.println("Apagando oferta de carona: ");
    }

    @Override
    void buscar(int id) {
        System.out.println("Pesquisando oferta de carona pelo id "+id);
    }

    @Override
    void listar() {
        System.out.println("Listando ofertas de carona disponíveis.");
    }
    
}
