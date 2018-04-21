<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="model.Cliente" %>
<%@ page import="model.Conta" %>
<%@ page import="java.util.ArrayList" %>

<% Conta co = (Conta)request.getAttribute("conta"); %>
<% Cliente c = (Cliente)request.getAttribute("cliente"); %>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
<title>Banco TOPZERA</title>
</head>
<body>

  <h1 >EAE,</h1>
  <h4>Contas:<%= co.getNumeroConta() %></h4>
  <h4>Agencia:<%= co.getAgenciaConta() %></h4>
  <h4>Tipo da conta:<%= co.getTipoConta() %><h4>

</body>
</html>