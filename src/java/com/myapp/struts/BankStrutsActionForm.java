/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class BankStrutsActionForm extends org.apache.struts.action.ActionForm {
    
    private String initial, amt, op;
    private int balance;

    public String getAmt() {
        return amt;
    }

    public void setAmt(String amt) {
        this.amt = amt;
    }
    
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    public BankStrutsActionForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getInitial() == null) {
            errors.add("Initial", new ActionMessage("error.initial.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        if (getAmt() == null || Integer.parseInt(getAmt()) < 0) {
            errors.add("Amount", new ActionMessage("error.amount.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }
}
