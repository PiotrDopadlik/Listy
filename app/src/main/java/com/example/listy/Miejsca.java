package com.example.listy;

public class Miejsca {
    private String miejsce;
    private int idObrazka;

    static public Miejsca miejsca [] = new Miejsca[] {new Miejsca("Radio", R.drawable.obrazek1),
                                  new Miejsca("Radio", R.drawable.obrazek2),
                                  new Miejsca("Radio", R.drawable.obrazek3)};

    public Miejsca(String miejsce, int idObrazka) {
        this.miejsce = miejsce;
        this.idObrazka = idObrazka;
    }

    public String getMiejsce() {
        return miejsce;
    }

    public void setMiejsce(String miejsce) {
        this.miejsce = miejsce;
    }

    public int getIdObrazka() {
        return idObrazka;
    }

    public void setIdObrazka(int idObrazka) {
        this.idObrazka = idObrazka;
    }
}
