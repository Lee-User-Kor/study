<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<table>
	<thead>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="dto" items="${list }">
			<tr>
				<td>${dto.idx }</td>
				<td><a href="${cpath }/read?idx=${dto.idx}">${dto.title }</a></td>
				<td>${dto.writer }</td>
				<td>${dto.writeDate }</td>
				<td>${dto.viewCount }</td>
			</tr>
		</c:forEach>	
	</tbody>
</table>
<div>
	<a href="${cpath }/write"><button>글 쓰기</button></a>
</div>


</body>
</html>