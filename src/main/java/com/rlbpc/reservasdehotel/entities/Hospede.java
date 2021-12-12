/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rlbpc.reservasdehotel.entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Rodolfo Bortoluzzi
 */
@Entity
@Table
public class Hospede extends Pessoa implements Serializable{
    private static final long serialVersionUID = 1L;
    Integer idHospede;
    String procedencia;
    String metodoDePagamento;

    public Hospede(){
        
    }
    public Hospede(Integer idHospede, String procedencia, String metodoDePagamento, Integer idPessoa, String nome, String cpf, String rg, String fone, String celular, String email, Integer codEndereco, String dataNascimento, String sexo, Integer idade, String nacionalidade, String passaporte, String observacoes, String logradouro, String numero, String bairro, String cidade, String cep, String pais, String estado, String complemento) {
        super(idPessoa, nome, cpf, rg, fone, celular, email, codEndereco, dataNascimento, sexo, idade, nacionalidade, passaporte, observacoes);
        this.idHospede = idHospede;
        this.procedencia = procedencia;
        this.metodoDePagamento = metodoDePagamento;
    }

    @Override
    public String toString() {
        return "Hospede{"
                + "IdHospede =" + idHospede
                + ", Procedencia =" + procedencia
                + ", MetodoDePagamento =" + metodoDePagamento
                + ", IdPessoa = " + idPessoa
                + ", Nome = " + nome
                + ", CPF = " + cpf
                + ", RG = " + rg
                + ", Telefone = " + fone
                + ", Celular = " + celular
                + ", Email = " + email
                + ", CodEndereco = " + codEndereco
                + ", DataNascimento = " + dataNascimento
                + ", Sexo = " + sexo
                + ", Idade = " + idade
                + ", Nacionalidade = " + nacionalidade
                + ", Passaporte = " + passaporte
                + ", Observacoes = " + observacoes
                + ", Logradouro = " + logradouro
                + ", Numero = " + numero
                + ", Bairro = " + bairro
                + ", Cidade = " + cidade
                + ", CEP = " + CEP
                + ", Pais = " + pais
                + ", Estado = " + estado
                + ", Complemento = " + complemento
                + '}';
    }
   

    public Integer getIdHospede() {
        return idHospede;
    }

    public void setIdHospede(Integer idHospede) {
        this.idHospede = idHospede;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getMetodoDePagamento() {
        return metodoDePagamento;
    }

    public void setMetodoDePagamento(String metodoDePagamento) {
        this.metodoDePagamento = metodoDePagamento;
    }

    public Integer getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getCodEndereco() {
        return codEndereco;
    }

    public void setCodEndereco(Integer codEndereco) {
        this.codEndereco = codEndereco;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.idHospede);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Hospede other = (Hospede) obj;
        if (!Objects.equals(this.idHospede, other.idHospede)) {
            return false;
        }
        return true;
    }

    
}
