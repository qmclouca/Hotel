/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rlbpc.reservasdehotel.entities;

import java.io.Serializable;
import java.util.Objects;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

/**
 *
 * @author Rodolfo Bortoluzzi
 */
//@Entity
public class Pessoa extends Endereco implements Serializable, Comparable<Pessoa>{
    private static final long serialVersionUID = 1L;
        //@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
        Integer idPessoa;
        String nome;
        String cpf;
        String rg;
        String fone;
        String celular;
        String email;
        Integer codEndereco;
        String dataNascimento;
        String sexo;
        String idade;
        String nacionalidade;
        String passaporte;
        String observacoes;
        
    public Pessoa(){
        
    }

   

    public Pessoa(Integer idPessoa, String nome, String cpf, String rg, String fone, String celular, String email, Integer codEndereco, String dataNascimento, String sexo, String idade, String nacionalidade, String passaporte, String observacoes) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.fone = fone;
        this.celular = celular;
        this.email = email;
        this.codEndereco = codEndereco;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
        this.passaporte = passaporte;
        this.observacoes = observacoes;
    }
    
    @Override
    public String toString() {
        return "Pessoa{" + "idPessoa=" + idPessoa + ", nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", fone=" + fone + ", celular=" + celular + ", email=" + email + ", codEndereco=" + codEndereco + ", dataNascimento=" + dataNascimento + ", sexo=" + sexo + ", idade=" + idade + ", nacionalidade=" + nacionalidade + ", passaporte=" + passaporte + ", observacoes=" + observacoes + '}';
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

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
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
    
     public Integer getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Integer idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.idPessoa);
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
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.idPessoa, other.idPessoa)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Pessoa o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
        
}
