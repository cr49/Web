<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html class="loading" lang="en" data-textdirection="ltr">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, user-scalable=0, minimal-ui">
<meta name="description"
	content="Chameleon Admin is a modern Bootstrap 4 webapp &amp; admin dashboard html template with a large number of components, elegant design, clean and organized code.">
<meta name="keywords"
	content="admin template, Chameleon admin template, dashboard template, gradient admin template, responsive admin template, webapp, eCommerce dashboard, analytic dashboard">
<meta name="author" content="ThemeSelect">
<title>Hello Admin</title>
<link rel="apple-touch-icon"
	href="<c:url value="/CuongHandsome/theme-assets/images/ico/apple-icon-120.png"/>">
<link rel="shortcut icon" type="image/x-icon"
	href="<c:url value="/CuongHandsome/theme-assets/images/ico/favicon.ico"/>">
<link
	href="<c:url value="/CuongHandsome/https://fonts.googleapis.com/css?family=Muli:300,300i,400,400i,600,600i,700,700i%7CComfortaa:300,400,700"/>"
	rel="stylesheet">
<link
	href="<c:url value="/CuongHandsome/https://maxcdn.icons8.com/fonts/line-awesome/1.1/css/line-awesome.min.css"/>"
	rel="stylesheet">
<!-- BEGIN VENDOR CSS-->
<link rel="stylesheet" type="text/css"
	href="<c:url value="/CuongHandsome/theme-assets/css/vendors.css"/>">
<!-- END VENDOR CSS-->
<!-- BEGIN CHAMELEON  CSS-->
<link rel="stylesheet" type="text/css"
	href="<c:url value="/CuongHandsome/theme-assets/css/app-lite.css"/>">
<!-- END CHAMELEON  CSS-->
<!-- BEGIN Page Level CSS-->
<link rel="stylesheet" type="text/css"
	href="<c:url value="/CuongHandsome/theme-assets/css/core/menu/menu-types/vertical-menu.css"/>">
<link rel="stylesheet" type="text/css"
	href="<c:url value="/CuongHandsome/theme-assets/css/core/colors/palette-gradient.css"/>">
<link rel="stylesheet" type="text/css" href="<c:url value="/CuongHandsome/editstyle.css"/>">
<link href="<c:url value="/CuongHandsome/https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"/>" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<!-- END Page Level CSS-->
<!-- BEGIN Custom CSS-->
<!-- END Custom CSS-->
</head>
<body
	class="vertical-layout vertical-menu 2-columns   menu-expanded fixed-navbar"
	data-open="click" data-menu="vertical-menu"
	data-color="bg-gradient-x-purple-blue" data-col="2-columns">

	<!-- fixed-top-->

	<div class="table-wrapper">
		<h1>QUẢN LÝ NGƯỜI DÙNG</h1>
		<a href="#addEmployeeModal"  class="btn btn-success" data-toggle="modal"><span>Thêm</span></a>
		<table class="fl-table">
        <div class="table-responsive text-nowrap">
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">FIRST NAME</th>
                    <th scope="col">LAST NAME</th>
                    <th scope="col">CARD_ID</th>
                    <th scope="col">EMAIL</th>
                    <th scope="col">PHONE</th>
                    <th scope="col">EMAIL ACTIVE</th>
                    <th scope="col">PHONE ACTIVE</th>
                    <th scope="col">USER NAME</th>
                    <th scope="col">PASS WORD</th>
                    <th scope="col">ROLE</th>
                    <th scope="col">ADDRESS</th>
                    <th scope="col">POINT</th>
                    <th scope="col">LEVEL</th>
                    <th scope="col">CREATE DATE</th>
                    <th scope="col">AVATAR</th>
                </tr>
            </thead>
            <tbody class="table-border-bottom-0">
                <c:forEach items="${listU}" var="o">
                    <tr>
                        <th scope="row">${o.id}</th>
                        <td>${o.fname}</td>
                        <td>${o.lname}</td>
                        <td>${o.idcard}</td>
                        <td>${o.email}</td>
                        <td>${o.phone}</td>
            			<td>${o.emailactive}</td>
            			<td>${o.phoneactive}</td>
                        <td>${o.username}</td>
                        <td>${o.password}</td>
                        <td>${o.role}</td>
                        <td>${o.address}</td>
                        <td>${o.point}</td>
                        <td>${o.level}</td>
                        <td>${o.create}</td>
                        <td>
                        	<img class="img-thumbnail"
                            src="${o.avatar}" height="50px" width="50px"
                            alt="Card image cap"></td>
                        <td>
                           	<a class="dropdown-item" href="<c:url value="/DeleteNguoidungControl?nid=${o.id}"/>">
                            	<i class="bx bx-edit-alt me-1"></i> 
                            	Xóa
                           	</a>
                           	<a class="dropdown-item" href="<c:url value="/LoadNguoidungControl?nid=${o.id}"/>">
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
                    <form action="AddNguoidungControl" method="post">
                        <div class="modal-header">						
                            <h4 class="modal-title">Thêm người dùng mới</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">					
                            <div class="form-group">
                                <label>Fisrt Name</label>
                                <input name="fname" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Last Name</label>
                                <input name="lname" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Card Id</label>
                                <input name="cardid" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Email</label>
                                <input name="email" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Phone</label>
                                <input name="phone" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Email Active</label>
                                <input name="eactive" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Phone Active</label>
                                <input name="pactive" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>User Name</label>
                                <input name="username" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Pass Word</label>
                                <input name="password" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Role</label>
                                <input name="role" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Address</label>
                                <input name="address" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Avatar</label>
                                <input name="avatar" type="text" class="form-control" required>
                            </div>  
                            <div class="form-group">
                                <label>Point</label>
                                <input name="point" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Level</label>
                                <input name="level" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Create Date</label>
                                <input name="create" type="text" class="form-control" required>
                            </div>
                   
                        </div>
                        <div class="modal-footer">
                            <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                            <input type="submit" class="btn btn-success" value="Add">
                        </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
	</div>

	<!-- ////////////////////////////////////////////////////////////////////////////-->


	<div
		class="main-menu menu-fixed menu-light menu-accordion    menu-shadow "
		data-scroll-to-active="true"
		data-img="theme-assets/images/backgrounds/02.jpg">
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
          <li class=" active"><a href="<c:url value="/QLNguoidungControl"/>"><i class="ft-circle"></i><span class="menu-title" data-i18n="">Quản lý người dùng</span></a>
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
						<h3 class="content-header-title">Buttons</h3>
					</div>
					<div class="content-header-right col-md-8 col-12">
						<div class="breadcrumbs-top float-md-right">
							<div class="breadcrumb-wrapper mr-1">
								<ol class="breadcrumb">
									<li class="breadcrumb-item"><a href="index.html">Home</a>
									</li>
									<li class="breadcrumb-item active">Buttons</li>
								</ol>
							</div>
						</div>
					</div>
				</div>
				<div class="content-body">
					<!-- Basic Buttons start -->
					<section id="basic-buttons">
						<div class="row">
							<div class="col-lg-12 col-md-12">
								<div class="card">
									<div class="card-header">
										<h4 class="card-title">Basic Buttons</h4>
										<a class="heading-elements-toggle"><i
											class="la la-ellipsis font-medium-3"></i></a>
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
											<p class="card-subtitle">Bootstrap includes six
												predefined button styles, each serving its own semantic
												purpose.</p>
											<div class="form-group">
												<!-- basic buttons -->
												<button type="button"
													class="btn btn-secondary btn-min-width mr-1 mb-1">Secondary</button>
												<button type="button"
													class="btn btn-primary btn-min-width mr-1 mb-1">Primary</button>
												<button type="button"
													class="btn btn-success btn-min-width mr-1 mb-1">Success</button>
												<button type="button"
													class="btn btn-info btn-min-width mr-1 mb-1">Info</button>
												<button type="button"
													class="btn btn-warning btn-min-width mr-1 mb-1">Warning</button>
												<button type="button"
													class="btn btn-danger btn-min-width mr-1 mb-1">Danger</button>
												<button type="button"
													class="btn btn-light btn-min-width mr-1 mb-1">Light</button>
												<button type="button"
													class="btn btn-dark btn-min-width mr-1 mb-1">Dark</button>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</section>
					<!-- Basic Buttons end -->

					<!-- Basic Button Icon start -->
					<section id="basic-button-icons">
						<div class="row">
							<div class="col-lg-12 col-md-12">
								<div class="card">
									<div class="card-header">
										<h4 class="card-title">Buttons with Icon</h4>
										<a class="heading-elements-toggle"><i
											class="la la-ellipsis font-medium-3"></i></a>
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
											<p class="card-subtitle">Bootstrap includes six
												predefined button styles, each serving its own semantic
												purpose.</p>
											<div class="form-group">
												<!-- Buttons with Icon -->
												<button type="button"
													class="btn btn-secondary btn-min-width mr-1 mb-1">
													<i class="ft-music"></i> Secondary
												</button>
												<button type="button"
													class="btn btn-primary btn-min-width mr-1 mb-1">
													<i class="ft-mic"></i> Primary
												</button>
												<button type="button"
													class="btn btn-success btn-min-width mr-1 mb-1">
													<i class=""></i> Success
												</button>
												<button type="button"
													class="btn btn-info btn-min-width mr-1 mb-1">
													<i class="ft-pause"></i> Info
												</button>
												<button type="button"
													class="btn btn-warning btn-min-width mr-1 mb-1">
													Warning <i class="ft-bookmark"></i>
												</button>
												<button type="button"
													class="btn btn-danger btn-min-width mr-1 mb-1">
													Danger <i class="ft-command"></i>
												</button>
												<button type="button"
													class="btn btn-light btn-min-width mr-1 mb-1">
													Light <i class="ft-radio"></i>
												</button>
												<button type="button"
													class="btn btn-dark btn-min-width mr-1 mb-1">
													Dark <i class="ft-link-2"></i>
												</button>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</section>
					<!-- Basic Button Icon end -->

					<!-- Single button dropdowns start -->
					<section id="single-button-dropdowns">
						<div class="row">
							<div class="col-lg-12 col-md-12">
								<div class="card">
									<div class="card-header">
										<h4 class="card-title">Single button dropdowns</h4>
										<a class="heading-elements-toggle"><i
											class="la la-ellipsis font-medium-3"></i></a>
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
											<p class="card-subtitle">Turn a button into a dropdown
												toggle with some basic markup changes.</p>
											<div class="form-group">
												<!-- Single Button Dropdown -->
												<div class="btn-group mr-1 mb-1">
													<button type="button"
														class="btn btn-secondary btn-min-width dropdown-toggle"
														data-toggle="dropdown" aria-haspopup="true"
														aria-expanded="true">Secondary</button>
													<div class="dropdown-menu">
														<a class="dropdown-item" href="#">Action</a> <a
															class="dropdown-item" href="#">Another action</a> <a
															class="dropdown-item" href="#">Something else here</a>
														<div class="dropdown-divider"></div>
														<a class="dropdown-item" href="#">Separated link</a>
													</div>
												</div>
												<!-- /btn-group -->
												<div class="btn-group mr-1 mb-1">
													<button type="button"
														class="btn btn-primary btn-min-width dropdown-toggle"
														data-toggle="dropdown" aria-haspopup="true"
														aria-expanded="false">Primary</button>
													<div class="dropdown-menu">
														<a class="dropdown-item" href="#">Action</a> <a
															class="dropdown-item" href="#">Another action</a> <a
															class="dropdown-item" href="#">Something else here</a>
														<div class="dropdown-divider"></div>
														<a class="dropdown-item" href="#">Separated link</a>
													</div>
												</div>
												<!-- /btn-group -->
												<div class="btn-group mr-1 mb-1">
													<button type="button"
														class="btn btn-success btn-min-width dropdown-toggle"
														data-toggle="dropdown" aria-haspopup="true"
														aria-expanded="false">Success</button>
													<div class="dropdown-menu">
														<a class="dropdown-item" href="#">Action</a> <a
															class="dropdown-item" href="#">Another action</a> <a
															class="dropdown-item" href="#">Something else here</a>
														<div class="dropdown-divider"></div>
														<a class="dropdown-item" href="#">Separated link</a>
													</div>
												</div>
												<!-- /btn-group -->
												<div class="btn-group mr-1 mb-1">
													<button type="button"
														class="btn btn-info btn-min-width dropdown-toggle"
														data-toggle="dropdown" aria-haspopup="true"
														aria-expanded="false">Info</button>
													<div class="dropdown-menu">
														<a class="dropdown-item" href="#">Action</a> <a
															class="dropdown-item" href="#">Another action</a> <a
															class="dropdown-item" href="#">Something else here</a>
														<div class="dropdown-divider"></div>
														<a class="dropdown-item" href="#">Separated link</a>
													</div>
												</div>
												<!-- /btn-group -->
												<div class="btn-group mr-1 mb-1">
													<button type="button"
														class="btn btn-warning btn-min-width dropdown-toggle"
														data-toggle="dropdown" aria-haspopup="true"
														aria-expanded="false">Warning</button>
													<div class="dropdown-menu">
														<a class="dropdown-item" href="#">Action</a> <a
															class="dropdown-item" href="#">Another action</a> <a
															class="dropdown-item" href="#">Something else here</a>
														<div class="dropdown-divider"></div>
														<a class="dropdown-item" href="#">Separated link</a>
													</div>
												</div>
												<!-- /btn-group -->
												<div class="btn-group mr-1 mb-1">
													<button type="button"
														class="btn btn-danger btn-min-width dropdown-toggle"
														data-toggle="dropdown" aria-haspopup="true"
														aria-expanded="false">Danger</button>
													<div class="dropdown-menu">
														<a class="dropdown-item" href="#">Action</a> <a
															class="dropdown-item" href="#">Another action</a> <a
															class="dropdown-item" href="#">Something else here</a>
														<div class="dropdown-divider"></div>
														<a class="dropdown-item" href="#">Separated link</a>
													</div>
												</div>
												<!-- /btn-group -->
												<div class="btn-group mr-1 mb-1">
													<button type="button"
														class="btn btn-light btn-min-width dropdown-toggle"
														data-toggle="dropdown" aria-haspopup="true"
														aria-expanded="false">Light</button>
													<div class="dropdown-menu">
														<a class="dropdown-item" href="#">Action</a> <a
															class="dropdown-item" href="#">Another action</a> <a
															class="dropdown-item" href="#">Something else here</a>
														<div class="dropdown-divider"></div>
														<a class="dropdown-item" href="#">Separated link</a>
													</div>
												</div>
												<!-- /btn-group -->
												<div class="btn-group mr-1 mb-1">
													<button type="button"
														class="btn btn-dark btn-min-width dropdown-toggle"
														data-toggle="dropdown" aria-haspopup="true"
														aria-expanded="false">Dark</button>
													<div class="dropdown-menu">
														<a class="dropdown-item" href="#">Action</a> <a
															class="dropdown-item" href="#">Another action</a> <a
															class="dropdown-item" href="#">Something else here</a>
														<div class="dropdown-divider"></div>
														<a class="dropdown-item" href="#">Separated link</a>
													</div>
												</div>
												<!-- /btn-group -->
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</section>
					<!-- Single button dropdowns end -->

					<!-- Split Buttons start -->
					<section id="split-buttons">
						<div class="row">
							<div class="col-lg-12 col-md-12">
								<div class="card">
									<div class="card-header">
										<h4 class="card-title">Split Buttons</h4>
										<a class="heading-elements-toggle"><i
											class="la la-ellipsis font-medium-3"></i></a>
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
											<p class="card-subtitle">Similarly, create split button
												dropdowns with the same markup changes, only with a separate
												button.</p>
											<div class="form-group">
												<!-- Split Button Dropdown -->
												<div class="btn-group mr-1 mb-1">
													<button type="button" class="btn btn-secondary">Secondary</button>
													<button type="button"
														class="btn btn-secondary dropdown-toggle"
														data-toggle="dropdown" aria-haspopup="true"
														aria-expanded="false"></button>
													<div class="dropdown-menu">
														<a class="dropdown-item" href="#">Action</a> <a
															class="dropdown-item" href="#">Another action</a> <a
															class="dropdown-item" href="#">Something else here</a>
														<div class="dropdown-divider"></div>
														<a class="dropdown-item" href="#">Separated link</a>
													</div>
												</div>
												<!-- /btn-group -->
												<div class="btn-group mr-1 mb-1">
													<button type="button" class="btn btn-primary">Primary</button>
													<button type="button"
														class="btn btn-primary dropdown-toggle"
														data-toggle="dropdown" aria-haspopup="true"
														aria-expanded="false"></button>
													<div class="dropdown-menu">
														<a class="dropdown-item" href="#">Action</a> <a
															class="dropdown-item" href="#">Another action</a> <a
															class="dropdown-item" href="#">Something else here</a>
														<div class="dropdown-divider"></div>
														<a class="dropdown-item" href="#">Separated link</a>
													</div>
												</div>
												<!-- /btn-group -->
												<div class="btn-group mr-1 mb-1">
													<button type="button" class="btn btn-success">Success</button>
													<button type="button"
														class="btn btn-success dropdown-toggle"
														data-toggle="dropdown" aria-haspopup="true"
														aria-expanded="false"></button>
													<div class="dropdown-menu">
														<a class="dropdown-item" href="#">Action</a> <a
															class="dropdown-item" href="#">Another action</a> <a
															class="dropdown-item" href="#">Something else here</a>
														<div class="dropdown-divider"></div>
														<a class="dropdown-item" href="#">Separated link</a>
													</div>
												</div>
												<!-- /btn-group -->
												<div class="btn-group mr-1 mb-1">
													<button type="button" class="btn btn-info">Info</button>
													<button type="button" class="btn btn-info dropdown-toggle"
														data-toggle="dropdown" aria-haspopup="true"
														aria-expanded="false"></button>
													<div class="dropdown-menu">
														<a class="dropdown-item" href="#">Action</a> <a
															class="dropdown-item" href="#">Another action</a> <a
															class="dropdown-item" href="#">Something else here</a>
														<div class="dropdown-divider"></div>
														<a class="dropdown-item" href="#">Separated link</a>
													</div>
												</div>
												<!-- /btn-group -->
												<div class="btn-group mr-1 mb-1">
													<button type="button" class="btn btn-warning">Warning</button>
													<button type="button"
														class="btn btn-warning dropdown-toggle"
														data-toggle="dropdown" aria-haspopup="true"
														aria-expanded="false"></button>
													<div class="dropdown-menu">
														<a class="dropdown-item" href="#">Action</a> <a
															class="dropdown-item" href="#">Another action</a> <a
															class="dropdown-item" href="#">Something else here</a>
														<div class="dropdown-divider"></div>
														<a class="dropdown-item" href="#">Separated link</a>
													</div>
												</div>
												<!-- /btn-group -->
												<div class="btn-group mr-1 mb-1">
													<button type="button" class="btn btn-danger">Danger</button>
													<button type="button"
														class="btn btn-danger dropdown-toggle"
														data-toggle="dropdown" aria-haspopup="true"
														aria-expanded="false"></button>
													<div class="dropdown-menu">
														<a class="dropdown-item" href="#">Action</a> <a
															class="dropdown-item" href="#">Another action</a> <a
															class="dropdown-item" href="#">Something else here</a>
														<div class="dropdown-divider"></div>
														<a class="dropdown-item" href="#">Separated link</a>
													</div>
												</div>
												<!-- /btn-group -->
												<div class="btn-group mr-1 mb-1">
													<button type="button" class="btn btn-light">Light</button>
													<button type="button" class="btn btn-light dropdown-toggle"
														data-toggle="dropdown" aria-haspopup="true"
														aria-expanded="false"></button>
													<div class="dropdown-menu">
														<a class="dropdown-item" href="#">Action</a> <a
															class="dropdown-item" href="#">Another action</a> <a
															class="dropdown-item" href="#">Something else here</a>
														<div class="dropdown-divider"></div>
														<a class="dropdown-item" href="#">Separated link</a>
													</div>
												</div>
												<!-- /btn-group -->
												<div class="btn-group mr-1 mb-1">
													<button type="button" class="btn btn-dark">Dark</button>
													<button type="button" class="btn btn-dark dropdown-toggle"
														data-toggle="dropdown" aria-haspopup="true"
														aria-expanded="false"></button>
													<div class="dropdown-menu">
														<a class="dropdown-item" href="#">Action</a> <a
															class="dropdown-item" href="#">Another action</a> <a
															class="dropdown-item" href="#">Something else here</a>
														<div class="dropdown-divider"></div>
														<a class="dropdown-item" href="#">Separated link</a>
													</div>
												</div>
												<!-- /btn-group -->
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</section>
					<!-- Split Buttons end -->

					<!-- Button group start -->
					<section id="button-group">
						<div class="row">
							<div class="col-lg-12 col-md-12">
								<div class="card">
									<div class="card-header">
										<h4 class="card-title">Button group</h4>
										<a class="heading-elements-toggle"><i
											class="la la-ellipsis font-medium-3"></i></a>
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
											<div class="form-group">
												<p class="card-subtitle">
													Group a series of buttons together on a single line with
													the button group. Wrap a series of buttons with
													<code>.btn</code>
													in
													<code>.btn-group</code>
													.
												</p>
												<!-- button group -->
												<div class="btn-group" role="group"
													aria-label="Basic example">
													<button type="button" class="btn btn-secondary">Secondary</button>
													<button type="button" class="btn btn-primary">Primary</button>
													<button type="button" class="btn btn-light">Light</button>
													<button type="button" class="btn btn-dark">Dark</button>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</section>
					<!-- Button group end -->

					<!-- Icon Buttons start -->
					<section id="icons-buttons">
						<div class="row">
							<div class="col-lg-12 col-md-12">
								<div class="card">
									<div class="card-header">
										<h4 class="card-title">Icon Buttons</h4>
										<a class="heading-elements-toggle"><i
											class="la la-ellipsis font-medium-3"></i></a>
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
											<div class="form-group">
												<!-- Simple Icon Button -->
												<button type="button"
													class="btn btn-icon btn-secondary mr-1">
													<i class="ft-music"></i>
												</button>
												<button type="button" class="btn btn-icon btn-primary mr-1">
													<i class="ft-mic"></i>
												</button>
												<button type="button" class="btn btn-icon btn-success mr-1">
													<i class="ft-paperclip"></i>
												</button>
												<button type="button" class="btn btn-icon btn-info mr-1">
													<i class="ft-pause"></i>
												</button>
												<button type="button" class="btn btn-icon btn-warning mr-1">
													<i class="ft-bookmark"></i>
												</button>
												<button type="button" class="btn btn-icon btn-danger mr-1">
													<i class="ft-command"></i>
												</button>
												<button type="button" class="btn btn-icon btn-light mr-1">
													<i class="ft-radio"></i>
												</button>
												<button type="button" class="btn btn-icon btn-dark mr-1">
													<i class="ft-link-2"></i>
												</button>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</section>
					<!-- Icon Buttons end -->

					<!-- Sizes start -->
					<section id="sizes-2">
						<div class="row">
							<div class="col-lg-12 col-md-12">
								<div class="card">
									<div class="card-header">
										<h4 class="card-title">Sizes</h4>
										<a class="heading-elements-toggle"><i
											class="la la-ellipsis font-medium-3"></i></a>
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
											<p class="card-subtitle">
												Add
												<code>.btn-lg</code>
												or
												<code>.btn-sm</code>
												for Fancy larger or smaller buttons size.
											</p>
											<!-- simple sizes -->
											<div class="form-group">
												<button type="button"
													class="btn mr-1 mb-1 btn-success btn-lg">Large
													button</button>
												<button type="button"
													class="btn mr-1 mb-1 btn-danger btn-lg">Large
													button</button>
											</div>
											<div class="form-group">
												<button type="button" class="btn mr-1 mb-1 btn-success">Default
													button</button>
												<button type="button" class="btn mr-1 mb-1 btn-danger">Default
													button</button>
											</div>
											<div class="form-group">
												<button type="button"
													class="btn mr-1 mb-1 btn-success btn-sm">Small
													button</button>
												<button type="button"
													class="btn mr-1 mb-1 btn-danger btn-sm">Small
													button</button>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</section>
					<!-- Sizes end -->

					<!-- Button Group Sizes start -->
					<section id="button-group-sizes">
						<div class="row">
							<div class="col-lg-12 col-md-12">
								<div class="card">
									<div class="card-header">
										<h4 class="card-title">Button Group Sizes</h4>
										<a class="heading-elements-toggle"><i
											class="la la-ellipsis font-medium-3"></i></a>
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
											<p class="subtitle">
												Instead of applying button sizing classes to every button in
												a group, just add
												<code>.btn-group-*</code>
												to each
												<code>.btn-group</code>
												.
											</p>
											<div class="form-group">
												<!-- Button Group Sizes -->
												<div class="btn-group btn-group-lg" role="group"
													aria-label="Basic example">
													<button type="button" class="btn btn-danger">Danger</button>
													<button type="button" class="btn btn-info">Info</button>
													<button type="button" class="btn btn-warning">Warning</button>
												</div>
											</div>
											<div class="form-group">
												<div class="btn-group" role="group"
													aria-label="Basic example">
													<button type="button" class="btn btn-danger">Danger</button>
													<button type="button" class="btn btn-info">Info</button>
													<button type="button" class="btn btn-warning">Warning</button>
												</div>
											</div>
											<div class="form-group">
												<div class="btn-group btn-group-sm" role="group"
													aria-label="Basic example">
													<button type="button" class="btn btn-danger">Danger</button>
													<button type="button" class="btn btn-info">Info</button>
													<button type="button" class="btn btn-warning">Warning</button>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</section>
					<!-- Button Group Sizes end -->

					<!-- Block level buttons start -->
					<section id="block-level-buttons">
						<div class="row">
							<div class="col-lg-12 col-md-12">
								<div class="card">
									<div class="card-header">
										<h4 class="card-title">Block buttons</h4>
										<a class="heading-elements-toggle"><i
											class="la la-ellipsis font-medium-3"></i></a>
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
											<p class="subtitle">
												Create block level buttons—those that span the full width of
												a parent—by adding
												<code>.btn-block</code>
												.
											</p>
											<!-- Block level buttons -->
											<div class="form-group">
												<button type="button"
													class="btn mb-1 btn-primary btn-lg btn-block">Block
													level button</button>
												<button type="button"
													class="btn mb-1 btn-secondary btn-lg btn-block">Block
													level button</button>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</section>
					<!-- Block level buttons end -->

					<!-- Button tags start -->
					<section id="button-tags">
						<div class="row">
							<div class="col-lg-12 col-md-12">
								<div class="card">
									<div class="card-header">
										<h4 class="card-title">Button tags</h4>
										<a class="heading-elements-toggle"><i
											class="la la-ellipsis font-medium-3"></i></a>
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
											<p class="subtitle">
												The .btn classes are designed to be used with the
												<code>&lt;button&gt;</code>
												element. However, you can also use these classes on
												<code>&lt;a&gt;</code>
												or
												<code>&lt;input&gt;</code>
												elements.
											</p>
											<!-- anchor, button tag, input button, input submit Tags -->
											<div class="form-group">
												<a class="btn btn-primary btn-min-width mr-1 mb-1" href="#"
													role="button">Link</a>
												<button class="btn btn-primary btn-min-width mr-1 mb-1"
													type="submit">Button</button>
												<input class="btn btn-primary btn-min-width mr-1 mb-1"
													type="button" value="Input"> <input
													class="btn btn-primary btn-min-width mr-1 mb-1"
													type="submit" value="Submit">
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</section>
					<!-- Button tags end -->
				</div>
			</div>
		</div>
	</div>
	<!-- ////////////////////////////////////////////////////////////////////////////-->



	<!-- BEGIN VENDOR JS-->
	<script src="<c:url value="/CuongHandsome/theme-assets/vendors/js/vendors.min.js"/>"
		type="text/javascript"></script>
	<!-- BEGIN VENDOR JS-->
	<!-- BEGIN PAGE VENDOR JS-->
	<!-- END PAGE VENDOR JS-->
	<!-- BEGIN CHAMELEON  JS-->
	<script src="<c:url value="/CuongHandsome/theme-assets/js/core/app-menu-lite.js"/>"
		type="text/javascript"></script>
	<script src="<c:url value="/CuongHandsome/theme-assets/js/core/app-lite.js"/>" type="text/javascript"></script>
	<!-- END CHAMELEON  JS-->
	<!-- BEGIN PAGE LEVEL JS-->
	<!-- END PAGE LEVEL JS-->
</body>
</html>