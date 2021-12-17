package com.rlbpc.reservasdehotel.entities;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
/**
 *
 * @author Rodolfo Bortoluzzi
 */
public class Hospede extends Pessoa implements Serializable{
    private static final long serialVersionUID = 1L;
    Integer idHospede;
    String procedencia;
    String metodoDePagamento;

    public Hospede(){
        
    }
    
    public static ArrayList<Hospede> lerArquivoHospedes(){
        File dir = new File("F:\\Rodolfo\\Dados I\\ReservasDeHotel\\src\\main\\java\\Persistencias");
        File arq = new File(dir, "hospedes.txt");
        ArrayList<Hospede> hospedes = new ArrayList<Hospede>();
        
        try {
            FileReader leitor = new FileReader(arq);
            BufferedReader bufferLeitura = new BufferedReader(leitor);
            String linha = "";
            String linhaDados = "";
            int idHospede = 0;
            int posNome = 0;
            int posCpf = 0;
            int posRg = 0;
            int posFone = 0;
            int posCelular = 0;
            int posEmail = 0;
            int posCodEndereco = 0;
            int posDataNascimento = 0;
            int posSexo = 0;
            int posIdade = 0;
            int posNacionalidade = 0;
            int posPassaporte = 0;
            int posObservacoes = 0;
            int posProcedencia = 0;
            int posLogradouro = 0;
            int posNumero = 0;
            int posBairro = 0;
            int posCidade = 0;
            int posCep = 0;
            int posPais = 0;
            int posEstado = 0;
            int posComplemento = 0;
            while ((linha = bufferLeitura.readLine()) != null){
                Hospede hospede = new Hospede();
                String[] linhaDadosSeparada = {"","","","","","","","","","","","","","","","","","","","","","","",""};
                linhaDados = linha.substring(8, linha.length());
                posNome = linhaDados.indexOf("Nome")+7;
                linhaDadosSeparada[0] = linhaDados.substring(posNome, linhaDados.indexOf(',', posNome));
                posCpf = linhaDados.indexOf("CPF")+6;
                linhaDadosSeparada[1] = linhaDados.substring(posCpf, linhaDados.indexOf(',', posCpf));
                posRg = linhaDados.indexOf("RG =")+5;
                linhaDadosSeparada[2] = linhaDados.substring(posRg, linhaDados.indexOf(',', posRg));
                posFone = linhaDados.indexOf("Telefone =")+10;
                linhaDadosSeparada[3] = linhaDados.substring(posFone, linhaDados.indexOf(',', posFone));
                posCelular = linhaDados.indexOf("Celular")+9;
                linhaDadosSeparada[4] = linhaDados.substring(posCelular, linhaDados.indexOf(',', posCelular));
                posEmail = linhaDados.indexOf("Email")+7;
                linhaDadosSeparada[5] = linhaDados.substring(posEmail, linhaDados.indexOf(',', posEmail));
                posCodEndereco = linhaDados.indexOf("CodEndereco")+13;
                linhaDadosSeparada[7] = linhaDados.substring(posDataNascimento, linhaDados.indexOf(',', posDataNascimento));
                posSexo = linhaDados.indexOf("Sexo")+6;
                linhaDadosSeparada[8] = linhaDados.substring(posSexo, linhaDados.indexOf(',', posSexo));
                posIdade = linhaDados.indexOf("Idade")+7;
                linhaDadosSeparada[9] = linhaDados.substring(posIdade, linhaDados.indexOf(',', posIdade));
                posNacionalidade = linhaDados.indexOf("Nacionalidade")+15;
                linhaDadosSeparada[10] = linhaDados.substring(posNacionalidade, linhaDados.indexOf(',', posNacionalidade));
                posPassaporte = linhaDados.indexOf("Passaporte")+12;
                linhaDadosSeparada[11] = linhaDados.substring(posPassaporte, linhaDados.indexOf(',', posPassaporte));
                posObservacoes = linhaDados.indexOf("Observacoes")+12;
                linhaDadosSeparada[12] = linhaDados.substring(posObservacoes, linhaDados.indexOf(',', posObservacoes));
                posLogradouro = linhaDados.indexOf("Logradouro")+12;
                linhaDadosSeparada[13] = linhaDados.substring(posLogradouro, linhaDados.indexOf(',', posLogradouro));
                posNumero = linhaDados.indexOf("Numero")+12;
                linhaDadosSeparada[14] = linhaDados.substring(posNumero, linhaDados.indexOf(',', posNumero));
                posBairro = linhaDados.indexOf("Bairro")+12;
                linhaDadosSeparada[15] = linhaDados.substring(posBairro, linhaDados.indexOf(',', posBairro));
                posCidade = linhaDados.indexOf("Cidade")+12;
                linhaDadosSeparada[16] = linhaDados.substring(posCidade, linhaDados.indexOf(',', posCidade));
                posCep = linhaDados.indexOf("CEP")+12;
                linhaDadosSeparada[17] = linhaDados.substring(posCep, linhaDados.indexOf(',', posCep));
                posPais = linhaDados.indexOf("Pais")+12;
                linhaDadosSeparada[18] = linhaDados.substring(posPais, linhaDados.indexOf(',', posPais));
                posEstado = linhaDados.indexOf("Estado")+12;
                linhaDadosSeparada[19] = linhaDados.substring(posEstado, linhaDados.indexOf(',', posEstado));
                posComplemento = linhaDados.indexOf("Complemento")+12;
                hospede.setIdHospede(idHospede);
                hospede.setNome(linhaDadosSeparada[0]);
                hospede.setCpf(linhaDadosSeparada[1]);
                hospede.setRg(linhaDadosSeparada[2]);
                hospede.setFone(linhaDadosSeparada[3]);
                hospede.setCelular(linhaDadosSeparada[4]);
                hospede.setEmail(linhaDadosSeparada[5]);
                hospede.setDataNascimento(linhaDadosSeparada[7]);
                hospede.setSexo(linhaDadosSeparada[8]);
                hospede.setIdade(linhaDadosSeparada[9]);
                hospede.setNacionalidade(linhaDadosSeparada[10]);
                hospede.setPassaporte(linhaDadosSeparada[11]);
                hospedes.add(hospede);
                idHospede++; 
            }
            leitor.close();
        } catch (IOException e){
            e.printStackTrace();            
        }
        return hospedes;        
    }
    
    public Hospede(Integer idHospede, 
            String procedencia, 
            String metodoDePagamento, 
            Integer idPessoa, 
            String nome, 
            String cpf, 
            String rg, 
            String fone, 
            String celular, 
            String email, 
            Integer codEndereco, 
            String dataNascimento, 
            String sexo, 
            String idade, 
            String nacionalidade, 
            String passaporte, 
            String observacoes, 
            String logradouro, 
            String numero, 
            String bairro, 
            String cidade, 
            String cep, 
            String pais, 
            String estado, 
            String complemento) {
        super(idPessoa, nome, cpf, rg, fone, celular, email, codEndereco, 
                dataNascimento, sexo, idade, nacionalidade, passaporte, 
                observacoes);
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
