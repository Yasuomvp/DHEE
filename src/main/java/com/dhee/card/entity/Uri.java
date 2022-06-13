package com.dhee.card.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * (Uri)实体类
 *
 * @author makejava
 * @since 2022-06-13 11:30:49
 */
@Component
public class Uri implements Serializable {
    private static final long serialVersionUID = -46767135920506158L;
    
    private String seq;
    
    private String kmtcd;
    
    private String kmtnam;
    
    private String poscd;
    
    private String dpycd;
    
    private String tritim;
    
    private String crdcd;
    
    private Integer bktskz;
    
    private Integer uag;
    
    private String cstid;
    
    private Character hnnkzk;
    
    private String skyym;
    
    private Character tskflg;
    
    private String insertdte;
    
    private String insertid;
    
    private String updatedte;
    
    private String updateid;
    
    private Character deleteflg;
    
    private String deletedte;


    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getKmtcd() {
        return kmtcd;
    }

    public void setKmtcd(String kmtcd) {
        this.kmtcd = kmtcd;
    }

    public String getKmtnam() {
        return kmtnam;
    }

    public void setKmtnam(String kmtnam) {
        this.kmtnam = kmtnam;
    }

    public String getPoscd() {
        return poscd;
    }

    public void setPoscd(String poscd) {
        this.poscd = poscd;
    }

    public String getDpycd() {
        return dpycd;
    }

    public void setDpycd(String dpycd) {
        this.dpycd = dpycd;
    }

    public String getTritim() {
        return tritim;
    }

    public void setTritim(String tritim) {
        this.tritim = tritim;
    }

    public String getCrdcd() {
        return crdcd;
    }

    public void setCrdcd(String crdcd) {
        this.crdcd = crdcd;
    }

    public Integer getBktskz() {
        return bktskz;
    }

    public void setBktskz(Integer bktskz) {
        this.bktskz = bktskz;
    }

    public Integer getUag() {
        return uag;
    }

    public void setUag(Integer uag) {
        this.uag = uag;
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

    public String getSkyym() {
        return skyym;
    }

    public void setSkyym(String skyym) {
        this.skyym = skyym;
    }

    public Character getTskflg() {
        return tskflg;
    }

    public void setTskflg(Character tskflg) {
        this.tskflg = tskflg;
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

    @Override
    public String toString() {
        return "Uri{" +
                "seq='" + seq + '\'' +
                ", kmtcd='" + kmtcd + '\'' +
                ", kmtnam='" + kmtnam + '\'' +
                ", poscd='" + poscd + '\'' +
                ", dpycd='" + dpycd + '\'' +
                ", tritim='" + tritim + '\'' +
                ", crdcd='" + crdcd + '\'' +
                ", bktskz=" + bktskz +
                ", uag=" + uag +
                ", cstid='" + cstid + '\'' +
                ", hnnkzk=" + hnnkzk +
                ", skyym='" + skyym + '\'' +
                ", tskflg=" + tskflg +
                ", insertdte='" + insertdte + '\'' +
                ", insertid='" + insertid + '\'' +
                ", updatedte='" + updatedte + '\'' +
                ", updateid='" + updateid + '\'' +
                ", deleteflg=" + deleteflg +
                ", deletedte='" + deletedte + '\'' +
                '}';
    }
}

