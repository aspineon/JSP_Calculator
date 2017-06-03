<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
  body {
    background-color: lightblue;
}
  button {
  height: 60px;
  width: 60px;
  }
  
  .btn-xlarge {
   height: 120px;
    }
  
  </style>
<title>Calculator JSP</title>
</head>
<body>

<div class="container">
<jsp:useBean class="atj.CalcModel" id="calcModel" scope="session"/>
<form action="CalcServlet" method="POST">
<table>
 <tr>
  <th><input  class="form-control input-lg" id="input" name="input"  value="${calcModel.input}" style="float:right" disabled></th>
 <th><button type="submit" class="btn btn-danger btn-lg" name="btn" value="Clear">C</button></th>
</tr>
</table>

<table>
<tr>
  <td><button type="submit" class="btn btn-primary btn-lg" name="btn" value="7">7</button></td>
  <td><button type="submit" class="btn btn-primary btn-lg" name="btn" value="8">8</button></td>
  <td><button type="submit" class="btn btn-primary btn-lg" name="btn" value="9">9</button></td>
  <td><button type="submit" class="btn btn-success btn-lg" name="btn" value="/">/</button></td>
  <td><button type="submit" class="btn btn-success btn-lg" name="btn" value="sqrt">sqrt</button></td>
</tr>

<tr>
  <td><button type="submit" class="btn btn-primary btn-lg" name="btn" value="4">4</button></td>
  <td><button type="submit" class="btn btn-primary btn-lg" name="btn" value="5">5</button></td>
  <td><button type="submit" class="btn btn-primary btn-lg" name="btn" value="6">6</button></td>
  <td><button type="submit" class="btn btn-success btn-lg" name="btn" value="*">*</button></td>
  <td><button type="submit" class="btn btn-success btn-lg" name="btn" value="%">%</button></td>
</tr>

<tr>
  <td><button type="submit" class="btn btn-primary btn-lg" name="btn" value="1">1</button></td>
  <td><button type="submit" class="btn btn-primary btn-lg" name="btn" value="2">2</button></td>
  <td><button type="submit" class="btn btn-primary btn-lg" name="btn" value="3">3</button></td>
  <td><button type="submit" class="btn btn-success btn-lg" name="btn" value="-">-</button></td>
  <td rowspan="2"><button type="submit" class="btn btn-warning btn-xlarge" name="btn" value="=" height="120">=</button></td>
</tr>

<tr>
  <td><button type="submit" class="btn btn-primary btn-lg" name="btn" value="0">0</button></td>
  <td><button type="submit" class="btn btn-primary btn-lg" name="btn" value=".">.</button></td>
  <td><button type="submit" class="btn btn-primary btn-lg" name="btn" value="+/-">+/-</button></td>
  <td><button type="submit" class="btn btn-success btn-lg" name="btn" value="+">+</button></td>
</tr>
</table>
</form>
</div>

</body>
</html>