<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Concurrency Utilities</title>
</head>
<body>
    <h1>Concurrency Utilities</h1>
 iahsdH ASIDUHA SIDUHASI DHASIUdh
 
    <jsp:include page="menu.jsp" />
 
     <form action="inicia-thread" method="post">
        <div>
            <label for="texto">Texto</label>
            <input id="texto" name="texto" type="text" />
        </div>
        <div>
            <label for="vezes">Vezes</label>
            <input id="vezes" name="vezes" type="number" />
        </div>
        <div>
            <button type="submit">Imprimir no Console</button>
            <button type="reset">Limpar</button>
        </div>
     </form>
</body>
</html>