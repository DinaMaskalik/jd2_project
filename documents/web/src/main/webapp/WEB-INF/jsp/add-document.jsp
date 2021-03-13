<%--
  Created by IntelliJ IDEA.
  User: Dina Maskalik
  Date: 12.03.2021
  Time: 17:20
  To change this template use File | Settings | File Templates.
--%>
<jsp:include page="header.jsp"/>

<form action="/doc/document/add" method="post">
    <%--<form action="/doc/document/edit" method="post">--%>
    <div class="input-group mb-3">
        <span class="input-group-text" id="basic-addon1">Document name</span>
        <input type="text" class="form-control" placeholder="document name" aria-label="document name"
               aria-describedby="basic-addon1" name="documentName">
    </div>

    <div class="input-group mb-3">
        <span class="input-group-text" id="basic-addon6">Author</span>
        <input type="text" class="form-control" placeholder="author" aria-label="author"
               aria-describedby="basic-addon6" name="author">
    </div>

    <div class="input-group mb-3">
        <span class="input-group-text" id="basic-addon2">Who create contract</span>
        <input type="text" class="form-control" placeholder="who create contract" aria-label="who create contract"
               aria-describedby="basic-addon2" name="personWhoConcludedContract">
    </div>

    <div class="input-group mb-3">
        <span class="input-group-text" id="basic-addon3">With whom create contract</span>
        <input type="text" class="form-control" placeholder="with whom contract was signed"
               aria-label="with whom contract was signed"
               aria-describedby="basic-addon3" name="personWithWhomTheContractWasSigned">
    </div>

    <div class="input-group mb-3">
        <span class="input-group-text" id="basic-addon4">Period of execution</span>
        <input type="text" class="form-control" placeholder="period of execution" aria-label="period of execution"
               aria-describedby="basic-addon4" name="periodOfExecution">
    </div>

    <div class="input-group mb-3">
        <span class="input-group-text" id="basic-addon5">Content</span>
        <textarea type="text" class="form-control" placeholder="content" aria-label="content"
                  aria-describedby="basic-addon5" name="content" rows="12"></textarea>
    </div>
    <button type="submit" class="btn btn-primary">Add</button>
</form>

<jsp:include page="footer.jsp"/>
