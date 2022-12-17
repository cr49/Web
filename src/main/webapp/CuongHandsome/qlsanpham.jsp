<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html class="loading" lang="en" data-textdirection="ltr">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimal-ui">
    <meta name="description" content="Chameleon Admin is a modern Bootstrap 4 webapp &amp; admin dashboard html template with a large number of components, elegant design, clean and organized code.">
    <meta name="keywords" content="admin template, Chameleon admin template, dashboard template, gradient admin template, responsive admin template, webapp, eCommerce dashboard, analytic dashboard">
    <meta name="author" content="ThemeSelect">
    <title>Hello Admin</title>
    <link href="<c:url value="/CuongHandsome/theme-assets/images/ico/apple-icon-120.png"/>" rel="stylesheet" type="text/css" />
    <link href="<c:url value="/CuongHandsome/theme-assets/images/ico/favicon.ico"/>" rel="stylesheet" type="text/css" />
    <link href="<c:url value="/CuongHandsome/https://fonts.googleapis.com/css?family=Muli:300,300i,400,400i,600,600i,700,700i%7CComfortaa:300,400,700"/>" rel="stylesheet" type="text/css" />
    <link href="<c:url value="/CuongHandsome/https://maxcdn.icons8.com/fonts/line-awesome/1.1/css/line-awesome.min.css"/>" rel="stylesheet" type="text/css" />
    <!-- BEGIN VENDOR CSS-->
    <link href="<c:url value="/CuongHandsome/theme-assets/css/vendors.css"/>" rel="stylesheet" type="text/css" />
    <link href="<c:url value="/CuongHandsome/theme-assets/vendors/css/charts/chartist.css"/>" rel="stylesheet" type="text/css" />
    <!-- END VENDOR CSS-->
    <!-- BEGIN CHAMELEON  CSS-->
    <link href="<c:url value="/CuongHandsome/theme-assets/css/app-lite.css"/>" rel="stylesheet" type="text/css" />
    <!-- END CHAMELEON  CSS-->
    <!-- BEGIN Page Level CSS-->
    <link href="<c:url value="/CuongHandsome/theme-assets/css/core/menu/menu-types/vertical-menu.css"/>" rel="stylesheet" type="text/css" />
    <link href="<c:url value="/CuongHandsome/theme-assets/css/core/colors/palette-gradient.css"/>" rel="stylesheet" type="text/css" />
    <link href="<c:url value="/CuongHandsome/theme-assets/css/pages/dashboard-ecommerce.css"/>" rel="stylesheet" type="text/css" />
    <link href="<c:url value="/CuongHandsome/editstyle.css"/>" rel="stylesheet" type="text/css" />
    <link href="<c:url value="/CuongHandsome/https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"/>" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <!-- END Page Level CSS-->
    <!-- BEGIN Custom CSS-->
    <!-- END Custom CSS-->
  </head>
  <body class="vertical-layout vertical-menu 2-columns   menu-expanded fixed-navbar" data-open="click" data-menu="vertical-menu" data-color="bg-chartbg" data-col="2-columns">

    <!-- fixed-top-->

<div class="table-wrapper">
<h1>QUẢN LÝ SẢN PHẨM</h1>
<a href="#addEmployeeModal"  class="btn btn-success" data-toggle="modal"><span>Thêm</span></a>
    <table class="fl-table">
        <div class="table-responsive text-nowrap">
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Name</th>
                    <th scope="col">Category_ID</th>
                    <th scope="col">Store_ID</th>
                    <th scope="col">Rating</th>
                    <th scope="col">Create</th>
                    <th scope="col">Price</th>
                    <th scope="col">Size</th>
                    <th scope="col">Quantity</th>
                    <th scope="col">Images</th>
                </tr>
            </thead>
            <tbody class="table-border-bottom-0">
                <c:forEach items="${listP}" var="o">
                    <tr>
                        <th scope="row">${o.id}</th>
                        <td>${o.name}</td>
                        <td>${o.categoryid}</td>
                        <td>${o.storeid}</td>
                        <td>${o.rating}</td>
                        <td>${o.create}</td>
            			<td>${o.price}</td>
            			<td>${o.size}</td>
                        <td>${o.quantity}</td>
                        <td>
                        	<img class="img-thumbnail"
                            src="${o.image}" height="50px" width="50px"
                            alt="Card image cap"></td>
                        <td>
                           	<a class="dropdown-item" href="<c:url value="/CuongHandsome/DeleteSanphamControl?pid=${o.id}"/>">
                            	<i class="bx bx-edit-alt me-1"></i> 
                            	Xóa
                           	</a>
                           	<a class="dropdown-item" href="<c:url value="/LoadProductControl?pid=${o.id}"/>">
                            	<i class="bx bx-edit-alt me-1"></i> 
                            	Sửa
                           	</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
    </table>
    <div id="addEmployeeModal" class="modal fade">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action="AddSanphamControl" method="post">
                        <div class="modal-header">						
                            <h4 class="modal-title">Thêm sản phẩm mới</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">					
                            <div class="form-group">
                                <label>Name</label>
                                <input name="name" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Description</label>
                                <input name="description" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>IsActive</label>
                                <input name="isactive" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>IsSelling</label>
                                <input name="isselling" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Category Id</label>
                                <input name="categoryid" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Store Id</label>
                                <input name="storeid" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Rating</label>
                                <input name="rating" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Create</label>
                                <input name="create" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Price</label>
                                <input name="price" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Size</label>
                                <input name="size" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Quantity</label>
                                <input name="quantity" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Image</label>
                                <input name="image" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Product Id img</label>
                                <input name="productidimg" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Product Id Size</label>
                                <input name="productidsize" type="text" class="form-control" required>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                            <input type="submit" class="btn btn-success" value="Add">
                        </div>
                    </form>
                </div>
            </div>
        </div>
</div>



    <div class="main-menu menu-fixed menu-light menu-accordion    menu-shadow " data-scroll-to-active="true" data-img="theme-assets/images/backgrounds/02.jpg">
      <div class="navbar-header">
        <ul class="nav navbar-nav flex-row">       

        </ul>
      </div>
      <div class="main-menu-content">
        <ul class="navigation navigation-main" id="main-menu-navigation" data-menu="menu-navigation">
        <li style="margin-bottom: 50px;
        		text-align: center;
        		font-size: 30px;
        		color: red;" class=" nav-item">Hello admin</li>
          <li class=" active"><a href="<c:url value="/QLSanphamControl"/>"><i class="ft-circle"></i><span class="menu-title" data-i18n="">Quản lý sản phẩm</span></a>
          </li>
          <li class=" nav-item"><a href="<c:url value="/QLLoaiSanphamControl"/>"><i class="ft-circle"></i><span class="menu-title" data-i18n="">Quản lý loại sp</span></a>
          </li>
          <li class=" nav-item"><a href="<c:url value="/QLDonhangControl"/>"><i class="ft-circle"></i><span class="menu-title" data-i18n="">Quản lý đơn hàng</span></a>
          </li>
          <li class=" nav-item"><a href="<c:url value="/QLVanchuyenControl"/>"><i class="ft-circle"></i><span class="menu-title" data-i18n="">Quản lý vận chuyển</span></a>
          </li>
          <li class=" nav-item"><a href="<c:url value="/QLNguoidungControl"/>"><i class="ft-circle"></i><span class="menu-title" data-i18n="">Quản lý người dùng</span></a>
          </li>
          <li class=" nav-item"><a href="<c:url value="/QLDoanhthuControl"/>"><i class="ft-circle"></i><span class="menu-title" data-i18n="">Doanh thu</span></a>
          </li>
          <li style="margin-bottom: 60px;" class=" nav-item"><a href="<c:url value="/QLThongke"/>"><i class="ft-circle"></i><span class="menu-title" data-i18n="">Thống kê</span></a>
          </li>
          <li class=" nav-item"><a href="<c:url value="/LoginControl"/>"><i class="ft-circle"></i><span class="menu-title" data-i18n="">Logout</span></a>
          </li>

        </ul>
      <div class="navigation-background"></div>
    </div>
<!--/ Statistics -->
    <!-- ////////////////////////////////////////////////////////////////////////////-->
    <!-- BEGIN VENDOR JS-->
    
    <script type="text/javascript" src="<c:url value="/CuongHandsome/theme-assets/vendors/js/vendors.min.js"/>"></script>
    <!-- BEGIN VENDOR JS-->
    <!-- BEGIN PAGE VENDOR JS-->
    <script type="text/javascript" src="<c:url value="/CuongHandsome/theme-assets/vendors/js/charts/chartist.min.js"/>"></script>
    <!-- END PAGE VENDOR JS-->
    <!-- BEGIN CHAMELEON  JS-->
    <script type="text/javascript" src="<c:url value="/CuongHandsome/theme-assets/js/core/app-menu-lite.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/CuongHandsome/theme-assets/js/core/app-lite.js"/>"></script>
    <!-- END CHAMELEON  JS-->
    <!-- BEGIN PAGE LEVEL JS-->
    <script type="text/javascript" src="<c:url value="/CuongHandsome/theme-assets/js/scripts/pages/dashboard-lite.js"/>"></script>
    <!-- END PAGE LEVEL JS
    <scrip type="text/javascript" src="<c:url value="/CuongHandsome/theme-assets/js/scripts/pages/dashboard-lite.js"/>"></scrip>
    
    <script src="theme-assets/js/scripts/pages/dashboard-lite.js" type="text/javascript"></script>
    <script src="theme-assets/js/core/app-menu-lite.js" type="text/javascript"></script>
    <script src="theme-assets/js/core/app-lite.js" type="text/javascript"></script>
    <script src="theme-assets/vendors/js/charts/chartist.min.js" type="text/javascript"></script>
    <script src="theme-assets/vendors/js/vendors.min.js" type="text/javascript"></script>
    -->
    <script src="<c:url value="/CuongHandsome/https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"/>" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    
    
  </body>
</html>