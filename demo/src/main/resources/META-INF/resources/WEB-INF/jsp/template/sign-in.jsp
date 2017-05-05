<%@ include file="../init.jsp" %>
<title>Sign In JSP</title>
<form:form action="/login">
	<input type="text" name="email"/>
	<input type="password" name="password"/>
	<input type="submit" value="Login">
</form:form>