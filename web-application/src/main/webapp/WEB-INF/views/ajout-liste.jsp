<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" >
         <title>Insert title here</title>
</head>
<body>
<p>Ajoutez une tache </p>
<div class="container">
   
           <form:form modelAttribute="liste" action ="/web-application/ajout-liste" method="post">
              <fieldset class="form-group">
                  <%-- <form:label path="description">Description : </form:label> --%>
                  <form:input path="description" type= "text" class="form-control"  required="required"/> 
                  <form:errors path="description" cssClass="text-warning" />
              </fieldset>
              <button class="btn btn-success" name = "button" type = "subit">Ajouteer</button>      
            
              
         </form:form>
 </div>
<script src="/webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>