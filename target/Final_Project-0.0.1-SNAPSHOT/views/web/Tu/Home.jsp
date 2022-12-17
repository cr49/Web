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
<!-- Product Section Begin -->
<section class="product spad">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="product__details__tab">
                    <ul class="nav nav-tabs" role="tablist">
                        <li class="nav-item">
                            <a style="color: rgb(0, 0, 0);" class="nav-link active" data-toggle="tab" href="#tabs-5"
                               role="tab">New Arrivals</a>
                        </li>
                        <li class="nav-item">
                            <a style="color: rgb(0, 0, 0);" class="nav-link" data-toggle="tab" href="#tabs-6"
                               role="tab">Best Sellers</a>
                        </li>
                    </ul>
                    <div class="tab-content">
                        <div class="tab-pane active" id="tabs-5" role="tabpanel">
                            <div class="product__details__tab__content">
                                <div class="row product__filter">
                                    <c:forEach items="${List8NewProduct}" var="li">
                                        <div class="col-lg-3 col-md-6 col-sm-6 col-md-6 col-sm-6 mix new-arrivals">
                                            <div class="product__item">
                                                <div class="product__item__pic set-bg"
                                                     data-setbg="${li.url_image}">
                                                    <span class="label">New</span>
                                                    <ul class="product__hover">
                                                        <li><a href="/Final_Project/AddFollowProduct?productId=${li.get_id()}"><i style="color: rgb(255, 0, 0);"
                                                                           class="fa-regular fa-heart"></i></a></li>
                                                    </ul>
                                                </div>
                                                <div class="product__item__text">
                                                    <h6>${li.name}</h6>
                                                    <a href="/Final_Project/Detail?productId=${li.get_id()}">View Detail</a>
                                                    <p>${li.rating} <i class="fa-solid fa-star"
                                                                       style="color: rgb(255, 123, 0);"></i></p>
                                                    <h5>${li.price} VND</h5>
                                                </div>
                                            </div>
                                        </div>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                        <div class="tab-pane" id="tabs-6" role="tabpanel">
                            <div class="product__details__tab__content">
                                <div class="product__details__tab__content__item">
                                    <div class="row product__filter">
                                        <c:forEach items="${List8BestSeller}" var="li">
                                            <div class="col-lg-3 col-md-6 col-sm-6 col-md-6 col-sm-6 mix new-arrivals">
                                                <div class="product__item">
                                                    <div class="product__item__pic set-bg"
                                                         data-setbg="${li.url_image}">
<%--                                                        <span class="label">New</span>--%>
                                                        <ul class="product__hover">
                                                            <li><a href="/Final_Project/AddFollowProduct?productId=${li.get_id()}"><i style="color: rgb(255, 0, 0);"
                                                                               class="fa-regular fa-heart"></i></a></li>
                                                        </ul>
                                                    </div>
                                                    <div class="product__item__text">
                                                        <h6>${li.name}</h6>
                                                        <a href="/Final_Project/Detail?productId=${li.get_id()}">View Detail</a>
                                                        <p>${li.rating} <i class="fa-solid fa-star"
                                                                           style="color: rgb(255, 123, 0);"></i></p>
                                                        <h5>${li.price} VND</h5>
                                                    </div>
                                                </div>
                                            </div>
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
</section>
<!-- Product Section End -->

<!-- Begin Footer -->
<jsp:include page="/common/web/footer.jsp"></jsp:include>
<!-- End Footer -->

</body>
</html>
