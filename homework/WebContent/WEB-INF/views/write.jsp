<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<!-- <form method="POST"> -->
	<div id="editor" style="box-sizing: border-box; height: 500px;"></div>
	<br>
<!-- 	<button onclick="ToView();">↓↓↓ 불러서 넣기 ↓↓↓</button> -->
	<div><input type="submit" value="작성 완료"></div>
<!-- </form> -->
    <script src="https://uicdn.toast.com/editor/2.0.0/toastui-editor-all.min.js"></script>

    <script>

        /* eslint-disable no-unused-vars */
        const content = [].join('\n');

        const editor = new toastui.Editor({
            el: document.querySelector('#editor'),
            previewStyle: 'vertical',
            initialEditType: "wysiwyg",
            height: '500px',
            initialValue: content
        });
		
//         const viewer = toastui.Editor.factory({
//             el: document.querySelector('#viewer'),
//             viewer: true,
//             height: '500px',
//             initialValue: content
//         });

//         function ToView()
//         {
//             viewer.setMarkdown(editor.getMarkdown());
//         };
    </script>

</body>
</html>