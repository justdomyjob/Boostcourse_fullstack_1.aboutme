

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TodayServlet
 */
@WebServlet("/today")
public class TodayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TodayServlet() {
        super();
        // TODO Auto-generated constructor stub
    } 

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html lang=\"kr\">");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<head><title>현재시간</title></head>");
		out.println("<body>");
		out.println("<a style =\"font-size : 30px\"  href=\"./html/index.html\">메인화면</a>");
		out.println("<div style =\"font-size : 50px;  text-align: center; padding : 20% 30%; position :fixed; \">");
		LocalDateTime currenTime = LocalDateTime.now();
		out.print("현재시간 :\n" +
				currenTime.getYear()+"/"+currenTime.getMonthValue()
				+"/"+currenTime.getDayOfMonth()+" "+ currenTime.getHour()
				+":"+currenTime.getMinute());
		//현재시간 : 2023/12/14 20:34
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
