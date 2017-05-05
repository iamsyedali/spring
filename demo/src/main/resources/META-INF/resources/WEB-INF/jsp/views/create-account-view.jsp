<%@ include file="../init.jsp" %>

<form:form action="/create-account" modelAttribute="user" method="post"  commandName="user" >
	<table>
		<tr>
		    <td><spring:message code="firstName" text="First Name" /></td>
		    <td><form:input path="firstName" /></td>
		</tr>
		<tr>
		    <td><spring:message code="lastName" text="Last Name" /></td>
		    <td><form:input path="lastName" /></td>
		</tr>
		<tr>
		    <td><spring:message code="email" text="Email Id" /></td>
		    <td><form:input path="email" /></td>
		</tr>
		<tr>
		    <td colspan="2"><input type="submit" value="Add User"/></td>
		</tr>
	</table>
</form:form>