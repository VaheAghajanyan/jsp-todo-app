<%@include file="common/header.jspf" %>
<%@include file="common/navigation.jspf" %>
<div class="container">
    <h2>Enter Todo Details</h2>
    <form:form method="post" modelAttribute="todo">
        <fieldset class="mb-3">
            <form:label path="name">Name</form:label>
            <form:input type="text" name="name" path="name" required="required" />
            <form:errors path="name" cssClass="text-warning"/>
        </fieldset>
        <fieldset class="mb-3">
            <form:label path="description">Description</form:label>
            <form:input type="text" name="description" path="description" required="required"/>
            <form:errors path="description" cssClass="text-warning"/>
        </fieldset>
        <fieldset>
            <form:label path="targetDate">Target Date</form:label>
            <form:input path="targetDate" name="targetDate" required="required"/>
            <form:errors path="targetDate" cssClass="text-warning"/>
        </fieldset>
        <form:input type="hidden" path="id" />
        <form:input type="hidden" path="done" />
        <input type="submit" class="btn btn-success">
    </form:form>
</div>
<%@include file="common/footer.jspf" %>