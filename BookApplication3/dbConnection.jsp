<%-- 
    Document   : dbConnection
    Created on : 10-Aug-2016, 02:44:09
    Author     : Sri Nivas Karri
--%>

<%@page import="com.mysql.jdbc.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700|Lato:400,100,300,700,900' rel='stylesheet' type='text/css'>
	<link rel="stylesheet" href="css/animate.css">
	
	<link rel="stylesheet" href="css/style.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
    </head>
    <body>
        <div class="container">
            <div class="top">
                <h1 id="title" class="hidden"><span id="logo">Book <span>Library</span></span></h1>
            </div>
            <div class="login-box animated fadeInUp" >
                <div class="box-header">
                    <h2>Log In</h2>
                </div>
                <jsp:useBean id="connect" class="GUI.dbConnectionBean">
                <jsp:setProperty name="connect" property="username" value="${param.username}" /><br>
                <jsp:setProperty name="connect" property="password" value="${param.password}" /><br>
                <%
                    boolean status=connect.LoginValidation();
                    if(status==false){
                        out.println("<form method='get' action='./dbConnection.jsp'><br>");
                        out.println("User Name:<input type='text' name='username'><br>");
                        out.println("Password:<input type='password' name='password'><br>");
                        out.println("<button type='submit'>Signin </button><br>");
                        out.println("</form>");
                    }
                    Connection con=connect.DBConnection();
                    String user=connect.getUsername();
                    String pwd=connect.getPassword();
                    if(status==true){
                        session.setAttribute("connection", con);
                        session.setAttribute("name", user);
                        session.setAttribute("password", pwd);
                        response.sendRedirect("./dbQuery.jsp?TYPE=search");
                    }
                %>
                <a href="#"><p class="small">Forgot your password?</p></a>
            </div>
	</div>
        </jsp:useBean>
    </body>
    <script>
	$(document).ready(function () {
    	$('#logo').addClass('animated fadeInDown');
    	$("input:text:visible:first").focus();
	});
	$('#username').focus(function() {
		$('label[for="username"]').addClass('selected');
	});
	$('#username').blur(function() {
		$('label[for="username"]').removeClass('selected');
	});
	$('#password').focus(function() {
		$('label[for="password"]').addClass('selected');
	});
	$('#password').blur(function() {
		$('label[for="password"]').removeClass('selected');
	});
    </script>
</html>
