<%@ page errorPage="/errorEmail.jsp" %>
<html>
<head>
    <title>SearchId Page</title>
    <style>


        body{background-color:gold; font-family:"Arial";}

        ul {text-align:center;}

        li{display:inline-block;padding:margin-left:5px;margin-right:15px;font-weight:bold;padding-right:20px;}

        #container{text-align:center;}

        p{font-size:20px;}

        #container { display: flex;flex-direction: column;justify-content: center;align-items: center;}

        form  { display: table;      }

        p     { display: table-row;  }

        label { display: table-cell;padding-top:10px;padding-right:10px;font-weight:bold; }

        #submitButton {margin-top:20px;position:absolute;padding:5 10 5 10;font-size:15px;font-weight:bold;left:47%;}

    </style>
</head>
<body>
<nav>
    <ul>
        <li class="selected"><a href="home.html" style="text-decoration:none">HOME</a></li>
        <li><a href="form.html" style="text-decoration:none">REGISTER USER</a></li>
        <li><a href="UsersPanelServlet" style="text-decoration:none">USERS PANEL</a></li>
        <li><a href="searchuser.html" style="text-decoration:none">SEARCH USER</a></li>
    </ul>
</nav>
<br>
<div id="container">
    <form method="GET" action="ResultServlet">
        <p>
            <label for="searchId">Please enter user id:</label>
            <input id="searchId" name="searchId" type="text">
        </p>
        <p>
            <input id="submitButton" type="SUBMIT">
        </p>
    </form>
</div>

</body>