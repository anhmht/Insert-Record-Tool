<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<nav class="navbar navbar-inverse" style="margin:auto">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">DB Management Tool</a>
		</div>
		<div id="navbar" class="collapse navbar-collapse">
			<ul class="nav navbar-nav">
				<li ${welcome}><a href="/">Dashboard</a></li>
				<li ${user}><a href="/user">User</a></li>
				<li ${language}><a href="/language">Language</a></li>
			</ul>
		</div>
	</div>
	</nav>
</body>
</html>