<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<!-- Begin Header -->
<jsp:include page="/common/web/header.jsp"></jsp:include>
<!-- End Header -->
<body>
<!-- Header Section Begin -->
<jsp:include page="/common/web/headerUser.jsp"></jsp:include>
<!-- Header Section End -->

<br>
<br>
<br>
<br>
<br>
<br>
<br>

<!-- Breadcrumb Section Begin -->
<section class="breadcrumb-option">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="breadcrumb__text">
                    <h3 class="font-weight-bold">My Profile</h3>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- Breadcrumb Section End -->

<!-- Checkout Section Begin -->
<section class="checkout spad pt-0">
    <div class="container">
        <div class="checkout__form">
            <div class="row">
                <div class="col-lg-4 col-md-6">
                    <div class="checkout__order">
                        <h4 class="order__title">My Information</h4>
                        <form action="/Final_Project/UploadMulti" method="post" enctype="multipart/form-data">
                            <div class="imgUser">
                                <img src="${User.getAvatar()}" alt="" class="img-thumbnail">
                                <input type="file" name="avatar">
                                <button type="submit" class="site-btn">Change image</button>
                            </div>
                        </form>
                        <hr>
                        <form action="/Final_Project/EditPassword" method="post">
                            <h4 class="pt-3 pb-3">Change Password</h4>
                            <div class="col-lg-12">
                                <div class="">
                                    <label class="pt-2 pb-1 form-label" for="recentpassword">Current
                                        Password</label>
                                    <input name="recentpassword" type="password" id="recentpassword"
                                           class="form-control"/>
                                </div>
                                <div class="">
                                    <label class="pt-2 pb-1 form-label" for="newpassword">New Password</label>
                                    <input name="newpassword" type="password" id="newpassword" class="form-control"/>
                                </div>
                                <div class="">
                                    <label class="pt-2 pb-1 form-label" for="newpassword">Re-Password</label>
                                    <input name="repassword" type="password" id="repassword" class="form-control"/>
                                </div>
                            </div>
                            <button type="submit" class=" site-btn">Change</button>
                        </form>

                    </div>
                </div>
                <div class="col-lg-8 col-md-6">
                    <form action="/Final_Project/EditInf" method="post" class="">
                        <div class="row">
                            <div class="col-lg-6">
                                <div class="checkout__input">
                                    <label class="form-label" for="firstname">First
                                        Name<span>*</span></label>
                                    <input style="color: #0b0b0b" name="firstname" type="text"
                                           id="firstname"
                                           class="form-control" value="${User.getFirstname()}"/>

                                </div>
                            </div>
                            <div class="col-lg-6">
                                <div class="checkout__input">
                                    <label class="form-label" for="lastname">Last Name<span>*</span></label>
                                    <input name="lastname" style="color: #0b0b0b" type="text" id="lastname"
                                           class="form-control"
                                           value="${User.getLastname()}"/>
                                </div>
                            </div>
                        </div>
                        <div class="checkout__input">
                            <label class="form-label" for="id_card">ID Card<span>*</span></label>
                            <input name="id_card" style="color: #0b0b0b" type="text" id="id_card"
                                   class="form-control"
                                   value="${User.getId_card()}"/>
                        </div>


                        <div class="checkout__input">
                            <label class="form-label" for="address">Address<span>*</span></label>
                            <input name="address" style="color: #0b0b0b" type="text" id="address"
                                   class="form-control"
                                   value="${User.getAddress()}"/>
                        </div>

                        <div class="row">
                            <div class="col-lg-6">
                                <div class="checkout__input">
                                    <label class="form-label" for="phone">Phone<span>*</span></label>
                                    <input name="phone" style="color: #0b0b0b" type="number" id="phone"
                                           class="form-control"
                                           value="${User.getPhone()}"/>
                                </div>
                            </div>
                            <div class="col-lg-6">
                                <div class="checkout__input">
                                    <label class="form-label" for="email">Email<span>*</span></label>
                                    <input name="email" style="color: #0b0b0b" type="email" id="email"
                                           class="form-control"
                                           value="${User.getEmail()}"/>
                                </div>
                            </div>
                        </div>
                        <button type="submit" class="btn btn-outline-dark pull-right">Update</button>
                    </form>


                    <br><br><br><br>
                    <div class="Following-inf">
                        <h2>Following</h2>
                        <div class="row">
                            <div class="col-lg-12">
                                <div class="product__details__tab">
                                    <ul class="nav nav-tabs" role="tablist">
                                        <li class="nav-item">
                                            <a style="color: rgb(0, 0, 0);" class="nav-link ${!isProductView?'active':''} "
                                               data-toggle="tab" href="#tabs-5" role="tab">Store</a>
                                        </li>
                                        <li class="nav-item">
                                            <a style="color: rgb(0, 0, 0);" class="nav-link ${isProductView?'active':''}" data-toggle="tab"
                                               href="#tabs-6" role="tab">Product</a>
                                        </li>
                                    </ul>
                                    <div class="tab-content">
                                        <div class="tab-pane ${!isProductView?'active':''}" id="tabs-5" role="tabpanel">
                                            <div class="product__details__tab__content">
                                                <c:forEach items="${listFollowingStore}" var="li">
                                                    <div class="list-group list-store p-2">
                                                        <div class="row h-3 p-3"
                                                             style=" border-radius: 2%; background-color: rgb(243, 243, 243);">
                                                            <div class=" following-img col-lg-3">
                                                                <img style="height: 150px"
                                                                     class=" img-thumbnail rounded float-left "
                                                                <c:if test="${li.getAvatar()}">
                                                                     src="${li.getAvatar()}"
                                                                </c:if>
                                                                <c:if test="${!li.getAvatar()}">
                                                                     src="https://cdn.vietnambiz.vn/2019/10/3/color-silhouette-cartoon-facade-shop-store-vector-14711058-1570007843495391141359-1570076859193969194096-15700769046292030065819-1570076927728377843390.png"
                                                                </c:if>

                                                                     alt="">
                                                            </div>
                                                            <div class="col-lg-6">
                                                                <div class="breadcrumb__text">
                                                                    <h4><a style="color: unset;"
                                                                           href="/Final_Project/Products?StoreId=${li.get_id()}&cid=0">Shop: ${li.getName()}</a></h4>
                                                                    <div class="breadcrumb__links">
                                                                        <a>Chủ sở hữu: </a>
                                                                        <a href="">${li.getNameOwner()}</a>
                                                                    </div>
                                                                    <p>${li.getBio()}</p>
                                                                    <p class="d-inline">${li.getRating()} <i
                                                                            class="fa-solid fa-star"
                                                                            style="color: rgb(255, 123, 0);"></i>
                                                                    </p>
                                                                    <p class="d-inline"> Ngày thành
                                                                        lập: ${li.getCreatedAt()}</p>

                                                                </div>
                                                            </div>
                                                            <div class="col-lg-3">
                                                                <div class="header__nav__option">
                                                                    <a href="/Final_Project/DeleteFollowStore?storeId=${li.get_id()}"><i
                                                                            class="fa-sharp fa-solid fa-xmark"></i></a>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </c:forEach>

                                            </div>
                                            <div class="row">
                                                <div class="col-lg-12">
                                                    <div class="product__pagination">
                                                        <c:forEach begin="1" end="${totalStorePage}" var="li">
                                                            <a class="${IindexStore == li ? 'active' : ''}"
                                                               href="/Final_Project/MyProfile?indexStore=${li}">${li}</a>
                                                        </c:forEach>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="tab-pane ${isProductView?'active':''}" id="tabs-6" role="tabpanel">
                                            <div class="product__details__tab__content">
                                                <div class="product__details__tab__content__item">
                                                    <div class="row">
                                                        <c:forEach items="${listFollowingProducts}" var="li">
                                                            <div class="col-lg-4 col-md-6 col-sm-6">
                                                                <div class="product__item">
                                                                    <div class="product__item__pic set-bg"
                                                                         data-setbg="${li.getUrl_image()}">
                                                                            <%--                                    <span class="label">New</span>--%>
                                                                        <ul class="product__hover">
                                                                            <li><a href="/Final_Project/DeleteFollowProduct?productId=${li.get_id()}"><i style="color: rgb(255, 0, 0);"
                                                                                                                                                      class="fa-regular fa-heart"></i></a></li>
                                                                        </ul>
                                                                    </div>
                                                                    <div class="product__item__text">
                                                                        <h6>${li.getName()}</h6>
                                                                        <a href="/Final_Project/Detail?productId=${li.get_id()}">View Detail</a>
                                                                        <p>${li.getRating()} <i class="fa-solid fa-star"
                                                                                                style="color: rgb(255, 123, 0);"></i></p>
                                                                        <h5>${li.getPrice()} VND</h5>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </c:forEach>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="row">
                                                <div class="col-lg-12">
                                                    <div class="product__pagination">
                                                        <c:forEach begin="1" end="${totalProductPage}" var="li">
                                                            <a class="${IindexProduct == li ? 'active' : ''}"
                                                               href="/Final_Project/MyProfile?indexProduct=${li}">${li}</a>
                                                        </c:forEach>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </div>

</section>
<!-- Checkout Section End -->


<!-- Begin Footer -->
<jsp:include page="/common/web/footer.jsp"></jsp:include>
<!-- End Footer -->
</body>

</html>