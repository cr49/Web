<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 14/12/2022
  Time: 1:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en" data-layout="vertical" data-topbar="light" data-sidebar="dark" data-sidebar-size="lg"
      data-sidebar-image="none" data-preloader="disable">


<!-- Mirrored from themesbrand.com/velzon/html/default/apps-ecommerce-product-details.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 04 Dec 2022 12:41:38 GMT -->

<head>

    <meta charset="utf-8" />
    <title>Product Details | Velzon - Admin & Dashboard Template</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta content="Premium Multipurpose Admin & Dashboard Template" name="description" />
    <meta content="Themesbrand" name="author" />
    <!-- App favicon -->
    <link rel="shortcut icon" href="<c:url value="/template/Trung/assets/images/favicon.ico"/>">

    <!--Swiper slider css-->
    <link href="<c:url value="/template/Trung/assets/libs/swiper/swiper-bundle.min.css"/>" rel="stylesheet" type="text/css" />

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

<!-- Begin page -->
<div id="layout-wrapper">


    <!-- ========== App Menu ========== -->
    <div class="app-menu navbar-menu">
        <!-- LOGO -->
        <div class="navbar-brand-box">
            <!-- Dark Logo-->
            <a href="index.html" class="logo logo-dark">
                    <span class="logo-sm">
                        <img src="assets/images/logo-sm.png" alt="" height="22">
                    </span>
                <span class="logo-lg">
                        <img src="assets/images/logo-dark.png" alt="" height="17">
                    </span>
            </a>
            <!-- Light Logo-->
            <a href="index.html" class="logo logo-light">
                    <span class="logo-sm">
                        <img src="assets/images/logo-sm.png" alt="" height="22">
                    </span>
                <span class="logo-lg">
                        <img src="assets/images/logo-light.png" alt="" height="17">
                    </span>
            </a>
            <button type="button" class="btn btn-sm p-0 fs-20 header-item float-end btn-vertical-sm-hover"
                    id="vertical-hover">
                <i class="ri-record-circle-line"></i>
            </button>
        </div>

        <div id="scrollbar">
            <div class="container-fluid">

                <div id="two-column-menu">
                </div>
                <ul class="navbar-nav" id="navbar-nav">
                    <li class="menu-title"><span data-key="t-menu">Menu</span></li>

                    <li class="nav-item">
                        <a class="nav-link menu-link" href="#sidebarProducts" data-bs-toggle="collapse"
                           role="button" aria-expanded="false" aria-controls="sidebarApps">
                            <i class="ri-apps-2-line"></i> <span data-key="t-apps">Products</span>
                        </a>
                        <div class="collapse menu-dropdown" id="sidebarProducts">
                            <ul class="nav nav-sm flex-column">
                                <li class="nav-item">
                                    <a href="/Final_Project/vendor/products" class="nav-link" data-key="t-products">
                                        Products List
                                    </a>
                                </li>
                                <li class="nav-item">
                                    <a href="/Final_Project/vendor/products/new" class="nav-link" data-key="t-products">
                                        Create a new product
                                    </a>
                                </li>
                                <%--                <li class="nav-item">--%>
                                <%--                  <a href="apps-ecommerce-products.html" class="nav-link" data-key="t-products">--%>
                                <%--                    Product Details--%>
                                <%--                  </a>--%>
                                <%--                </li>--%>
                            </ul>
                        </div>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link menu-link" href="#sidebarOrders" data-bs-toggle="collapse"
                           role="button" aria-expanded="false" aria-controls="sidebarApps">
                            <i class="ri-apps-2-line"></i> <span data-key="t-apps">Orders</span>
                        </a>
                        <div class="collapse menu-dropdown" id="sidebarOrders">
                            <ul class="nav nav-sm flex-column">
                                <li class="nav-item">
                                    <a href="/Final_Project/vendor/orders" class="nav-link" data-key="t-products">
                                        Orders List
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link menu-link" href="#sidebarS" data-bs-toggle="collapse"
                           role="button" aria-expanded="false" aria-controls="sidebarApps">
                            <i class="ri-apps-2-line"></i> <span data-key="t-apps">Revenue Statistics</span>
                        </a>
                        <div class="collapse menu-dropdown" id="sidebarS">
                            <ul class="nav nav-sm flex-column">
                                <li class="nav-item">
                                    <a href="/Final_Project/vendor/revenue-statistics" class="nav-link" data-key="t-products">
                                        Dashboard
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link menu-link" href="#sidebarStores" data-bs-toggle="collapse"
                           role="button" aria-expanded="false" aria-controls="sidebarApps">
                            <i class="ri-apps-2-line"></i> <span data-key="t-apps">Stores</span>
                        </a>
                        <div class="collapse menu-dropdown" id="sidebarStores">
                            <ul class="nav nav-sm flex-column">
                                <li class="nav-item">
                                    <a href="/Final_Project/vendor/stores-list" class="nav-link" data-key="t-products">
                                        Store List
                                    </a>
                                </li>
                                <li class="nav-item">
                                    <a href="/Final_Project/vendor/stores?id_store_profile=${sessionScope.idStore}" class="nav-link" data-key="t-products">
                                        Profile
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </li>

                </ul>
            </div>
            <!-- Sidebar -->
        </div>

        <div class="sidebar-background"></div>
    </div>
    <!-- Left Sidebar End -->
    <!-- Vertical Overlay-->
    <div class="vertical-overlay"></div>

    <!-- ============================================================== -->
    <!-- Start right Content here -->
    <!-- ============================================================== -->
    <div class="main-content">

        <div class="page-content">
            <div class="container-fluid">

                <!-- start page title -->
                <div class="row">
                    <div class="col-12">
                        <div class="page-title-box d-sm-flex align-items-center justify-content-between">
                            <h4 class="mb-sm-0">Product Details</h4>

                            <div class="page-title-right">
                                <ol class="breadcrumb m-0">
                                    <li class="breadcrumb-item"><a href="javascript: void(0);">Ecommerce</a></li>
                                    <li class="breadcrumb-item active">Product Details</li>
                                </ol>
                            </div>

                        </div>
                    </div>
                </div>
                <!-- end page title -->

                <div class="row">
                    <div class="col-lg-12">
                        <div class="card">
                            <div class="card-body">
                                <div class="row gx-lg-5">
                                    <div class="col-xl-4 col-md-8 mx-auto">
                                        <div class="product-img-slider sticky-side-div">
                                            <div class="swiper product-thumbnail-slider p-2 rounded bg-light">
                                                <div class="swiper-wrapper">
                                                    <c:forEach items="${productImages}" var="image">
                                                        <div class="swiper-slide">
                                                            <img src="${image.url_image}" alt="" class="img-fluid mx-auto d-block">
                                                        </div>
                                                    </c:forEach>
                                                </div>
                                                <div class="swiper-button-next"></div>
                                                <div class="swiper-button-prev"></div>
                                            </div>
                                            <!-- end swiper thumbnail slide -->
                                            <div class="swiper product-nav-slider mt-2">
                                                <div class="swiper-wrapper">
                                                    <div class="swiper-slide">

<%--                                                            <img src="assets/images/products/img-8.png" alt=""--%>
<%--                                                                 class="img-fluid d-block" />--%>

                                                    </div>
                                                </div>
                                            </div>
                                            <!-- end swiper nav slide -->
                                        </div>
                                    </div>
                                    <!-- end col -->

                                    <div class="col-xl-8">
                                        <div class="mt-xl-0 mt-5">
                                            <div class="d-flex">
                                                <div class="flex-grow-1">
                                                    <h4>${product.name}</h4>
                                                    <div class="hstack gap-3 flex-wrap">
<%--                                                        <div><a href="#" class="text-primary d-block">Tommy--%>
<%--                                                            Hilfiger</a></div>--%>
<%--                                                        <div class="vr"></div>--%>
                                                        <div class="text-muted">Categories : <span
                                                                class="text-body fw-medium">${categoryName}</span>
                                                        </div>
<%--                                                        <div class="vr"></div>--%>
<%--                                                        <div class="text-muted">Published : <span--%>
<%--                                                                class="text-body fw-medium">26 Mar, 2021</span>--%>
<%--                                                        </div>--%>
                                                    </div>
                                                </div>
                                                <div class="flex-shrink-0">
                                                    <div>
                                                        <a href="products/edit?id=${product._id}"
                                                           class="btn btn-light" data-bs-toggle="tooltip"
                                                           data-bs-placement="top" title="Edit"><i
                                                                class="ri-pencil-fill align-bottom"></i></a>
                                                    </div>
                                                </div>
                                            </div>

<%--                                            <div class="d-flex flex-wrap gap-2 align-items-center mt-3">--%>
<%--                                                <div class="text-muted fs-16">--%>
<%--                                                    <span class="mdi mdi-star text-warning"></span>--%>
<%--                                                    <span class="mdi mdi-star text-warning"></span>--%>
<%--                                                    <span class="mdi mdi-star text-warning"></span>--%>
<%--                                                    <span class="mdi mdi-star text-warning"></span>--%>
<%--                                                    <span class="mdi mdi-star text-warning"></span>--%>
<%--                                                </div>--%>
<%--                                                <div class="text-muted">( 5.50k Customer Review )</div>--%>
<%--                                            </div>--%>

                                            <div class="row mt-4">
                                                <div class="col-lg-3 col-sm-6">
                                                    <div class="p-2 border border-dashed rounded">
                                                        <div class="d-flex align-items-center">
                                                            <div class="avatar-sm me-2">
                                                                <div
                                                                        class="avatar-title rounded bg-transparent text-success fs-24">
                                                                    <i class="ri-money-dollar-circle-fill"></i>
                                                                </div>
                                                            </div>
                                                            <div class="flex-grow-1">
                                                                <p class="text-muted mb-1">Price :</p>
                                                                <h5 class="mb-0">$ ${product.price}</h5>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                                <!-- end col -->
<%--                                                <div class="col-lg-3 col-sm-6">--%>
<%--                                                    <div class="p-2 border border-dashed rounded">--%>
<%--                                                        <div class="d-flex align-items-center">--%>
<%--                                                            <div class="avatar-sm me-2">--%>
<%--                                                                <div--%>
<%--                                                                        class="avatar-title rounded bg-transparent text-success fs-24">--%>
<%--                                                                    <i class="ri-file-copy-2-fill"></i>--%>
<%--                                                                </div>--%>
<%--                                                            </div>--%>
<%--                                                            <div class="flex-grow-1">--%>
<%--                                                                <p class="text-muted mb-1">No. of Orders :</p>--%>
<%--                                                                <h5 class="mb-0">2,234</h5>--%>
<%--                                                            </div>--%>
<%--                                                        </div>--%>
<%--                                                    </div>--%>
<%--                                                </div>--%>
                                                <!-- end col -->
                                                <div class="col-lg-3 col-sm-6">
                                                    <div class="p-2 border border-dashed rounded">
                                                        <div class="d-flex align-items-center">
                                                            <div class="avatar-sm me-2">
                                                                <div
                                                                        class="avatar-title rounded bg-transparent text-success fs-24">
                                                                    <i class="ri-stack-fill"></i>
                                                                </div>
                                                            </div>
                                                            <div class="flex-grow-1">
                                                                <p class="text-muted mb-1">Available Stocks :</p>
                                                                <h5 class="mb-0">${stock}</h5>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                                <!-- end col -->

                                                <!-- end col -->
                                            </div>

                                            <div class="row">
                                                <div class="col-xl-6">
                                                    <div class="mt-4">
                                                        <h5 class="fs-14">Sizes :</h5>
                                                        <div class="d-flex flex-wrap gap-2">
                                                            <div data-bs-toggle="tooltip" data-bs-trigger="hover"
                                                                 data-bs-placement="top" title="${stockOfSize[0]}">
                                                                <input type="radio" class="btn-check"
                                                                       name="productsize-radio" id="productsize-radio1" ${stockOfSize[0] == "0 Items Available" ? 'disabled' : ''}>
<%--                                                                       disabled>--%>
                                                                <label
                                                                        class="btn btn-soft-primary avatar-xs rounded-circle p-0 d-flex justify-content-center align-items-center"
                                                                        for="productsize-radio1">S</label>
                                                            </div>

                                                            <div data-bs-toggle="tooltip" data-bs-trigger="hover"
                                                                 data-bs-placement="top" title="${stockOfSize[1]}">
                                                                <input type="radio" class="btn-check"
                                                                       name="productsize-radio"
                                                                       id="productsize-radio2">
                                                                <label
                                                                        class="btn btn-soft-primary avatar-xs rounded-circle p-0 d-flex justify-content-center align-items-center"
                                                                        for="productsize-radio2">M</label>
                                                            </div>
                                                            <div data-bs-toggle="tooltip" data-bs-trigger="hover"
                                                                 data-bs-placement="top" title="${stockOfSize[2]}">
                                                                <input type="radio" class="btn-check"
                                                                       name="productsize-radio"
                                                                       id="productsize-radio3">
                                                                <label
                                                                        class="btn btn-soft-primary avatar-xs rounded-circle p-0 d-flex justify-content-center align-items-center"
                                                                        for="productsize-radio3">L</label>
                                                            </div>

                                                            <div data-bs-toggle="tooltip" data-bs-trigger="hover"
                                                                 data-bs-placement="top" title="${stockOfSize[3]}">
                                                                <input type="radio" class="btn-check"
                                                                       name="productsize-radio" id="productsize-radio4"
                                                                        ${stockOfSize[3] == "0 Items Available" ? 'disabled' : ''}>
                                                                <label
                                                                        class="btn btn-soft-primary avatar-xs rounded-circle p-0 d-flex justify-content-center align-items-center"
                                                                        for="productsize-radio4">XL</label>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                                <!-- end col -->


                                                <!-- end col -->
                                            </div>
                                            <!-- end row -->

                                            <div class="mt-4 text-muted">
                                                <h5 class="fs-14">Description :</h5>
                                                <p>${product.description}</p>
                                            </div>





                                            <!-- product-content -->

<%--                                            <div class="mt-5">--%>
<%--                                                <div>--%>
<%--                                                    <h5 class="fs-14 mb-3">Ratings & Reviews</h5>--%>
<%--                                                </div>--%>
<%--                                                <div class="row gy-4 gx-0">--%>
<%--                                                    <div class="col-lg-4">--%>
<%--                                                        <div>--%>
<%--                                                            <div class="pb-3">--%>
<%--                                                                <div class="bg-light px-3 py-2 rounded-2 mb-2">--%>
<%--                                                                    <div class="d-flex align-items-center">--%>
<%--                                                                        <div class="flex-grow-1">--%>
<%--                                                                            <div--%>
<%--                                                                                    class="fs-16 align-middle text-warning">--%>
<%--                                                                                <i class="ri-star-fill"></i>--%>
<%--                                                                                <i class="ri-star-fill"></i>--%>
<%--                                                                                <i class="ri-star-fill"></i>--%>
<%--                                                                                <i class="ri-star-fill"></i>--%>
<%--                                                                                <i class="ri-star-half-fill"></i>--%>
<%--                                                                            </div>--%>
<%--                                                                        </div>--%>
<%--                                                                        <div class="flex-shrink-0">--%>
<%--                                                                            <h6 class="mb-0">4.5 out of 5</h6>--%>
<%--                                                                        </div>--%>
<%--                                                                    </div>--%>
<%--                                                                </div>--%>
<%--                                                                <div class="text-center">--%>
<%--                                                                    <div class="text-muted">Total <span--%>
<%--                                                                            class="fw-medium">5.50k</span> reviews--%>
<%--                                                                    </div>--%>
<%--                                                                </div>--%>
<%--                                                            </div>--%>

<%--                                                            <div class="mt-3">--%>
<%--                                                                <div class="row align-items-center g-2">--%>
<%--                                                                    <div class="col-auto">--%>
<%--                                                                        <div class="p-2">--%>
<%--                                                                            <h6 class="mb-0">5 star</h6>--%>
<%--                                                                        </div>--%>
<%--                                                                    </div>--%>
<%--                                                                    <div class="col">--%>
<%--                                                                        <div class="p-2">--%>
<%--                                                                            <div--%>
<%--                                                                                    class="progress animated-progress progress-sm">--%>
<%--                                                                                <div class="progress-bar bg-success"--%>
<%--                                                                                     role="progressbar"--%>
<%--                                                                                     style="width: 50.16%"--%>
<%--                                                                                     aria-valuenow="50.16"--%>
<%--                                                                                     aria-valuemin="0"--%>
<%--                                                                                     aria-valuemax="100"></div>--%>
<%--                                                                            </div>--%>
<%--                                                                        </div>--%>
<%--                                                                    </div>--%>
<%--                                                                    <div class="col-auto">--%>
<%--                                                                        <div class="p-2">--%>
<%--                                                                            <h6 class="mb-0 text-muted">2758</h6>--%>
<%--                                                                        </div>--%>
<%--                                                                    </div>--%>
<%--                                                                </div>--%>
<%--                                                                <!-- end row -->--%>

<%--                                                                <div class="row align-items-center g-2">--%>
<%--                                                                    <div class="col-auto">--%>
<%--                                                                        <div class="p-2">--%>
<%--                                                                            <h6 class="mb-0">4 star</h6>--%>
<%--                                                                        </div>--%>
<%--                                                                    </div>--%>
<%--                                                                    <div class="col">--%>
<%--                                                                        <div class="p-2">--%>
<%--                                                                            <div--%>
<%--                                                                                    class="progress animated-progress progress-sm">--%>
<%--                                                                                <div class="progress-bar bg-success"--%>
<%--                                                                                     role="progressbar"--%>
<%--                                                                                     style="width: 19.32%"--%>
<%--                                                                                     aria-valuenow="19.32"--%>
<%--                                                                                     aria-valuemin="0"--%>
<%--                                                                                     aria-valuemax="100"></div>--%>
<%--                                                                            </div>--%>
<%--                                                                        </div>--%>
<%--                                                                    </div>--%>
<%--                                                                    <div class="col-auto">--%>
<%--                                                                        <div class="p-2">--%>
<%--                                                                            <h6 class="mb-0 text-muted">1063</h6>--%>
<%--                                                                        </div>--%>
<%--                                                                    </div>--%>
<%--                                                                </div>--%>
<%--                                                                <!-- end row -->--%>

<%--                                                                <div class="row align-items-center g-2">--%>
<%--                                                                    <div class="col-auto">--%>
<%--                                                                        <div class="p-2">--%>
<%--                                                                            <h6 class="mb-0">3 star</h6>--%>
<%--                                                                        </div>--%>
<%--                                                                    </div>--%>
<%--                                                                    <div class="col">--%>
<%--                                                                        <div class="p-2">--%>
<%--                                                                            <div--%>
<%--                                                                                    class="progress animated-progress progress-sm">--%>
<%--                                                                                <div class="progress-bar bg-success"--%>
<%--                                                                                     role="progressbar"--%>
<%--                                                                                     style="width: 18.12%"--%>
<%--                                                                                     aria-valuenow="18.12"--%>
<%--                                                                                     aria-valuemin="0"--%>
<%--                                                                                     aria-valuemax="100"></div>--%>
<%--                                                                            </div>--%>
<%--                                                                        </div>--%>
<%--                                                                    </div>--%>
<%--                                                                    <div class="col-auto">--%>
<%--                                                                        <div class="p-2">--%>
<%--                                                                            <h6 class="mb-0 text-muted">997</h6>--%>
<%--                                                                        </div>--%>
<%--                                                                    </div>--%>
<%--                                                                </div>--%>
<%--                                                                <!-- end row -->--%>

<%--                                                                <div class="row align-items-center g-2">--%>
<%--                                                                    <div class="col-auto">--%>
<%--                                                                        <div class="p-2">--%>
<%--                                                                            <h6 class="mb-0">2 star</h6>--%>
<%--                                                                        </div>--%>
<%--                                                                    </div>--%>
<%--                                                                    <div class="col">--%>
<%--                                                                        <div class="p-2">--%>
<%--                                                                            <div--%>
<%--                                                                                    class="progress animated-progress progress-sm">--%>
<%--                                                                                <div class="progress-bar bg-warning"--%>
<%--                                                                                     role="progressbar"--%>
<%--                                                                                     style="width: 7.42%"--%>
<%--                                                                                     aria-valuenow="7.42"--%>
<%--                                                                                     aria-valuemin="0"--%>
<%--                                                                                     aria-valuemax="100"></div>--%>
<%--                                                                            </div>--%>
<%--                                                                        </div>--%>
<%--                                                                    </div>--%>

<%--                                                                    <div class="col-auto">--%>
<%--                                                                        <div class="p-2">--%>
<%--                                                                            <h6 class="mb-0 text-muted">408</h6>--%>
<%--                                                                        </div>--%>
<%--                                                                    </div>--%>
<%--                                                                </div>--%>
<%--                                                                <!-- end row -->--%>

<%--                                                                <div class="row align-items-center g-2">--%>
<%--                                                                    <div class="col-auto">--%>
<%--                                                                        <div class="p-2">--%>
<%--                                                                            <h6 class="mb-0">1 star</h6>--%>
<%--                                                                        </div>--%>
<%--                                                                    </div>--%>
<%--                                                                    <div class="col">--%>
<%--                                                                        <div class="p-2">--%>
<%--                                                                            <div--%>
<%--                                                                                    class="progress animated-progress progress-sm">--%>
<%--                                                                                <div class="progress-bar bg-danger"--%>
<%--                                                                                     role="progressbar"--%>
<%--                                                                                     style="width: 4.98%"--%>
<%--                                                                                     aria-valuenow="4.98"--%>
<%--                                                                                     aria-valuemin="0"--%>
<%--                                                                                     aria-valuemax="100"></div>--%>
<%--                                                                            </div>--%>
<%--                                                                        </div>--%>
<%--                                                                    </div>--%>
<%--                                                                    <div class="col-auto">--%>
<%--                                                                        <div class="p-2">--%>
<%--                                                                            <h6 class="mb-0 text-muted">274</h6>--%>
<%--                                                                        </div>--%>
<%--                                                                    </div>--%>
<%--                                                                </div>--%>
<%--                                                                <!-- end row -->--%>
<%--                                                            </div>--%>
<%--                                                        </div>--%>
<%--                                                    </div>--%>
<%--                                                    <!-- end col -->--%>

<%--                                                    <div class="col-lg-8">--%>
<%--                                                        <div class="ps-lg-4">--%>
<%--                                                            <div class="d-flex flex-wrap align-items-start gap-3">--%>
<%--                                                                <h5 class="fs-14">Reviews: </h5>--%>
<%--                                                            </div>--%>

<%--                                                            <div class="me-lg-n3 pe-lg-4" data-simplebar--%>
<%--                                                                 style="max-height: 225px;">--%>
<%--                                                                <ul class="list-unstyled mb-0">--%>
<%--                                                                    <li class="py-2">--%>
<%--                                                                        <div--%>
<%--                                                                                class="border border-dashed rounded p-3">--%>
<%--                                                                            <div--%>
<%--                                                                                    class="d-flex align-items-start mb-3">--%>
<%--                                                                                <div class="hstack gap-3">--%>
<%--                                                                                    <div--%>
<%--                                                                                            class="badge rounded-pill bg-success mb-0">--%>
<%--                                                                                        <i class="mdi mdi-star"></i>--%>
<%--                                                                                        4.2--%>
<%--                                                                                    </div>--%>
<%--                                                                                    <div class="vr"></div>--%>
<%--                                                                                    <div class="flex-grow-1">--%>
<%--                                                                                        <p class="text-muted mb-0">--%>
<%--                                                                                            Superb sweatshirt. I--%>
<%--                                                                                            loved it. It is for--%>
<%--                                                                                            winter.</p>--%>
<%--                                                                                    </div>--%>
<%--                                                                                </div>--%>
<%--                                                                            </div>--%>

<%--                                                                            <div--%>
<%--                                                                                    class="d-flex flex-grow-1 gap-2 mb-3">--%>
<%--                                                                                <a href="#" class="d-block">--%>
<%--                                                                                    <img src="assets/images/small/img-12.jpg"--%>
<%--                                                                                         alt=""--%>
<%--                                                                                         class="avatar-sm rounded object-cover">--%>
<%--                                                                                </a>--%>
<%--                                                                                <a href="#" class="d-block">--%>
<%--                                                                                    <img src="assets/images/small/img-11.jpg"--%>
<%--                                                                                         alt=""--%>
<%--                                                                                         class="avatar-sm rounded object-cover">--%>
<%--                                                                                </a>--%>
<%--                                                                                <a href="#" class="d-block">--%>
<%--                                                                                    <img src="assets/images/small/img-10.jpg"--%>
<%--                                                                                         alt=""--%>
<%--                                                                                         class="avatar-sm rounded object-cover">--%>
<%--                                                                                </a>--%>
<%--                                                                            </div>--%>

<%--                                                                            <div class="d-flex align-items-end">--%>
<%--                                                                                <div class="flex-grow-1">--%>
<%--                                                                                    <h5 class="fs-14 mb-0">Henry--%>
<%--                                                                                    </h5>--%>
<%--                                                                                </div>--%>

<%--                                                                                <div class="flex-shrink-0">--%>
<%--                                                                                    <p--%>
<%--                                                                                            class="text-muted fs-13 mb-0">--%>
<%--                                                                                        12 Jul, 21</p>--%>
<%--                                                                                </div>--%>
<%--                                                                            </div>--%>
<%--                                                                        </div>--%>
<%--                                                                    </li>--%>
<%--                                                                    <li class="py-2">--%>
<%--                                                                        <div--%>
<%--                                                                                class="border border-dashed rounded p-3">--%>
<%--                                                                            <div--%>
<%--                                                                                    class="d-flex align-items-start mb-3">--%>
<%--                                                                                <div class="hstack gap-3">--%>
<%--                                                                                    <div--%>
<%--                                                                                            class="badge rounded-pill bg-success mb-0">--%>
<%--                                                                                        <i class="mdi mdi-star"></i>--%>
<%--                                                                                        4.0--%>
<%--                                                                                    </div>--%>
<%--                                                                                    <div class="vr"></div>--%>
<%--                                                                                    <div class="flex-grow-1">--%>
<%--                                                                                        <p class="text-muted mb-0">--%>
<%--                                                                                            Great at this price,--%>
<%--                                                                                            Product quality and look--%>
<%--                                                                                            is awesome.</p>--%>
<%--                                                                                    </div>--%>
<%--                                                                                </div>--%>
<%--                                                                            </div>--%>
<%--                                                                            <div class="d-flex align-items-end">--%>
<%--                                                                                <div class="flex-grow-1">--%>
<%--                                                                                    <h5 class="fs-14 mb-0">Nancy--%>
<%--                                                                                    </h5>--%>
<%--                                                                                </div>--%>

<%--                                                                                <div class="flex-shrink-0">--%>
<%--                                                                                    <p--%>
<%--                                                                                            class="text-muted fs-13 mb-0">--%>
<%--                                                                                        06 Jul, 21</p>--%>
<%--                                                                                </div>--%>
<%--                                                                            </div>--%>
<%--                                                                        </div>--%>
<%--                                                                    </li>--%>

<%--                                                                    <li class="py-2">--%>
<%--                                                                        <div--%>
<%--                                                                                class="border border-dashed rounded p-3">--%>
<%--                                                                            <div--%>
<%--                                                                                    class="d-flex align-items-start mb-3">--%>
<%--                                                                                <div class="hstack gap-3">--%>
<%--                                                                                    <div--%>
<%--                                                                                            class="badge rounded-pill bg-success mb-0">--%>
<%--                                                                                        <i class="mdi mdi-star"></i>--%>
<%--                                                                                        4.2--%>
<%--                                                                                    </div>--%>
<%--                                                                                    <div class="vr"></div>--%>
<%--                                                                                    <div class="flex-grow-1">--%>
<%--                                                                                        <p class="text-muted mb-0">--%>
<%--                                                                                            Good product. I am so--%>
<%--                                                                                            happy.</p>--%>
<%--                                                                                    </div>--%>
<%--                                                                                </div>--%>
<%--                                                                            </div>--%>
<%--                                                                            <div class="d-flex align-items-end">--%>
<%--                                                                                <div class="flex-grow-1">--%>
<%--                                                                                    <h5 class="fs-14 mb-0">Joseph--%>
<%--                                                                                    </h5>--%>
<%--                                                                                </div>--%>

<%--                                                                                <div class="flex-shrink-0">--%>
<%--                                                                                    <p--%>
<%--                                                                                            class="text-muted fs-13 mb-0">--%>
<%--                                                                                        06 Jul, 21</p>--%>
<%--                                                                                </div>--%>
<%--                                                                            </div>--%>
<%--                                                                        </div>--%>
<%--                                                                    </li>--%>

<%--                                                                    <li class="py-2">--%>
<%--                                                                        <div--%>
<%--                                                                                class="border border-dashed rounded p-3">--%>
<%--                                                                            <div--%>
<%--                                                                                    class="d-flex align-items-start mb-3">--%>
<%--                                                                                <div class="hstack gap-3">--%>
<%--                                                                                    <div--%>
<%--                                                                                            class="badge rounded-pill bg-success mb-0">--%>
<%--                                                                                        <i class="mdi mdi-star"></i>--%>
<%--                                                                                        4.1--%>
<%--                                                                                    </div>--%>
<%--                                                                                    <div class="vr"></div>--%>
<%--                                                                                    <div class="flex-grow-1">--%>
<%--                                                                                        <p class="text-muted mb-0">--%>
<%--                                                                                            Nice Product, Good--%>
<%--                                                                                            Quality.</p>--%>
<%--                                                                                    </div>--%>
<%--                                                                                </div>--%>
<%--                                                                            </div>--%>
<%--                                                                            <div class="d-flex align-items-end">--%>
<%--                                                                                <div class="flex-grow-1">--%>
<%--                                                                                    <h5 class="fs-14 mb-0">Jimmy--%>
<%--                                                                                    </h5>--%>
<%--                                                                                </div>--%>

<%--                                                                                <div class="flex-shrink-0">--%>
<%--                                                                                    <p--%>
<%--                                                                                            class="text-muted fs-13 mb-0">--%>
<%--                                                                                        24 Jun, 21</p>--%>
<%--                                                                                </div>--%>
<%--                                                                            </div>--%>
<%--                                                                        </div>--%>
<%--                                                                    </li>--%>

<%--                                                                </ul>--%>
<%--                                                            </div>--%>
<%--                                                        </div>--%>
<%--                                                    </div>--%>
<%--                                                    <!-- end col -->--%>
<%--                                                </div>--%>
<%--                                                <!-- end Ratings & Reviews -->--%>
<%--                                            </div>--%>
                                            <!-- end card body -->
                                        </div>
                                    </div>
                                    <!-- end col -->
                                </div>
                                <!-- end row -->
                            </div>
                            <!-- end card body -->
                        </div>
                        <!-- end card -->
                    </div>
                    <!-- end col -->
                </div>
                <!-- end row -->

            </div>
            <!-- container-fluid -->
        </div>
        <!-- End Page-content -->

        <footer class="footer">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-sm-6">
                        <script>document.write(new Date().getFullYear())</script> © Velzon.
                    </div>
                    <div class="col-sm-6">
                        <div class="text-sm-end d-none d-sm-block">
                            Design & Develop by Themesbrand
                        </div>
                    </div>
                </div>
            </div>
        </footer>
    </div>
    <!-- end main content-->

</div>
<!-- END layout-wrapper -->



<!--start back-to-top-->
<button onclick="topFunction()" class="btn btn-danger btn-icon" id="back-to-top">
    <i class="ri-arrow-up-line"></i>
</button>
<!--end back-to-top-->

<!--preloader-->
<div id="preloader">
    <div id="status">
        <div class="spinner-border text-primary avatar-sm" role="status">
            <span class="visually-hidden">Loading...</span>
        </div>
    </div>
</div>

<div class="customizer-setting d-none d-md-block">
    <div class="btn-info btn-rounded shadow-lg btn btn-icon btn-lg p-2" data-bs-toggle="offcanvas"
         data-bs-target="#theme-settings-offcanvas" aria-controls="theme-settings-offcanvas">
        <i class='mdi mdi-spin mdi-cog-outline fs-22'></i>
    </div>
</div>

<!-- Theme Settings -->
<div class="offcanvas offcanvas-end border-0" tabindex="-1" id="theme-settings-offcanvas">
    <div class="d-flex align-items-center bg-primary bg-gradient p-3 offcanvas-header">
        <h5 class="m-0 me-2 text-white">Theme Customizer</h5>

        <button type="button" class="btn-close btn-close-white ms-auto" id="customizerclose-btn"
                data-bs-dismiss="offcanvas" aria-label="Close"></button>
    </div>
    <div class="offcanvas-body p-0">
        <div data-simplebar class="h-100">
            <div class="p-4">
                <h6 class="mb-0 fw-semibold text-uppercase">Layout</h6>
                <p class="text-muted">Choose your layout</p>

                <div class="row">
                    <div class="col-4">
                        <div class="form-check card-radio">
                            <input id="customizer-layout01" name="data-layout" type="radio" value="vertical"
                                   class="form-check-input">
                            <label class="form-check-label p-0 avatar-md w-100" for="customizer-layout01">
                                    <span class="d-flex gap-1 h-100">
                                        <span class="flex-shrink-0">
                                            <span class="bg-light d-flex h-100 flex-column gap-1 p-1">
                                                <span class="d-block p-1 px-2 bg-soft-primary rounded mb-2"></span>
                                                <span class="d-block p-1 px-2 pb-0 bg-soft-primary"></span>
                                                <span class="d-block p-1 px-2 pb-0 bg-soft-primary"></span>
                                                <span class="d-block p-1 px-2 pb-0 bg-soft-primary"></span>
                                            </span>
                                        </span>
                                        <span class="flex-grow-1">
                                            <span class="d-flex h-100 flex-column">
                                                <span class="bg-light d-block p-1"></span>
                                                <span class="bg-light d-block p-1 mt-auto"></span>
                                            </span>
                                        </span>
                                    </span>
                            </label>
                        </div>
                        <h5 class="fs-13 text-center mt-2">Vertical</h5>
                    </div>
                    <div class="col-4">
                        <div class="form-check card-radio">
                            <input id="customizer-layout02" name="data-layout" type="radio" value="horizontal"
                                   class="form-check-input">
                            <label class="form-check-label p-0 avatar-md w-100" for="customizer-layout02">
                                    <span class="d-flex h-100 flex-column gap-1">
                                        <span class="bg-light d-flex p-1 gap-1 align-items-center">
                                            <span class="d-block p-1 bg-soft-primary rounded me-1"></span>
                                            <span class="d-block p-1 pb-0 px-2 bg-soft-primary ms-auto"></span>
                                            <span class="d-block p-1 pb-0 px-2 bg-soft-primary"></span>
                                        </span>
                                        <span class="bg-light d-block p-1"></span>
                                        <span class="bg-light d-block p-1 mt-auto"></span>
                                    </span>
                            </label>
                        </div>
                        <h5 class="fs-13 text-center mt-2">Horizontal</h5>
                    </div>
                    <div class="col-4">
                        <div class="form-check card-radio">
                            <input id="customizer-layout03" name="data-layout" type="radio" value="twocolumn"
                                   class="form-check-input">
                            <label class="form-check-label p-0 avatar-md w-100" for="customizer-layout03">
                                    <span class="d-flex gap-1 h-100">
                                        <span class="flex-shrink-0">
                                            <span class="bg-light d-flex h-100 flex-column gap-1">
                                                <span class="d-block p-1 bg-soft-primary mb-2"></span>
                                                <span class="d-block p-1 pb-0 bg-soft-primary"></span>
                                                <span class="d-block p-1 pb-0 bg-soft-primary"></span>
                                                <span class="d-block p-1 pb-0 bg-soft-primary"></span>
                                            </span>
                                        </span>
                                        <span class="flex-shrink-0">
                                            <span class="bg-light d-flex h-100 flex-column gap-1 p-1">
                                                <span class="d-block p-1 px-2 pb-0 bg-soft-primary"></span>
                                                <span class="d-block p-1 px-2 pb-0 bg-soft-primary"></span>
                                                <span class="d-block p-1 px-2 pb-0 bg-soft-primary"></span>
                                                <span class="d-block p-1 px-2 pb-0 bg-soft-primary"></span>
                                            </span>
                                        </span>
                                        <span class="flex-grow-1">
                                            <span class="d-flex h-100 flex-column">
                                                <span class="bg-light d-block p-1"></span>
                                                <span class="bg-light d-block p-1 mt-auto"></span>
                                            </span>
                                        </span>
                                    </span>
                            </label>
                        </div>
                        <h5 class="fs-13 text-center mt-2">Two Column</h5>
                    </div>
                    <!-- end col -->
                </div>

                <h6 class="mt-4 mb-0 fw-semibold text-uppercase">Color Scheme</h6>
                <p class="text-muted">Choose Light or Dark Scheme.</p>

                <div class="colorscheme-cardradio">
                    <div class="row">
                        <div class="col-4">
                            <div class="form-check card-radio">
                                <input class="form-check-input" type="radio" name="data-layout-mode"
                                       id="layout-mode-light" value="light">
                                <label class="form-check-label p-0 avatar-md w-100" for="layout-mode-light">
                                        <span class="d-flex gap-1 h-100">
                                            <span class="flex-shrink-0">
                                                <span class="bg-light d-flex h-100 flex-column gap-1 p-1">
                                                    <span class="d-block p-1 px-2 bg-soft-primary rounded mb-2"></span>
                                                    <span class="d-block p-1 px-2 pb-0 bg-soft-primary"></span>
                                                    <span class="d-block p-1 px-2 pb-0 bg-soft-primary"></span>
                                                    <span class="d-block p-1 px-2 pb-0 bg-soft-primary"></span>
                                                </span>
                                            </span>
                                            <span class="flex-grow-1">
                                                <span class="d-flex h-100 flex-column">
                                                    <span class="bg-light d-block p-1"></span>
                                                    <span class="bg-light d-block p-1 mt-auto"></span>
                                                </span>
                                            </span>
                                        </span>
                                </label>
                            </div>
                            <h5 class="fs-13 text-center mt-2">Light</h5>
                        </div>

                        <div class="col-4">
                            <div class="form-check card-radio dark">
                                <input class="form-check-input" type="radio" name="data-layout-mode"
                                       id="layout-mode-dark" value="dark">
                                <label class="form-check-label p-0 avatar-md w-100 bg-dark" for="layout-mode-dark">
                                        <span class="d-flex gap-1 h-100">
                                            <span class="flex-shrink-0">
                                                <span class="bg-soft-light d-flex h-100 flex-column gap-1 p-1">
                                                    <span class="d-block p-1 px-2 bg-soft-light rounded mb-2"></span>
                                                    <span class="d-block p-1 px-2 pb-0 bg-soft-light"></span>
                                                    <span class="d-block p-1 px-2 pb-0 bg-soft-light"></span>
                                                    <span class="d-block p-1 px-2 pb-0 bg-soft-light"></span>
                                                </span>
                                            </span>
                                            <span class="flex-grow-1">
                                                <span class="d-flex h-100 flex-column">
                                                    <span class="bg-soft-light d-block p-1"></span>
                                                    <span class="bg-soft-light d-block p-1 mt-auto"></span>
                                                </span>
                                            </span>
                                        </span>
                                </label>
                            </div>
                            <h5 class="fs-13 text-center mt-2">Dark</h5>
                        </div>
                    </div>
                </div>

                <div id="layout-width">
                    <h6 class="mt-4 mb-0 fw-semibold text-uppercase">Layout Width</h6>
                    <p class="text-muted">Choose Fluid or Boxed layout.</p>

                    <div class="row">
                        <div class="col-4">
                            <div class="form-check card-radio">
                                <input class="form-check-input" type="radio" name="data-layout-width"
                                       id="layout-width-fluid" value="fluid">
                                <label class="form-check-label p-0 avatar-md w-100" for="layout-width-fluid">
                                        <span class="d-flex gap-1 h-100">
                                            <span class="flex-shrink-0">
                                                <span class="bg-light d-flex h-100 flex-column gap-1 p-1">
                                                    <span class="d-block p-1 px-2 bg-soft-primary rounded mb-2"></span>
                                                    <span class="d-block p-1 px-2 pb-0 bg-soft-primary"></span>
                                                    <span class="d-block p-1 px-2 pb-0 bg-soft-primary"></span>
                                                    <span class="d-block p-1 px-2 pb-0 bg-soft-primary"></span>
                                                </span>
                                            </span>
                                            <span class="flex-grow-1">
                                                <span class="d-flex h-100 flex-column">
                                                    <span class="bg-light d-block p-1"></span>
                                                    <span class="bg-light d-block p-1 mt-auto"></span>
                                                </span>
                                            </span>
                                        </span>
                                </label>
                            </div>
                            <h5 class="fs-13 text-center mt-2">Fluid</h5>
                        </div>
                        <div class="col-4">
                            <div class="form-check card-radio">
                                <input class="form-check-input" type="radio" name="data-layout-width"
                                       id="layout-width-boxed" value="boxed">
                                <label class="form-check-label p-0 avatar-md w-100 px-2" for="layout-width-boxed">
                                        <span class="d-flex gap-1 h-100 border-start border-end">
                                            <span class="flex-shrink-0">
                                                <span class="bg-light d-flex h-100 flex-column gap-1 p-1">
                                                    <span class="d-block p-1 px-2 bg-soft-primary rounded mb-2"></span>
                                                    <span class="d-block p-1 px-2 pb-0 bg-soft-primary"></span>
                                                    <span class="d-block p-1 px-2 pb-0 bg-soft-primary"></span>
                                                    <span class="d-block p-1 px-2 pb-0 bg-soft-primary"></span>
                                                </span>
                                            </span>
                                            <span class="flex-grow-1">
                                                <span class="d-flex h-100 flex-column">
                                                    <span class="bg-light d-block p-1"></span>
                                                    <span class="bg-light d-block p-1 mt-auto"></span>
                                                </span>
                                            </span>
                                        </span>
                                </label>
                            </div>
                            <h5 class="fs-13 text-center mt-2">Boxed</h5>
                        </div>
                    </div>
                </div>

                <div id="layout-position">
                    <h6 class="mt-4 mb-0 fw-semibold text-uppercase">Layout Position</h6>
                    <p class="text-muted">Choose Fixed or Scrollable Layout Position.</p>

                    <div class="btn-group radio" role="group">
                        <input type="radio" class="btn-check" name="data-layout-position" id="layout-position-fixed"
                               value="fixed">
                        <label class="btn btn-light w-sm" for="layout-position-fixed">Fixed</label>

                        <input type="radio" class="btn-check" name="data-layout-position"
                               id="layout-position-scrollable" value="scrollable">
                        <label class="btn btn-light w-sm ms-0" for="layout-position-scrollable">Scrollable</label>
                    </div>
                </div>
                <h6 class="mt-4 mb-0 fw-semibold text-uppercase">Topbar Color</h6>
                <p class="text-muted">Choose Light or Dark Topbar Color.</p>

                <div class="row">
                    <div class="col-4">
                        <div class="form-check card-radio">
                            <input class="form-check-input" type="radio" name="data-topbar" id="topbar-color-light"
                                   value="light">
                            <label class="form-check-label p-0 avatar-md w-100" for="topbar-color-light">
                                    <span class="d-flex gap-1 h-100">
                                        <span class="flex-shrink-0">
                                            <span class="bg-light d-flex h-100 flex-column gap-1 p-1">
                                                <span class="d-block p-1 px-2 bg-soft-primary rounded mb-2"></span>
                                                <span class="d-block p-1 px-2 pb-0 bg-soft-primary"></span>
                                                <span class="d-block p-1 px-2 pb-0 bg-soft-primary"></span>
                                                <span class="d-block p-1 px-2 pb-0 bg-soft-primary"></span>
                                            </span>
                                        </span>
                                        <span class="flex-grow-1">
                                            <span class="d-flex h-100 flex-column">
                                                <span class="bg-light d-block p-1"></span>
                                                <span class="bg-light d-block p-1 mt-auto"></span>
                                            </span>
                                        </span>
                                    </span>
                            </label>
                        </div>
                        <h5 class="fs-13 text-center mt-2">Light</h5>
                    </div>
                    <div class="col-4">
                        <div class="form-check card-radio">
                            <input class="form-check-input" type="radio" name="data-topbar" id="topbar-color-dark"
                                   value="dark">
                            <label class="form-check-label p-0 avatar-md w-100" for="topbar-color-dark">
                                    <span class="d-flex gap-1 h-100">
                                        <span class="flex-shrink-0">
                                            <span class="bg-light d-flex h-100 flex-column gap-1 p-1">
                                                <span class="d-block p-1 px-2 bg-soft-primary rounded mb-2"></span>
                                                <span class="d-block p-1 px-2 pb-0 bg-soft-primary"></span>
                                                <span class="d-block p-1 px-2 pb-0 bg-soft-primary"></span>
                                                <span class="d-block p-1 px-2 pb-0 bg-soft-primary"></span>
                                            </span>
                                        </span>
                                        <span class="flex-grow-1">
                                            <span class="d-flex h-100 flex-column">
                                                <span class="bg-primary d-block p-1"></span>
                                                <span class="bg-light d-block p-1 mt-auto"></span>
                                            </span>
                                        </span>
                                    </span>
                            </label>
                        </div>
                        <h5 class="fs-13 text-center mt-2">Dark</h5>
                    </div>
                </div>

                <div id="sidebar-size">
                    <h6 class="mt-4 mb-0 fw-semibold text-uppercase">Sidebar Size</h6>
                    <p class="text-muted">Choose a size of Sidebar.</p>

                    <div class="row">
                        <div class="col-4">
                            <div class="form-check sidebar-setting card-radio">
                                <input class="form-check-input" type="radio" name="data-sidebar-size"
                                       id="sidebar-size-default" value="lg">
                                <label class="form-check-label p-0 avatar-md w-100" for="sidebar-size-default">
                                        <span class="d-flex gap-1 h-100">
                                            <span class="flex-shrink-0">
                                                <span class="bg-light d-flex h-100 flex-column gap-1 p-1">
                                                    <span class="d-block p-1 px-2 bg-soft-primary rounded mb-2"></span>
                                                    <span class="d-block p-1 px-2 pb-0 bg-soft-primary"></span>
                                                    <span class="d-block p-1 px-2 pb-0 bg-soft-primary"></span>
                                                    <span class="d-block p-1 px-2 pb-0 bg-soft-primary"></span>
                                                </span>
                                            </span>
                                            <span class="flex-grow-1">
                                                <span class="d-flex h-100 flex-column">
                                                    <span class="bg-light d-block p-1"></span>
                                                    <span class="bg-light d-block p-1 mt-auto"></span>
                                                </span>
                                            </span>
                                        </span>
                                </label>
                            </div>
                            <h5 class="fs-13 text-center mt-2">Default</h5>
                        </div>

                        <div class="col-4">
                            <div class="form-check sidebar-setting card-radio">
                                <input class="form-check-input" type="radio" name="data-sidebar-size"
                                       id="sidebar-size-compact" value="md">
                                <label class="form-check-label p-0 avatar-md w-100" for="sidebar-size-compact">
                                        <span class="d-flex gap-1 h-100">
                                            <span class="flex-shrink-0">
                                                <span class="bg-light d-flex h-100 flex-column gap-1 p-1">
                                                    <span class="d-block p-1 bg-soft-primary rounded mb-2"></span>
                                                    <span class="d-block p-1 pb-0 bg-soft-primary"></span>
                                                    <span class="d-block p-1 pb-0 bg-soft-primary"></span>
                                                    <span class="d-block p-1 pb-0 bg-soft-primary"></span>
                                                </span>
                                            </span>
                                            <span class="flex-grow-1">
                                                <span class="d-flex h-100 flex-column">
                                                    <span class="bg-light d-block p-1"></span>
                                                    <span class="bg-light d-block p-1 mt-auto"></span>
                                                </span>
                                            </span>
                                        </span>
                                </label>
                            </div>
                            <h5 class="fs-13 text-center mt-2">Compact</h5>
                        </div>

                        <div class="col-4">
                            <div class="form-check sidebar-setting card-radio">
                                <input class="form-check-input" type="radio" name="data-sidebar-size"
                                       id="sidebar-size-small" value="sm">
                                <label class="form-check-label p-0 avatar-md w-100" for="sidebar-size-small">
                                        <span class="d-flex gap-1 h-100">
                                            <span class="flex-shrink-0">
                                                <span class="bg-light d-flex h-100 flex-column gap-1">
                                                    <span class="d-block p-1 bg-soft-primary mb-2"></span>
                                                    <span class="d-block p-1 pb-0 bg-soft-primary"></span>
                                                    <span class="d-block p-1 pb-0 bg-soft-primary"></span>
                                                    <span class="d-block p-1 pb-0 bg-soft-primary"></span>
                                                </span>
                                            </span>
                                            <span class="flex-grow-1">
                                                <span class="d-flex h-100 flex-column">
                                                    <span class="bg-light d-block p-1"></span>
                                                    <span class="bg-light d-block p-1 mt-auto"></span>
                                                </span>
                                            </span>
                                        </span>
                                </label>
                            </div>
                            <h5 class="fs-13 text-center mt-2">Small (Icon View)</h5>
                        </div>

                        <div class="col-4">
                            <div class="form-check sidebar-setting card-radio">
                                <input class="form-check-input" type="radio" name="data-sidebar-size"
                                       id="sidebar-size-small-hover" value="sm-hover">
                                <label class="form-check-label p-0 avatar-md w-100" for="sidebar-size-small-hover">
                                        <span class="d-flex gap-1 h-100">
                                            <span class="flex-shrink-0">
                                                <span class="bg-light d-flex h-100 flex-column gap-1">
                                                    <span class="d-block p-1 bg-soft-primary mb-2"></span>
                                                    <span class="d-block p-1 pb-0 bg-soft-primary"></span>
                                                    <span class="d-block p-1 pb-0 bg-soft-primary"></span>
                                                    <span class="d-block p-1 pb-0 bg-soft-primary"></span>
                                                </span>
                                            </span>
                                            <span class="flex-grow-1">
                                                <span class="d-flex h-100 flex-column">
                                                    <span class="bg-light d-block p-1"></span>
                                                    <span class="bg-light d-block p-1 mt-auto"></span>
                                                </span>
                                            </span>
                                        </span>
                                </label>
                            </div>
                            <h5 class="fs-13 text-center mt-2">Small Hover View</h5>
                        </div>
                    </div>
                </div>

                <div id="sidebar-view">
                    <h6 class="mt-4 mb-0 fw-semibold text-uppercase">Sidebar View</h6>
                    <p class="text-muted">Choose Default or Detached Sidebar view.</p>

                    <div class="row">
                        <div class="col-4">
                            <div class="form-check sidebar-setting card-radio">
                                <input class="form-check-input" type="radio" name="data-layout-style"
                                       id="sidebar-view-default" value="default">
                                <label class="form-check-label p-0 avatar-md w-100" for="sidebar-view-default">
                                        <span class="d-flex gap-1 h-100">
                                            <span class="flex-shrink-0">
                                                <span class="bg-light d-flex h-100 flex-column gap-1 p-1">
                                                    <span class="d-block p-1 px-2 bg-soft-primary rounded mb-2"></span>
                                                    <span class="d-block p-1 px-2 pb-0 bg-soft-primary"></span>
                                                    <span class="d-block p-1 px-2 pb-0 bg-soft-primary"></span>
                                                    <span class="d-block p-1 px-2 pb-0 bg-soft-primary"></span>
                                                </span>
                                            </span>
                                            <span class="flex-grow-1">
                                                <span class="d-flex h-100 flex-column">
                                                    <span class="bg-light d-block p-1"></span>
                                                    <span class="bg-light d-block p-1 mt-auto"></span>
                                                </span>
                                            </span>
                                        </span>
                                </label>
                            </div>
                            <h5 class="fs-13 text-center mt-2">Default</h5>
                        </div>
                        <div class="col-4">
                            <div class="form-check sidebar-setting card-radio">
                                <input class="form-check-input" type="radio" name="data-layout-style"
                                       id="sidebar-view-detached" value="detached">
                                <label class="form-check-label p-0 avatar-md w-100" for="sidebar-view-detached">
                                        <span class="d-flex h-100 flex-column">
                                            <span class="bg-light d-flex p-1 gap-1 align-items-center px-2">
                                                <span class="d-block p-1 bg-soft-primary rounded me-1"></span>
                                                <span class="d-block p-1 pb-0 px-2 bg-soft-primary ms-auto"></span>
                                                <span class="d-block p-1 pb-0 px-2 bg-soft-primary"></span>
                                            </span>
                                            <span class="d-flex gap-1 h-100 p-1 px-2">
                                                <span class="flex-shrink-0">
                                                    <span class="bg-light d-flex h-100 flex-column gap-1 p-1">
                                                        <span class="d-block p-1 px-2 pb-0 bg-soft-primary"></span>
                                                        <span class="d-block p-1 px-2 pb-0 bg-soft-primary"></span>
                                                        <span class="d-block p-1 px-2 pb-0 bg-soft-primary"></span>
                                                    </span>
                                                </span>
                                            </span>
                                            <span class="bg-light d-block p-1 mt-auto px-2"></span>
                                        </span>
                                </label>
                            </div>
                            <h5 class="fs-13 text-center mt-2">Detached</h5>
                        </div>
                    </div>
                </div>
                <div id="sidebar-color">
                    <h6 class="mt-4 mb-0 fw-semibold text-uppercase">Sidebar Color</h6>
                    <p class="text-muted">Choose a color of Sidebar.</p>

                    <div class="row">
                        <div class="col-4">
                            <div class="form-check sidebar-setting card-radio" data-bs-toggle="collapse"
                                 data-bs-target="#collapseBgGradient.show">
                                <input class="form-check-input" type="radio" name="data-sidebar"
                                       id="sidebar-color-light" value="light">
                                <label class="form-check-label p-0 avatar-md w-100" for="sidebar-color-light">
                                        <span class="d-flex gap-1 h-100">
                                            <span class="flex-shrink-0">
                                                <span class="bg-white border-end d-flex h-100 flex-column gap-1 p-1">
                                                    <span class="d-block p-1 px-2 bg-soft-primary rounded mb-2"></span>
                                                    <span class="d-block p-1 px-2 pb-0 bg-soft-primary"></span>
                                                    <span class="d-block p-1 px-2 pb-0 bg-soft-primary"></span>
                                                    <span class="d-block p-1 px-2 pb-0 bg-soft-primary"></span>
                                                </span>
                                            </span>
                                            <span class="flex-grow-1">
                                                <span class="d-flex h-100 flex-column">
                                                    <span class="bg-light d-block p-1"></span>
                                                    <span class="bg-light d-block p-1 mt-auto"></span>
                                                </span>
                                            </span>
                                        </span>
                                </label>
                            </div>
                            <h5 class="fs-13 text-center mt-2">Light</h5>
                        </div>
                        <div class="col-4">
                            <div class="form-check sidebar-setting card-radio" data-bs-toggle="collapse"
                                 data-bs-target="#collapseBgGradient.show">
                                <input class="form-check-input" type="radio" name="data-sidebar"
                                       id="sidebar-color-dark" value="dark">
                                <label class="form-check-label p-0 avatar-md w-100" for="sidebar-color-dark">
                                        <span class="d-flex gap-1 h-100">
                                            <span class="flex-shrink-0">
                                                <span class="bg-primary d-flex h-100 flex-column gap-1 p-1">
                                                    <span class="d-block p-1 px-2 bg-soft-light rounded mb-2"></span>
                                                    <span class="d-block p-1 px-2 pb-0 bg-soft-light"></span>
                                                    <span class="d-block p-1 px-2 pb-0 bg-soft-light"></span>
                                                    <span class="d-block p-1 px-2 pb-0 bg-soft-light"></span>
                                                </span>
                                            </span>
                                            <span class="flex-grow-1">
                                                <span class="d-flex h-100 flex-column">
                                                    <span class="bg-light d-block p-1"></span>
                                                    <span class="bg-light d-block p-1 mt-auto"></span>
                                                </span>
                                            </span>
                                        </span>
                                </label>
                            </div>
                            <h5 class="fs-13 text-center mt-2">Dark</h5>
                        </div>
                        <div class="col-4">
                            <button class="btn btn-link avatar-md w-100 p-0 overflow-hidden border collapsed"
                                    type="button" data-bs-toggle="collapse" data-bs-target="#collapseBgGradient"
                                    aria-expanded="false" aria-controls="collapseBgGradient">
                                    <span class="d-flex gap-1 h-100">
                                        <span class="flex-shrink-0">
                                            <span class="bg-vertical-gradient d-flex h-100 flex-column gap-1 p-1">
                                                <span class="d-block p-1 px-2 bg-soft-light rounded mb-2"></span>
                                                <span class="d-block p-1 px-2 pb-0 bg-soft-light"></span>
                                                <span class="d-block p-1 px-2 pb-0 bg-soft-light"></span>
                                                <span class="d-block p-1 px-2 pb-0 bg-soft-light"></span>
                                            </span>
                                        </span>
                                        <span class="flex-grow-1">
                                            <span class="d-flex h-100 flex-column">
                                                <span class="bg-light d-block p-1"></span>
                                                <span class="bg-light d-block p-1 mt-auto"></span>
                                            </span>
                                        </span>
                                    </span>
                            </button>
                            <h5 class="fs-13 text-center mt-2">Gradient</h5>
                        </div>
                    </div>
                    <!-- end row -->

                    <div class="collapse" id="collapseBgGradient">
                        <div class="d-flex gap-2 flex-wrap img-switch p-2 px-3 bg-light rounded">

                            <div class="form-check sidebar-setting card-radio">
                                <input class="form-check-input" type="radio" name="data-sidebar"
                                       id="sidebar-color-gradient" value="gradient">
                                <label class="form-check-label p-0 avatar-xs rounded-circle"
                                       for="sidebar-color-gradient">
                                    <span class="avatar-title rounded-circle bg-vertical-gradient"></span>
                                </label>
                            </div>
                            <div class="form-check sidebar-setting card-radio">
                                <input class="form-check-input" type="radio" name="data-sidebar"
                                       id="sidebar-color-gradient-2" value="gradient-2">
                                <label class="form-check-label p-0 avatar-xs rounded-circle"
                                       for="sidebar-color-gradient-2">
                                    <span class="avatar-title rounded-circle bg-vertical-gradient-2"></span>
                                </label>
                            </div>
                            <div class="form-check sidebar-setting card-radio">
                                <input class="form-check-input" type="radio" name="data-sidebar"
                                       id="sidebar-color-gradient-3" value="gradient-3">
                                <label class="form-check-label p-0 avatar-xs rounded-circle"
                                       for="sidebar-color-gradient-3">
                                    <span class="avatar-title rounded-circle bg-vertical-gradient-3"></span>
                                </label>
                            </div>
                            <div class="form-check sidebar-setting card-radio">
                                <input class="form-check-input" type="radio" name="data-sidebar"
                                       id="sidebar-color-gradient-4" value="gradient-4">
                                <label class="form-check-label p-0 avatar-xs rounded-circle"
                                       for="sidebar-color-gradient-4">
                                    <span class="avatar-title rounded-circle bg-vertical-gradient-4"></span>
                                </label>
                            </div>
                        </div>
                    </div>
                </div>

                <div id="sidebar-img">
                    <h6 class="mt-4 mb-0 fw-semibold text-uppercase">Sidebar Images</h6>
                    <p class="text-muted">Choose a image of Sidebar.</p>

                    <div class="d-flex gap-2 flex-wrap img-switch">
                        <div class="form-check sidebar-setting card-radio">
                            <input class="form-check-input" type="radio" name="data-sidebar-image"
                                   id="sidebarimg-none" value="none">
                            <label class="form-check-label p-0 avatar-sm h-auto" for="sidebarimg-none">
                                    <span
                                            class="avatar-md w-auto bg-light d-flex align-items-center justify-content-center">
                                        <i class="ri-close-fill fs-20"></i>
                                    </span>
                            </label>
                        </div>

                        <div class="form-check sidebar-setting card-radio">
                            <input class="form-check-input" type="radio" name="data-sidebar-image"
                                   id="sidebarimg-01" value="img-1">
                            <label class="form-check-label p-0 avatar-sm h-auto" for="sidebarimg-01">
                                <img src="assets/images/sidebar/img-1.jpg" alt=""
                                     class="avatar-md w-auto object-cover">
                            </label>
                        </div>

                        <div class="form-check sidebar-setting card-radio">
                            <input class="form-check-input" type="radio" name="data-sidebar-image"
                                   id="sidebarimg-02" value="img-2">
                            <label class="form-check-label p-0 avatar-sm h-auto" for="sidebarimg-02">
                                <img src="assets/images/sidebar/img-2.jpg" alt=""
                                     class="avatar-md w-auto object-cover">
                            </label>
                        </div>
                        <div class="form-check sidebar-setting card-radio">
                            <input class="form-check-input" type="radio" name="data-sidebar-image"
                                   id="sidebarimg-03" value="img-3">
                            <label class="form-check-label p-0 avatar-sm h-auto" for="sidebarimg-03">
                                <img src="assets/images/sidebar/img-3.jpg" alt=""
                                     class="avatar-md w-auto object-cover">
                            </label>
                        </div>
                        <div class="form-check sidebar-setting card-radio">
                            <input class="form-check-input" type="radio" name="data-sidebar-image"
                                   id="sidebarimg-04" value="img-4">
                            <label class="form-check-label p-0 avatar-sm h-auto" for="sidebarimg-04">
                                <img src="assets/images/sidebar/img-4.jpg" alt=""
                                     class="avatar-md w-auto object-cover">
                            </label>
                        </div>
                    </div>
                </div>

                <div id="preloader-menu">
                    <h6 class="mt-4 mb-0 fw-semibold text-uppercase">Preloader</h6>
                    <p class="text-muted">Choose a preloader.</p>

                    <div class="row">
                        <div class="col-4">
                            <div class="form-check sidebar-setting card-radio">
                                <input class="form-check-input" type="radio" name="data-preloader"
                                       id="preloader-view-custom" value="enable">
                                <label class="form-check-label p-0 avatar-md w-100" for="preloader-view-custom">
                                        <span class="d-flex gap-1 h-100">
                                            <span class="flex-shrink-0">
                                                <span class="bg-light d-flex h-100 flex-column gap-1 p-1">
                                                    <span class="d-block p-1 px-2 bg-soft-primary rounded mb-2"></span>
                                                    <span class="d-block p-1 px-2 pb-0 bg-soft-primary"></span>
                                                    <span class="d-block p-1 px-2 pb-0 bg-soft-primary"></span>
                                                    <span class="d-block p-1 px-2 pb-0 bg-soft-primary"></span>
                                                </span>
                                            </span>
                                            <span class="flex-grow-1">
                                                <span class="d-flex h-100 flex-column">
                                                    <span class="bg-light d-block p-1"></span>
                                                    <span class="bg-light d-block p-1 mt-auto"></span>
                                                </span>
                                            </span>
                                        </span>
                                    <!-- <div id="preloader"> -->
                                    <div id="status" class="d-flex align-items-center justify-content-center">
                                        <div class="spinner-border text-primary avatar-xxs m-auto" role="status">
                                            <span class="visually-hidden">Loading...</span>
                                        </div>
                                    </div>
                                    <!-- </div> -->
                                </label>
                            </div>
                            <h5 class="fs-13 text-center mt-2">Enable</h5>
                        </div>
                        <div class="col-4">
                            <div class="form-check sidebar-setting card-radio">
                                <input class="form-check-input" type="radio" name="data-preloader"
                                       id="preloader-view-none" value="disable">
                                <label class="form-check-label p-0 avatar-md w-100" for="preloader-view-none">
                                        <span class="d-flex gap-1 h-100">
                                            <span class="flex-shrink-0">
                                                <span class="bg-light d-flex h-100 flex-column gap-1 p-1">
                                                    <span class="d-block p-1 px-2 bg-soft-primary rounded mb-2"></span>
                                                    <span class="d-block p-1 px-2 pb-0 bg-soft-primary"></span>
                                                    <span class="d-block p-1 px-2 pb-0 bg-soft-primary"></span>
                                                    <span class="d-block p-1 px-2 pb-0 bg-soft-primary"></span>
                                                </span>
                                            </span>
                                            <span class="flex-grow-1">
                                                <span class="d-flex h-100 flex-column">
                                                    <span class="bg-light d-block p-1"></span>
                                                    <span class="bg-light d-block p-1 mt-auto"></span>
                                                </span>
                                            </span>
                                        </span>
                                </label>
                            </div>
                            <h5 class="fs-13 text-center mt-2">Disable</h5>
                        </div>
                    </div>

                </div>
                <!-- end preloader-menu -->

            </div>
        </div>

    </div>
    <div class="offcanvas-footer border-top p-3 text-center">
        <div class="row">
            <div class="col-6">
                <button type="button" class="btn btn-light w-100" id="reset-layout">Reset</button>
            </div>
            <div class="col-6">
                <a href="https://1.envato.market/velzon-admin" target="_blank" class="btn btn-primary w-100">Buy
                    Now</a>
            </div>
        </div>
    </div>
</div>

<!-- JAVASCRIPT -->
<script src="<c:url value="/template/Trung/assets/libs/bootstrap/js/bootstrap.bundle.min.js"/>"></script>
<script src="<c:url value="/template/Trung/assets/libs/simplebar/simplebar.min.js"/>"></script>
<script src="<c:url value="/template/Trung/assets/libs/node-waves/waves.min.js"/>"></script>
<script src="<c:url value="/template/Trung/assets/libs/feather-icons/feather.min.js"/>"></script>
<script src="<c:url value="/template/Trung/assets/js/pages/plugins/lord-icon-2.1.0.js"/>"></script>
<script src="<c:url value="/template/Trung/assets/js/plugins.js"/>"></script>


<!--Swiper slider js-->
<script src="<c:url value="/template/Trung/assets/libs/swiper/swiper-bundle.min.js"/>"></script>

<!-- ecommerce product details init -->
<script src="<c:url value="/template/Trung/assets/js/pages/ecommerce-product-details.init.js"/>"></script>

<!-- App js -->
<script src="<c:url value="/template/Trung/assets/js/app.js"/>"></script>
</body>


<!-- Mirrored from themesbrand.com/velzon/html/default/apps-ecommerce-product-details.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 04 Dec 2022 12:41:38 GMT -->

</html>