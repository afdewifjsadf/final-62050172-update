/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.StudentVaccineDataTable;
import model.Studentvaccinedata;

/**
 *
 * @author tana_
 */
public class updatevacTypeServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String id = request.getParameter("idStudent");

        ArrayList<String> listId = (ArrayList<String>) getServletContext().getAttribute("list");
        if (listId.contains(id)) {
             request.setAttribute("idstudent",id);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
            return;
        } else {
            listId.add(id);
            getServletContext().setAttribute("list", listId);
            synchronized (getServletContext()) {
                String no = request.getParameter("vacNo");
                Studentvaccinedata std = null;
                List<Studentvaccinedata> stdList = StudentVaccineDataTable.findStudentById(id);
                for (Studentvaccinedata x : stdList) {
                    if (x.getVacno() == Integer.parseInt(no)) {
                        std = x;
                        break;
                    }
                }

                std.setVactype(request.getParameter("vaccine"));
                StudentVaccineDataTable.updateStudent(std);
                stdList = StudentVaccineDataTable.findStudentById(id);
                request.setAttribute("idstudent", id);
                request.setAttribute("stdList", stdList);
                request.getRequestDispatcher("/student.jsp").forward(request, response);
            }
            listId.remove(id);
            getServletContext().setAttribute("list", listId);
        }
        return;
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
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
