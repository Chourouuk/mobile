package com.example.timeconverter.model;

public class TimeConvert {
    // attributs de classe
private long secondes;
private long minutes;
private long heurs;
private String temps ;
private long reste;
    // constructeur

    public TimeConvert(long secondes, long minutes, long heurs, String temps, long reste) {
        this.secondes = secondes;
        this.minutes = minutes;
        this.heurs = heurs;
        this.temps = temps;
        this.reste = reste;
    }

    public TimeConvert(long secondes) {
    }

    // getter(s)


    public long getSecondes() {
        return secondes;
    }

    public long getMinutes() {
        return minutes;
    }

    public long getHeurs() {
        return heurs;
    }

    public  String getTemps() {
        return temps;
    }

    public long getReste() {
        return reste;
    }

    public void setReponse() {

        long heurs = secondes / 3600;
        long reste = secondes % 3600;
        long minutes = reste / 60;
        long secs = reste % 60;

        //temps : l'attribut qui content le résultat
        temps= String.format("%02d:%02d:%02d", heurs, minutes, secs);


    }


}
