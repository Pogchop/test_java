<%
    request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<head>
    <jsp:include page="/admin/include/header.jsp">
        <jsp:param name="title" value="Product form"/>
        <jsp:param name="description" value="Product form"/>
        <jsp:param name="keywords" value="admin, page...."/>
    </jsp:include>
</head>
<body class="w3-light-grey">

<!-- Top container -->
<div class="w3-bar w3-top w3-black w3-large" style="z-index:4">
    <button class="w3-bar-item w3-button w3-hide-large w3-hover-none w3-hover-text-light-grey" onclick="w3_open();"><i class="fa fa-bars"></i>  Menu</button>
    <span class="w3-bar-item w3-right">Admin Page</span>
</div>
<jsp:include page="/admin/include/left-menu.jsp"/>

<!-- Overlay effect when opening sidebar on small screens -->
<div class="w3-overlay w3-hide-large w3-animate-opacity" onclick="w3_close()" style="cursor:pointer" title="close side menu" id="myOverlay"></div>

<!-- !PAGE CONTENT! -->
<div class="w3-main" style="margin-left:300px;margin-top:43px;">

    <!-- Header -->
    <header class="w3-container" style="padding-top:22px">
        <h5><b><i class="fa fa-dashboard"></i> Product form</b></h5>
    </header>

    <div class="w3-padding w3-margin-bottom">
        <form action="/admin/product/addphone" method="post" class="w3-container w3-padding w3-card-4 w3-margin">
            <div class="w3-margin">
                <label>Name</label>
                <input class="w3-input" type="text" name="name">
            </div>
            <div class="w3-margin">
                <label>Price</label>
                <input class="w3-input" type="number" name="price">
            </div>
            <div class="w3-margin">
                <label>Description</label>
                <input class="w3-input" type="text" name="description">
            </div>
            <button type="submit" class="w3-btn w3-blue w3-margin">Submit</button>
        </form>
        <hr>
        <!-- Footer -->
        <jsp:include page="/admin/include/footer.jsp"/>
        <!-- End page content -->
    </div>

    <jsp:include page="/admin/include/script.jsp"/>

</body>
</html>


