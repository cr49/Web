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

<!-- Breadcrumb Section Begin -->
<section class="breadcrumb-option">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="breadcrumb__text">
                    <h4>Check Out</h4>
                    <div class="breadcrumb__links">
                        <a href="./index.html">Home</a>
                        <a href="./shop.html">Shop</a>
                        <span>Check Out</span>
                    </div>
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
            <form action="#" method="post">
                <div class="row">
                    <div class="col-lg-8 col-md-6">
                        <h6 class="checkout__title">Billing Details</h6>
                        <c:if test="${error!=null}">
                            <p class="text-danger">${error }</p>
                        </c:if>
                        <div class="row">
                            <div class="col-lg-6">
                                <div class="checkout__input">
                                    <label class="form-label" for="firstname">First
                                        Name<span>*</span></label>
                                    <input style="color: #0b0b0b" name="firstname" type="text"
                                           id="firstname"
                                           class="form-control" value="${sessionScope.User.getFirstname()}"/>

                                </div>
                            </div>
                            <div class="col-lg-6">
                                <div class="checkout__input">
                                    <label class="form-label" for="lastname">Last Name<span>*</span></label>
                                    <input name="lastname" style="color: #0b0b0b" type="text" id="lastname"
                                           class="form-control"
                                           value="${sessionScope.User.getLastname()}"/>
                                </div>
                            </div>
                        </div>
                        <div class="checkout__input">
                            <label class="form-label" for="id_card">ID Card<span>*</span></label>
                            <input name="id_card" style="color: #0b0b0b" type="text" id="id_card" class="form-control"
                                   value="${sessionScope.User.getId_card()}"/>
                        </div>


                        <div class="checkout__input">
                            <label class="form-label" for="address">Address<span>*</span></label>
                            <input name="address" style="color: #0b0b0b" type="text" id="address" class="form-control"
                                   value="${sessionScope.User.getAddress()}"/>
                        </div>

                        <div class="row">
                            <div class="col-lg-6">
                                <div class="checkout__input">
                                    <label class="form-label" for="phone">Phone<span>*</span></label>
                                    <input name="phone" style="color: #0b0b0b" type="text" id="phone"
                                           class="form-control"
                                           value="${sessionScope.User.getPhone()}"/>
                                </div>
                            </div>
                            <div class="col-lg-6">
                                <div class="checkout__input">
                                    <label class="form-label" for="email">Email<span>*</span></label>
                                    <input name="email" style="color: #0b0b0b" type="email" id="email"
                                           class="form-control"
                                           value="${sessionScope.User.getEmail()}"/>
                                </div>
                            </div>
                        </div>
                        <div class="checkout__order" style="border-bottom: none">
                            <h4 style="border-top: 2px solid #d7d7d7; border-bottom: none" class="p-2 order__title">Note</h4>
                            <textarea name="content" style="color: #0b0b0b;" type="text" id="content" class="form-control"
                                      rows="10"
                                      value=""></textarea>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6">
                        <div class="checkout__order">
                            <h4 class="order__title">Your order</h4>
                            <div class="checkout__order__products">Product <span>Total</span></div>
                            <ul class="checkout__total__products">
                                <c:forEach items="${listCartItem}" var="li" varStatus="loop">
                                    <li>${loop.index + 1}. ${li.getProductName()}
                                        (${li.getCount()})(Size:${li.getSize()}) <span>${li.getTotal()} VND</span></li>
                                </c:forEach>

                            </ul>
                            <ul class="checkout__total__all">
                                <%--                                <li>Subtotal <span>$750.99</span></li>--%>
                                <li>SubTotal <span class="SubTotal">${total}</span></li>
                            </ul>
                            <h5 class="p-2">Paymen Method</h5>
                            <div class="checkout__input__checkbox pl-5">
                                <input class="form-check-input" type="radio" name="flexRadioDefault"
                                       id="flexRadioRegisterVendor" checked>
                                <label class="form-check-label" for="flexRadioRegisterVendor">
                                    Cash On Delivery
                                </label>
                            </div>
                            <h5 class="p-2">Delivery</h5>
                            <c:forEach items="${Delivery}" var="li" varStatus="loop">
                                <div class="checkout__input__checkbox pl-5">
                                    <input class="RadioDelivery  form-check-input" type="radio" name="RadioDelivery"
                                           id="${li.get_id()}" value="${li.get_id()}" ${loop.index==0?'checked':''}>
                                    <label class="form-check-label" for="${li.get_id()}">
                                            ${li.getName()}
                                        ( + <span class="deliveryPrice"
                                                  style="color: #e53637; font-weight: 700">${li.getPrice()}</span> VND )
                                        <p>( ${li.getEstimatedDeliveryDays()} ngày )</p>
                                    </label>
                                </div>
                            </c:forEach>
                            <ul class="checkout__total__all">
                                <%--                                <li>Subtotal <span>$750.99</span></li>--%>
                                <li>Total <span class="total">${total}</span></li>
                            </ul>
                            <button type="submit" class="site-btn">PLACE ORDER</button>
                        </div>
                    </div>
                </div>
            </form>
        </div>
    </div>
</section>
<!-- Checkout Section End -->


<!-- Begin Footer -->
<jsp:include page="/common/web/footer.jsp"></jsp:include>

<script>
    const deliveryBtn = document.getElementsByClassName("RadioDelivery");
    const total = document.getElementsByClassName("total");
    const SubTotal = document.getElementsByClassName("SubTotal");
    const deliveryPrice = document.getElementsByClassName("deliveryPrice");
    for (let i = 0; i < deliveryBtn.length; i++) {
        deliveryBtn[i].addEventListener("click", function () {
            total[0].innerText = parseInt(SubTotal[0].innerText) + parseInt(deliveryPrice[i].innerText);
        })
    }
    deliveryBtn[0].click()

</script>
<!-- End Footer -->
</body>

</html>