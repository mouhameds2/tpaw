<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
    <head>
         <meta charset="ISO-8859-1">
         <link rel="stylesheet" href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" >
         <title>Insert title here</title>
   </head>
   <body>
      <div class="container">
           <table class="table table-striped">
           <caption>Les taches sont : </caption>
                 <h1> <p>M : ${login} </p>Voici la liste des taches à faire</h1>
                <thead>
                      <tr>
                           <th> Description</th>
                           <th> Date</th>
                      <th> Statut</th>
                   </tr>
              </thead>
             <tbody>
                    <c:forEach items="${list}" var="list">
                     <tr>
                        <td>${list.description}</td>
                        <td>${list.targetDate}</td>
                       <td>${list.estEffectuée}</td>
                      <td> <a class="btn btn-danger" href="/web-application/supprime-tache?id=${list.id }">Supprimer</a></td>
                      <td> <a class="btn btn-warning" href="/web-application/modifie-tache">Modifier</a>
                  </tr>
                 </c:forEach>
  
            </tbody>
         </table><br>
           <div>
               <a class="btn btn-primary" href="/web-application/ajout-liste">Ajouter</a><br> <br>
              <a class="btn btn-primary" href="/web-application/Bienvenue">Accueil</a>
          </div> 
     </div> 
   



<script src="/webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>



</body>
</html>