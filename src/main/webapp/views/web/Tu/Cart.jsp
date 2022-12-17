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
<!-- Shopping Cart Section Begin -->
<section class="shopping-cart spad pt-0">
    <div class="container">
        <div class="row">
                <div class="col-lg-8">
                    <form action="/Final_Project/UpdateCart" method="post">
                    <div class="shopping__cart__table">
                        <table>
                            <thead>
                            <tr>
                                <th>Product</th>
                                <th>Quantity</th>
                                <th>Total</th>
                                <th></th>
                            </tr>
                            </thead>
                            <tbody>

                            <c:forEach items="${listCartItem}" var="li">
                                <input style="display: none" name="CIId-${li.get_id()}" type="text" value="${li.get_id()}">
                                <tr>
                                    <td class="product__cart__item">
                                        <div class="product__cart__item__pic">
                                            <img style="height: 150px;" src="${li.getProductImage()}" alt="">
                                        </div>
                                        <div class="product__cart__item__text">

                                            <h6><a style="color: unset" href="/Final_Project/Detail?productId=${li.getProductId()}">${li.getProductName()}</a></h6>

                                            <h6>Size: ${li.getSize()}</h6>
                                            <h5>${li.getPrice()} VND</h5>
                                        </div>
                                    </td>
                                    <td class="quantity__item">
                                        <div class="quantity">
                                            <div class="pro-qty-2">
                                                <input name="count-${li.get_id()}" type="text" value="${li.getCount()}">
                                            </div>
                                        </div>
                                    </td>
                                    <td class="cart__price">${li.getTotal()} VND</td>
                                    <td class="cart__close"><a href="/Final_Project/DeleteCart?CIId=${li.get_id()}"><i
                                            class="fa-sharp fa-solid fa-xmark"></i></a>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>
                        <c:if test="${listCartItem.isEmpty()}">
                            <h3 class="p-4">Giỏ hàng trống!!</h3>
                        </c:if>
                    <div class="row">

                        <div class="col-lg-6 col-md-6 col-sm-6">
                            <div class="continue__btn">
                                <a href="/Final_Project/Products?cid=0">Continue Shopping</a>
                            </div>
                        </div>
                        <div class="col-lg-6 col-md-6 col-sm-6">
                            <div class="continue__btn update__btn">
                                <button type="submit" class="site-btn">Update
                                    cart</button>
                            </div>
                        </div>
                    </div>
                    </form>
                </div>

            <div class="col-lg-4">
                <%--                <div class="cart__discount">--%>
                <%--                    <h6>Discount codes</h6>--%>
                <%--                    <form action="#">--%>
                <%--                        <input type="text" placeholder="Coupon code">--%>
                <%--                        <button type="submit">Apply</button>--%>
                <%--                    </form>--%>
                <%--                </div>--%>
                <div class="cart__total">
                    <h6>Cart total</h6>
                    <ul>
<%--                        <li>Subtotal <span>$ 169.50</span></li>--%>
                        <li>Total <span>${total} VND</span></li>
                    </ul>
                    <a href="${!listCartItem.isEmpty() ?'/Final_Project/Checkout':''} " class="primary-btn">Proceed to checkout</a>
                </div>
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