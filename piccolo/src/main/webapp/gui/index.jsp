<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h2>Spring MVC and List Example</h2>

	<c:if test="${not empty queryList}">
     <c:forEach var="listValue" items="${queryList}" varStatus="idx">
		<ul>
			
				<li>${listValue.query}</li>
				<li>${listValue.name}</li>
				<li>${idx.index}</li>

				
			<img src="${listValue.name}"/>

		</ul>
     </c:forEach>
	</c:if>
</body>
</html>