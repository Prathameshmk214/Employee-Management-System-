package com.ems.servlet;
import com.ems.dao.EmployeeDAO;
import com.ems.model.Employee;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class ListEmployeeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<Employee> list = new EmployeeDAO().getAllEmployees();
            request.setAttribute("employeeList", list);
            RequestDispatcher rd = request.getRequestDispatcher("list_employees.jsp");
            rd.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
