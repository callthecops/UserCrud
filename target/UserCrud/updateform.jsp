<html>
<head>
    <title>User UPDATE</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <style>

      body {
  background-color: #2ecc71;
  font-family: source-sans-pro, sans-serif;
}

h1 {
  margin-left: auto;
  margin-top: 50px;
  text-align: center;
  font-weight: 100;
  font-size: 2.8em;
  color: #ffffff;
}
        ul {text-align:center;}

        li{display:inline-block;padding:margin-left:5px;margin-right:15px;font-weight:bold;padding-right:20px;}


#formcontainer {
  width: 500px;
  margin: auto;
}

.formStyle {
  background-color: #2ecc71;
  padding: 20px;
  width: 400px;
  margin-bottom: 20px;
  border-bottom-width: 1px;
  border-bottom-style: solid;
  border-bottom-color: #ecf0f1;
  border-top-style: none;
  border-right-style: none;
  border-left-style: none;
  font-size: 1em;
  font-weight: 100;
  color: #ffffff;
}

.formButton {
  float: right;
	background-color:#ffffff;
	display:inline-block;
	color:#2ecc71;
	font-size:28px;
	font-weight: 500;
	padding:6px 24px;
  margin-top: 15px;
  margin-right: 60px;
	text-decoration:none;
}

.formButton:hover {
	background-color: #27ae60;
  color:#ffffff;
}

.formButton:active {
	position:relative;
	top:3px;
}

/*To remove the outline that appears on clicking the input textbox*/
input:focus {
  outline: none;
}

/* To format the placeholder text color */
::-webkit-input-placeholder {
   color: #ecf0f1;
}

:-moz-placeholder { /* Firefox 18- */
   color: #ecf0f1;
}

::-moz-placeholder {  /* Firefox 19+ */
   color: #ecf0f1;
}

:-ms-input-placeholder {
   color: #ecf0f1;
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
<h1>
    <h1>Updating user with id = ${id} and name = ${user.firstName} ${user.lastName}</h1>
</h1>

<div id = "formcontainer">
    <form method="POST" action="AfterUpdateDeleteServlet">
        <input type="text" name="firstName" class="formStyle" placeholder="First Name (required)" required/>
        <input type="text" name="lastName" class="formStyle" placeholder="Last Name (required)" required/>
        <input type="email" name="eMail" class="formStyle" placeholder="Email (required)" required/>
        <input type="text" name="age" class="formStyle" placeholder="Age"/>
        <input type="text" name="gender" class="formStyle" placeholder="Gender"/>
        </p>
        <input type = "hidden" name ="useridfordbsearch" value = ${user.id}>
        <p>
        <br>
        <input id="submitButton" class="formButton" type="SUBMIT">
    </form>
</div>
<br>
<p></p><br>
</body>
</html>