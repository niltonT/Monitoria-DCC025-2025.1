/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufjf.carOS.obj;

/**
 *
 * @author nilton
 */
public class Cliente extends Pessoa {
    
    public String endereco;

    public Cliente() {
    }

    public Cliente(String endereco, String nome, String cpf, String telefone) {
        super(nome, cpf, telefone);
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
