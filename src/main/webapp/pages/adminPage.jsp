<%@include file="templates/header.jsp" %>

<form action="/admin/saveBlog" method="post" enctype="multipart/form-data">
    <input type="text" name="blogName">
    <input type="text" name="blogDescript">
    <input type="file" name="picture">
    <input type="submit">
</form>

<sf:form action="/admin/savePost" method="post" modelAttribute="emptyPost">
    <sf:input path="id" type="hidden"/>
    <sf:input path="postTitle"/>
    <sf:errors path="postTitle"/>
    <sf:input path="postText"/>
    <sf:select path="blog">
        <c:forEach items="${blogs}" var="blog">
            <sf:option value="${blog.id}">${blog.blogTitle}</sf:option>
        </c:forEach>
    </sf:select>
    <input type="submit">
</sf:form>

</body>
</html>
