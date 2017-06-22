package bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by bruno on 22/06/17.
 */
public class Oferta {

  private Motorista motorista;
  private String partida;
  private String destino;
  private Date dataSaida;
  private double preco;
  private int vagas;

  private List<Cliente> clientes;

  private Oferta() {

  }

  public Oferta(Motorista motorista, String partida, String destino, Date dataSaida, double preco, int vagas) {
    this.motorista = motorista;
    this.partida = partida;
    this.destino = destino;
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

  public String getPartida() {
    return partida;
  }

  public void setPartida(String partida) {
    this.partida = partida;
  }

  public String getDestino() {
    return destino;
  }

  public void setDestino(String destino) {
    this.destino = destino;
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
