package org.gyeongju.ctrl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gyeongju")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public Main() {
    	super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//서버 연결 테스트 + 커밋&푸시 테스트
		ServletContext application = request.getServletContext();
		application.setAttribute("title", "경주시 문화관광 웹 애플리케이션");
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/index.jsp");
		view.forward(request, response);
	}

}
