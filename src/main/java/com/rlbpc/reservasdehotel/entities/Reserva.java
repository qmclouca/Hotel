/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rlbpc.reservasdehotel.entities;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import com.rlbpc.reservasdehotel.HotelModerno;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;


/**
 *
 * @author Rodolfo Bortoluzzi
 */
public class Reserva implements Serializable {
    private static final long serialVersionUID = 1L;
    private static Calendar DiaEntrada;
    int idReserva;
    DateTime dataInicial;
    DateTime dataFinal;
    String nomeHospedePrincipal;
    int idadeHospedePrincipal;
    String nomeHospedeAdicional1;
    int idadeHospedeAdicional1;
    String nomeHospedeAdicional2;
    int idadeHospedeAdicional2;
    String nomeHospedeAdicional3;
    int idadeHospedeAdicional3;
    String nomeHospedeAdicional4;
    int idadeHospedeAdicional4;
    String nomeHospedeAdicional5;
    int idadeHospedeAdicional5;
    String nomeHospedeAdicional6;
    int idadeHospedeAdicional6;
    String nomeHospedeAdicional7;
    int idadeHospedeAdicional7;
    String nomeHospedeAdicional8;
    int idadeHospedeAdicional8;
    String nomeHospedeAdicional9;
    int idadeHospedeAdicional9;
    String nomeHospedeAdicional10;
    int idadeHospedeAdicional10;
    String formaPagamento;
    String apartamento;
    float valorDiaria;
    float valorTotal;    
    
    public Reserva(){
    }
    
    public static ArrayList<Reserva> lerArquivoReserva(){
        File dir = new File("F:\\Rodolfo\\Dados I\\ReservasDeHotel\\src\\main\\java\\Persistencias");
        File arq = new File(dir, "reservas.txt");
        ArrayList<Reserva> reservas = new ArrayList<Reserva>();
        
        try {
            FileReader leitor = new FileReader(arq);
            BufferedReader bufferLeitura = new BufferedReader(leitor);
            String linha = "";
            String linhaDados = "";
            int idReserva = 0;
            DateTime dataInicial;
            DateTime dataFinal;
            String NomeHospedePrincipal = "";
            String NumeroApartamento = "";
            int posDataInicial = 0;        
            int posDataFinal = 0;
            int posNomeHospedePrincipal = 0;
            int posNumeroApartamento = 0;
            String pattern = "dd-MMM-yy hh.mm.ss aa";
            while ((linha = bufferLeitura.readLine()) != null){
                Reserva reserva = new Reserva();
                String[] linhaDadosSeparada = {"","","",""};
                linhaDados = linha.substring(8, linha.length());
                posDataInicial = linhaDados.indexOf("dataInicial")+11;
                dataInicial = DateTime.parse(linhaDados.substring(posDataInicial, linhaDados.indexOf(',', posDataInicial)), DateTimeFormat.forPattern(pattern));
                linhaDadosSeparada[0] = linhaDados.substring(posDataInicial, linhaDados.indexOf(',', posDataInicial));
                posDataFinal = linhaDados.indexOf("dataFinal")+10;
                dataFinal = DateTime.parse(linhaDados.substring(posDataFinal, linhaDados.indexOf(',', posDataFinal)), DateTimeFormat.forPattern(pattern));
                linhaDadosSeparada[1] = linhaDados.substring(posDataFinal, linhaDados.indexOf(',', posDataFinal));
                posNomeHospedePrincipal = linhaDados.indexOf("nomeHospedePrincipal")+21;
                linhaDadosSeparada[2] = linhaDados.substring(posNomeHospedePrincipal, linhaDados.indexOf(',', posNomeHospedePrincipal));
                posNumeroApartamento = linhaDados.indexOf("apartamento")+12;
                linhaDadosSeparada[3] = linhaDados.substring(posNumeroApartamento, linhaDados.indexOf('}', linhaDados.length()-1));
                reserva.setDataInicial(dataInicial);
                reserva.setDataFinal(dataFinal);
                reserva.setNomeHospedePrincipal(linhaDadosSeparada[2]);
                reservas.add(reserva);
                idReserva++; 
            }
            leitor.close();
        } catch (IOException e){
            e.printStackTrace();            
        }
        return reservas;        
    }
    
    public Reserva(DateTime dataInicial, DateTime dataFinal, String nomeHospedePrincipal, String apartamento) {
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.nomeHospedePrincipal = nomeHospedePrincipal;
        this.apartamento = apartamento;
    }

    @Override
    public String toString() {
        return "Reserva{" + "dataInicial=" + dataInicial + ", dataFinal=" + dataFinal + ", nomeHospedePrincipal=" + nomeHospedePrincipal + ", apartamento=" + apartamento + '}';
    }

    public Reserva(int idReserva, DateTime dataInicial, DateTime dataFinal, String nomeHospedePrincipal, int idadeHospedePrincipal, String nomeHospedeAdicional1, int idadeHospedeAdicional1, String nomeHospedeAdicional2, int idadeHospedeAdicional2, String nomeHospedeAdicional3, int idadeHospedeAdicional3, String nomeHospedeAdicional4, int idadeHospedeAdicional4, String nomeHospedeAdicional5, int idadeHospedeAdicional5, String nomeHospedeAdicional6, int idadeHospedeAdicional6, String nomeHospedeAdicional7, int idadeHospedeAdicional7, String nomeHospedeAdicional8, int idadeHospedeAdicional8, String nomeHospedeAdicional9, int idadeHospedeAdicional9, String nomeHospedeAdicional10, int idadeHospedeAdicional10, String formaPagamento, String apartamento, float valorDiaria, float valorTotal) {
        this.idReserva = idReserva;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.nomeHospedePrincipal = nomeHospedePrincipal;
        this.idadeHospedePrincipal = idadeHospedePrincipal;
        this.nomeHospedeAdicional1 = nomeHospedeAdicional1;
        this.idadeHospedeAdicional1 = idadeHospedeAdicional1;
        this.nomeHospedeAdicional2 = nomeHospedeAdicional2;
        this.idadeHospedeAdicional2 = idadeHospedeAdicional2;
        this.nomeHospedeAdicional3 = nomeHospedeAdicional3;
        this.idadeHospedeAdicional3 = idadeHospedeAdicional3;
        this.nomeHospedeAdicional4 = nomeHospedeAdicional4;
        this.idadeHospedeAdicional4 = idadeHospedeAdicional4;
        this.nomeHospedeAdicional5 = nomeHospedeAdicional5;
        this.idadeHospedeAdicional5 = idadeHospedeAdicional5;
        this.nomeHospedeAdicional6 = nomeHospedeAdicional6;
        this.idadeHospedeAdicional6 = idadeHospedeAdicional6;
        this.nomeHospedeAdicional7 = nomeHospedeAdicional7;
        this.idadeHospedeAdicional7 = idadeHospedeAdicional7;
        this.nomeHospedeAdicional8 = nomeHospedeAdicional8;
        this.idadeHospedeAdicional8 = idadeHospedeAdicional8;
        this.nomeHospedeAdicional9 = nomeHospedeAdicional9;
        this.idadeHospedeAdicional9 = idadeHospedeAdicional9;
        this.nomeHospedeAdicional10 = nomeHospedeAdicional10;
        this.idadeHospedeAdicional10 = idadeHospedeAdicional10;
        this.formaPagamento = formaPagamento;
        this.apartamento = apartamento;
        this.valorDiaria = valorDiaria;
        this.valorTotal = valorTotal;
    }

    public static Calendar getDiaEntrada() {
        return DiaEntrada;
    }

    public static void setDiaEntrada(Calendar DiaEntrada) {
        Reserva.DiaEntrada = DiaEntrada;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public DateTime getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(DateTime dataInicial) {
        this.dataInicial = dataInicial;
    }

    public DateTime getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(DateTime dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getNomeHospedePrincipal() {
        return nomeHospedePrincipal;
    }

    public void setNomeHospedePrincipal(String nomeHospedePrincipal) {
        this.nomeHospedePrincipal = nomeHospedePrincipal;
    }

    public int getIdadeHospedePrincipal() {
        return idadeHospedePrincipal;
    }

    public void setIdadeHospedePrincipal(int idadeHospedePrincipal) {
        this.idadeHospedePrincipal = idadeHospedePrincipal;
    }

    public String getNomeHospedeAdicional1() {
        return nomeHospedeAdicional1;
    }

    public void setNomeHospedeAdicional1(String nomeHospedeAdicional1) {
        this.nomeHospedeAdicional1 = nomeHospedeAdicional1;
    }

    public int getIdadeHospedeAdicional1() {
        return idadeHospedeAdicional1;
    }

    public void setIdadeHospedeAdicional1(int idadeHospedeAdicional1) {
        this.idadeHospedeAdicional1 = idadeHospedeAdicional1;
    }

    public String getNomeHospedeAdicional2() {
        return nomeHospedeAdicional2;
    }

    public void setNomeHospedeAdicional2(String nomeHospedeAdicional2) {
        this.nomeHospedeAdicional2 = nomeHospedeAdicional2;
    }

    public int getIdadeHospedeAdicional2() {
        return idadeHospedeAdicional2;
    }

    public void setIdadeHospedeAdicional2(int idadeHospedeAdicional2) {
        this.idadeHospedeAdicional2 = idadeHospedeAdicional2;
    }

    public String getNomeHospedeAdicional3() {
        return nomeHospedeAdicional3;
    }

    public void setNomeHospedeAdicional3(String nomeHospedeAdicional3) {
        this.nomeHospedeAdicional3 = nomeHospedeAdicional3;
    }

    public int getIdadeHospedeAdicional3() {
        return idadeHospedeAdicional3;
    }

    public void setIdadeHospedeAdicional3(int idadeHospedeAdicional3) {
        this.idadeHospedeAdicional3 = idadeHospedeAdicional3;
    }

    public String getNomeHospedeAdicional4() {
        return nomeHospedeAdicional4;
    }

    public void setNomeHospedeAdicional4(String nomeHospedeAdicional4) {
        this.nomeHospedeAdicional4 = nomeHospedeAdicional4;
    }

    public int getIdadeHospedeAdicional4() {
        return idadeHospedeAdicional4;
    }

    public void setIdadeHospedeAdicional4(int idadeHospedeAdicional4) {
        this.idadeHospedeAdicional4 = idadeHospedeAdicional4;
    }

    public String getNomeHospedeAdicional5() {
        return nomeHospedeAdicional5;
    }

    public void setNomeHospedeAdicional5(String nomeHospedeAdicional5) {
        this.nomeHospedeAdicional5 = nomeHospedeAdicional5;
    }

    public int getIdadeHospedeAdicional5() {
        return idadeHospedeAdicional5;
    }

    public void setIdadeHospedeAdicional5(int idadeHospedeAdicional5) {
        this.idadeHospedeAdicional5 = idadeHospedeAdicional5;
    }

    public String getNomeHospedeAdicional6() {
        return nomeHospedeAdicional6;
    }

    public void setNomeHospedeAdicional6(String nomeHospedeAdicional6) {
        this.nomeHospedeAdicional6 = nomeHospedeAdicional6;
    }

    public int getIdadeHospedeAdicional6() {
        return idadeHospedeAdicional6;
    }

    public void setIdadeHospedeAdicional6(int idadeHospedeAdicional6) {
        this.idadeHospedeAdicional6 = idadeHospedeAdicional6;
    }

    public String getNomeHospedeAdicional7() {
        return nomeHospedeAdicional7;
    }

    public void setNomeHospedeAdicional7(String nomeHospedeAdicional7) {
        this.nomeHospedeAdicional7 = nomeHospedeAdicional7;
    }

    public int getIdadeHospedeAdicional7() {
        return idadeHospedeAdicional7;
    }

    public void setIdadeHospedeAdicional7(int idadeHospedeAdicional7) {
        this.idadeHospedeAdicional7 = idadeHospedeAdicional7;
    }

    public String getNomeHospedeAdicional8() {
        return nomeHospedeAdicional8;
    }

    public void setNomeHospedeAdicional8(String nomeHospedeAdicional8) {
        this.nomeHospedeAdicional8 = nomeHospedeAdicional8;
    }

    public int getIdadeHospedeAdicional8() {
        return idadeHospedeAdicional8;
    }

    public void setIdadeHospedeAdicional8(int idadeHospedeAdicional8) {
        this.idadeHospedeAdicional8 = idadeHospedeAdicional8;
    }

    public String getNomeHospedeAdicional9() {
        return nomeHospedeAdicional9;
    }

    public void setNomeHospedeAdicional9(String nomeHospedeAdicional9) {
        this.nomeHospedeAdicional9 = nomeHospedeAdicional9;
    }

    public int getIdadeHospedeAdicional9() {
        return idadeHospedeAdicional9;
    }

    public void setIdadeHospedeAdicional9(int idadeHospedeAdicional9) {
        this.idadeHospedeAdicional9 = idadeHospedeAdicional9;
    }

    public String getNomeHospedeAdicional10() {
        return nomeHospedeAdicional10;
    }

    public void setNomeHospedeAdicional10(String nomeHospedeAdicional10) {
        this.nomeHospedeAdicional10 = nomeHospedeAdicional10;
    }

    public int getIdadeHospedeAdicional10() {
        return idadeHospedeAdicional10;
    }

    public void setIdadeHospedeAdicional10(int idadeHospedeAdicional10) {
        this.idadeHospedeAdicional10 = idadeHospedeAdicional10;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getApartamento() {
        return apartamento;
    }

    public void setApartamento(String apartamento) {
        this.apartamento = apartamento;
    }

    public float getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(float valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.idReserva;
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
        final Reserva other = (Reserva) obj;
        if (this.idReserva != other.idReserva) {
            return false;
        }
        return true;
    }
   
    
    
}
