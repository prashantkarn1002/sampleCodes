package com.registration.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;

import com.registration.dao.StudentDao;
import com.registration.model.Student;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/register")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    private StudentDao studentDao;

    public void init() {
        studentDao = new StudentDao();
    } 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher disp = request.getRequestDispatcher("/WEB-INF/jsp/studentregister.jsp");
		disp.forward(request, response);
	}


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String contact = request.getParameter("contact");
        String department = request.getParameter("department");

        Student student = new Student();
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setUsername(username);
        student.setPassword(password);
        student.setContact(contact);
        student.setDepartment(department);

        try {
            studentDao.registerStudent(student);
        } catch (Exception e) {
            e.printStackTrace();
        }

        RequestDispatcher disp = request.getRequestDispatcher("/WEB-INF/jsp/studentdetails.jsp");
		disp.forward(request, response);
    }

}
