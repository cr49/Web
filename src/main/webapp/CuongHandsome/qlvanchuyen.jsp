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
    <!-- END Page Level CSS-->
    <!-- BEGIN Custom CSS-->
    <!-- END Custom CSS-->
    <link rel="stylesheet" type ="text/css" href="<c:url value="/CuongHandsome/editstyle.css"/>">
  </head>
  <body class="vertical-layout vertical-menu 2-columns   menu-expanded fixed-navbar" data-open="click" data-menu="vertical-menu" data-color="bg-gradient-x-purple-blue" data-col="2-columns">

    <!-- fixed-top-->
    
<div class="table-wrapper">
	<h1>QUẢN LÝ VẬN CHUYỂN</h1>
	<a href="#addEmployeeModal"  class="btn btn-success" data-toggle="modal"><span>Thêm</span></a>
    <table class="fl-table">
        <div class="table-responsive text-nowrap">
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Name</th>
                    <th scope="col">DESCIPTION</th>
                    <th scope="col">PRICE</th>
                    <th scope="col">ESTIMATE DATE</th>
                </tr>
            </thead>
            <tbody class="table-border-bottom-0">
                <c:forEach items="${listD}" var="o">
                    <tr>
                        <th scope="row">${o.id}</th>
                        <td>${o.name}</td>
                        <td>${o.description}</td>
                        <td>${o.price}</td>
                        <td>${o.estimate}</td>
                        <td>
                           	<a class="dropdown-item" href="<c:url value="/DeleteVanchuyenControl?vid=${o.id}"/>">
                            	<i class="bx bx-edit-alt me-1"></i> 
                            	Xóa
                           	</a>
                           	<a class="dropdown-item" href="<c:url value="/LoadVanchuyenControl?vid=${o.id}"/>">
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
                    <form action="AddVanchuyenControl" method="post">
                        <div class="modal-header">						
                            <h4 class="modal-title">Thêm vận chuyển mới</h4>
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
                                <label>Price</label>
                                <input name="price" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Estimate Date</label>
                                <input name="estimate" type="text" class="form-control" required>
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
          <li class=" active"><a href="<c:url value="/QLVanchuyenControl"/>"><i class="ft-circle"></i><span class="menu-title" data-i18n="">Quản lý vận chuyển</span></a>
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
            <h3 class="content-header-title">Bootstrap Cards</h3>
          </div>
          <div class="content-header-right col-md-8 col-12">
            <div class="breadcrumbs-top float-md-right">
              <div class="breadcrumb-wrapper mr-1">
                <ol class="breadcrumb">
                  <li class="breadcrumb-item"><a href="index.html">Home</a>
                  </li>
                  <li class="breadcrumb-item active">Cards
                  </li>
                </ol>
              </div>
            </div>
          </div>
        </div>
        <div class="content-body"><!-- ../../../theme-assets/images/carousel/22.jpg -->

<!-- Header footer section start -->
<section id="header-footer">
	<div class="row match-height">
		<div class="col-lg-4 col-md-12">
			<div class="card">
				<div class="card-body">
					<h4 class="card-title">Basic Card</h4>
					<h6 class="card-subtitle text-muted">Basic Card With Header & Footer</h6>
				</div>
				<img class="" src="theme-assets/images/carousel/22.jpg" alt="Card image cap">
				<div class="card-body">
					<p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
					<a href="#" class="card-link">Card link</a>
					<a href="#" class="card-link">Another link</a>
				</div>
				<div class="card-footer border-top-blue-grey border-top-lighten-5 text-muted">
					<span class="float-left">3 hours ago</span>
					<span class="float-right">
						<a href="#" class="card-link">Read More
							<i class="la la-angle-right"></i>
						</a>
					</span>
				</div>
			</div>
		</div>
		<div class="col-lg-4 col-md-12">
			<div class="card">
				<div class="card-body">
					<h4 class="card-title">Basic Card</h4>
					<h6 class="card-subtitle text-muted">Basic Card With Header & Footer</h6>
				</div>
				<img class="" src="theme-assets/images/carousel/23.jpg" alt="Card image cap">
				<div class="card-body">
					<p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
					<a href="#" class="card-link">Card link</a>
					<a href="#" class="card-link">Another link</a>
				</div>
				<div class="card-footer border-top-blue-grey border-top-lighten-5 text-muted">
					<span class="float-left">1 day ago</span>
				</div>
			</div>
		</div>
		<div class="col-lg-4 col-md-12">
			<div class="card">
				<div class="card-body">
					<h4 class="card-title">Basic Card</h4>
					<h6 class="card-subtitle text-muted">Basic Card With Header & Footer</h6>
				</div>
				<img class="" src="theme-assets/images/carousel/24.jpg" alt="Card image cap">
				<div class="card-body">
					<p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
					<a href="#" class="card-link">Card link</a>
					<a href="#" class="card-link">Another link</a>
				</div>
				<div class="card-footer border-top-blue-grey border-top-lighten-5 text-muted">
					<span class="float-left">3 hours ago</span>
					<span class="float-right">
						<a href="#" class="card-link">Read More
							<i class="la la-angle-right"></i>
						</a>
					</span>
				</div>
			</div>
		</div>
	</div>
</section>
<!-- Header footer section End -->

<!-- Content types section start -->
<section id="content-types">
	<div class="row">
		<div class="col-12 mt-3 mb-1">
			<h4 class="text-uppercase">Content Types</h4>
			<p>Cards support a wide variety of content, including images, text, list groups, links, and more. Mix and match multiple
				content types to create the card you need.</p>
		</div>
	</div>
	<div class="row match-height">
		<div class="col-xl-6 col-md-6 col-sm-12">
			<div class="card">
				<div class="card-content">
					<div class="card-body">
						<h4 class="card-title">List Group</h4>
						<p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
					</div>
					<ul class="list-group list-group-flush">
						<li class="list-group-item">
							Cras justo odio
						</li>
						<li class="list-group-item">
							Dapibus ac facilisis in
						</li>
						<li class="list-group-item">
							Morbi leo risus
						</li>
						<li class="list-group-item">
							Porta ac consectetur ac
						</li>
						<li class="list-group-item">
							Vestibulum at eros
						</li>
					</ul>
					<div class="card-body">
						<a href="#" class="card-link">Card link</a>
						<a href="#" class="card-link">Another link</a>
					</div>
				</div>
			</div>
		</div>

		<div class="col-xl-6 col-md-12">
			<div class="card">
				<div class="card-content">
					<div class="card-body">
						<h4 class="card-title">Contact Form</h4>
						<h6 class="card-subtitle text-muted">Support card subtitle</h6>
					</div>
					<div class="card-body">
						<form class="form">
							<div class="form-body">
								<div class="form-group">
									<label for="donationinput1" class="sr-only">First Name</label>
									<input type="text" id="donationinput1" class="form-control" placeholder="First Name" name="fname">
								</div>
								<div class="form-group">
									<label for="donationinput2" class="sr-only">Last Name</label>
									<input type="text" id="donationinput2" class="form-control" placeholder="Last Name" name="lanme">
								</div>
								<div class="form-group">
									<label for="donationinput3" class="sr-only">E-mail</label>
									<input type="email" id="donationinput3" class="form-control" placeholder="E-mail" name="email">
								</div>

								<div class="form-group">
									<label for="donationinput4" class="sr-only">Contact Number</label>
									<input type="text" id="donationinput4" class="form-control" placeholder="Phone" name="phone">
								</div>
								<div class="form-group">
									<label for="donationinput7" class="sr-only">Message</label>
									<textarea id="donationinput7" rows="5" class="form-control square" name="message" placeholder="message"></textarea>
								</div>

							</div>
							<div class="form-actions center">
								<button type="submit" class="btn btn-outline-primary">Send</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>
<!-- Content types section end -->

<!-- Text Alignment section start -->
<section id="text-alignments">
	<div class="row">
		<div class="col-12 mt-3 mb-1">
			<h4 class="text-uppercase">Text Alignment</h4>
			<p>You can quickly change the text alignment of any card—in its entirety or specific parts—with our text align classes.</p>
		</div>
	</div>
	<div class="row">
		<div class="col-lg-4 col-md-12">
			<div class="card">
				<div class="card-body">
					<h4 class="card-title">Text Align Left</h4>
					<p class="card-text">Jelly beans sugar plum cheesecake cookie oat cake soufflé.Tootsie roll bonbon liquorice tiramisu pie powder.Donut sweet
						roll marzipan pastry cookie cake tootsie roll oat cake cookie.</p>
					<p class="card-text">Sweet roll marzipan pastry halvah. Cake bear claw sweet. Tootsie roll pie marshmallow lollipop chupa chups donut fruitcake
						cake.Jelly beans sugar plum cheesecake cookie oat cake soufflé. Tart lollipop carrot cake sugar plum. Marshmallow wafer
						tiramisu jelly beans.</p>
					<a href="#" class="btn btn-primary">Go somewhere</a>
				</div>
			</div>
		</div>
		<div class="col-lg-4 col-md-12">
			<div class="card text-center">
				<div class="card-body">
					<h4 class="card-title">Text Align Center</h4>
					<p class="card-text">Jelly beans sugar plum cheesecake cookie oat cake soufflé.Tootsie roll bonbon liquorice tiramisu pie powder.Donut sweet
						roll marzipan pastry cookie cake tootsie roll oat cake cookie.</p>
					<p class="card-text">Sweet roll marzipan pastry halvah. Cake bear claw sweet. Tootsie roll pie marshmallow lollipop chupa chups donut fruitcake
						cake.Jelly beans sugar plum cheesecake cookie oat cake soufflé. Tart lollipop carrot cake sugar plum. Marshmallow wafer
						tiramisu jelly beans.</p>
					<a href="#" class="btn btn-primary">Go somewhere</a>
				</div>
			</div>
		</div>
		<div class="col-lg-4 col-md-12">
			<div class="card text-right">
				<div class="card-body">
					<h4 class="card-title">Text Align Right</h4>
					<p class="card-text">Jelly beans sugar plum cheesecake cookie oat cake soufflé.Tootsie roll bonbon liquorice tiramisu pie powder.Donut sweet
						roll marzipan pastry cookie cake tootsie roll oat cake cookie.</p>
					<p class="card-text">Sweet roll marzipan pastry halvah. Cake bear claw sweet. Tootsie roll pie marshmallow lollipop chupa chups donut fruitcake
						cake.Jelly beans sugar plum cheesecake cookie oat cake soufflé. Tart lollipop carrot cake sugar plum. Marshmallow wafer
						tiramisu jelly beans.</p>
					<a href="#" class="btn btn-primary">Go somewhere</a>
				</div>
			</div>
		</div>
	</div>
</section>
<!-- Text Alignment section end -->

<!-- Card Headings section start -->
<section id="card-headings">
	<div class="row">
		<div class="col-12 mt-3 mb-1">
			<h4 class="text-uppercase">Card Headings</h4>
		</div>
	</div>

	<div class="row">
		<div class="col-md-6 col-sm-12">
			<div class="card text-center">
				<div class="card-header">
					Featured
				</div>
				<div class="card-body">
					<h5 class="card-title">Special title treatment</h5>
					<p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
					<a href="#" class="btn btn-primary">Go somewhere</a>
				</div>
				<div class="card-footer text-muted">
					2 days ago
				</div>
			</div>
		</div>
		<div class="col-md-6 col-sm-12">
			<div class="card">
				<div class="card-header">
					<h4 class="card-title" id="heading-multiple-thumbnails">Multiple Thumbnail</h4>
					<a class="heading-elements-toggle">
						<i class="la la-ellipsis-v font-medium-3"></i>
					</a>
					<div class="heading-elements">
						<span class="avatar">
							<img src="theme-assets/images/portrait/small/avatar-s-2.png" alt="avatar">
						</span>
						<span class="avatar">
							<img src="theme-assets/images/portrait/small/avatar-s-3.png" alt="avatar">
						</span>
						<span class="avatar">
							<img src="theme-assets/images/portrait/small/avatar-s-4.png" alt="avatar">
						</span>
					</div>
				</div>
				<div class="card-content">
					<div class="card-body">
						<h4 class="card-title">Content title</h4>
						<p class="card-text">Jelly beans sugar plum cheesecake cookie oat cake soufflé.Tootsie roll bonbon liquorice tiramisu pie powder.Donut sweet
							roll marzipan pastry cookie cake tootsie roll oat cake cookie.</p>
						<p class="card-text">Sweet roll marzipan pastry halvah. Cake bear claw sweet. Tootsie roll pie marshmallow lollipop chupa chups donut fruitcake
							cake.Jelly beans sugar plum cheesecake cookie oat cake soufflé. Tart lollipop carrot cake sugar plum. Marshmallow
							wafer tiramisu jelly beans.</p>
					</div>
				</div>
			</div>
		</div>
	</div>

</section>
<!-- // Card Headings section end -->
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
    <!-- END PAGE LEVEL JS-->
  </body>
</html>