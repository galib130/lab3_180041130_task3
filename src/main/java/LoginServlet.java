
import com.example.lab04_180041130_task3.LoginBean;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends  HttpServlet{

    Boolean valid;
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{

        LoginBean loginBean =new LoginBean();

        loginBean.setUsername(request.getParameter("username"));
        loginBean.setPassword(request.getParameter("password"));

        valid=loginBean.getValid();

        if(valid==Boolean.TRUE){
            HttpSession session=request.getSession();
            request.getRequestDispatcher("welcome.jsp").include(request,response);
        }
        else{
            request.getRequestDispatcher("login.jsp").include(request,response);
        }

    }




}
