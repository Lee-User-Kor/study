<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<div>
	<c:forEach var="dto" items="${list }">
		<div>
			${dto.idx } | ${dto.title } | ${dto.writer } | ${dto.writeDate } | ${dto.viewCount }
		</div>
	</c:forEach>
</div>
<div>
	<a href="${cpath }/board/write"><button>글 쓰기</button></a>
</div>

</body>
</html>
