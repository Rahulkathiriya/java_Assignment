package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.empDao;
import model.employee;

/**
 * Servlet implementation class addEmployee
 */
@WebServlet("/addEmployee")
public class addEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public addEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		employee emp = new employee();
		String id = req.getParameter("id");
		emp.setFname(req.getParameter("fname"));
		emp.setLname(req.getParameter("lname"));
		emp.setEmail(req.getParameter("email"));
		emp.setNumber(req.getParameter("number"));
		emp.setAddress(req.getParameter("address"));
		emp.setGender(req.getParameter("gender"));
		emp.setPassword(req.getParameter("password"));

		empDao dao = new empDao();

		if (id == "" || id == null) {

			int addEmp = dao.addEmployee(emp);

			if (addEmp > 0) {

				req.setAttribute("data", dao.viewAllData());
				req.setAttribute("dataAdd", "Data Added Successfully....");
				req.getRequestDispatcher("home.jsp").forward(req, resp);
			}

		} else {

			emp.setId(Integer.parseInt(id));

			int update = dao.updateEmployee(emp);

			if (update > 0) {

				req.setAttribute("data", dao.viewAllData());
				req.setAttribute("update", "Data Updated....");
				req.getRequestDispatcher("viewEmployee").forward(req, resp);

			}

		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
