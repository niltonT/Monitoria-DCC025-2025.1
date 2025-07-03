/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufjf.carOS.obj;

/**
 *
 * @author nilton
 */

import java.util.Calendar;




public class OS {
    
    
    private final int id;
    private Calendar data;
    private String km;
    private Status status;
    private String reclamacao;
    private String diag;
    private Cliente cliente;
    private Veiculo veiculo;
    private Mecanico mecanico;
    
    public enum Status {
        ABERTA,
        EXECUTANDO,
        FECHADA;
    };
    
    public OS(int id){
        this.id = id;
        this.data = Calendar.getInstance();
        this.km = "";
        this.reclamacao = "";
        this.status = Status.ABERTA;
        this.cliente = null;
        this.veiculo = null;
        this.mecanico = null;
    }

    public int getId() {
        return id;
    }

    public Calendar getData() {
        return data;
    }

    public Status getStatus() {
        return status;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public String getDiag() {
        return diag;
    }

    public String getReclamacao() {
        return reclamacao;
    }

    public String getKm() {
        return km;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public void setDiag(String diag) {
        this.diag = diag;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public void setReclamacao(String reclamacao) {
        this.reclamacao = reclamacao;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    
    
    
}
