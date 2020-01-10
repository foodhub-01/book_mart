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
public class SciBook11 {
    int sciBookid;
    String sciBookname;
    String sciBookpublication;
    int sciBookprice;
    int sciBookstock;

    public int getSciBookid() {
        return sciBookid;
    }

    public void setSciBookid(int sciBookid) {
        this.sciBookid = sciBookid;
    }

    public String getSciBookname() {
        return sciBookname;
    }

    public void setSciBookname(String sciBookname) {
        this.sciBookname = sciBookname;
    }

    public String getSciBookpublication() {
        return sciBookpublication;
    }

    public void setSciBookpublication(String sciBookpublication) {
        this.sciBookpublication = sciBookpublication;
    }

    public int getSciBookprice() {
        return sciBookprice;
    }

    public void setSciBookprice(int sciBookprice) {
        this.sciBookprice = sciBookprice;
    }

    public int getSciBookstock() {
        return sciBookstock;
    }

    public void setSciBookstock(int sciBookstock) {
        this.sciBookstock = sciBookstock;
    }
    public SciBook11(int sciBookid,
    String sciBookname,
    String sciBookpublication,
    int sciBookprice,
    int sciBookstock){
    this.sciBookid=sciBookid;
    this.sciBookname=sciBookname;
    this.sciBookpublication=sciBookpublication;
    this.sciBookprice=sciBookprice;
    this.sciBookstock=sciBookstock;
    }
    public SciBook11(
    String sciBookname,
    String sciBookpublication,
    int sciBookprice,
    int sciBookstock){
    
    this.sciBookname=sciBookname;
    this.sciBookpublication=sciBookpublication;
    this.sciBookprice=sciBookprice;
    this.sciBookstock=sciBookstock;
    }
}
