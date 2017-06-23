/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import bean.Carro;

/**
<<<<<<< HEAD
 *
 * @author cainan
 * Padrão Prototype
 */
public class CarroPrototipo extends Carro{

    public CarroPrototipo(String placa, String modelo, String marca, String cor) {
        super(placa, modelo, marca, cor);
    }

    @Override
    public Carro clonar(String placa, String modelo, String marca, String cor) {
        return new CarroPrototipo(placa, modelo, marca, cor);
    }

}
