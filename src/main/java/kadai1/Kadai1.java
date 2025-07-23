package kadai1;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Kadai1Bean;

/**
 * Servlet implementation class Kadai1
 */
@WebServlet("/keisan")
public class Kadai1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Kadai1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		String strMoney=(String) request.getParameter("money");
		String strRate=(String) request.getParameter("rate");
		int money=0;
		double rate=0;
		int tax=0;
		int withTax=0;
		String judge="";
		try {
			money=Integer.parseInt(strMoney);
			//rate=Double.parseDouble(strRate);
			if(strRate.equals("1")) {
				rate=0.08;
			}else if(strRate.equals("2")) {
				rate=0.1;
			}
		
			tax=(int)(money*(rate));
			withTax=(int)money+tax;
			System.out.println(withTax);
		}catch(Exception e) {
			e.printStackTrace();
			judge="計算できませんでした";
		}
		Kadai1Bean date=new Kadai1Bean();
		date.setMoney(money);
		date.setRate(rate);
		date.setTax(tax);
		date.setWithTax(withTax);
		request.setAttribute("DATA", date);
		request.getRequestDispatcher("kadai1.jsp").forward(request, response);
		
	}

}
