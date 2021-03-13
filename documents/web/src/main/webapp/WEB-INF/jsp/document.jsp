<%--
  Created by IntelliJ IDEA.
  User: Dina Maskalik
  Date: 13.03.2021
  Time: 22:48
  To change this template use File | Settings | File Templates.
--%>

<jsp:include page="header.jsp"/>
<h1>
    Document:
</h1>

<table class="table">
    <tr>
        <td><h3>Document name</h3></td>
    </tr>
    <tr>
        <td>${document.documentName.documentName}</td>
    </tr>
    <tr>
        <td><h3>Author</h3></td>
        <td><h3>Who create</h3></td>
        <td><h3>With whom</h3></td>
    </tr>
    <tr>
        <td>${document.author}</td>
        <td>${document.personWhoConcludedContract}</td>
        <td>${document.personWithWhomTheContractWasSigned}</td>
    </tr>
    <tr>
        <td><h3>Create date</h3></td>
        <td><h3>Period of execution</h3></td>
    </tr>
    <tr>
        <td>${document.createDate}</td>
        <td>${document.periodOfExecution}</td>
    </tr>
    <tr>
        <td><h3>Content</h3></td>
    </tr>

</table>
<textarea type="text" class="form-control" placeholder="content" aria-label="content"
          aria-describedby="basic-addon5" name="content"
          rows="12" disabled="disabled">${document.content.content}</textarea>
<h1></h1>

<jsp:include page="footer.jsp"/>
