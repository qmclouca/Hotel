package com.rlbpc.reservasdehotel.entities;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Rodolfo Bortoluzzi
 */
//@Entity
public class Endereco implements Serializable{
    private static final long serialVersionUID = 1L;
    Integer idEndereco;
    String logradouro;
    String numero;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    String CEP;
    String bairro;
    String estado;
    String pais;
    String cidade;
    String complemento;

    public Endereco() {
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.idEndereco);
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
        final Endereco other = (Endereco) obj;
        if (!Objects.equals(this.idEndereco, other.idEndereco)) {
            return false;
        }
        return true;
    }

    public Endereco(Integer idEndereco, String logradouro, String CEP, String bairro, String estado, String pais, String cidade, String complemento) {
        this.idEndereco = idEndereco;
        this.logradouro = logradouro;
        this.CEP = CEP;
        this.bairro = bairro;
        this.estado = estado;
        this.pais = pais;
        this.cidade = cidade;
        this.complemento = complemento;
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
    
    
}
