<%-- 
    Document   : dbUpdate
    Created on : 10-Aug-2016, 02:45:03
    Author     : Sri Nivas Karri
--%>
<%@page import="com.mysql.jdbc.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="display" uri="/WEB-INF/tlds/tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Maintain Data</title>
    </head>
    <body>
        
        <%
        Connection con_new=(Connection)session.getAttribute("connection");
        %>
        <display:dbqDisplay con='<%=con_new%>' />
        <display:dbUpdate ISBN="${param.ISBN}" con='<%=con_new%>' TYPE="${param.TYPE}" />
    </body>
</html>
