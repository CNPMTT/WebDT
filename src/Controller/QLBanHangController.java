package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.HDBHDao;
import Model.HDBH;
/**
 * Servlet implementation class QLBanHangController
 */
@WebServlet("/QLBanHangController")
public class QLBanHangController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QLBanHangController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HDBHDao hdDao= new HDBHDao();
		HDBH hd=new HDBH();
		String command = request.getParameter("command");
		String maHD= request.getParameter("MaHD");
		
		String url="", error="";
		
		try{
			switch(command){
				case "delete":
					System.out.println("Vào delete");
					boolean g=hdDao.deleteHDBH(maHD);
				
					if(g)			
						error="Thành công";					
					else
						error="Thất bại";
					url="WebDT/7NhanVienPage.jsp";
					System.out.println(error+"__________"+url);
					break;
				case "check":
					System.out.println("Vào phê duyệt");
					String xuly = request.getParameter("xuly");
					HDBH hdbh=hdDao.getHDBH(maHD);
					
					if(xuly.equals("check1"))
						hdbh.setTrangThai("2");
					if(xuly.equals("check2"))
						hdbh.setTrangThai("3");
					if(hdDao.updateTrangThai(hdbh))
						error="Thành công";
					else
						error="Thất bại";
					url="WebDT/7NhanVienPage.jsp";
					break;
//				case "insert":
//					System.out.println("Vào insert 2");
////					int sokh=khDao.getListKhachHang().size()+1;
////					String maKH=Integer.toString(sokh);
//					ArrayList<KhachHang> list = new ArrayList<KhachHang>();
//					list = crt.getListKhachHang();
//					int kq=1;
//					int temp=0;
//					while(temp==0)
//					{
//						if(kq!=Integer.parseInt(list.get(kq).getMaKH()))
//							temp=1;
//						kq=kq+1;
//					}
//					System.out.println(kq-1);
////					kh.setMaKH( Integer.toString(kq-1));
////					kh.setMaKH(request.getParameter("maKH"));
////					kh.setTenKH(request.getParameter("tenKH"));
////					kh.setSDT(request.getParameter("sdt"));
////					kh.setDiaChi(request.getParameter("diachi"));
////					kh.setEmail(request.getParameter("email"));
////					if(crt.insertKhachHang(kh))
////						error="Thành công";
////					else
////						error="Thất bại";
//					url="WebDT/7NhanVienPage.jsp";
//					System.out.println(error+"__________"+url);
//					break;
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
