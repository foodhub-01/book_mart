/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.book_mart.entities;

/**
 *
 * @author Vedant
 */
public class ArtsBook11 {

    public int getArtsBookid() {
        return artsBookid;
    }

    public void setArtsBookid(int artsBookid) {
        this.artsBookid = artsBookid;
    }

    public String getArtsBookname() {
        return artsBookname;
    }

    public void setArtsBookname(String artsBookname) {
        this.artsBookname = artsBookname;
    }

    public String getArtsBookpublication() {
        return artsBookpublication;
    }

    public void setArtsBookpublication(String artsBookpublication) {
        this.artsBookpublication = artsBookpublication;
    }

    public int getArtsBookprice() {
        return artsBookprice;
    }

    public void setArtsBookprice(int artsBookprice) {
        this.artsBookprice = artsBookprice;
    }

    public int getArtsBookstock() {
        return artsBookstock;
    }

    public void setArtsBookstock(int artsBookstock) {
        this.artsBookstock = artsBookstock;
    }
    public ArtsBook11(int artsBookid,
    String artsBookname,
    String artsBookpublication,
    int artsBookprice,
    int artsBookstock){
    this.artsBookid=artsBookid;
    this.artsBookname=artsBookname;
    this.artsBookpublication=artsBookpublication;
    this.artsBookprice=artsBookprice;
    this.artsBookstock=artsBookstock;
    }
    
    public ArtsBook11(
    String artsBookname,
    String artsBookpublication,
    int artsBookprice,
    int artsBookstock){
    
    this.artsBookname=artsBookname;
    this.artsBookpublication=artsBookpublication;
    this.artsBookprice=artsBookprice;
    this.artsBookstock=artsBookstock;
    }
    int artsBookid;
    String artsBookname;
    String artsBookpublication;
    int artsBookprice;
    int artsBookstock;
}
