<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<form method="POST" id="writeForm">
	<div>
		<input id="title" type="text" name="title" placeholder="글 제목을 입력하세요" required>
		<input id="writer" type="text" name="writer" placeholder="작성자를 입력하세요" required>
	</div>
	
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="https://uicdn.toast.com/editor/latest/toastui-jquery-editor.min.js"></script>
	<div id="editor"></div>
	<script>
		 $('#editor').toastuiEditor({
	         height: '500px',
	         initialEditType: 'wysiwyg',
	         previewStyle: 'vertical'
	     });
	</script>
	
	<a href="${cpath }/"><button type="button">작성 취소</button></a>
	<button type="button" value="내용저장">내용저장</button>
	<input type="submit" value="작성 완료">
</form>

<script>
	var content = editor.getHTML();
	const addHandler = function(event) {
		const input1 = document.createElement('input')
		input1.type = 'hidden'
		input1.name = 'content'
		input1.value = content
		documetn.getElementById('writeForm').appendChild(input1)
	}
	document.querySelector('button[value="내용저장"]').onclick = addHandler
</script>

</body>
</html>