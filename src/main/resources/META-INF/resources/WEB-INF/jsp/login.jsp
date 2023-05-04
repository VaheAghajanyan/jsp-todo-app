<%@include file="common/header.jspf" %>
<%@include file="common/navigation.jspf" %>
<div class="container">
    <h2>Welcome to the login page</h2>
    <pre>${error}</pre>
    <form method="post">
        <div>
            <label for="name">Name</label>
            <input type="text" name="name" id="name">
        </div>
        <div>
            <label for="password">Password</label>
            <input type="password" name="password" id="password">
        </div>
        <input type="submit">
    </form>
</div>
<%@include file="common/footer.jspf" %>