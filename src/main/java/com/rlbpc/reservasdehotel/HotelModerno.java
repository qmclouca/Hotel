/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.rlbpc.reservasdehotel;

import com.rlbpc.reservasdehotel.entities.Apartamento;
import java.sql.*;
import com.rlbpc.reservasdehotel.entities.Funcionario;
import com.rlbpc.reservasdehotel.entities.Hospede;
import static java.awt.image.ImageObserver.HEIGHT;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Rodolfo Bortoluzzi
 */


public class HotelModerno extends javax.swing.JFrame{
    List<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
    List<Hospede> listaHospede = new ArrayList<Hospede>();
    List<Apartamento> listaApartamento = new ArrayList<Apartamento>();
    
    /*
    public int[] recuperaNumeracoes(){
        int numeracoes[];
        try {
            File fileHospedes = new File("F:\\Rodolfo\\Dados I\\ReservasDeHotel\\src\\main\\java\\Persistencias\\hospedes.txt");
            File fileApartamentos = new File("F:\\Rodolfo\\Dados I\\ReservasDeHotel\\src\\main\\java\\Persistencias\\apartamentos.txt");
            File fileFuncionarios = new File("F:\\Rodolfo\\Dados I\\ReservasDeHotel\\src\\main\\java\\Persistencias\\funcionatios.txt");
                     
            //TODO ler arquivos e pegar as últimas numerações
                    } catch {
        };
    return numeracoes;
    }
    
    }
    */
    
    public void salvaFuncionario(String fileName, List<Funcionario> list) throws Exception {
        try {    
            File file = new File(fileName);
            if (!file.exists()){
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            	for (int i=0; listaFuncionario!=null && i<listaFuncionario.size(); i++){
                    bw.write(listaFuncionario.get(i).toString());
                    bw.write("\n");                   
                }
                bw.close();
                fw.close();                
	    } catch (Exception e) {
		System.out.println("ERRO: " + e.getMessage());
		throw e;
	    } 
    }
    
    public void salvaHospede(String fileName, List<Hospede> list) throws Exception {
        try {    
            File file = new File(fileName);
            if (!file.exists()){
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            	for (int i=0; listaHospede!=null && i<listaHospede.size(); i++){
                    bw.write(listaHospede.get(i).toString());
                    bw.write("\n");
                   
                }
                bw.close();
                fw.close();                
	    } catch (Exception e) {
		System.out.println("ERRO: " + e.getMessage());
		throw e;
	    } 
    }
    
    public void salvaApartamento(String fileName, List<Apartamento> list) throws Exception {
        try {    
            File file = new File(fileName);
            if (!file.exists()){
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            	for (int i=0; listaApartamento!=null && i<listaApartamento.size(); i++){
                    bw.write(listaApartamento.get(i).toString());
                    bw.write("\n");                   
                }
                bw.close();
                fw.close();                
	    } catch (Exception e) {
		System.out.println("ERRO: " + e.getMessage());
		throw e;
	    } 
    }
   
    public HotelModerno() {        
        initComponents();    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MultiGuiasNivel1 = new javax.swing.JTabbedPane();
        GuiaMeuHotel = new javax.swing.JPanel();
        MultiGuiasNivel2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        Nome1 = new javax.swing.JTextField();
        Cpf1 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        Rg1 = new javax.swing.JTextField();
        Ctps = new javax.swing.JTextField();
        DataContratacao1 = new javax.swing.JTextField();
        DataNascimento1 = new javax.swing.JTextField();
        Email1 = new javax.swing.JTextField();
        Fone1 = new javax.swing.JTextField();
        Celular1 = new javax.swing.JTextField();
        BtnCadastraFuncionario = new javax.swing.JButton();
        BtnBuscarFuncionario = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        Logradouro1 = new javax.swing.JTextField();
        Numero1 = new javax.swing.JTextField();
        Bairro1 = new javax.swing.JTextField();
        Cidade1 = new javax.swing.JTextField();
        Cep1 = new javax.swing.JTextField();
        Pais1 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Complemento1 = new javax.swing.JTextArea();
        jLabel42 = new javax.swing.JLabel();
        Estado1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Nome = new javax.swing.JTextField();
        Cpf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Rg = new javax.swing.JTextField();
        Passaporte = new javax.swing.JTextField();
        Nacionalidade = new javax.swing.JTextField();
        DataNascimento = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        Fone = new javax.swing.JTextField();
        Celular = new javax.swing.JTextField();
        BtnCadastraCliente = new javax.swing.JButton();
        BtnBuscarCliente = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Logradouro = new javax.swing.JTextField();
        Numero = new javax.swing.JTextField();
        Bairro = new javax.swing.JTextField();
        Cidade = new javax.swing.JTextField();
        Cep = new javax.swing.JTextField();
        Pais = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Complemento = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        Estado = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        TipoSuite = new javax.swing.JComboBox<>();
        NumSuite = new javax.swing.JTextField();
        ValorDiaria = new javax.swing.JTextField();
        BtnCadastraQuarto = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TxtDescricaoSuite = new javax.swing.JTextArea();
        CapacidadeApartamento = new javax.swing.JTextField();
        GuiaReservas = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        canvas1 = new java.awt.Canvas();
        jTextField1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jSpinner5 = new javax.swing.JSpinner();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSpinner6 = new javax.swing.JSpinner();
        jButton2 = new javax.swing.JButton();
        BtnAutorizar = new javax.swing.JButton();
        Login = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        BtnBloquear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PSII - Hotel - Autor: Rodolfo Lucas Bortoluzzi");
        setResizable(false);
        setSize(new java.awt.Dimension(600, 900));

        MultiGuiasNivel1.setEnabled(false);

        MultiGuiasNivel2.setEnabled(false);

        jPanel3.setEnabled(false);

        jLabel26.setText("Nome:");

        Nome1.setEnabled(false);

        Cpf1.setEnabled(false);

        jLabel27.setText("CPF:");

        jLabel28.setText("RG:");

        jLabel29.setText("CTPS:");

        jLabel30.setText("Data de contratação:");

        jLabel31.setText("Data de nascimento:");

        jLabel32.setText("Email:");

        jLabel33.setText("Telefone:");

        jLabel34.setText("Celular:");

        Rg1.setEnabled(false);

        Ctps.setEnabled(false);

        DataContratacao1.setEnabled(false);

        DataNascimento1.setEnabled(false);

        Email1.setEnabled(false);

        Fone1.setEnabled(false);

        Celular1.setEnabled(false);

        BtnCadastraFuncionario.setText("Cadastrar");
        BtnCadastraFuncionario.setEnabled(false);
        BtnCadastraFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadastraFuncionarioActionPerformed(evt);
            }
        });

        BtnBuscarFuncionario.setText("Buscar");
        BtnBuscarFuncionario.setEnabled(false);
        BtnBuscarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarFuncionarioActionPerformed(evt);
            }
        });

        jLabel35.setText("Logradouro:");

        jLabel36.setText("Bairro:");

        jLabel37.setText("Cidade:");

        jLabel38.setText("CEP:");

        jLabel39.setText("Pais:");

        jLabel40.setText("Número:");

        Logradouro1.setEnabled(false);

        Numero1.setEnabled(false);
        Numero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero1ActionPerformed(evt);
            }
        });

        Bairro1.setEnabled(false);

        Cidade1.setEnabled(false);

        Cep1.setEnabled(false);

        Pais1.setEnabled(false);

        jLabel41.setText("Complemento:");

        Complemento1.setColumns(20);
        Complemento1.setRows(5);
        Complemento1.setEnabled(false);
        jScrollPane4.setViewportView(Complemento1);

        jLabel42.setText("Estado:");

        Estado1.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel41)
                    .addComponent(jLabel40)
                    .addComponent(jLabel39)
                    .addComponent(jLabel38)
                    .addComponent(jLabel37)
                    .addComponent(jLabel36)
                    .addComponent(jLabel35)
                    .addComponent(jLabel34)
                    .addComponent(jLabel33)
                    .addComponent(jLabel32)
                    .addComponent(jLabel31)
                    .addComponent(jLabel30)
                    .addComponent(jLabel29)
                    .addComponent(jLabel28)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(BtnCadastraFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnBuscarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Estado1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Pais1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Cep1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Cidade1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Bairro1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Numero1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Logradouro1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Celular1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Fone1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Email1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(DataNascimento1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(DataContratacao1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Ctps, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Rg1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Cpf1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Nome1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(Nome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cpf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(Rg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(Ctps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(DataContratacao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(DataNascimento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(Email1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(Fone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(Celular1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(Logradouro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(Numero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(Bairro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(Cidade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(Cep1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(Pais1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(Estado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel41))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnCadastraFuncionario)
                    .addComponent(BtnBuscarFuncionario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 74, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 132, Short.MAX_VALUE))
        );

        MultiGuiasNivel2.addTab("Cadastro de Funcionários", jPanel5);

        jLabel1.setText("Nome:");

        Nome.setEnabled(false);

        Cpf.setEnabled(false);

        jLabel2.setText("CPF:");

        jLabel3.setText("RG:");

        jLabel4.setText("Passaporte:");

        jLabel5.setText("Nacionalidade:");

        jLabel6.setText("Data de nascimento:");

        jLabel7.setText("Email:");

        jLabel8.setText("Telefone:");

        jLabel9.setText("Celular:");

        Rg.setEnabled(false);

        Passaporte.setEnabled(false);

        Nacionalidade.setEnabled(false);

        DataNascimento.setEnabled(false);

        Email.setEnabled(false);

        Fone.setEnabled(false);

        Celular.setEnabled(false);

        BtnCadastraCliente.setText("Cadastrar");
        BtnCadastraCliente.setEnabled(false);
        BtnCadastraCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadastraClienteActionPerformed(evt);
            }
        });

        BtnBuscarCliente.setText("Buscar");
        BtnBuscarCliente.setEnabled(false);
        BtnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarClienteActionPerformed(evt);
            }
        });

        jLabel10.setText("Logradouro:");

        jLabel11.setText("Bairro:");

        jLabel12.setText("Cidade:");

        jLabel13.setText("CEP:");

        jLabel14.setText("Pais:");

        jLabel15.setText("Número:");

        Logradouro.setEnabled(false);

        Numero.setEnabled(false);
        Numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumeroActionPerformed(evt);
            }
        });

        Bairro.setEnabled(false);

        Cidade.setEnabled(false);

        Cep.setEnabled(false);

        Pais.setEnabled(false);

        jLabel16.setText("Complemento:");

        Complemento.setColumns(20);
        Complemento.setRows(5);
        Complemento.setEnabled(false);
        jScrollPane1.setViewportView(Complemento);

        jLabel17.setText("Estado:");

        Estado.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BtnCadastraCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Estado, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Pais, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Cep, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Cidade, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Bairro, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Numero, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Logradouro, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Celular, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Fone, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Email, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(DataNascimento, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Nacionalidade, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Passaporte, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Rg, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Cpf, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Nome, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Passaporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Nacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(DataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Fone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(Numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(Cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(Pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel16))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnCadastraCliente)
                    .addComponent(BtnBuscarCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MultiGuiasNivel2.addTab("Cadastrar Cliente", jPanel2);

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));

        jLabel20.setText("Número da suíte:");

        jLabel21.setText("Tipo:");

        jLabel22.setText("Capacidade de pessoas:");

        jLabel23.setText("Valor da diária (R$):");

        TipoSuite.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Simples", "Luxo" }));
        TipoSuite.setEnabled(false);
        TipoSuite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoSuiteActionPerformed(evt);
            }
        });

        NumSuite.setEnabled(false);
        NumSuite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumSuiteActionPerformed(evt);
            }
        });

        ValorDiaria.setEnabled(false);

        BtnCadastraQuarto.setText("Cadastrar Quarto");
        BtnCadastraQuarto.setEnabled(false);
        BtnCadastraQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadastraQuartoActionPerformed(evt);
            }
        });

        TxtDescricaoSuite.setColumns(20);
        TxtDescricaoSuite.setLineWrap(true);
        TxtDescricaoSuite.setRows(5);
        TxtDescricaoSuite.setText("Inclua aqui a descrição e outras informações pertinentes sobre o quarto");
        TxtDescricaoSuite.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane3.setViewportView(TxtDescricaoSuite);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel21)
                            .addComponent(jLabel20)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TipoSuite, javax.swing.GroupLayout.Alignment.LEADING, 0, 155, Short.MAX_VALUE)
                            .addComponent(NumSuite)
                            .addComponent(ValorDiaria)
                            .addComponent(CapacidadeApartamento))
                        .addGap(18, 18, 18)
                        .addComponent(BtnCadastraQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(NumSuite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(TipoSuite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(CapacidadeApartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ValorDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(BtnCadastraQuarto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );

        MultiGuiasNivel2.addTab("Cadastros de Quartos", jPanel4);

        javax.swing.GroupLayout GuiaMeuHotelLayout = new javax.swing.GroupLayout(GuiaMeuHotel);
        GuiaMeuHotel.setLayout(GuiaMeuHotelLayout);
        GuiaMeuHotelLayout.setHorizontalGroup(
            GuiaMeuHotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GuiaMeuHotelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MultiGuiasNivel2)
                .addContainerGap())
        );
        GuiaMeuHotelLayout.setVerticalGroup(
            GuiaMeuHotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GuiaMeuHotelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MultiGuiasNivel2, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MultiGuiasNivel1.addTab("Recursos", GuiaMeuHotel);

        jLabel43.setText("Data de entrada:");

        jLabel44.setText("Data da saída:");

        jLabel45.setText("Horário da entrada:");

        jLabel46.setText("Horário da saída:");

        jLabel24.setText("Hóspede prinicipal:");

        jLabel25.setText("Idade:");

        jLabel47.setText("Número de pessoas:");

        jLabel48.setText("Valor total (R$):");

        jLabel49.setText("jLabel49");

        jButton1.setText("Confirmar Reserva");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel50.setText("Forma de pagamento:");

        jLabel51.setText("Demais hóspedes:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Idade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(160);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(5);
        }

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton2.setText("Adicionar hóspedes");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GuiaReservasLayout = new javax.swing.GroupLayout(GuiaReservas);
        GuiaReservas.setLayout(GuiaReservasLayout);
        GuiaReservasLayout.setHorizontalGroup(
            GuiaReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GuiaReservasLayout.createSequentialGroup()
                .addGroup(GuiaReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GuiaReservasLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(GuiaReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel51)
                            .addComponent(jLabel47)
                            .addComponent(jLabel24)
                            .addComponent(jLabel44)
                            .addComponent(jLabel43))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(GuiaReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, GuiaReservasLayout.createSequentialGroup()
                                .addGroup(GuiaReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(GuiaReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(GuiaReservasLayout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jLabel46))
                                    .addComponent(jLabel45))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(GuiaReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinner1)
                                    .addComponent(jSpinner3))
                                .addGap(0, 0, 0)
                                .addGroup(GuiaReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSpinner4, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                                    .addComponent(jSpinner2))
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, GuiaReservasLayout.createSequentialGroup()
                                .addGroup(GuiaReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, GuiaReservasLayout.createSequentialGroup()
                                        .addGroup(GuiaReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, GuiaReservasLayout.createSequentialGroup()
                                                .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(GuiaReservasLayout.createSequentialGroup()
                        .addGroup(GuiaReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(GuiaReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(GuiaReservasLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel50)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(GuiaReservasLayout.createSequentialGroup()
                                    .addGap(60, 60, 60)
                                    .addComponent(jLabel48)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel49))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(232, 232, 232))
        );
        GuiaReservasLayout.setVerticalGroup(
            GuiaReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GuiaReservasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GuiaReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(jLabel45)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(GuiaReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(jLabel46)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(GuiaReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(GuiaReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(GuiaReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GuiaReservasLayout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addGap(70, 70, 70)
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                .addGroup(GuiaReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(GuiaReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(jLabel49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(241, 241, 241))
        );

        MultiGuiasNivel1.addTab("Reservas", GuiaReservas);

        BtnAutorizar.setText("Autorizar");
        BtnAutorizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAutorizarActionPerformed(evt);
            }
        });

        jLabel18.setText("Login:");

        jLabel19.setText("Senha:");

        BtnBloquear.setText("Bloquear");
        BtnBloquear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBloquearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(Password))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnAutorizar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnBloquear, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MultiGuiasNivel1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(BtnAutorizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnBloquear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MultiGuiasNivel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        MultiGuiasNivel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCadastraClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastraClienteActionPerformed
        Path arqHospede = Paths.get("F:\\Rodolfo\\Dados I\\ReservasDeHotel\\src\\main\\java\\Persistencias\\hospedes.txt");
        Hospede hospede = new Hospede();
        hospede.setNome(Nome.getText());
        hospede.setCpf(Cpf.getText());
        hospede.setRg(Rg.getText());
        hospede.setPassaporte(Passaporte.getText());
        hospede.setNacionalidade(Nacionalidade.getText());
        hospede.setDataNascimento(DataNascimento.getText());
        hospede.setEmail(Email.getText());
        hospede.setFone(Fone.getText());
        hospede.setCelular(Celular.getText());
        hospede.setLogradouro(Logradouro.getText());
        hospede.setNumero(Numero.getText());
        hospede.setBairro(Bairro.getText());
        hospede.setCidade(Cidade.getText());
        hospede.setCEP(Cep.getText());
        hospede.setPais(Pais.getText());
        hospede.setEstado(Estado.getText());
        hospede.setComplemento(Complemento.getText());
        listaHospede.add(new Hospede(
               hospede.getIdHospede(),
               hospede.getProcedencia(),
               hospede.getMetodoDePagamento(),
               hospede.getIdPessoa(),
               hospede.getNome(),
               hospede.getCpf(),
               hospede.getRg(),
               hospede.getFone(),
               hospede.getCelular(),
               hospede.getEmail(),
               hospede.getCodEndereco(),
               hospede.getDataNascimento(),
               hospede.getSexo(),
               hospede.getIdade(),
               hospede.getNacionalidade(),
               hospede.getPassaporte(),
               hospede.getObservacoes(),
               hospede.getLogradouro(),
               hospede.getNumero(),
               hospede.getBairro(),
               hospede.getCidade(),
               hospede.getCEP(),
               hospede.getPais(),
               hospede.getEstado(),
               hospede.getComplemento()
        ));
         try {
            salvaHospede(arqHospede.toString(), listaHospede);
        } catch (Exception ex) {
            System.out.println("modifique o caminho do arquivo hospede.txt e crie o mesmo antes de rodar o programa." );
            Logger.getLogger(HotelModerno.class.getName()).log(Level.SEVERE, null, ex);
        }
        Nome.setText("");
        Cpf.setText("");
        Rg.setText("");
        Passaporte.setText("");
        Nacionalidade.setText("");
        DataNascimento.setText("");
        Email.setText("");
        Fone.setText("");
        Celular.setText("");
        Logradouro.setText("");
        Numero.setText("");
        Bairro.setText("");
        Cidade.setText("");
        Cep.setText("");
        Pais.setText("");
        Estado.setText("");
        Complemento.setText("");
        Logger.getLogger(HotelModerno.class.getName()).log(Level.INFO, null, "Hospede cadastrado com sucesso.");
        JOptionPane.showMessageDialog(null, "O hospede foi cadastrado com sucesso." , "Cadastramento", HEIGHT);
    }//GEN-LAST:event_BtnCadastraClienteActionPerformed

    private void BtnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarClienteActionPerformed
        //Statement dbstmt = null; 
        //hospede.setNome(Nome.toString());
        //hospede.setCpf(Cpf.toString());
        //dbstmt = DataBank(dbdriver, dburl, user, pass);
        
    }//GEN-LAST:event_BtnBuscarClienteActionPerformed

    private void NumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumeroActionPerformed

    private void TipoSuiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoSuiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoSuiteActionPerformed

    private void BtnCadastraFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastraFuncionarioActionPerformed
        Path arqFuncionarios = Paths.get("F:\\Rodolfo\\Dados I\\ReservasDeHotel\\src\\main\\java\\Persistencias\\funcionarios.txt");
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(Nome1.getText());
        funcionario.setCpf(Cpf1.getText());
        funcionario.setRg(Rg1.getText());
        funcionario.setCtps(Ctps.getText());
        funcionario.setDataContratacao(DataContratacao1.getText());
        funcionario.setDataNascimento(DataNascimento1.getText());
        funcionario.setEmail(Email1.getText());
        funcionario.setFone(Fone1.getText());
        funcionario.setCelular(Celular1.getText());
        funcionario.setLogradouro(Logradouro1.getText());
        funcionario.setNumero(Numero1.getText());
        funcionario.setBairro(Bairro1.getText());
        funcionario.setCidade(Cidade1.getText());
        funcionario.setCEP(Cep1.getText());
        funcionario.setPais(Pais1.getText());
        funcionario.setEstado(Estado1.getText());
        funcionario.setComplemento(Complemento1.getText());
        listaFuncionario.add(new Funcionario(
                funcionario.getIdPessoa(),
                funcionario.getNome(),
                funcionario.getCpf(),
                funcionario.getRg(),
                funcionario.getCtps(),
                funcionario.getDataContratacao(),
                funcionario.getDataNascimento(),
                funcionario.getEmail(),
                funcionario.getFone(),
                funcionario.getCelular(),
                funcionario.getLogradouro(),
                funcionario.getNumero(),
                funcionario.getBairro(),
                funcionario.getCidade(),
                funcionario.getCEP(),
                funcionario.getPais(),
                funcionario.getEstado(),
                funcionario.getComplemento()));
        //for (Funcionario funcionario:listaFuncionario) System.out.println(funcionario);
        try {
            salvaFuncionario(arqFuncionarios.toString(), listaFuncionario);
        } catch (Exception ex) {
            System.out.println("modifique o caminho do arquivo Prontuarios.txt e crie o mesmo antes de rodar o programa." );
            Logger.getLogger(HotelModerno.class.getName()).log(Level.SEVERE, null, ex);
        }
        Nome1.setText("");
        Cpf1.setText("");
        Rg1.setText("");
        Ctps.setText("");
        DataContratacao1.setText("");
        DataNascimento1.setText("");
        Email1.setText("");
        Fone1.setText("");
        Celular1.setText("");
        Logradouro1.setText("");
        Numero1.setText("");
        Bairro1.setText("");
        Cidade1.setText("");
        Cep1.setText("");
        Pais1.setText("");
        Estado1.setText("");
        Complemento1.setText("");
        Logger.getLogger(HotelModerno.class.getName()).log(Level.INFO, null, "Funcionário cadastrado com sucesso.");
        JOptionPane.showMessageDialog(null, "O funcionário foi cadastrado com sucesso." , "Cadastramento", HEIGHT);
    }//GEN-LAST:event_BtnCadastraFuncionarioActionPerformed

    private void Numero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Numero1ActionPerformed

    private void BtnAutorizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAutorizarActionPerformed
        if (Login.getText().equals("Rodolfo")){
            String strPass = new String(Password.getPassword()).trim();
            if (strPass.equals("123456")){
                Nome.setEnabled(true);
                Nome1.setEnabled(true);
                Cpf.setEnabled(true);
                Cpf1.setEnabled(true);
                Rg.setEnabled(true);
                Rg1.setEnabled((true));
                Passaporte.setEnabled(true);
                Ctps.setEnabled(true);
                Nacionalidade.setEnabled(true);
                DataNascimento.setEnabled(true);
                DataNascimento1.setEnabled(true);
                DataContratacao1.setEnabled(true);
                Email.setEnabled(true);
                Email1.setEnabled(true);
                Fone.setEnabled(true);
                Fone1.setEnabled(true);
                Celular.setEnabled(true);
                Celular1.setEnabled(true);
                Logradouro.setEnabled(true);
                Logradouro1.setEnabled(true);
                Numero.setEnabled(true);
                Numero1.setEnabled(true);
                Bairro.setEnabled(true);
                Bairro1.setEnabled(true);
                Cidade.setEnabled(true);
                Cidade1.setEnabled(true);
                Cep.setEnabled(true);
                Cep1.setEnabled(true);
                Pais.setEnabled(true);
                Pais1.setEnabled(true);
                Estado.setEnabled(true);
                Estado1.setEnabled(true);
                Complemento.setEnabled(true);
                Complemento1.setEnabled(true);
                MultiGuiasNivel1.setEnabled(true);
                MultiGuiasNivel2.setEnabled(true);
                BtnCadastraCliente.setEnabled(true);
                BtnBuscarCliente.setEnabled(true);
                BtnCadastraFuncionario.setEnabled(true);
                BtnBuscarFuncionario.setEnabled(true);
                NumSuite.setEnabled(true);
                TipoSuite.setEnabled(true);
                ValorDiaria.setEnabled(true);
                BtnCadastraQuarto.setEnabled(true);
                TxtDescricaoSuite.setEnabled(true);
                Login.setText("");
                Password.setText("");
            }
        }
    }//GEN-LAST:event_BtnAutorizarActionPerformed

    private void BtnBloquearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBloquearActionPerformed
        Nome.setEnabled(false);
        Nome1.setEnabled(false);
        Cpf.setEnabled(false);
        Cpf1.setEnabled(false);
        Rg.setEnabled(false);
        Rg1.setEnabled((false));
        Passaporte.setEnabled(false);
        Ctps.setEnabled(false);
        Nacionalidade.setEnabled(false);
        DataNascimento.setEnabled(false);
        DataNascimento1.setEnabled(false);
        DataContratacao1.setEnabled(false);
        Email.setEnabled(false);
        Email1.setEnabled(false);
        Fone.setEnabled(false);
        Fone1.setEnabled(false);
        Celular.setEnabled(false);
        Celular1.setEnabled(false);
        Logradouro.setEnabled(false);
        Logradouro1.setEnabled(false);
        Numero.setEnabled(false);
        Numero1.setEnabled(false);
        Bairro.setEnabled(false);
        Bairro1.setEnabled(false);
        Cidade.setEnabled(false);
        Cidade1.setEnabled(false);
        Cep.setEnabled(false);
        Cep1.setEnabled(false);
        Pais.setEnabled(false);
        Pais1.setEnabled(false);
        Estado.setEnabled(false);
        Estado1.setEnabled(false);
        Complemento.setEnabled(false);
        Complemento1.setEnabled(false);
        MultiGuiasNivel1.setEnabled(false);
        MultiGuiasNivel2.setEnabled(false);
        BtnCadastraCliente.setEnabled(false);
        BtnBuscarCliente.setEnabled(false);
        BtnCadastraFuncionario.setEnabled(false);
        BtnBuscarFuncionario.setEnabled(false);
        NumSuite.setEnabled(false);
        TipoSuite.setEnabled(false);
        ValorDiaria.setEnabled(false);
        BtnCadastraQuarto.setEnabled(false);
        TxtDescricaoSuite.setEnabled(false);
        Login.setText("");
        Password.setText("");
    }//GEN-LAST:event_BtnBloquearActionPerformed

    private void BtnBuscarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBuscarFuncionarioActionPerformed

    private void BtnCadastraQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastraQuartoActionPerformed
        Path arqApartamento = Paths.get("F:\\Rodolfo\\Dados I\\ReservasDeHotel\\src\\main\\java\\Persistencias\\apartamentos.txt");
        Apartamento apartamento = new Apartamento();
        apartamento.setNumeroApartamento(NumSuite.getText());
        apartamento.setTipoApartamento(TipoSuite.getSelectedItem().toString());
        apartamento.setCapacidadeApartamento(CapacidadeApartamento.getText());
        apartamento.setValorDiaria(ValorDiaria.getText());
        apartamento.setDescricaoApartamento(TxtDescricaoSuite.getText());
        listaApartamento.add(new Apartamento(
                apartamento.getIdApartamento(),
                apartamento.getNumeroApartamento(),
                apartamento.getTipoApartamento(),
                apartamento.getCapacidadeApartamento(),
                apartamento.getStatusApartamento(),
                apartamento.getAgendaApartamento(),
                apartamento.getValorDiaria(),
                apartamento.getDescricaoApartamento()                
        ));
         try {
            salvaApartamento(arqApartamento.toString(), listaApartamento);
        } catch (Exception ex) {
            System.out.println("modifique o caminho do arquivo apartamentos.txt e crie o mesmo antes de rodar o programa." );
            Logger.getLogger(HotelModerno.class.getName()).log(Level.SEVERE, null, ex);
        }
        NumSuite.setText("");
        TipoSuite.setSelectedIndex(1);
        CapacidadeApartamento.setText("");
        ValorDiaria.setText("");
        TxtDescricaoSuite.setText("");
        Logger.getLogger(HotelModerno.class.getName()).log(Level.INFO, null, "Apartamento cadastrado com sucesso.");
        JOptionPane.showMessageDialog(null, "O apartamento foi cadastrado com sucesso." , "Cadastramento", HEIGHT);
    }//GEN-LAST:event_BtnCadastraQuartoActionPerformed

    private void NumSuiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumSuiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumSuiteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SQLException {       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HotelModerno().setVisible(true);
            }
        });        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField Bairro;
    public javax.swing.JTextField Bairro1;
    public javax.swing.JButton BtnAutorizar;
    public javax.swing.JButton BtnBloquear;
    public javax.swing.JButton BtnBuscarCliente;
    public javax.swing.JButton BtnBuscarFuncionario;
    public javax.swing.JButton BtnCadastraCliente;
    public javax.swing.JButton BtnCadastraFuncionario;
    public javax.swing.JButton BtnCadastraQuarto;
    public javax.swing.JTextField CapacidadeApartamento;
    public javax.swing.JTextField Celular;
    public javax.swing.JTextField Celular1;
    public javax.swing.JTextField Cep;
    public javax.swing.JTextField Cep1;
    public javax.swing.JTextField Cidade;
    public javax.swing.JTextField Cidade1;
    public javax.swing.JTextArea Complemento;
    public javax.swing.JTextArea Complemento1;
    public javax.swing.JTextField Cpf;
    public javax.swing.JTextField Cpf1;
    public javax.swing.JTextField Ctps;
    public javax.swing.JTextField DataContratacao1;
    public javax.swing.JTextField DataNascimento;
    public javax.swing.JTextField DataNascimento1;
    public javax.swing.JTextField Email;
    public javax.swing.JTextField Email1;
    public javax.swing.JTextField Estado;
    public javax.swing.JTextField Estado1;
    public javax.swing.JTextField Fone;
    public javax.swing.JTextField Fone1;
    public javax.swing.JPanel GuiaMeuHotel;
    public javax.swing.JPanel GuiaReservas;
    public javax.swing.JTextField Login;
    public javax.swing.JTextField Logradouro;
    public javax.swing.JTextField Logradouro1;
    public javax.swing.JTabbedPane MultiGuiasNivel1;
    public javax.swing.JTabbedPane MultiGuiasNivel2;
    public javax.swing.JTextField Nacionalidade;
    public javax.swing.JTextField Nome;
    public javax.swing.JTextField Nome1;
    public javax.swing.JTextField NumSuite;
    public javax.swing.JTextField Numero;
    public javax.swing.JTextField Numero1;
    public javax.swing.JTextField Pais;
    public javax.swing.JTextField Pais1;
    public javax.swing.JTextField Passaporte;
    public javax.swing.JPasswordField Password;
    public javax.swing.JTextField Rg;
    public javax.swing.JTextField Rg1;
    public javax.swing.JComboBox<String> TipoSuite;
    public javax.swing.JTextArea TxtDescricaoSuite;
    public javax.swing.JTextField ValorDiaria;
    public java.awt.Canvas canvas1;
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JComboBox<String> jComboBox1;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel16;
    public javax.swing.JLabel jLabel17;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel19;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel21;
    public javax.swing.JLabel jLabel22;
    public javax.swing.JLabel jLabel23;
    public javax.swing.JLabel jLabel24;
    public javax.swing.JLabel jLabel25;
    public javax.swing.JLabel jLabel26;
    public javax.swing.JLabel jLabel27;
    public javax.swing.JLabel jLabel28;
    public javax.swing.JLabel jLabel29;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel30;
    public javax.swing.JLabel jLabel31;
    public javax.swing.JLabel jLabel32;
    public javax.swing.JLabel jLabel33;
    public javax.swing.JLabel jLabel34;
    public javax.swing.JLabel jLabel35;
    public javax.swing.JLabel jLabel36;
    public javax.swing.JLabel jLabel37;
    public javax.swing.JLabel jLabel38;
    public javax.swing.JLabel jLabel39;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel40;
    public javax.swing.JLabel jLabel41;
    public javax.swing.JLabel jLabel42;
    public javax.swing.JLabel jLabel43;
    public javax.swing.JLabel jLabel44;
    public javax.swing.JLabel jLabel45;
    public javax.swing.JLabel jLabel46;
    public javax.swing.JLabel jLabel47;
    public javax.swing.JLabel jLabel48;
    public javax.swing.JLabel jLabel49;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel50;
    public javax.swing.JLabel jLabel51;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    public javax.swing.JPanel jPanel5;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JSpinner jSpinner1;
    public javax.swing.JSpinner jSpinner2;
    public javax.swing.JSpinner jSpinner3;
    public javax.swing.JSpinner jSpinner4;
    public javax.swing.JSpinner jSpinner5;
    public javax.swing.JSpinner jSpinner6;
    public javax.swing.JTable jTable1;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
    

}
