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



<!-- Breadcrumb Section Begin -->
<c:if test="${Store != null}">
    <br>
    <br>
    <section class="breadcrumb-option">
        <div class="container">
            <div class="row h-3">
                <div class="col-lg-3">
                    <img style="height: 150px"
                    <c:if test="${Store.getAvatar()}">
                         src="${Store.getAvatar()}"
                    </c:if>
                    <c:if test="${!Store.getAvatar()}">
                         src="https://cdn.vietnambiz.vn/2019/10/3/color-silhouette-cartoon-facade-shop-store-vector-14711058-1570007843495391141359-1570076859193969194096-15700769046292030065819-1570076927728377843390.png"
                    </c:if>
                         alt="">
                </div>
                <div class="col-lg-6">
                    <div class="breadcrumb__text">
                        <h4>${Store.getName()}</h4>
                        <div class="breadcrumb__links">
                            <a>Chủ sở hữu: </a>
                            <a href="">${Store.getNameOwner()}</a>
                        </div>
                        <p>${Store.getBio()}</p>
                        <p class="d-inline">${Store.getRating()} <i class="fa-solid fa-star" style="color: rgb(255, 123, 0);"></i></p>
                        <p class="d-inline"> Ngày thành lập: ${Store.getCreatedAt()}</p>

                        <c:if test="${Store.isOpen()}">
                            <h4 class="text-success">Opening</h4>
                        </c:if>
                        <c:if test="${!Store.isOpen()}">
                            <h4 class="text-danger">Closed</h4>
                        </c:if>
                    </div>
                </div>
                <div class="col-lg-3">
                    <div class="header__nav__option">

                        <a href="/Final_Project/AddFollowStore?StoreId=${Store.get_id()}"><i class="fa-solid fa-heart" style="color: rgb(255, 123, 0);"></i></a>
                    </div>
                </div>
            </div>
        </div>
    </section>
</c:if>
<!-- Breadcrumb Section End -->

<!-- Shop Section Begin -->
<section class="shop spad">
    <div class="container">
        <div class="row">
            <div class="col-lg-3">
                <div class="shop__sidebar">
                    <div class="shop__sidebar__search">
                        <form action="/Final_Project/Products" method="post">
                            <input style="color: #0b0b0b" name="search" type="text" placeholder="Search..." value="${search}">
                            <input style="display: none" name="StoreId" type="text" placeholder="Search..." value="${StoreId}">
                            <input style="display: none" name="cid" type="text" placeholder="Search..." value="0">
                            <button type="submit"><span class="icon_search"></span></button>
                        </form>
                    </div>
                    <div class="shop__sidebar__accordion">
                        <div class="accordion" id="accordionExample">
                            <div class="card">
                                <div class="card-heading">
                                    <a data-toggle="collapse" data-target="#collapseOne">Categories</a>
                                </div>
                                <div id="collapseOne" class="collapse show" data-parent="#accordionExample">
                                    <div class="card-body">
                                        <div class="shop__sidebar__categories">
                                            <ul class="nice-scroll" style="height: auto">
                                                <c:forEach items="${listCate}" var="li">
                                                    <li><a style=" ${cid == li.get_id() ?'color: #ff0000' : ''}"
                                                           href="/Final_Project/Products?cid=${li.get_id()}&StoreId=${StoreId}">${li.getName()}
                                                        - ${li.get_id()}</a></li>
                                                </c:forEach>
                                                <li><a style=" ${cid == 0 ?'color: #ff0000' : ''}"
                                                       href="/Final_Project/Products?cid=0&StoreId=${StoreId}">All Product</a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-lg-9">
                <div class="shop__product__option">
                    <div class="row">
                        <div class="col-lg-6 col-md-6 col-sm-6">
                            <div class="shop__product__option__left">
                                <p>Showing ${beginP}–${endP} of ${total} results</p>
                            </div>
                        </div>
                        <div class="col-lg-6 col-md-6 col-sm-6">
                            <div class="shop__product__option__right">
                                <a style="color: ${typeSort==1 ? 'red':'unset'}"
                                   href="/Final_Project/Products?typeSort=1&search=${search}&StoreId=${StoreId}"> Low To High</a>
                                <p>||</p>
                                <a style="color: ${typeSort==0 ? 'red':'unset'}"
                                   href="/Final_Project/Products?typeSort=0&search=${search}&StoreId=${StoreId}">High To Low</a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <c:if test="${listProduct.isEmpty()}">
                        <h2>Không tìm thấy sản phẩm!!</h2>
                    </c:if>
                    <c:forEach items="${listProduct}" var="li">
                        <div class="col-lg-4 col-md-6 col-sm-6">
                            <div class="product__item">
                                <div class="product__item__pic set-bg"
                                     data-setbg="${li.getUrl_image()}">
<%--                                    <span class="label">New</span>--%>
                                    <ul class="product__hover">
                                        <li><a href="/Final_Project/AddFollowProduct?productId=${li.get_id()}"><i style="color: rgb(255, 0, 0);"
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
                <div class="row">
                    <div class="col-lg-12">
                        <div class="product__pagination">
                            <c:forEach begin="1" end="${totalPage}" var="li">
                                <a class="${Iindex == li ? 'active' : ''}"
                                   href="/Final_Project/Products?index=${li}&search=${search}&StoreId=${StoreId}">${li}</a>
                            </c:forEach>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- Shop Section End -->

<!-- Begin Footer -->
<jsp:include page="/common/web/footer.jsp"></jsp:include>
<!-- End Footer -->


</body>

</html>
