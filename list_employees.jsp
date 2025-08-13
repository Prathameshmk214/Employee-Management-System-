<%@ page import="java.util.List, com.ems.model.Employee" %>
<%
    List<Employee> employees = (List<Employee>) request.getAttribute("employeeList");
%>
<h2>Employee List</h2>
<table border="1">
    <tr><th>ID</th><th>Name</th><th>Email</th><th>Department</th><th>Salary</th><th>Action</th></tr>
    <%
        if (employees != null) {
            for (Employee e : employees) {
    %>
                <tr>
                    <td><%= e.getId() %></td>
                    <td><%= e.getName() %></td>
                    <td><%= e.getEmail() %></td>
                    <td><%= e.getDepartment() %></td>
                    <td><%= e.getSalary() %></td>
                    <td><a href="DeleteEmployeeServlet?id=<%= e.getId() %>">Delete</a></td>
                </tr>
    <%
            }
        }
    %>
</table>
