package com.dhee.card.entity;

import java.io.Serializable;

/**
 * (Pntinf)实体类
 *
 * @author makejava
 * @since 2022-06-14 16:35:42
 */
public class Pntinf implements Serializable {
    @Override
    public String toString() {
        return "Pntinf{" +
                "pntinfid='" + pntinfid + '\'' +
                ", cstid='" + cstid + '\'' +
                ", hnnkzk=" + hnnkzk +
                ", urseq='" + urseq + '\'' +
                ", tritim='" + tritim + '\'' +
                ", rksts=" + rksts +
                ", pntcou='" + pntcou + '\'' +
                ", ktkytiym='" + ktkytiym + '\'' +
                ", campid='" + campid + '\'' +
                ", insertdte='" + insertdte + '\'' +
                ", insertid='" + insertid + '\'' +
                ", updatedte='" + updatedte + '\'' +
                ", updateid='" + updateid + '\'' +
                ", deleteflg=" + deleteflg +
                ", deletedte='" + deletedte + '\'' +
                '}';
    }

    private static final long serialVersionUID = -55829794299324669L;
    
    private String pntinfid;
    
    private String cstid;
    
    private Character hnnkzk;
    
    private String urseq;
    
    private String tritim;
    
    private Character rksts;
    
    private String pntcou;
    
    private String ktkytiym;
    
    private String campid;
    
    private String insertdte;
    
    private String insertid;
    
    private String updatedte;
    
    private String updateid;
    
    private Character deleteflg;
    
    private String deletedte;


    public String getPntinfid() {
        return pntinfid;
    }

    public void setPntinfid(String pntinfid) {
        this.pntinfid = pntinfid;
    }

    public String getCstid() {
        return cstid;
    }

    public void setCstid(String cstid) {
        this.cstid = cstid;
    }

    public Character getHnnkzk() {
        return hnnkzk;
    }

    public void setHnnkzk(Character hnnkzk) {
        this.hnnkzk = hnnkzk;
    }

    public String getUrseq() {
        return urseq;
    }

    public void setUrseq(String urseq) {
        this.urseq = urseq;
    }

    public String getTritim() {
        return tritim;
    }

    public void setTritim(String tritim) {
        this.tritim = tritim;
    }

    public Character getRksts() {
        return rksts;
    }

    public void setRksts(Character rksts) {
        this.rksts = rksts;
    }

    public String getPntcou() {
        return pntcou;
    }

    public void setPntcou(String pntcou) {
        this.pntcou = pntcou;
    }

    public String getKtkytiym() {
        return ktkytiym;
    }

    public void setKtkytiym(String ktkytiym) {
        this.ktkytiym = ktkytiym;
    }

    public String getCampid() {
        return campid;
    }

    public void setCampid(String campid) {
        this.campid = campid;
    }

    public String getInsertdte() {
        return insertdte;
    }

    public void setInsertdte(String insertdte) {
        this.insertdte = insertdte;
    }

    public String getInsertid() {
        return insertid;
    }

    public void setInsertid(String insertid) {
        this.insertid = insertid;
    }

    public String getUpdatedte() {
        return updatedte;
    }

    public void setUpdatedte(String updatedte) {
        this.updatedte = updatedte;
    }

    public String getUpdateid() {
        return updateid;
    }

    public void setUpdateid(String updateid) {
        this.updateid = updateid;
    }

    public Character getDeleteflg() {
        return deleteflg;
    }

    public void setDeleteflg(Character deleteflg) {
        this.deleteflg = deleteflg;
    }

    public String getDeletedte() {
        return deletedte;
    }

    public void setDeletedte(String deletedte) {
        this.deletedte = deletedte;
    }

}

