package com.cdk.assignment2;


        import javax.servlet.RequestDispatcher;
        import javax.servlet.ServletException;
        import javax.servlet.http.HttpSession;
        import java.io.IOException;
        import java.io.PrintWriter;
        import java.util.HashMap;
        import java.util.Map;

public class LoginServlet extends javax.servlet.http.HttpServlet {

    Map<String, String> credentials = new HashMap<String, String>();

    public void init() throws ServletException {
        credentials.put("admin", "1234");
        credentials.put("Binay", "sonudjazz");
    }

    public void destroy() {
        credentials.clear();
        credentials = null;
    }

    public void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (credentials.get(username).equals(password)) {
            HttpSession session = request.getSession();
            session.setAttribute("Login-Status", true);
            pw.write("<H3>User</H3> <H1>" + username + " </H1><H3>Logged in successfully!!</H3>");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Menu.html");
            requestDispatcher.forward(request, response);
        } else {
            pw.write("<H3>Wrong Username or Password!!</H3>");
            pw.write("<br><a href=\"login.html\">Try login again</a>");

        }
    }
}
