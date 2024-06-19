<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="cl.praxis.desafiojsp.utiles.UtilesGeneral"%>
<%
    // Incluye clases requeridas
    UtilesGeneral utilesgeneral = new UtilesGeneral();
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Desafío evaluado - JEE y Java Server Pages</title>
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.mi
n.css"
            rel="stylesheet"
            integrity="sha384-
gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx"
            crossorigin="anonymous">

</head>
<body>
<div class="container">
    <h1>Desafío evaluado - JEE y Java Server Pages</h1>
    <div class="row">
        <div class="col-12 col-sm-12">
            <table class="table table-striped table-hover">
                <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Número</th>
                    <th scope="col">Calcular factorial</th>
                    <th scope="col">Es par o impar?</th>
                </tr>
                </thead>
                <tbody>
                <%
                    for (int x = 0; x < 10; x++) {
                %>
                <tr>
                    <th scope="row"><%=x + 1%></th>
                    <th>Número <%=x + 1%></th>
                    <td><a href=factorial?num=<%=x + 1%>><%=utilesgeneral.getFactorial(x+1)%></a></td>
                    <td><a href=numerosPares?num=<%=x + 1%>><%=utilesgeneral.esPar(x+1)? "Verdadero": "Falso"%></a></td>
                </tr>
                <%
                    }
                %>
                </tbody>
            </table>
        </div>
    </div>
</div>
<script

        src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bund
le.min.js"
        integrity="sha384-
A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
        crossorigin="anonymous"></script>
</body>
</html>