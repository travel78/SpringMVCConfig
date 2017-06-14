<%@include file="templates/header.jsp"%>

<form action="/admin/saveBlog" method="post">
    <input type="text" name="blogName">
    <input type="text" name="blogDescript">

    <input type="submit">
</form>

<sf:form action="/admin/savePost" method="post" modelAttribute="emptyPost">
    <sf:input path="postTitle"/>
    <sf:input path="postText"/>
    <sf:select path="blog">
        <sf:option value=""></sf:option>
    </sf:select>
    <input type="submit">
</sf:form>

</body>
</html>
