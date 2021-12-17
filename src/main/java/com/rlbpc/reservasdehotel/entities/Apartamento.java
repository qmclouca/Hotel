package com.rlbpc.reservasdehotel.entities;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/**
 * @author Rodolfo Bortoluzzi
 */
public class Apartamento extends Agenda implements Serializable{
    private static final long serialVersionUID = 1L;
    Integer idApartamento;
    String numeroApartamento;
    String tipoApartamento;
    String capacidadeApartamento;
    String statusApartamento;
    Agenda agendaApartamento;
    String valorDiaria;
    String descricaoApartamento;

    public static List<Apartamento> lerArquivoApartamento(){
        File dir = new File("F:\\Rodolfo\\Dados I\\ReservasDeHotel\\src\\main\\java\\Persistencias");
        File arq = new File(dir, "apartamentos.txt");
        ArrayList<Apartamento> apartamentos = new ArrayList<Apartamento>();
        
        try {
            FileReader leitor = new FileReader(arq);
            BufferedReader bufferLeitura = new BufferedReader(leitor);
            String linha = "";
            String linhaDados = "";
            int idAP = 0;
            int posNumeroApartamento = 0;
            int posTipoApartamento = 0;
            int posCapacidadeApartamento = 0;
            int posStatusApartamento = 0;
            int posAgendaApartamento = 0;
            int posValorDiaria = 0;
            int posDescricaoApartamento = 0;
            Apartamento ap = new Apartamento();
            while ((linha = bufferLeitura.readLine()) != null){
                String[] linhaDadosSeparada = {"","","","","","",""};
                linhaDados = linha.substring(12, linha.length());
                posNumeroApartamento = linhaDados.indexOf("numeroApartamento")+18;
                linhaDadosSeparada[0] = linhaDados.substring(posNumeroApartamento, linhaDados.indexOf(',', posNumeroApartamento));
                posTipoApartamento = linhaDados.indexOf("tipoApartamento")+16;
                linhaDadosSeparada[1] = linhaDados.substring(posTipoApartamento, linhaDados.indexOf(',', posTipoApartamento));
                posCapacidadeApartamento = linhaDados.indexOf("capacidadeApartamento")+22;
                linhaDadosSeparada[2] = linhaDados.substring(posCapacidadeApartamento, linhaDados.indexOf(',', posCapacidadeApartamento));
                posStatusApartamento = linhaDados.indexOf("capacidadeApartamento")+22;
                linhaDadosSeparada[3] = linhaDados.substring(posStatusApartamento, linhaDados.indexOf(',', posStatusApartamento));
                posAgendaApartamento = linhaDados.indexOf("agendaApartamento")+18;
                linhaDadosSeparada[4] = linhaDados.substring(posAgendaApartamento, linhaDados.indexOf(',', posAgendaApartamento));
                posValorDiaria = linhaDados.indexOf("valorDiaria")+12;
                linhaDadosSeparada[5] = linhaDados.substring(posValorDiaria, linhaDados.indexOf(',', posValorDiaria));
                posDescricaoApartamento = linhaDados.indexOf("descricaoApartamento")+21;
                linhaDadosSeparada[6] = linhaDados.substring(posDescricaoApartamento, linhaDados.indexOf('}', linhaDados.length()-1));
                ap.setIdApartamento(idAP);
                ap.setNumeroApartamento(linhaDadosSeparada[0]);
                ap.setTipoApartamento(linhaDadosSeparada[1]);
                ap.setCapacidadeApartamento(linhaDadosSeparada[2]);
                ap.setStatusApartamento(linhaDadosSeparada[3]);
                ap.setValorDiaria(linhaDadosSeparada[5]);
                ap.setDescricaoApartamento(linhaDadosSeparada[6]);
                apartamentos.add(ap);
                posNumeroApartamento = 0;
                posTipoApartamento = 0;
                posCapacidadeApartamento = 0;
                posStatusApartamento = 0;
                posAgendaApartamento = 0;
                posValorDiaria = 0;
                posDescricaoApartamento = 0;        
                idAP++; 
            }
            leitor.close();
        } catch (IOException e){
            e.printStackTrace();            
        }
        return apartamentos;        
    }
    
    public Apartamento(){
        
    }
    public Apartamento(Integer idApartamento,
            String numeroApartamento,
            String tipoApartamento,
            String capacidadeApartamento,
            String statusApartamento,
            Agenda agendaApartamento,
            String valorDiaria,
            String descricaoApartamento) {
        this.idApartamento = idApartamento;
        this.numeroApartamento = numeroApartamento;
        this.tipoApartamento = tipoApartamento;
        this.capacidadeApartamento = capacidadeApartamento;
        this.statusApartamento = statusApartamento;
        this.agendaApartamento = agendaApartamento;
        this.valorDiaria = valorDiaria;
        this.descricaoApartamento = descricaoApartamento;
    }

    @Override
    public String toString() {
        return "Apartamento{" 
                + "idApartamento=" + idApartamento 
                + ", numeroApartamento=" + numeroApartamento 
                + ", tipoApartamento=" + tipoApartamento 
                + ", capacidadeApartamento=" + capacidadeApartamento 
                + ", statusApartamento=" + statusApartamento 
                + ", agendaApartamento=" + agendaApartamento 
                + ", valorDiaria=" + valorDiaria 
                + ", descricaoApartamento=" + descricaoApartamento 
                + '}';
    }

    public String getDescricaoApartamento() {
        return descricaoApartamento;
    }

    public void setDescricaoApartamento(String descricaoApartamento) {
        this.descricaoApartamento = descricaoApartamento;
    }

    public Integer getIdApartamento() {
        return idApartamento;
    }

    public String getCapacidadeApartamento() {
        return capacidadeApartamento;
    }

    public void setCapacidadeApartamento(String capacidadeApartamento) {
        this.capacidadeApartamento = capacidadeApartamento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.idApartamento);
        hash = 41 * hash + Objects.hashCode(this.numeroApartamento);
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
        final Apartamento other = (Apartamento) obj;
        if (!Objects.equals(this.idApartamento, other.idApartamento)) {
            return false;
        }
        if (!Objects.equals(this.numeroApartamento, other.numeroApartamento)) {
            return false;
        }
        return true;
    }

    public void setIdApartamento(Integer idApartamento) {
        this.idApartamento = idApartamento;
    }

    public String getNumeroApartamento() {
        return numeroApartamento;
    }

    public void setNumeroApartamento(String numeroApartamento) {
        this.numeroApartamento = numeroApartamento;
    }

    public String getTipoApartamento() {
        return tipoApartamento;
    }

    public void setTipoApartamento(String tipoApartamento) {
        this.tipoApartamento = tipoApartamento;
    }

    public String getStatusApartamento() {
        return statusApartamento;
    }

    public void setStatusApartamento(String statusApartamento) {
        this.statusApartamento = statusApartamento;
    }

    public Agenda getAgendaApartamento() {
        return agendaApartamento;
    }

    public void setAgendaApartamento(Agenda agendaApartamento) {
        this.agendaApartamento = agendaApartamento;
    }

    public String getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(String valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
    
    
}
