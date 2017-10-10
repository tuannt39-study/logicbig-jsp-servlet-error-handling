package com.logicbig.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "testServlet",
            urlPatterns = {"/test"},
            loadOnStartup = 1)
public class TestServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	@Override
    protected void doGet (HttpServletRequest req,
                          HttpServletResponse resp)
                             throws ServletException, IOException {

        int i = 1 / 0;
    }
}