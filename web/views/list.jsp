<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: NoteBook
  Date: 25.08.2018
  Time: 1:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../w3.css">
</head>
<body class="w3-light-grey">
 <div class="w3-container w3-light-blue w3-round-xlarge w3-center">
     <h1>My app</h1>
 </div>


<div class="w3-container w3-center w3-margin-bottom w3-padding">
    <div class="w3-card-4">
 <div class="w3-container w3-light-blue"><h2>Users</h2></div>



    <%
        List<String> names = (List<String>) request.getAttribute("users");
        if (names != null && !names.isEmpty()) {
            out.println("<ul class=\"w3-ul\">");
            for (int i = 0; i < names.size(); i++) {
                out.println("<li class=\"w3-hover-sand\">" + names.get(i) + "</li>");
            }
            out.println("</ul>");
        } else out.println("<div class=\"w3-panel w3-red w3-display-container w3-card-4 w3-round\">\n " +
                "<span onclick=\"this.parentElement.style.display='none'\"\n"+
                "class=\"w3-button w3-margin-right w3-display-right w3-round-large w3-hover-red w3-border w3-border-red w3-hover-border-grey\">x</span>\n"+
                " <h5>There are no users yet!</h5>\n"+
                "</div>");

    %>
    </div>
</div>

<div class="w3-container w3-grey w3-opacity w3-center w3-padding">
    <button class="w3-btn w3-round-large" onclick="location.href='/'">Back to main</button>

</div>

</body>
</html>
