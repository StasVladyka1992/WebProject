<%--
  Created by IntelliJ IDEA.
  User: NoteBook
  Date: 27.08.2018
  Time: 18:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="../w3.css"/>
</head>

<body>

<div class="w3-container w3-light-green w3-round-xlarge w3-center">
    <h1>My app</h1>
</div>

<div class="w3-container w3-padding">
</div>

<div class="w3-card-4">
        <div class="w3-container w3-yellow w3-center">
            <h1>Delete user</h1>
        </div>


        <%--<%--%>
            <%--if (request.getAttribute("answer") != null) {--%>
                <%--out.println("<div class=\"w3-panel w3-green w3-display-container w3-card-4 w3-round\">\n" +--%>
                        <%--" <span onclick=\"this.parentElement.style.display='none'\"\n" +--%>
                        <%--" class=\"w3-button w3-margin-right w3-display-right w3-round-large w3-hover-green w3-border w3-border-green w3-hover-border-grey\">x</span>\n" +--%>
                        <%--" <h5>User '" + request.getAttribute("answer") + "' deleted</h5>\n" +--%>
                        <%--"</div>");--%>
            <%--}--%>
            <%--else out.println("<div class=\"w3-panel w3-green w3-display-container w3-card-4 w3-round\">\n" +--%>
                    <%--" <span onclick=\"this.parentElement.style.display='none'\"\n" +--%>
                    <%--" class=\"w3-button w3-margin-right w3-display-right w3-round-large w3-hover-green w3-border w3-border-green w3-hover-border-grey\">x</span>\n" +--%>
                    <%--" <h5>There is no user with such login and password</h5>\n" +--%>
                    <%--"</div>");--%>

        <%--%>--%>



        <div>
            <form action="" class="w3-light-grey w3-padding" method="post">
                <label for="deleteName">Name:</label>
                <br>
                <input class="w3-input w3-animate-input w3-border-amber w3-round-xlarge"
                       style="width: 30%" type="text" id="deleteName" name="deleteN">
                <br>
                <label for="deletePassword">Password:</label>
                <br>
                <input class="w3-input w3-animate-input w3-border-amber w3-round-xlarge" style="width: 30%"
                       type="password"
                       id="deletePassword" name="deleteP">
                <br>
                <input type="submit" class="w3-btn w3-yellow w3-round-large w3-margin-bottom">

            </form>
        </div>

    <div class="w3-container w3-grey w3-opacity w3-center w3-padding">
        <button class="w3-btn w3-round-large" onclick="location.href='/'">Back to main</button>
    </div>

    </div>
</body>
</html>
