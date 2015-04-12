<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<html>
	<head>
		<meta charset="utf-8">
		<title>${title}</title>
	</head> 
	<body>
		<h2>${message}</h2>
		<table>
			<form:form modelAttribute="formModel">
				<tr>
					<td><form:label path="input">インプット</form:label></td>
					<td><form:input path="input" size="20" /></td>
				</tr>
				<tr>
					<td><input type="submit"></td>
				</tr>			
			</form:form>
		</table>
	</body>
</html>
