<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
.button				{ background: black; border: 1px solid #999;
					  -moz-border-radius: 5px; padding: 5px; color: white; font-weight: bold;
					  -webkit-border-radius: 5px; font-size: 13px;  width: 70px; }
.button:hover		{ background: white; color: black; }
</style>
<title>CMS 회원 조회 및 삭제</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
</head>
<body>
<h2>사용자 목록</h2>
<table border=''>
	
	<thead>
		<tr>
			<th>날짜</th>
			<th>아이디</th>
			<th>선택보기</th>
		</tr>
	</thead>
	<tbody>
		<c:choose>
			<c:when test="${fn:length(vote_list) > 0}">
				<c:forEach items="${vote_list}" var="row">
					<tr>
						<td>${row.vote_date}</td>
						<td>${row.user_id}</td>
						<td>${row.vote_answer}</td>
					</tr>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<tr>
					<td colspan="4">조회된 결과가 없습니다.</td>
				</tr>
			</c:otherwise>
		</c:choose>
		
	</tbody>
</table>
	<h2>삭제할 번호 입력</h2>
	<form method="post" action="voteDelete.do">
		삭제할 날짜 : <input type="text" name="vote_date"/><br>
		삭제할 아이디 : <input type="text" name="user_id"/><br>
		<input type="submit" value="입력완료"/>
	</form>
	<br><br><br>
	
</body>
</html>