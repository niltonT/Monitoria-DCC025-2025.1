/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufjf.carOS.obj;

/**
 *
 * @author nilton
 */
public class Veiculo {
    
    private String placa;
    private String modelo;
    private String ano;
    private Cliente cliente;

    public Veiculo() {
    }

    public Veiculo(String placa, String modelo, String ano, Cliente cliente) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.cliente = cliente;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAno() {
        return ano;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }
    
}
