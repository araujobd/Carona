/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 * @author cainan
 * Padrão Prototype
 * Classe Protótipo
 */

public class Carro {
  private String placa;
  private String modelo;
  private String marca;
  private String cor;
  private Carro carro;

  public Carro(Carro c) {
    this.placa = c.getPlaca();
    this.modelo = c.getModelo();
    this.marca = c.getMarca();
    this.cor = c.getCor();
  }
//    
//  public Carro(String placa, String modelo, String marca, String cor){
//    
//  }
    
  public Carro() {
    // TODO Auto-generated constructor stub
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }
    
  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public Carro getCarro() {
    return carro;
  }

  public void setCarro(Carro carro) {
    this.carro = carro;
  }
}
