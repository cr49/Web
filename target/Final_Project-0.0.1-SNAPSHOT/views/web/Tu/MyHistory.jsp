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

<!-- Breadcrumb Section Begin -->
<section class="breadcrumb-option">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="breadcrumb__text">
                    <h3 style="font-weight: 800">My History</h3>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- Breadcrumb Section End -->
<!-- Shopping Cart Section Begin -->
<section class="shopping-cart spad p-1">
    <div class="container m-0" style="max-width: unset;">
        <div class="row">
            <div class="col-lg-12">
                <c:forEach items="${allOrders}" var="O" varStatus="loopO">
                    <div class="shopping__cart__table p-3 "
                         style="background-color: ${loopO.index%2 == 0 ?'rgb(230, 245, 245)':'#faf3e5'}; border-radius: 5%;">

                        <table>
                            <h5 class="p-3" style="font-weight: 800;">Tên shop: ${O.getNameStore()}</h5>
                            <thead>
                            <tr>
                                <th>Product</th>
                                <th>Quantity</th>
                                <th>Total</th>
                                <th>Note</th>
                                <th>Tình trạng</th>
                                <th>Đánh giá</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${allOrderItems}" var="OI" varStatus="loopOI">
                                <form action="/Final_Project/AddReview" method="post">
                                    <c:if test="${O.get_id()==OI.getOrderId()}">
                                        <input style="display: none" name="orderId" type="text" value="${O.get_id()}"/>
                                        <input style="display: none" name="productId" type="text"
                                               value="${OI.getProductId()}"/>
                                        <tr>
                                            <td class="product__cart__item">
                                                <div class="product__cart__item__pic">
                                                    <img style="height: 150px;"
                                                         src="${OI.getProductImage()}"
                                                         alt="">
                                                </div>
                                                <div class="product__cart__item__text">
                                                    <h6><a style="color: unset" href="/Final_Project/Detail?productId=${OI.getProductId()}">${OI.getProductName()}</a></h6>
                                                    <h6>Size: ${OI.getSize()}</h6>
                                                    <h5>${OI.getPrice()}</h5>
                                                    <h6>Danh mục: ${OI.getCategoryName()}</h6>
                                                </div>
                                            </td>
                                            <td class="quantity__item">
                                                <div class="quantity">
                                                    <div class="">
                                                        <h6>${OI.getCount()}</h6>
                                                    </div>
                                                </div>
                                            </td>
                                            <td class="cart__price">${OI.getPrice()} VND</td>
                                            <td class="Content">
                                                    ${OI.getContent()}
                                            </td>
                                            <td class="Status" style="font-weight: 1000;">
                                                    ${O.getStatus()}
                                            </td>
                                            <td>
                                                <input name="rating-${OI.getProductId()}" type="radio" class="rating"
                                                       value="1"/>
                                                <p class="pr-3" style="display: inline;">1<i class="fa-solid fa-star"
                                                                                             style="color: rgb(255, 123, 0);"></i>
                                                </p>
                                                <input name="rating-${OI.getProductId()}" type="radio" class="rating"
                                                       value="2"/>
                                                <p class="pr-3" style="display: inline;">2<i class="fa-solid fa-star"
                                                                                             style="color: rgb(255, 123, 0);"></i>
                                                </p>
                                                <input name="rating-${OI.getProductId()}" type="radio" class="rating"
                                                       value="3"/>
                                                <p class="pr-3" style="display: inline;">3<i class="fa-solid fa-star"
                                                                                             style="color: rgb(255, 123, 0);"></i>
                                                </p>
                                                <input name="rating-${OI.getProductId()}" type="radio" class="rating"
                                                       value="4"/>
                                                <p class="pr-3" style="display: inline;">4<i class="fa-solid fa-star"
                                                                                             style="color: rgb(255, 123, 0);"></i>
                                                </p>
                                                <input name="rating-${OI.getProductId()}" type="radio" class="rating"
                                                       value="5" checked/>
                                                <p class="pr-3" style="display: inline;">5<i class="fa-solid fa-star"
                                                                                             style="color: rgb(255, 123, 0);"></i>
                                                </p>
                                                <div><textarea name="review-${OI.getProductId()}"
                                                               id="review-${OI.getProductId()}" cols="40"
                                                               rows="3"></textarea>
                                                    <button name="btn-${OI.getProductId()}"
                                                            class="btn btn-outline-dark" type="submit"
                                                            style="float: right;">Gửi
                                                    </button>
                                                </div>
                                            </td>
                                        </tr>

                                    </c:if>
                                </form>
                            </c:forEach>
                            </tbody>
                        </table>
                        <div style=" display: flex; justify-content: end;">
                            <div class="total">
                                <span style="display: inline;">Ngày
                                    đặt
                                    hàng:
                                    <p class=" pr-5" style="display: inline;color: rgb(0, 0, 0) ;font-weight: 800;">
                                            ${O.getCreatedAt()}</p>
                                </span>
                                <span style="display: inline;">Phương
                                    thức vận chuyển:
                                    <p class=" pr-5" style="display: inline;color: rgb(0, 0, 0) ;font-weight: 800;">
                                            ${O.getDeliveryName()}</p>
                                </span>
                                <span style="display: inline;">Số ngày
                                    vận chuyển dự kiến:
                                    <p class=" pr-5" style="display: inline;color: rgb(0, 0, 0) ;font-weight: 800;">
                                        ${O.getEstimatedDeliveryDays()} ngày</p>
                                </span>
                                <p style="display: inline;color: red ;font-weight: 800;"> Tổng số
                                    tiền: ${O.getAmountFromUser()} VND</p>
                            </div>
                        </div>


                    </div>
                </c:forEach>
                <c:if test="${allOrders.isEmpty()}">
                    <h3>Không có lịch sử mua hàng</h3>
                </c:if>
            </div>
        </div>
    </div>
</section>
<!-- Shopping Cart Section End -->

<!-- Begin Footer -->
<jsp:include page="/common/web/footer.jsp"></jsp:include>
<!-- End Footer -->
</body>

</html>