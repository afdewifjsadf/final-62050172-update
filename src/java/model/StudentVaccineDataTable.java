/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author tana_
 */
public class StudentVaccineDataTable {

    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("62050172-FinalPU");

    
         
    public static void insertStdent(Studentvaccinedata std) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(std);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    public static void updateStudent(Studentvaccinedata std) {
        EntityManager em = emf.createEntityManager();
        Studentvaccinedata fromDb = em.find(Studentvaccinedata.class, std.getSeq());
        fromDb.setId(std.getId());
        fromDb.setVacno(std.getVacno());
        fromDb.setVactype(std.getVactype());
        em.getTransaction().begin();
        try {
            em.persist(fromDb);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    
    public static List<Studentvaccinedata> findAllStudentvaccinedata() {
        EntityManager em = emf.createEntityManager();
        List<Studentvaccinedata> stdList = (List<Studentvaccinedata>) em.createNamedQuery("Studentvaccinedata.findAll").getResultList();
        em.close();
        return stdList;
    }
    public static List<Studentvaccinedata> findStudentById(String id) {
        EntityManager em = emf.createEntityManager();
        Query query = em.createNamedQuery("Studentvaccinedata.findById");
        query.setParameter("id", id);
        List<Studentvaccinedata> stdList = (List<Studentvaccinedata>) query.getResultList();
        em.close();
        return stdList;
    }
    public static void removeStdent(Studentvaccinedata std) {
        EntityManager em = emf.createEntityManager();
        Studentvaccinedata fromDb = em.find(Studentvaccinedata.class, std.getSeq());
        em.getTransaction().begin();
        try {
            em.remove(fromDb);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
                
    }



  
 
    
}
