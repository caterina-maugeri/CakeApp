package com.example.myapplication.ui.fragment_preferiti;

public class Preferiti {
    String id_ricetta, id_utente;
    public Preferiti(){}

    public Preferiti(String id_cuoco, String id_utente) {
        this.id_ricetta= id_cuoco;
        this.id_utente = id_utente;
    }

    public String getId_ricetta() {
        return id_ricetta;
    }

    public void setId_cuoco(String id_cuoco) {
        this.id_ricetta = id_cuoco;
    }

    public String getId_utente() {
        return id_utente;
    }

    public void setId_utente(String id_utente) {
        this.id_utente = id_utente;
    }
}