<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Levy</title>
<link rel="shortcut icon"
	href="http://nasuke.net/wp-content/uploads/favorite.ico" />
</head>
<hr>
<body>
	<h3>${FailureLoginMessage}</h3>
	<form name="welcome"
		action="${pageContext.request.contextPath}/welcome" method="post">
		Name: <input type="text" title="Enter UserName" name="username" />
		Password: <input type="password" title="Enter Password"
			name="password">
		<button type="Submit">LogIn</button>
	</form>
</body>
<footer>
	<hr>
	Powered By &copy;RaptorCorp
</footer>
</html>
