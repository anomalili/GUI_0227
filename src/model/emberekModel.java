/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author makra.zs.lili
 */
public class emberekModel {

public emberekModel(String nev, int kor, String neme, int MunkToltEv) {
        this.nev = nev;
        this.kor = kor;
        this.neme = neme;
        this.MunkToltEv = MunkToltEv;
    }

    public String getNev() {
        return nev;
    }

    public int getKor() {
        return kor;
    }

    public String getNeme() {
        return neme;
    }

    public int getMunkToltEv() {
        return MunkToltEv;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setNeme(String neme) {
        this.neme = neme;
    }

    public void setMunkToltEv(int MunkToltEv) {
        this.MunkToltEv = MunkToltEv;
    }

    @Override
    public String toString() {
        return "emberekModel{" + "nev=" + nev + ", kor=" + kor + ", neme=" + neme + ", MunkToltEv=" + MunkToltEv + '}';
    }
    public String nev;
    public int kor;
    public String neme;
    public int MunkToltEv;
}
