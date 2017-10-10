package com.logicbig.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "testServlet3", urlPatterns = {"/test3"},
          loadOnStartup = 1)
public class TestServlet3 extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    protected void doGet (HttpServletRequest req,
                          HttpServletResponse resp) throws ServletException, IOException {

        throw new ServletException();
    }
}