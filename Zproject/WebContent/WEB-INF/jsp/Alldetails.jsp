<%@page import="com.manipal.beans.Athlete"%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="ll">
<tr>
<th>Random number</th>
<th>Name</th>
<th>Gender</th>
<th>Category</th>
<th>Email</th>
<th>Mobile Number</th>

</tr>
<%
	List<Athlete> record = (List<Athlete>)request.getAttribute("data");
Iterator<Athlete> lit = record.iterator();
while(lit.hasNext())
{
	Athlete cc = lit.next();

%>
<tr>
<td><%=cc.getRandnum()%></td>
<td><%=cc.getName()%></td>
<td><%=cc.getGender()%></td>
<td><%=cc.getCategory()%></td>
<td><%=cc.getEmail()%></td>
<td><%=cc.getMobile()%></td>

<%
}
%>
</table>
</body>
</html>