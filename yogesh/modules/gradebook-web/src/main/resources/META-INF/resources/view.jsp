<%@ include file="/init.jsp" %>

<portlet:actionURL name="employeeSubmit" var="employeeSubmit" />
<h4>Fill The Form</h4>
<form action="<employeeSubmit>" method="post">
Name: <input type="text" name="<portlet:namespace/>name">
E-mail: <input type="text" name="<portlet:namespace/>email">
Mobile: <input type="text" name="<portlet:namespace/>mobile">
<input type="Submit" value="SUBMIT">
</form>