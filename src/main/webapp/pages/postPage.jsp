<%@include file="templates/header.jsp"%>
<h3>${post.postTitle}</h3>
<p>${post.postText}</p>
<a href="/edit-${post.id}">
    <button>edit</button>
</a>
<a href="/delete-${post.id}">
    <button>delete</button>
</a>

</body>
</html>
