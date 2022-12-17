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

<!-- Stores Section Begin -->
<section class="shop spad">
    <div class="container">
        <div class="row d-flex justify-content-around">
            <div class="shop__product__option">
                <div class="row">
                    <div class="">
                        <div class="shop__product__option__left">
                            <p>Showing ${beginS}–${endS} of ${total} results</p>
                        </div>
                    </div>
                </div>
            </div>
            <div class="shop__sidebar">
                <div class="shop__sidebar__search">
                    <form action="/Final_Project/Store">
                        <input style="color: #0b0b0b" name="search" type="text" placeholder="Search..." value="${search}">
                        <button type="submit"><span class="icon_search"></span></button>
                    </form>
                </div>
            </div>

        </div>
        <div class="row">
            <div class="col-lg-12">
                <section class="">
                    <div class="container">
                        <c:if test="${listStore.isEmpty()}">
                            <h2>Không tìm thấy cửa hàng!!</h2>
                        </c:if>
                        <c:forEach items="${listStore}" var="ls" varStatus="loop">
                            <div class="m-5 row h-3"
                                 style=" border-radius: 2%; ${loop.index%2==0 ? 'background-color: rgb(219,255,254);':''}">
                                <div class="col-lg-3 d-flex justify-content-center">
                                    <img style="height: 150px"
                                    <c:if test="${ls.getAvatar()}">
                                         src="${ls.getAvatar()}"
                                    </c:if>
                                    <c:if test="${!ls.getAvatar()}">
                                         src="https://cdn.vietnambiz.vn/2019/10/3/color-silhouette-cartoon-facade-shop-store-vector-14711058-1570007843495391141359-1570076859193969194096-15700769046292030065819-1570076927728377843390.png"
                                    </c:if>
                                         alt="">
                                </div>
                                <div class="col-lg-6">
                                    <div class="breadcrumb__text">
                                        <h4><a style="color: unset" href="/Final_Project/Products?StoreId=${ls.get_id()}&cid=0">${ls.getName()}</a></h4>
                                        <div class="breadcrumb__links">
                                            <a>Chủ sở hữu:</a>
                                            <a href="">${ls.getNameOwner()}</a>
                                        </div>
                                        <p>${ls.getBio()}</p>
                                        <p class="d-inline">${ls.getRating()} <i class="fa-solid fa-star"
                                                                 style="color: rgb(255, 123, 0);"></i></p>
                                        <p class="d-inline"> Ngày thành lập: ${ls.getCreatedAt()}</p>

                                        <c:if test="${ls.isOpen()}">
                                            <h4 class="text-success">Opening</h4>
                                        </c:if>
                                        <c:if test="${!ls.isOpen()}">
                                            <h4 class="text-danger">Closed</h4>
                                        </c:if>

                                    </div>
                                </div>
                                <div class="col-lg-3">
                                    <div class="header__nav__option">
<%--                                        <a href="#"><i class="fa-regular fa-heart"></i></a>--%>
                                        <a href="/Final_Project/AddFollowStore?StoreId=${ls.get_id()}"><i class="fa-solid fa-heart"
                                                       style="color: rgb(255, 123, 0);"></i></a>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>

                    </div>
                </section>
                <div class="row">
                    <div class="col-lg-12">
                        <div class="product__pagination">
                            <c:forEach begin="1" end="${totalPage}" var="li">
                                <a class="${Iindex == li ? 'active' : ''}"
                                   href="/Final_Project/Store?index=${li}&search=${search}">${li}</a>
                            </c:forEach>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- Stores Section End -->

<!-- Begin Footer -->
<jsp:include page="/common/web/footer.jsp"></jsp:include>
<!-- End Footer -->


</body>

</html>
