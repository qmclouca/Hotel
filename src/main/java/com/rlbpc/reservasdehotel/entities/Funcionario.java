/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rlbpc.reservasdehotel.entities;

import java.io.Serializable;

/**
 *
 * @author Rodolfo Bortoluzzi
 */
public class Funcionario extends Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;
    public String Ctps;
    public String DataContratacao;
    
    
    public Funcionario(){
        
    }
    
    public Funcionario(String ctps, String dataContratacao, Integer idPessoa, String nome, String cpf, String rg, String fone, String celular, String email, String logradouro, String numero, String bairro, String cidade, String cep, String pais, String estado, Integer codEndereco, String dataNascimento, String sexo, Integer idade, String nacionalidade, String passaporte, String complemento) {
        super(idPessoa, nome, cpf, rg, fone, celular, email, codEndereco, dataNascimento, sexo, idade, nacionalidade, passaporte, complemento);
        this.Ctps = ctps;
        this.DataContratacao = dataContratacao;
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
        this.observacoes = complemento;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.CEP = cep;
        this.pais = pais;
        this.estado = estado;
    }
    
    public Funcionario(
            Integer idPessoa,
            String nome, 
            String cpf, 
            String rg, 
            String ctps, 
            String dataContratacao, 
            String dataNascimento, 
            String email, 
            String fone, 
            String celular, 
            String logradouro, 
            String numero, 
            String bairro, 
            String cidade, 
            String cep, 
            String pais, 
            String estado, 
            String complemento){
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.Ctps = ctps;
        this.DataContratacao = dataContratacao;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.fone = fone;
        this.celular = celular;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.CEP = cep;
        this.pais = pais;
        this.estado = estado;
        this.complemento = complemento;        
    }


    @Override
    public String toString() {
        return "Funcionario{"
                + "Id = " + idPessoa
                + ", Nome = " + nome
                + ", Ctps = " + Ctps 
                + ", DataContratacao = " + DataContratacao 
                + ", CPF = " + cpf
                + ", RG = " + rg
                + ", Telefone = " + fone
                + ", Celular = " + celular
                + ", Email = " + email
                + ", codEndereco = " + codEndereco
                + ", dataNascimento = " + dataNascimento
                + ", Sexo = " + sexo
                + ", Idade = " + idade
                + ", Nacionalidade = " + nacionalidade
                + ", Observacoes = " + observacoes
                + '}';
    }

    
    public String getCtps() {
        return Ctps;
    }

    public void setCtps(String Ctps) {
        this.Ctps = Ctps;
    }

    public String getDataContratacao() {
        return DataContratacao;
    }

    public void setDataContratacao(String DataContratacao) {
        this.DataContratacao = DataContratacao;
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
}
