package Servelet;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
            name = "Students",
            urlPatterns = {"/students"}
    )
public class StudentsAction extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

    }
}
