<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>url path</th>
		</tr>
		<c:forEach items="${aList}" var="aList">
			<tr>
				<td>${aList.res_num}</td>
				<td><c:url var="path" value="detailpage.do">
						<c:param name="latitude" value="${aList.latitude}" />
						<c:param name="longitude" value="${aList.longitude}" />
						<c:param name="foodtype" value="${aList.foodtype}" />
					</c:url> <a href="${path}">${aList.foodstore_id}</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>