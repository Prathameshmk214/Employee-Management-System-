package com.ems.servlet;
import com.ems.dao.EmployeeDAO;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class DeleteEmployeeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            new EmployeeDAO().deleteEmployee(id);
            response.sendRedirect("list_employees.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
