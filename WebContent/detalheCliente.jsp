<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="model.Cliente" %>
<%@ page import="model.Conta" %>
<%@ page import="java.util.ArrayList" %>

<% Cliente c = (Cliente)request.getAttribute("cliente"); %>
<% Arraylist<Conta> contas = (Arraylist<Conta>)request.getAttribute("conta"); %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Banco TOPZERA</title>
</head>
<body>
<h1>Cliente:<%= c.getNomeCliente() %></h1>
<h1>CPF:<%= c.getCpfCliente() %></h1>

<h1>Contas:<%= co.getIdConta() %></h1>
</body>
</html>