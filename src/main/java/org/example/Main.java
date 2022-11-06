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
        System.out.println(ocena(3,eM));
        //eM.getTransaction().commit();


        eMF.close();

    }
    public static String listaWszystkichAut(EntityManager eM){
        List<Auta> autka = eM.createQuery("SELECT e FROM Auta e" ).getResultList();
        String s ="";
        for(int i=0; i<autka.size(); i++){
        s+=autka.get(i).getKolor()+"    "+autka.get(i).getMarka()+"    "+autka.get(i).getPredkosc()+"    "+autka.get(i).getPrzyspiesznie()+"    "+autka.get(i).getRocznik()+"\n";
        }
        return s;
    }
    public static float ocena(float d,EntityManager eM){
        Waga w = eM.find(Waga.class,1);
        Auta auto = eM.find(Auta.class,d);
        float oc= 0;
        oc=  (((float) (auto.getPredkosc()-100))/200*w.getPredkosc())+((((float) auto.getPrzyspiesznie()-1)/9*w.getPrzyspieszenie()))+((((float) (auto.getRocznik())-2000)/22*w.getRocznikp()));
        //normalizacja
        //liczenie sredniej


        return oc;
    }
}