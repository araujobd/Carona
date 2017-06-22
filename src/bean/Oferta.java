package bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by bruno on 22/06/17.
 */
public class Oferta {

  private Motorista motorista;
  private String localPartida;
  private String localDestino;
  private Date dataSaida;
  private double preco;
  private int vagas;

  private List<Cliente> clientes;

  private Oferta() {

  }

  public Oferta(Motorista motorista, String localPartida, String localDestino, Date dataSaida, double preco, int vagas) {
    this.motorista = motorista;
    this.localPartida = localPartida;
    this.localDestino = localDestino;
    this.dataSaida = dataSaida;
    this.preco = preco;
    this.vagas = vagas;
    this.clientes = new ArrayList<>();
  }
  
  public Motorista getMotorista() {
    return motorista;
  }

  public void setMotorista(Motorista motorista) {
    this.motorista = motorista;
  }

  public String getLocalPartida() {
    return localPartida;
  }

  public void setLocalPartida(String localPartida) {
    this.localPartida = localPartida;
  }

  public String getLocalDestino() {
    return localDestino;
  }

  public void setLocalDestino(String localDestino) {
    this.localDestino = localDestino;
  }

  public Date getDataSaida() {
    return dataSaida;
  }

  public void setDataSaida(Date dataSaida) {
    this.dataSaida = dataSaida;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public int getVagas() {
    return vagas;
  }

  public void setVagas(int vagas) {
    this.vagas = vagas;
  }

  public List<Cliente> getClientes() {
    return clientes;
  }

  public void setClientes(List<Cliente> clientes) {
    this.clientes = clientes;
  }
}
