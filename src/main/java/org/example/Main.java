package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory eMF = Persistence.createEntityManagerFactory("default");
        Auta auta = new Auta();
        //auta.setPredkosc(200);
        //auta.setKolor("czerwony");
        //auta.setPrzyspiesznie(3);
        //auta.setMarka("audi");
        //auta.setRocznik(2020);

        EntityManager eM = eMF.createEntityManager();

        //eM.getTransaction().begin();
        //eM.persist(auta);
//


        System.out.println(listaWszystkichAut(eM));
        //eM.getTransaction().commit();


        eMF.close();

    }
    public static String listaWszystkichAut(EntityManager eM){
        List<Auta> autka = eM.createQuery("SELECT e FROM Auta e" ).getResultList();
        String s ="";
        for(int i=0; i<autka.size(); i++){
        s+=autka.get(i).getKolor()+"   "+autka.get(i).getMarka()+"   "+autka.get(i).getPredkosc()+"   "+autka.get(i).getPrzyspiesznie()+"   "+autka.get(i).getRocznik()+"\n";
        }

        return s;

    }
}