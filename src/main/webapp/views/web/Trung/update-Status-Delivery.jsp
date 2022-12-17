<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 14/12/2022
  Time: 7:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Update Status Delivery</title>

    <!-- App favicon -->
    <link rel="shortcut icon" href="<c:url value="/template/Trung/assets/images/favicon.ico"/>">

    <!-- Sweet Alert css-->
    <link href="<c:url value="/template/Trung/assets/libs/sweetalert2/sweetalert2.min.css"/>" rel="stylesheet" type="text/css" />

    <!-- Layout config Js -->
    <script src="<c:url value="/template/Trung/assets/js/layout.js"/>"></script>
    <!-- Bootstrap Css -->
    <link href="<c:url value="/template/Trung/assets/css/bootstrap.min.css"/>" rel="stylesheet" type="text/css" />
    <!-- Icons Css -->
    <link href="<c:url value="/template/Trung/assets/css/icons.min.css"/>" rel="stylesheet" type="text/css" />
    <!-- App Css-->
    <link href="<c:url value="/template/Trung/assets/css/app.min.css"/>" rel="stylesheet" type="text/css" />
    <!-- custom Css-->
    <link href="<c:url value="/template/Trung/assets/css/custom.min.css"/>" rel="stylesheet" type="text/css" />
</head>
<body>
<h1>Status Delivery</h1>
<form action="orders?idUpdateS=${idUpdateS}" method="post">
        <div class="mb-3" id="modal-id">
            <label for="idUpdateS" class="form-label">ID</label>
            <input type="text" id="idUpdateS" class="form-control" value="${idUpdateS}"
                   placeholder="ID" readonly/>
        </div>
        <div>
            <label for="delivered-status" class="form-label">Delivery
                Status</label>
            <select class="form-control" data-trigger
                    name="delivered-status" id="delivered-status">
<%--                <option value="">Delivery Status</option>--%>
                <option value="processing">Processing</option>
                <option value="shipped">Shipped</option>
                <option value="delivered">Delivered</option>
            </select>
        </div>
    <button type="submit" class="btn btn-primary btn-block mb-3">up load status</button>
</form>



<!-- JAVASCRIPT -->
<!-- JAVASCRIPT -->
<script src="<c:url value="/template/Trung/assets/libs/bootstrap/js/bootstrap.bundle.min.js"/>"></script>
<script src="<c:url value="/template/Trung/assets/libs/simplebar/simplebar.min.js"/>"></script>
<script src="<c:url value="/template/Trung/assets/libs/node-waves/waves.min.js"/>"></script>
<script src="<c:url value="/template/Trung/assets/libs/feather-icons/feather.min.js"/>"></script>
<script src="<c:url value="/template/Trung/assets/js/pages/plugins/lord-icon-2.1.0.js"/>"></script>
<script src="<c:url value="/template/Trung/assets/js/plugins.js"/>"></script>

<!-- list.js min js -->
<script src="<c:url value="/template/Trung/assets/libs/list.js/list.min.js"/>"></script>

<!--list pagination js-->
<script src="<c:url value="/template/Trung/assets/libs/list.pagination.js/list.pagination.min.js"/>"></script>

<!-- ecommerce-order init js -->
<script src="<c:url value="/template/Trung/assets/js/pages/ecommerce-order.init.js"/>"></script>

<!-- Sweet Alerts js -->
<script src="<c:url value="/template/Trung/assets/libs/sweetalert2/sweetalert2.min.js"/>"></script>
<!-- App js -->
<script src="<c:url value="/template/Trung/assets/js/app.js"/>"></script>
</body>
</html>
