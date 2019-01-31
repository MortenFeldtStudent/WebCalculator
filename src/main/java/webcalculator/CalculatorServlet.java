/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webcalculator;

import calculator.simplecalculator.Calculator;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.InvalidParameterException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author nr
 */
@WebServlet(name = "CalculatorServlet", urlPatterns = {"/calculator"})
public class CalculatorServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    static Calculator calc = new Calculator();//This is the Calculator class implemented in part-1 

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/plain;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            try {
                String opp = request.getParameter("operation");
                String res = null;
                int n1 = Integer.parseInt(request.getParameter("n1"));
                int n2 = Integer.parseInt(request.getParameter("n2"));
                switch (opp) {
                    case "add":
                        res = "Result of: " + n1 + "+" + n2 + "= " + calc.add(n1, n2);
                        break;
                    case "sub":
                        res = "Result of: " + n1 + "-" + n2 + "= " + calc.sub(n1, n2);
                        break;
                    case "mul":
                        res = "Result of: " + n1 + "*" + n2 + "= " + calc.mul(n1, n2);
                        break;
                    case "div":
                        res = "Result of: " + n1 + "/" + n2 + "= " + calc.div(n1, n2);
                        break;
                    default:
                        throw new InvalidParameterException("Operation not supported");
                }
                out.println(res);
            } catch (Exception e) {
                response.setStatus(400);
                out.println("ERROR, illegal inputs" + e.getMessage());
            }
        }
    }
}

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
/**
 * Handles the HTTP <code>GET</code> method.
 *
 * @param request servlet request
 * @param response servlet response
 * @throws ServletException if a servlet-specific error occurs
 * @throws IOException if an I/O error occurs
 */
