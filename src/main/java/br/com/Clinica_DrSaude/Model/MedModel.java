package br.com.Clinica_DrSaude.Model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "tb_cadrastro de medicos")
public class MedModel {
    
    @Id
    @GeneratedValue(generator = "UUID" )
    private UUID id;

    private String nome;
    private int idade;
    private String nacionalidade;
    private String endereco;
    private char numero_de_telefone;
    private String email;
    private String procedimento;
    private char crm;
    private String cargo;
    private String atendimento;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public char getNumero_de_telefone() {
        return numero_de_telefone;
    }
    public void setNumero_de_telefone(char numero_de_telefone) {
        this.numero_de_telefone = numero_de_telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getProcedimento() {
        return procedimento;
    }
    public void setProcedimento(String procedimento) {
        this.procedimento = procedimento;
    }
    public char getCrm() {
        return crm;
    }
    public void setCrm(char crm) {
        this.crm = crm;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getAtendimento() {
        return atendimento;
    }
    public void setAtendimento(String atendimento) {
        this.atendimento = atendimento;
    }


    






    
}
