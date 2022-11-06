package org.example;

import jakarta.persistence.*;

@Entity
@Table(name="wagi")
public class Waga {
    @Id
    @Column(name="id_w")
    private int id_w;
    @Column(name="predkosc")
    public int predkosc;
    @Column(name="przyspieszenie")
    public int przyspieszenie;

    @Column(name="rocznik")
    public int rocznik;

    public int getId_w() {
        return id_w;
    }

    public void setId_w(int id_w) {
        this.id_w = id_w;
    }

    public int getPredkosc() {
        return predkosc;
    }

    public void setPredkosc(int predkosc) {
        this.predkosc = predkosc;
    }

    public int getPrzyspieszenie() {
        return przyspieszenie;
    }

    public void setPrzyspieszenie(int przyspieszenie) {
        this.przyspieszenie = przyspieszenie;
    }

    public int getRocznikp() {
        return rocznik;
    }

    public void setRocznikp(int rocznikp) {
        this.rocznik = rocznik;
    }
    public int suma_wag(){
        return this.predkosc+this.rocznik+this.przyspieszenie;

    }
}
