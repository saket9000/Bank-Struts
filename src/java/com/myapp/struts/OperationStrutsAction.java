/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class OperationStrutsAction extends org.apache.struts.action.Action {

    private static final String SUCCESS = "success";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PrintWriter out = response.getWriter();
        BankStrutsActionForm baf = (BankStrutsActionForm) form;
        String opr = baf.getOp();
        do{
            if(opr.equals("add")){
                int bal = baf.getBalance();
                int amount = Integer.parseInt(baf.getAmt());
                int cal = bal+amount;
                baf.setBalance(cal);
                out.print("NEW BALANCE IS :");
                out.print(cal);
            }
            else if(opr.equals("less")){
                int bal = baf.getBalance();
                int amount = Integer.parseInt(baf.getAmt());
                int cal = bal-amount;
                baf.setBalance(cal);
                out.print("NEW BALANCE IS :");
                out.print(cal);
            }
        }while(opr.equals("exit"));
        return mapping.findForward(SUCCESS);
    }
}
