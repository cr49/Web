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

<!-- Shop Details Section Begin -->
<section class="shop-details">
    <div class="product__details__pic">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="product__details__breadcrumb">
                        <a href="./index.html">Home</a>
                        <a href="./shop.html">Shop</a>
                        <span>Product Details</span>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-3 col-md-3">
                    <ul class="nav nav-tabs" role="tablist">
                        <c:forEach items="${listProductImages}" var="li" varStatus="loop">
                            <li class="nav-item">
                                <a class="nav-link ${loop.index==0?'active':''} " data-toggle="tab"
                                   href="#tabs-${loop.index}" role="tab">
                                    <div class="product__thumb__pic set-bg"
                                         data-setbg="${li.getUrl_image()}">
                                    </div>
                                </a>
                            </li>
                        </c:forEach>
                    </ul>
                </div>
                <div class="col-lg-6 col-md-9">
                    <div class="tab-content">
                        <c:forEach items="${listProductImages}" var="li" varStatus="loop">
                            <div class="tab-pane ${loop.index==0?'active':''}" id="tabs-${loop.index}" role="tabpanel">
                                <div class="product__details__pic__item">
                                    <img src="${li.getUrl_image()}"
                                         alt="">
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="product__details__content">
        <div class="container">
            <div class="row d-flex justify-content-center">
                <div class="col-lg-8">
                    <div class="product__details__text">
                        <form action="/Final_Project/AddCart" method="post">
                            <input readonly style="display: none" name="productId" type="text" id="ProductId"
                                   value="${Product.get_id()}">
                            <h4>${Product.getName()}</h4>
                            <p>${Product.getRating()} <i class="fa-solid fa-star" style="color: rgb(255, 123, 0);"></i>
                            </p>
                            <h3>${Product.getPrice()} VND</h3>
                            <%--                            <h3>$270.00 <span>70.00</span></h3>--%>
                            <p>${Product.getDescription()}</p>
                            <c:if test="${error}">
                                <p class="alert-danger">Bạn phải chọn size</p>
                            </c:if>
                            <div class="product__details__option">
                                <div class="product__details__option__size">
                                    <span>Size:</span>
                                    <c:forEach items="${listProductSizes}" var="li" varStatus="loop">
                                        <label class="${loop.index==0?'active':''}"
                                               for="${li.getSize()}">${li.getSize()}
                                            <input name="RadioSize" type="radio" id="${li.getSize()}"
                                                   value="${li.getSize()}" ${loop.index==0?'checked':''}>
                                        </label>
                                    </c:forEach>
                                </div>
                            </div>
                            <c:if test="${sessionScope.User == null}">
                                <p class="alert-danger">Bạn phải đăng nhập trước khi đặt hàng!</p>
                            </c:if>
                            <div class="product__details__cart__option">
                                <div class="quantity">
                                    <div class="pro-qty">
                                        <input name="count" type="text" value="1">
                                    </div>
                                </div>
                                <button type="submit" class="primary-btn" ${sessionScope.User == null ? 'disabled' : ''}>add to cart</button>
                            </div>
                            <div class="product__details__btns__option">
                                <a href="/Final_Project/AddFollowProduct?productId=${Product.get_id()}"><i class="fa fa-heart" ></i> add to wishlist</a>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-12">
                    <div class="product__details__tab">
                        <ul class="nav nav-tabs" role="tablist">
                            <li class="nav-item">
                                <a class="nav-link active" data-toggle="tab" style="color: rgb(0, 0, 0);"
                                   href="#tabs-6" role="tab">Customer
                                    Previews</a>
                            </li>
                        </ul>
                        <div class="tab-content" style="display: flex; justify-content: center;">
                            <div class="tab-pane active" id="tabs-6" role="tabpanel">
                                <div class="product__details__tab__content">
                                    <c:forEach items="${listReview}" var="li">
                                        <div class="product__details__tab__content__item"
                                             style="border-radius: 10%;background-color: rgb(228, 228, 228);">
                                            <div class="p-3"
                                                 style=" border-radius: 10%; background-color: rgb(208, 208, 208);">
                                                <h5 style="display: inline;" class="p-5">${li.getUserName()}</h5>
                                                <h6 style="display: inline;">${li.getStars()} <i class="fa-solid fa-star"
                                                                                  style="color: rgb(255, 123, 0);"></i>
                                                </h6>
                                            </div>
                                            <p class="p-3">${li.getContent()}</p>
                                        </div>
                                    </c:forEach>
                                    <c:if test="${listReview.isEmpty()}">
                                        <h2>Chưa có nhận xét cho sản phẩm này!!</h2>
                                    </c:if>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- Shop Details Section End -->

<!-- Begin Footer -->
<jsp:include page="/common/web/footer.jsp"></jsp:include>
<!-- End Footer -->
</body>

</html>
