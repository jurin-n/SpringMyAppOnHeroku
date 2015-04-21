<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width,initial-scale=1">
		<title>${title}</title>
	</head> 
	<body>
		<header>
			<div>
				<h1>${message}</h1>
			</div>
		</header>
		<div class="container">
			<div class="column">
				<form:form modelAttribute="loginFormModel">
					<div>
						<span><form:label path="id">ユーザID</form:label></span>
						<span><form:input path="id" size="20" /></span>
					</div>
					<div>
						<span><form:label path="password">パスワード</form:label></span>
						<span><form:password path="password" size="20" /></span>
					</div>
					<div>
						<span><input type="submit"></span>
					</div>			
				</form:form>
			</div>
			<div class="column">
			</div>
		</div>
		<footer>
			<div></div>
		</footer>
	</body>
</html>
