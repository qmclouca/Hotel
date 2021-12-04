/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rlbpc.reservasdehotel.utils;

/**
 *
 * @author Rodolfo Bortoluzzi
 */
import com.rlbpc.reservasdehotel.instances.Hospede;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;

public class DadosPersistence {
    private EntityManagerFactory factory;
    private EntityManager em;
    
    public void getEntityManager(){
        factory = Persistence.createEntityManagerFactory("DADOS_HOTEL_MODERNO");
        em = factory.createEntityManager();
    }
    
    public List<Hospede> getAll() throws AppPersistenceException {
        getEntityManager();
        try {
            TypedQuery<Hospede> query = em.createQuery("SELECT n FROM Dados n", Hospede.class);
            List<Hospede> hospede = query.getResultList();
            return hospede;
        } 
        catch (PersistenceException ex){
            throw new AppPersistenceException();
        }
        finally {
            em.close();
            factory.close();
        }       
    }
    public Hospede create(Hospede n) throws AppPersistenceException {
        getEntityManager();
		em.getTransaction().begin();
		
		try {			
			em.persist(n);
			em.getTransaction().commit();
		}
		catch (PersistenceException ex) {

			// NOTE: this code can be used to get specific exception 
			// Throwable t = null;
			// for(t = ex.getCause(); t != null; t = t.getCause())
			//		System.out.println("Exception: " + t.getClass());		
			throw new AppPersistenceException();
		}
		finally {
			em.close();
			factory.close();
		}
		
		return n;
	}
	
	public void update(Hospede updatedD)
			throws AppPersistenceException {
	
		getEntityManager();		
		em.getTransaction().begin();
		
		try {
			em.find(Hospede.class, Integer.valueOf(updatedD.getIdHospede()));			
			em.merge(updatedD);			
			em.getTransaction().commit();
		}
		catch (PersistenceException ex) {
		
			throw new AppPersistenceException();
		}
		finally {
			em.close();
			factory.close();
		}
	}
	
	public void delete(int key)
			throws AppPersistenceException {

		getEntityManager();
		em.getTransaction().begin();
		
		try {			
			Hospede n = em.find(Hospede.class, Integer.valueOf(key));
			em.remove(n);			
			em.getTransaction().commit();
		}
		catch (PersistenceException ex) {
		
			throw new AppPersistenceException();
		}
		finally {
			em.close();
			factory.close();
		}
	}
            
    
}
