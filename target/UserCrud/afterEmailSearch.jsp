<html>
<head>
    <title>Returned User Page</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

    <style>
        @charset "UTF-8";
        @import url(https://fonts.googleapis.com/css?family=Open+Sans:300,400,700);


          body {  background-color: #2ecc71;font-family: source-sans-pro, sans-serif;font-weight: 300;line-height: 1.42em;
  color:#A7A1AE;}


        ul {text-align:center;}

        li{display:inline-block;padding:margin-left:5px;margin-right:15px;font-weight:bold;padding-right:20px;}


        h1 {
  font-size:3em;
  font-weight: 300;
  line-height:1em;
  text-align: center;
  color: #4DC3FA;
}

h2 {
  font-size:1em;
  font-weight: 300;
  text-align: center;
  display: block;
  line-height:1em;
  padding-bottom: 2em;
  color: #FB667A;
}

h2 a {
  font-weight: 700;
  text-transform: uppercase;
  color: #FB667A;
  text-decoration: none;
}

.blue { color: #185875; }
.yellow { color: #FFF842; }

.container th h1 {
	  font-weight: bold;
	  font-size: 1.5em;
  text-align: left;
  color: #185875;
}

.container td {
	  font-weight: normal;
	  font-size: 1em;
  -webkit-box-shadow: 0 2px 2px -2px #0E1119;
	   -moz-box-shadow: 0 2px 2px -2px #0E1119;
	        box-shadow: 0 2px 2px -2px #0E1119;
}

.container {
	  text-align: left;
	  overflow: hidden;
	  width: 90%;
	  margin: 0 auto;
  display: table;
  padding: 0 0 8em 0;
}

.container td, .container th {
	  padding-bottom: 2%;
	  padding-top: 2%;
  padding-left:2%;
}

/* Background-color of the odd rows */
.container tr:nth-child(odd) {
	  background-color: #323C50;
}

/* Background-color of the even rows */
.container tr:nth-child(even) {
	  background-color: #2C3446;
}

.container th {
	  background-color: #1F2739;
}

.container td:first-child { color: #FB667A; }

.container tr:hover {
   background-color: #464A52;
-webkit-box-shadow: 0 6px 6px -6px #0E1119;
	   -moz-box-shadow: 0 6px 6px -6px #0E1119;
	        box-shadow: 0 6px 6px -6px #0E1119;
}

.container td:hover {
  background-color: #FFF842;
  color: #403E10;
  font-weight: bold;

  box-shadow: #7F7C21 -1px 1px, #7F7C21 -2px 2px, #7F7C21 -3px 3px, #7F7C21 -4px 4px, #7F7C21 -5px 5px, #7F7C21 -6px 6px;
  transform: translate3d(6px, -6px, 0);

  transition-delay: 0s;
	  transition-duration: 0.4s;
	  transition-property: all;
  transition-timing-function: line;
}


@media (max-width: 800px) {
.container td:nth-child(4),
.container th:nth-child(4) { display: none; }
}


.formButton {
	background-color:#fffffff;
	display:inline-block;
	color:#2ecc71;
	font-size:28px;
	font-weight: 500;
	text-decoration:none;
    width:88%;
    position:relative;
}
.formButton:hover {
	background-color: #27ae60;
  color:#ffffff;
}


#formButtonDelete{
color:red;
}

#formButtonDelete:hover{
background-color:red;
color:#ffffff;
}

.formButton:active {
	position:relative;
	background-color:red;
	top:3px;
}


    </style>
</head>
<body>
<div id="fullnav">
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="#">User Database 1.0</a>
            </div>
            <ul class="nav navbar-nav">
                <li class="active"><a href="home.html" style="text-decoration:none">Home</a></li>
                <li><a href="form.html" style="text-decoration:none">Register User</a></li>
                <li><a href="UsersPanelServlet" style="text-decoration:none">Users Panel</a></li>
                <li><a href="searchuser.html" style="text-decoration:none">Search User</a></li>
            </ul>

        </div>
    </nav>
</div>
<br>
<table class="container">
    <thead>
    <tr>
        <th><h1>First Name</h1></th>
        <th><h1>Last Name</h1></th>
        <th><h1>Email</h1></th>
        <th><h1>Age</h1></th>
        <th><h1>Gender</h1></th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>${user.firstName}</td>
        <td>${user.lastName}</td>
        <td>${user.eMail}</td>
        <td>${user.age}</td>
        <td>${user.gender}</td>
    </tr>
    </tbody>
    </table>
</div>
</body>
<tbody>
