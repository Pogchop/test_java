<%@ page import="com.example.testjava.entity.Product" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.testjava.entity.Product" %>
<%
    request.setCharacterEncoding("utf-8");
    ArrayList<Product> list = (ArrayList<Product>)request.getAttribute("listphones");
    if (list == null){
        list = new ArrayList<Product>();
    }
%>
<!DOCTYPE html>
<head>
    <jsp:include page="../include/header.jsp">
        <jsp:param name="title" value="My admin page"/>
        <jsp:param name="description" value="Admin area"/>
        <jsp:param name="keywords" value="admin, page...."/>
    </jsp:include>
</head>
<body class="w3-light-grey">

<!-- Top container -->
<div class="w3-bar w3-top w3-black w3-large" style="z-index:4">
    <button class="w3-bar-item w3-button w3-hide-large w3-hover-none w3-hover-text-light-grey" onclick="w3_open();"><i class="fa fa-bars"></i>  Menu</button>
    <span class="w3-bar-item w3-right">Admin Page</span>
</div>
<jsp:include page="../include/left-menu.jsp"/>

<!-- Overlay effect when opening sidebar on small screens -->
<div class="w3-overlay w3-hide-large w3-animate-opacity" onclick="w3_close()" style="cursor:pointer" title="close side menu" id="myOverlay"></div>

<!-- !PAGE CONTENT! -->
<div class="w3-main" style="margin-left:300px;margin-top:43px;">
    <!-- Header -->
    <header class="w3-container" style="padding-top:22px">
        <h5><b><i class="fa fa-dashboard"></i> My Dashboard</b></h5>
    </header>
    <table class="w3-table-all">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Price</th>
            <th>Description</th>
        </tr>
        <%
            for (int i = 0; i < list.size(); i++){
        %>
        <tr>
            <th><%=list.get(i).getId()%></th>
            <th><%=list.get(i).getName()%></th>
            <th><%=list.get(i).getPrice()%></th>
            <th><%=list.get(i).getDescription()%></th>
            <th>

        </tr>
        <%
            }
        %>
    </table>
    <hr>
    <!-- Footer -->
    <jsp:include page="../include/footer.jsp"/>
    <!-- End page content -->
</div>

<jsp:include page="../include/script.jsp"/>

</body>


