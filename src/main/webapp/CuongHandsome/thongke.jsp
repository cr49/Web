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
    <link rel="stylesheet" type="text/css" href="<c:url value="/CuongHandsome/editstyle.css"/>">
    <!-- END Page Level CSS-->
    <!-- BEGIN Custom CSS-->
    <!-- END Custom CSS-->
  </head>
  <body class="vertical-layout vertical-menu 2-columns   menu-expanded fixed-navbar" data-open="click" data-menu="vertical-menu" data-color="bg-gradient-x-purple-blue" data-col="2-columns">

    <!-- fixed-top-->
	
	<div class="table-wrapperrr11">
	<h1>THỐNG KÊ</h1>
				<table border="1" id="html5logo" class="table table-striped">
					<tbody>
						<tr>
							<th>Tổng thu của hệ thống</th>

						</tr>
						<c:forEach items="${listC1}" var="o">
						<tr>
							<td>${o.atg} đ</td>

						</tr>
						</c:forEach>
					</tbody> 
				</table>
			</div>
			
	<div style = "margin-top: -155px;" class="table-wrapperrr22">
				<table border="1" id="html5logo" class="table table-striped">
					<tbody>
						<tr>
							<th>Tổng thu của các cửa hàng</th>

						</tr>
						<c:forEach items="${listC2}" var="o">
						<tr>
							<td>${o.ats} đ</td>

						</tr>
						</c:forEach>
					</tbody> 
				</table>
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
          <li style="margin-bottom: 60px;" class=" active"><a href="<c:url value="/QLThongke"/>"><i class="ft-circle"></i><span class="menu-title" data-i18n="">Thống kê</span></a>
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
            <h3 class="content-header-title">Basic Form Elements</h3>
          </div>
          <div class="content-header-right col-md-8 col-12">
            <div class="breadcrumbs-top float-md-right">
              <div class="breadcrumb-wrapper mr-1">
                <ol class="breadcrumb">
                  <li class="breadcrumb-item"><a href="index.html">Home</a>
                  </li>
                  <li class="breadcrumb-item active">Form Elements
                  </li>
                </ol>
              </div>
            </div>
          </div>
        </div>
        <div class="content-body"><!-- Basic Inputs start -->
<section class="basic-inputs">
  <div class="row match-height">
      <div class="col-xl-4 col-lg-6 col-md-12">
          <div class="card">
              <div class="card-header">
                  <h4 class="card-title">Basic Input</h4>
              </div>
              <div class="card-block">
                  <div class="card-body">
                      <fieldset class="form-group">
                          <input type="text" class="form-control" id="basicInput" >
                      </fieldset>
                  </div>
              </div>
          </div>
      </div>
      <div class="col-xl-4 col-lg-6 col-md-12">
          <div class="card">
              <div class="card-header">
                  <h4 class="card-title">Password</h4>
              </div>
              <div class="card-block">
                  <div class="card-body">
                      <fieldset class="form-group">
                          <input type="password" class="form-control" id="passwordField">
                      </fieldset>
                  </div>
              </div>
          </div>
      </div>
      <div class="col-xl-4 col-lg-6 col-md-12">
          <div class="card">
              <div class="card-header">
                  <h4 class="card-title">With Placeholder</h4>
              </div>
              <div class="card-block">
                  <div class="card-body">
                      <fieldset class="form-group">
                          <input type="email" class="form-control" id="placeholderInput" placeholder="Enter Email Address">
                      </fieldset>
                  </div>
              </div>
          </div>
      </div>
      <div class="col-xl-4 col-lg-6 col-md-12">
          <div class="card">
              <div class="card-header">
                  <h4 class="card-title">Disabled Input</h4>
              </div>
              <div class="card-block">
                  <div class="card-body">
                      <p>Add <code>disabled</code> attribute to disable input field.</p>
                      <fieldset class="form-group">
                          <input type="text" class="form-control" id="disabledInput" disabled>
                      </fieldset>
                  </div>
              </div>
          </div>
      </div>
      <div class="col-xl-4 col-lg-6 col-md-12">
          <div class="card">
              <div class="card-header">
                  <h4 class="card-title">Readonly Input</h4>
              </div>
              <div class="card-block">
                  <div class="card-body">
                      <p>Add <code>readonly="readonly"</code> attribute to set field readonly.</p>
                      <fieldset class="form-group">
                          <input type="text" class="form-control" id="readonlyInput" readonly="readonly" value="You can't change me. ;)">
                      </fieldset>
                  </div>
              </div>
          </div>
      </div>
      <div class="col-xl-4 col-lg-6 col-md-12">
          <div class="card">
              <div class="card-header">
                  <h4 class="card-title">Predefined Value</h4>
              </div>
              <div class="card-block">
                  <div class="card-body">
                      <p>Add <code>value="VALUE"</code> attribute to set predefined value.</p>
                      <fieldset class="form-group">
                          <input type="text" class="form-control" id="predefinedInput" value="http://">
                      </fieldset>
                  </div>
              </div>
          </div>
      </div>
      <div class="col-xl-4 col-lg-6 col-md-12">
          <div class="card">
              <div class="card-header">
                  <h4 class="card-title">Static Text</h4>
              </div>
              <div class="card-block">
                  <div class="card-body">
                      <fieldset class="form-group">
                          <p class="form-control-static" id="staticInput">email@themeselection.com</p>
                          <p>To set static text use <code>.form-control-static</code> class.</p>
                      </fieldset>
                  </div>
              </div>
          </div>
      </div>
      <div class="col-xl-4 col-lg-6 col-md-12">
          <div class="card">
              <div class="card-header">
                  <h4 class="card-title">Input text with help</h4>
              </div>
              <div class="card-block">
                  <div class="card-body">
                      <fieldset class="form-group">
                          <small class="text-muted">eg.<i>someone@example.com</i></small>
                          <input type="text" class="form-control" id="helpInputTop">
                      </fieldset>
                  </div>
              </div>
          </div>
      </div>
      <div class="col-xl-4 col-lg-6 col-md-12">
          <div class="card">
              <div class="card-header">
                  <label class="card-title" for="helpInput">Input with Help</label>
              </div>
              <div class="card-block">
                  <div class="card-body">
                      <fieldset class="form-group">
                          <input type="text" class="form-control" id="helpInput" placeholder="With Help Text">
                      </fieldset>
                      <p class="text-muted">Muted help text using <code>.text-muted</code> class.</p>
                  </div>
              </div>
          </div>
      </div>
  </div>
</section>
<!-- Basic Inputs end -->

<section class="textarea-select">
  <!-- Textarea start -->
  <div class="row">
      <div class="col-12 mt-3 mb-1">
          <h4 class="text-uppercase">Textarea &amp; Select</h4>
          <p>Textual form controlsâlike <code>&lt;select&gt;</code>s, and <code>&lt;textarea&gt;</code>sâare styled with the <code>.form-control</code> class. Included are styles for general appearance, focus state, sizing, and more.</p>
      </div>
  </div>
  <div class="row match-height">
      <div class="col-lg-6 col-md-12">
          <div class="card">
              <div class="card-header">
                  <h4 class="card-title">Textarea</h4>
              </div>
              <div class="card-block">
                  <div class="card-body">
                      <h5 class="mt-2">Basic Textarea</h5>
                      <fieldset class="form-group">
                          <textarea class="form-control" id="basicTextarea" rows="3"></textarea>
                      </fieldset>

                      <h5 class="mt-2">Textarea with Placeholder</h5>
                      <fieldset class="form-group">
                          <textarea class="form-control" id="placeTextarea" rows="3" placeholder="Simple Textarea"></textarea>
                      </fieldset>

                      <h5 class="mt-2">Textarea with Description</h5>
                      <fieldset class="form-group">
                          <p class="text-muted">Textarea description text.</p>
                          <textarea class="form-control" id="descTextarea" rows="3" placeholder="Textarea with description"></textarea>
                      </fieldset>
                  </div>
              </div>
          </div>
      </div>
      <div class="col-lg-6 col-md-12">
          <div class="card">
              <div class="card-header">
                  <h4 class="card-title">Select</h4>
              </div>
              <div class="card-block">
                  <div class="card-body">
                      <h5 class="mt-2">Basic Select</h5>
                      <fieldset class="form-group">
                          <select class="form-control" id="basicSelect">
                            <option>Select Option</option>
                            <option>Option 1</option>
                            <option>Option 2</option>
                            <option>Option 3</option>
                            <option>Option 4</option>
                            <option>Option 5</option>
                          </select>
                      </fieldset>
                      <h5 class="mt-2">Custom select</h5>
                      <p>To use custom select add class<code>.custom-select</code> to select.</p>
                      <fieldset class="form-group">
                          <select class="custom-select" id="customSelect">
                              <option selected>Open this select menu</option>
                              <option value="1">One</option>
                              <option value="2">Two</option>
                              <option value="3">Three</option>
                          </select>
                      </fieldset>
                      <h5 class="mt-2">Multiple select</h5>
                      <p>To use multiple select add an attribute<code> multiple="multiple"</code>.</p>
                      <fieldset class="form-group">
                          <select class="form-control" id="countrySelect" multiple="multiple">
                              <option selected="selected">United States</option>
                              <option>Canada</option>
                              <option selected="selected">United Kingdom</option>
                              <option>Japan</option>
                              <option>Australia</option>
                              <option>Germany</option>
                              <option selected="selected">India</option>
                              <option>Italy</option>
                              <option>Sweden</option>
                              <option>France</option>
                              <option>New Zealand</option>
                              <option>Switzerland</option>
                              <option>Russia</option>
                              <option>England</option>
                              <option>Norway</option>
                              <option>Greece</option>
                              <option>Philippines</option>
                              <option>Ireland</option>
                              <option>China</option>
                              <option>South Korea</option>
                          </select>
                      </fieldset>
                  </div>
              </div>
          </div>
      </div>
  </div>
  <!-- Textarea end -->
</section>
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
    <!-- END PAGE VENDOR JS-->
    <!-- BEGIN CHAMELEON  JS-->
    <script src="<c:url value="/CuongHandsome/theme-assets/js/core/app-menu-lite.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/CuongHandsome/theme-assets/js/core/app-lite.js"/>" type="text/javascript"></script>
    <!-- END CHAMELEON  JS-->
    <!-- BEGIN PAGE LEVEL JS-->
    <script src="<c:url value="/CuongHandsome/theme-assets/vendors/js/forms/tags/form-field.js"/>" type="text/javascript"></script>
    <!-- END PAGE LEVEL JS-->
  </body>
</html>