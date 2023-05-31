<%-- 
    Document   : Perroinfo
    Created on : 22/05/2023, 11:09:59 p. m.
    Author     : trosq
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Información de perros</title>
    </head>
    <body>
        <h1>Información de perros</h1>
        <form action="./StudentServlet" method="POST">
        <table>
            <tr>
                <th> Id</th>
                <th><input type="text" name="studentId" value="${perro.idPerro}"/> </th>
            </tr>
            <tr>
                <th> Nombre</th>
                 <th> <input type="text" name="firstname" value="${perro.nombrePerro}"/></th>
            </tr>
             <tr>
                <th> Raza</th>
                 <th><input type="text" name="lastname" value="${perro.razaPerro}"/> </th>
            </tr>
             <tr>
                <th> Edad</th>
                 <th> <input type="text" name="yearLevel" value="${perro.edadPerro}"/></th>
            </tr>
            <tr>
                <th> Sexo</th>
                 <th> <input type="text" name="firstname" value="${perro.sexoPerro}"/></th>
            </tr>
             <tr>
                 <td colspan="2">
                 <input type="submit" name="action" value="Add"/>
                 <input type="submit" name="action" value="Edit"/>
                 <input type="submit" name="action" value="Delete"/>
                 <input type="submit" name="action" value="Search"/>
                 </td>
             </tr>
            
        </table>
            </form>
            <br>
            
            <table border="1">
                <th>Id</th>
                <th>Nombre</th>
                <th>Raza</th>
                <th>Edad</th>
                <th>Sexo</th>
                
                <c:forEach items="${allPerro}" var="perro">
                    <tr>
                        <td>${perro.idPerro}</td>
                        <td>${perro.nombrePerro}</td>
                        <td>${perro.razaPerro}</td>
                        <td>${perro.edadPerro}</td>
                        <td>${perro.sexoPerro}</td>
                    </tr>
                </c:forEach>
           </table>
    </body>
</html>
