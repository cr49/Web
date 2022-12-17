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
    <link rel="apple-touch-icon" href="<c:url value="/CuongHandsome/theme-assets/images/ico/apple-icon-120.png"/>">
    <link rel="shortcut icon" type="image/x-icon" href="<c:url value="/CuongHandsome/theme-assets/images/ico/favicon.ico"/>">
    <link href="<c:url value="/CuongHandsome/https://fonts.googleapis.com/css?family=Muli:300,300i,400,400i,600,600i,700,700i%7CComfortaa:300,400,700"/>" rel="stylesheet">
    <link href="<c:url value="/CuongHandsome/https://maxcdn.icons8.com/fonts/line-awesome/1.1/css/line-awesome.min.css"/>" rel="stylesheet">
    <!-- BEGIN VENDOR CSS-->
    <link rel="stylesheet" type="text/css" href="<c:url value="/CuongHandsome/theme-assets/css/vendors.css"/>">
    <!-- END VENDOR CSS-->
    <!-- BEGIN CHAMELEON  CSS-->
    <link rel="stylesheet" type="text/css" href="<c:url value="/CuongHandsome/theme-assets/css/app-lite.css"/>">
    <!-- END CHAMELEON  CSS-->
    <!-- BEGIN Page Level CSS-->
    <link rel="stylesheet" type="text/css" href="<c:url value="/CuongHandsome/theme-assets/css/core/menu/menu-types/vertical-menu.css"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/CuongHandsome/theme-assets/css/core/colors/palette-gradient.css"/>">
    <link rel="stylesheet" type ="text/css" href="<c:url value="/CuongHandsome/editstyle.css"/>">
    <link href="<c:url value="/CuongHandsome/https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"/>" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
  </head>
  <body class="vertical-layout vertical-menu 2-columns   menu-expanded fixed-navbar" data-open="click" data-menu="vertical-menu" data-color="bg-gradient-x-purple-blue" data-col="2-columns">

    <!-- fixed-top-->

	<div class="table-wrapper">
	<h1>QUẢN LÝ LOẠI SẢN PHẨM</h1>
	<a href="#addEmployeeModal"  class="btn btn-success" data-toggle="modal"><span>Thêm</span></a>
    <table class="fl-table">
        <div class="table-responsive text-nowrap">
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Name</th>
                    <th scope="col">Create</th>
                </tr>
            </thead>
            <tbody class="table-border-bottom-0">
                <c:forEach items="${listC}" var="o">
                    <tr>
                        <th scope="row">${o.id}</th>
                        <td>${o.name}</td>
                        <td>${o.create}</td>
                        <td>

                           	<a class="dropdown-item" href="<c:url value="/DeleteCategoryControl?cid=${o.id}"/>">
                            	<i class="bx bx-edit-alt me-1"></i> 
                            	Xóa
                           	</a>
                           	<a class="dropdown-item" href="<c:url value="/LoadCategoryControl?cid=${o.id}"/>">
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
                    <form action="AddCategoryControl" method="post">
                        <div class="modal-header">						
                            <h4 class="modal-title">Thêm loại sản phẩm mới</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">					
                            <div class="form-group">
                                <label>Name</label>
                                <input name="name" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Create</label>
                                <input name="create" type="text" class="form-control" required>
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
	
    <!-- ////////////////////////////////////////////////////////////////////////////-->


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
          <li class=" nav-item"><a href="<c:url value="/QLSanphamControl"/>"><i class="ft-circle"></i><span class="menu-title" data-i18n="">Quản lý sản phẩm</span></a>
          </li>
          <li class=" active"><a href="<c:url value="/QLLoaiSanphamControl"/>"><i class="ft-circle"></i><span class="menu-title" data-i18n="">Quản lý loại sp</span></a>
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

    <div class="app-content content">
      <div class="content-wrapper">
        <div class="content-wrapper-before"></div>
        <div class="content-header row">
          <div class="content-header-left col-md-4 col-12 mb-2">
            <h3 class="content-header-title">Charts</h3>
          </div>
          <div class="content-header-right col-md-8 col-12">
            <div class="breadcrumbs-top float-md-right">
              <div class="breadcrumb-wrapper mr-1">
                <ol class="breadcrumb">
                  <li class="breadcrumb-item"><a href="index.html">Home</a>
                  </li>
                  <li class="breadcrumb-item active">Charts
                  </li>
                </ol>
              </div>
            </div>
          </div>
        </div>
        <div class="content-body"><!-- Bar charts section start -->
<section id="chartjs-bar-charts">
    <!-- Column Chart -->
    <div class="row">
        <div class="col-12">
            <div class="card">
                <div class="card-header">
                    <h4 class="card-title">Column Chart</h4>
                    <a class="heading-elements-toggle"><i class="la la-ellipsis-v font-medium-3"></i></a>
                    <div class="heading-elements">
                        <ul class="list-inline mb-0">
                            <li><a data-action="collapse"><i class="ft-minus"></i></a></li>
                            <li><a data-action="reload"><i class="ft-rotate-cw"></i></a></li>
                            <li><a data-action="expand"><i class="ft-maximize"></i></a></li>
                            <li><a data-action="close"><i class="ft-x"></i></a></li>
                        </ul>
                    </div>
                </div>
                <div class="card-content collapse show">
                    <div class="card-body">
                            <div class="height-400">
                        <canvas id="column-chart"></canvas>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    
    <!-- Bar Chart -->
    <div class="row">
        <div class="col-12">
            <div class="card">
                <div class="card-header">
                    <h4 class="card-title">Bar Chart</h4>
                    <a class="heading-elements-toggle"><i class="la la-ellipsis-v font-medium-3"></i></a>
                    <div class="heading-elements">
                        <ul class="list-inline mb-0">
                            <li><a data-action="collapse"><i class="ft-minus"></i></a></li>
                            <li><a data-action="reload"><i class="ft-rotate-cw"></i></a></li>
                            <li><a data-action="expand"><i class="ft-maximize"></i></a></li>
                            <li><a data-action="close"><i class="ft-x"></i></a></li>
                        </ul>
                    </div>
                </div>
                <div class="card-content collapse show">
                    <div class="card-body">
                            <div class="height-400">
                        <canvas id="bar-chart"></canvas>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

</section>
<!-- // Bar charts section end -->

<!-- line chart section start -->
<section id="chartjs-line-charts">
    <!-- Line Chart -->
    <div class="row">
        <div class="col-12">
            <div class="card">
                <div class="card-header">
                    <h4 class="card-title">Simple Line Chart</h4>
                    <a class="heading-elements-toggle"><i class="la la-ellipsis-v font-medium-3"></i></a>
                    <div class="heading-elements">
                        <ul class="list-inline mb-0">
                            <li><a data-action="collapse"><i class="ft-minus"></i></a></li>
                            <li><a data-action="reload"><i class="ft-rotate-cw"></i></a></li>
                            <li><a data-action="expand"><i class="ft-maximize"></i></a></li>
                            <li><a data-action="close"><i class="ft-x"></i></a></li>
                        </ul>
                    </div>
                </div>
                <div class="card-content collapse show">
                    <div class="card-body chartjs">
                            <div class="height-500">
                        <canvas id="line-chart"></canvas>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

</section>
<!-- // line chart section end -->

<!-- Pie charts section start -->
<section id="chartjs-pie-charts">
    <div class="row">
        <!-- Simple Pie Chart -->
        <div class="col-md-6 col-sm-12">
            <div class="card">
                <div class="card-header">
                    <h4 class="card-title">Simple Pie Chart</h4>
                    <a class="heading-elements-toggle"><i class="la la-ellipsis-v font-medium-3"></i></a>
                    <div class="heading-elements">
                        <ul class="list-inline mb-0">
                            <li><a data-action="collapse"><i class="ft-minus"></i></a></li>
                            <li><a data-action="reload"><i class="ft-rotate-cw"></i></a></li>
                            <li><a data-action="expand"><i class="ft-maximize"></i></a></li>
                            <li><a data-action="close"><i class="ft-x"></i></a></li>
                        </ul>
                    </div>
                </div>
                <div class="card-content collapse show">
                    <div class="card-body">
                            <div class="height-400">
                        <canvas id="simple-pie-chart"></canvas>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Simple Doughnut Chart -->
        <div class="col-md-6 col-sm-12">
            <div class="card">
                <div class="card-header">
                    <h4 class="card-title">Simple Doughnut Chart</h4>
                    <a class="heading-elements-toggle"><i class="la la-ellipsis-v font-medium-3"></i></a>
                    <div class="heading-elements">
                        <ul class="list-inline mb-0">
                            <li><a data-action="collapse"><i class="ft-minus"></i></a></li>
                            <li><a data-action="reload"><i class="ft-rotate-cw"></i></a></li>
                            <li><a data-action="expand"><i class="ft-maximize"></i></a></li>
                            <li><a data-action="close"><i class="ft-x"></i></a></li>
                        </ul>
                    </div>
                </div>
                <div class="card-content collapse show">
                    <div class="card-body">
                            <div class="height-400">
                        <canvas id="simple-doughnut-chart"></canvas>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>    
</section>
<!-- // Pie charts section end -->

        </div>
      </div>
    </div>
    <!-- ////////////////////////////////////////////////////////////////////////////-->


    <footer class="footer footer-static footer-light navbar-border navbar-shadow">
      <div class="clearfix blue-grey lighten-2 text-sm-center mb-0 px-2"><span class="float-md-left d-block d-md-inline-block">2018  &copy; Copyright <a class="text-bold-800 grey darken-2" href="https://themeselection.com" target="_blank">ThemeSelection</a></span>
        <ul class="list-inline float-md-right d-block d-md-inline-blockd-none d-lg-block mb-0">
          <li class="list-inline-item"><a class="my-1" href="https://themeselection.com/" target="_blank"> More themes</a></li>
          <li class="list-inline-item"><a class="my-1" href="https://themeselection.com/support" target="_blank"> Support</a></li>
          <li class="list-inline-item"><a class="my-1" href="https://themeselection.com/products/chameleon-admin-modern-bootstrap-webapp-dashboard-html-template-ui-kit/" target="_blank"> Purchase</a></li>
        </ul>
      </div>
    </footer>

    <!-- BEGIN VENDOR JS-->
    <script src="<c:url value="/CuongHandsome/theme-assets/vendors/js/vendors.min.js"/>" type="text/javascript"></script>
    <!-- BEGIN VENDOR JS-->
    <!-- BEGIN PAGE VENDOR JS-->
    <script src="<c:url value="/CuongHandsome/theme-assets/vendors/js/charts/chart.min.js"/>" type="text/javascript"></script>
    <!-- END PAGE VENDOR JS-->
    <!-- BEGIN CHAMELEON  JS-->
    <script src="<c:url value="/CuongHandsome/theme-assets/js/core/app-menu-lite.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/CuongHandsome/theme-assets/js/core/app-lite.js"/>" type="text/javascript"></script>
    <!-- END CHAMELEON  JS-->
    <!-- BEGIN PAGE LEVEL JS-->
    <script src="<c:url value="/CuongHandsome/theme-assets/js/scripts/charts/chartjs/bar/column.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/CuongHandsome/theme-assets/js/scripts/charts/chartjs/bar/bar.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/CuongHandsome/theme-assets/js/scripts/charts/chartjs/line/line.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/CuongHandsome/theme-assets/js/scripts/charts/chartjs/pie-doughnut/pie-simple.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/CuongHandsome/theme-assets/js/scripts/charts/chartjs/pie-doughnut/doughnut-simple.js"/>" type="text/javascript"></script>
    <!-- END PAGE LEVEL JS-->
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