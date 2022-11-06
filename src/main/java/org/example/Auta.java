package org.example;

import jakarta.persistence.*;

@Entity
@Table(name="auta")
public class Auta {

    @Id
    @GeneratedValue(generator= "generator")
    @Column(name="id")
    private int id;
    @Column(name="marka")
    public String marka;
    @Column(name="kolor")
    public String kolor;
    @Column(name="predkosc")
    public int predkosc;
    @Column(name="przyspieszenie")
    public int przyspiesznie;
    @Column(name="rocznik")
    public int rocznik;

    public int getId() {
        return id;
    }

    public String getKolor() {
        return kolor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getPredkosc() {
        return predkosc;
    }

    public void setPredkosc(int predkosc) {
        this.predkosc = predkosc;
    }

    public int getPrzyspiesznie() {
        return przyspiesznie;
    }

    public void setPrzyspiesznie(int przyspiesznie) {
        this.przyspiesznie = przyspiesznie;
    }

    public int getRocznik() {
        return rocznik;
    }

    public void setRocznik(int rocznik) {
        this.rocznik = rocznik;
    }


}
