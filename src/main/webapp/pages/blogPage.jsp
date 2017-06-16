<%@include file="templates/header.jsp" %>

<h2>${blog.blogTitle}</h2>
<p>${blog.blogDescription}</p>
<ul>
    <c:forEach items="${blog.posts}" var="post">
        <li>${post.postTitle} <a href="/detPost-${post.id}">details</a></li>
    </c:forEach>
</ul>

</body>
</html>
