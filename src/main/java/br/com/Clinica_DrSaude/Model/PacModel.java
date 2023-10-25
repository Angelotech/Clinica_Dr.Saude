package br.com.Clinica_DrSaude.Model;

import java.time.LocalDate;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "tb_cadrastro_de_pacientes")
public class PacModel {

    @Id
    @GeneratedValue (generator = "UUID")
    private UUID id;
   
    private String nome;
    private int idade;
    private String endereco;
    private char numero_de_telefone;
    private String email;
    private String procedimento;
    private String plano_de_saude;
    private String sexo;
    
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    @CreationTimestamp
    private LocalDate Data_do_cadrastro;

   
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
    public String getPlano_de_saude() {
        return plano_de_saude;
    }
    public void setPlano_de_saude(String plano_de_saude) {
        this.plano_de_saude = plano_de_saude;
    }
     public LocalDate getData_do_cadrastro() {
        return Data_do_cadrastro;
    }
    public void setData_do_cadrastro(LocalDate data_do_cadrastro) {
        Data_do_cadrastro = data_do_cadrastro;
    }

    
}