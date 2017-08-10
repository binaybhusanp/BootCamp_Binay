package com.cdk.assignment1.cricket;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class CricketServlet extends HttpServlet {
    Map<String,String> data = new HashMap<>();

    public void init()  throws ServletException {

        data.put("India","ODI");
        data.put("England","Test");
        data.put("Australia","T20");
        data.put("Bangladesh","BPL");
        data.put("Pakistan","Bombing");
    }

    public void destroy() {
        data.clear();
        data = null;
    }
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String methodValue = request.getMethod();
        String countryName = request.getParameter("countryname");
        //String matchType = request.getParameter("matchType");

        PrintWriter pw = response.getWriter();
        pw.write(countryName+" is Playing "+data.get(countryName));
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String methodValue = request.getMethod();
        String countryName = request.getParameter("countryname");
        //String matchType = request.getParameter("Match Type");

        PrintWriter pw = response.getWriter();
        pw.write(countryName+" is Playing "+data.get(countryName));
    }
}
