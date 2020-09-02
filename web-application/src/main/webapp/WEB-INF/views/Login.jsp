<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel='stylesheet' type='text/css' href="/WEB-INF/style.css"/>
<title>Votre application</title>
<h1>Veillez vous identifier!</h1>
</head>

<body>
  <form method="post" action=""> 
  
  <p><font color = red>${ error }</font></p>
            <label for = 'login'> Login : </label>
            <input id ='login' type = 'text' name = 'txtlogin' value='${ login }' autofocus></br></br>
            
             <label for = 'password'> Password : </label>
       <input id ='login' type = 'password' name = 'txtpassword' value=''></br></br>
       
       <button id='btnbutton' name = button type = 'submit'> Valider</button>
       

      </form>

</body>
</html>