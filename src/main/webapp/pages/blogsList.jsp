<%@include file="templates/header.jsp"%>

<c:forEach items="${blogsList}" var="singleBlog">
    <div>

        ${singleBlog.id}
        ${singleBlog.blogTitle}
        ${singleBlog.blogDescription}
            <a href="/blogDetails${singleBlog.id}">details</a>
    </div>
    

</c:forEach>

<h2>${blog.id} ${blog.blogTitle} ${blog.blogDescription}</h2>



</body>
</html>
