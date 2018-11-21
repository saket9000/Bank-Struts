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

public class BankStrutsAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String NONE = "none";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        BankStrutsActionForm baf = (BankStrutsActionForm) form;
        String initial = baf.getInitial();
        baf.setBalance(Integer.parseInt(initial));
        response.sendRedirect("bank.jsp");
        return mapping.findForward(NONE);
    }
}
