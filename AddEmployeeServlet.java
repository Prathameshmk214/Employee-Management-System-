package com.ems.servlet;
import com.ems.dao.EmployeeDAO;
import com.ems.model.Employee;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class AddEmployeeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Employee emp = new Employee();
            emp.setName(request.getParameter("name"));
            emp.setEmail(request.getParameter("email"));
            emp.setDepartment(request.getParameter("department"));
            emp.setSalary(Double.parseDouble(request.getParameter("salary")));

            new EmployeeDAO().addEmployee(emp);
            response.sendRedirect("list_employees.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
