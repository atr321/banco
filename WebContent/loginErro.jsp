<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="model.Cliente" %>

<% Cliente c = (Cliente)request.getAttribute("cliente"); %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Banco TOPZERA</title>
</head>
<body>
<div class="alert alert-danger" role="alert"><h1>DEU RUIM MERMAO</h1></div>

<h3>Loga dnv CACHORRO</h3>

<form action="login">
  <div class="form-group">
    <label for="exampleInputEmail1">CPF</label>
    <input type="text" name="cpfcliente"class="form-control"  placeholder="XXX.XXX.XXX-XX ">
    
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Senha</label>
    <input type="password" name="senhacliente" class="form-control" id="exampleInputPassword1" placeholder="Senha">
  </div>
  <button type="submit" class="btn btn-primary">Acessar</button>
</form>
</body>
</html>