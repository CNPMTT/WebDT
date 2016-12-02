package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.KhachHangDao;
import Model.KhachHang;

/**
 * Servlet implementation class KhachHangController
 */
@WebServlet("/KhachHangController")
public class KhachHangController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public KhachHangController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		KhachHangDao crt= new KhachHangDao();
		KhachHang kh=new KhachHang();
		String command = request.getParameter("command");
		String maKH= request.getParameter("MaKH");
		
		String url="", error="";
		
		try{
			switch(command){
				case "delete":
					System.out.println("Vào delete");
					boolean g=crt.deleteKhachHang(maKH);
				
					if(g)			
						error="Thành công";					
					else
						error="Thất bại";
					url="WebDT/7NhanVienPage.jsp";
					System.out.println(error+"__________"+url);
					break;
				case "update":
					System.out.println("Vào update");
					kh = crt.getKhachHang(maKH);
					kh.setTenKH(request.getParameter("tenKH"));
					kh.setSDT(request.getParameter("sdt"));
					kh.setDiaChi(request.getParameter("diachi"));
					kh.setEmail(request.getParameter("email"));
					if(crt.updateKhachHang(kh))
						error="Thành công";
					else
						error="Thất bại";
					url="WebDT/7NhanVienPage.jsp";
					System.out.println(error+"__________"+url);
					break;
				case "insert":
					System.out.println("Vào insert 2");
//					int sokh=khDao.getListKhachHang().size()+1;
//					String maKH=Integer.toString(sokh);
					ArrayList<KhachHang> list = new ArrayList<KhachHang>();
					list = crt.getListKhachHang();
					int kq=1;
					int temp=0;
					while(temp==0)
					{
						if(kq!=Integer.parseInt(list.get(kq).getMaKH()))
							temp=1;
						kq=kq+1;
					}
					System.out.println(kq-1);
//					kh.setMaKH( Integer.toString(kq-1));
//					kh.setMaKH(request.getParameter("maKH"));
//					kh.setTenKH(request.getParameter("tenKH"));
//					kh.setSDT(request.getParameter("sdt"));
//					kh.setDiaChi(request.getParameter("diachi"));
//					kh.setEmail(request.getParameter("email"));
//					if(crt.insertKhachHang(kh))
//						error="Thành công";
//					else
//						error="Thất bại";
					url="WebDT/7NhanVienPage.jsp";
					System.out.println(error+"__________"+url);
					break;
			}
			
		}catch(Exception e){
			error="Xảy ra lỗi ngẫu nhiên!";
		}
		
		request.setAttribute("error", error);
		response.sendRedirect(url);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
