<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css"
	href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />
<c:url value="/css/welcome.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />
<title>DB Management Tool</title>
</head>
<body>
	<jsp:include page="component/TopMenu.jsp" />
	<jsp:include page="component/Sidebar.jsp"/>  
	<div class="container">
		<c:if test="${not empty msg}">
			<div class="alert alert-${css} fade in" role="alert" id="alert">
				<strong>${msg}</strong>
			</div>
		</c:if>
		<div class="row main">
			<div class="panel-heading">
				<div class="panel-title text-center">
					<h1 class="title">Language</h1>
					<hr />
				</div>
			</div>
			<div class="main-login main-center">
				<form class="form-horizontal" method="GET" action="/addKey"
					modelAttribute="key">

					<div class="form-group">
						<label for="name" class="cols-sm-2 control-label">Key</label>
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"><i class="fa fa-key fa"
									aria-hidden="true"></i></span>
								<input type="text" class="form-control"
									name="key" id="name" placeholder="Enter your key" />
							</div>
						</div>
					</div>

					<div class="form-group">
						<label for="password" class="cols-sm-2 control-label">English</label>
						<div class="cols-sm-10">
							<div class="input-group">
								 <span class="input-group-addon"><i class="fa fa-key fa"
									aria-hidden="true"></i></span><input
									type="text" class="form-control" name="english"
									id="english" placeholder="Enter your English key" />
							</div>
						</div>
					</div>
					
					<div class="form-group">
						<label for="password" class="cols-sm-2 control-label">Việt Nam</label>
						<div class="cols-sm-10">
							<div class="input-group">
								 <span class="input-group-addon"><i class="fa fa-key"
									aria-hidden="true"></i></span><input
									type="text" class="form-control" name="vietnam"
									id="vietnam" placeholder="Enter your VietNam key" />
							</div>
						</div>
					</div>

					<div class="form-group ">
						<button type="submit"
							class="btn btn-primary btn-lg btn-block login-button">Register</button>
					</div>
				</form>
			</div>
		</div>

	</div>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script type="text/javascript">
		$("#alert").fadeTo(2000, 500).slideUp(500, function() {
			$("#alert").slideUp(500);
		});
	</script>
</body>
</html>