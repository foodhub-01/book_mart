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
public class ComBook11 {
    int comBookid;
    String comBookname;
    String comBookpublication;
    int comBookprice;
    int comBookstock;

    public int getComBookid() {
        return comBookid;
    }

    public void setComBookid(int comBookid) {
        this.comBookid = comBookid;
    }

    public String getComBookname() {
        return comBookname;
    }

    public void setComBookname(String comBookname) {
        this.comBookname = comBookname;
    }

    public String getComBookpublication() {
        return comBookpublication;
    }

    public void setComBookpublication(String comBookpublication) {
        this.comBookpublication = comBookpublication;
    }

    public int getComBookprice() {
        return comBookprice;
    }

    public void setComBookprice(int comBookprice) {
        this.comBookprice = comBookprice;
    }

    public int getComBookstock() {
        return comBookstock;
    }

    public void setComBookstock(int comBookstock) {
        this.comBookstock = comBookstock;
    }
    public ComBook11(int comBookid,
    String comBookname,
    String comBookpublication,
    int comBookprice,
    int comBookstock){
    this.comBookid=comBookid;
    this.comBookname=comBookname;
    this.comBookpublication=comBookpublication;
    this.comBookprice=comBookprice;
    this.comBookstock=comBookstock;
    }
     public ComBook11(
    String comBookname,
    String comBookpublication,
    int comBookprice,
    int comBookstock){
    
    this.comBookname=comBookname;
    this.comBookpublication=comBookpublication;
    this.comBookprice=comBookprice;
    this.comBookstock=comBookstock;
    }
    
}
