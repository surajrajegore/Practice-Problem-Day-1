import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Pattern;

@WebServlet(
        description = "Login Servlet Testing",
        urlPatterns = { "/LoginServlet" },
        initParams = {
                @WebInitParam(name = "user", value = "suraj"),
                @WebInitParam(name = "password", value = "admin")
        }
)
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");
        String pwd = request.getParameter("pwd");

        String userID = getServletConfig().getInitParameter("user");
        String password = getServletConfig().getInitParameter("password");
        if (Pattern.matches("[A-Z][a-z]{2,}", userID) && Pattern.matches("(?=.*?[A-Z])(?=.*?\\d)(?=.*?[a-z])(?=.*?[!@#$%^&*_()+-])[A-Za-z\\d!@#$%^&()*+_-]{8,}", password) && userID.equals(user) && password.equals(pwd)) {
            request.setAttribute("user", user);
            request.getRequestDispatcher("LoginSuccess.jsp").forward(request, response);
            request.getRequestDispatcher("LoginSuccess.jsp").forward(request,response);
        }else {
            RequestDispatcher requestDispatcher = getServletContext().getNamedDispatcher("/login.html");
            PrintWriter out = response.getWriter();
            out.println("<font color=red>User name or Password is Wrong.</font>");
            requestDispatcher.include(request,response);
        }
    }
}
