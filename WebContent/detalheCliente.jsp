<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="model.Cliente" %>
<%@ page import="model.Conta" %>
<%@ page import="java.util.ArrayList" %>

<% Cliente c = (Cliente)request.getAttribute("cliente"); %>
<% ArrayList<Conta> contas = (ArrayList<Conta>)request.getAttribute("detalhes"); %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
<title>Banco TOPZERA</title>
</head>
<body>

<div class="jumbotron">
  <h1 class="display-4">EAE, <%= c.getNomeCliente() %>!</h1>
  <h4>CPF:<%= c.getCpfCliente() %></h4>
  <h4>Contas:<h4>
  <table>
  <% for(int i = 0; i < contas.size(); i++){%>
	  
	  <tr><a href="detalheConta?idconta=<%= contas.get(i).getIdConta()%>&numeroconta=<%= contas.get(i).getNumeroConta()%>&agenciaconta=<%= contas.get(i).getAgenciaConta()%>&tipoconta=<%= contas.get(i).getTipoConta() %>"><%= contas.get(i).getNumeroConta() %></a><br/></tr>
	  
 <% } %>
  </table>
</body>
</html>