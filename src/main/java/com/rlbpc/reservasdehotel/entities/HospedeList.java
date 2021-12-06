/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rlbpc.reservasdehotel.entities;

import java.util.List;
import javax.swing.AbstractListModel;

/**
 *
 * @author Rodolfo Bortoluzzi
 */
public class HospedeList extends AbstractListModel<Hospede>{
    public List<Hospede> hospedesDB;
    public HospedeList(List<Hospede> input){
        hospedesDB = input;
        hospedesDB.sort(null);
    }
    @Override
    public int getSize(){
        return hospedesDB.size();
    }
        
    @Override
    public Hospede getElementAt(int index) {
        if (hospedesDB.isEmpty()) {
            return null;
	}
            return hospedesDB.get(index);
	}
	
    public List<Hospede> getData() {
	return hospedesDB;
    }
    public boolean isEmpty() {
	return hospedesDB.isEmpty();
    }
    public int indexOf(Hospede n) {
	return hospedesDB.indexOf(n);
    }
    public boolean containsName(Hospede input) {
        for (Hospede n : hospedesDB) {
	    if (n.getNome().equals(input.getNome())) {
                return true;
            }
	}
	return false;
    }
	
    public void add(Hospede n) {
        hospedesDB.add(n);
	hospedesDB.sort(null);
	}
	
    public void delete(Hospede n) {
	hospedesDB.remove(n);
    }
 
    public void update(Hospede n) {
	int index = hospedesDB.indexOf(n);		
	hospedesDB.set(index, n);
	hospedesDB.sort(null);
    }
}
