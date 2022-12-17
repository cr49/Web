<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<header class="header" style="position: fixed; z-index: 100; width: 100%;">
  <div class="header__top">
    <div class="container">
      <div class="row">
        <div class="col-lg-6 col-md-7">
          <div class="header__top__left">
            <p>Welcome to our perfect store !!!</p>
          </div>
        </div>
        <div class="col-lg-6 col-md-5">

          <div class="header__top__right" style="justify-content: flex-end;">
            <div class="NameUser">
              <h4 class="p-3" style="color: #ffffff" >${User.getFirstname()} ${User.getLastname()}</h4>
            </div>
            <div class="header__top__links">
              <c:if test="${User==null}">
                  <a href="/Final_Project/Login">Sign in</a>
              </c:if>

              <c:if test="${User!=null}">
              <div class="app__header-user" style="text-align: left;">
                <div class="app__header-user-display">
                  <!-- <div class="app__header-user-display" onclick="user_menu_click()"> -->
                  <div class="app__header-user-btn">
                    <img src="${User.getAvatar()}"
                         alt="" class="user-img">

                  </div>
                  <i class="fa-sharp fa-solid fa-caret-down"
                     style="font-size: 24px; color: #fff;"></i>

                </div>

                <div class="app__header-user-menu">
                  <div class="user-menu-text">
                    TÀI KHOẢN CỦA TÔI ( ${User.getFirstname()} ${User.getLastname()} )
                  </div>
                  <div class="user-menu-option">
                    <ul>
                      <li>
                        <i class="fa-solid fa-cart-shopping"></i>
                        <a href="/Final_Project/AddCart" style="color: #0b0b0b">Giỏ hàng</a>
                      </li>

                      <li>
                        <i class="fa-solid fa-address-card"></i>
                        <a href="/Final_Project/MyProfile" style="color: #0b0b0b">Hồ sơ của tôi</a>
                      </li>
                      <li>
                        <i class="fa-solid fa-clock-rotate-left"></i>
                        <a href="/Final_Project/MyHistory" style="color: #0b0b0b">Lịch sử mua hàng</a>
                      </li>

                      <span>
                                                Đặc biệt
                                            </span>

<%--                      <li class="landlord-register"--%>
<%--                          onclick="location.href='./HTML/propertyLandlord.html'">--%>
<%--                        <i class="fa-solid fa-house-flag"></i>--%>
<%--                        <!-- <a href="/HTML/propertyLanlord.html"> -->--%>
<%--                        Tạo cửa hàng--%>
<%--                        <!-- </a> -->--%>
<%--                      </li>--%>
                      <button class="user-menu-option-logout" onclick="location.href='LogOut'">
                        <i class="fa-solid fa-right-from-bracket"></i>
                        Đăng xuất
                      </button>
                    </ul>
                  </div>
                </div>
              </c:if>
            </div>

            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="container">
    <div class="row">
      <div class="col-lg-3 col-md-3">
        <div class="header__logo" style="padding: 18px 0;">

        </div>
      </div>
      <div class="col-lg-6 col-md-6">
        <nav class="header__menu mobile-menu" style="padding: 18px 0;">
          <ul>
            <li class="${currentHeader=='Home'?'active':''}"><a href="/Final_Project/Home">Home</a></li>
            <li class="${currentHeader=='Product'?'active':''}"><a href="/Final_Project/Products?cid=0">Products</a></li>
            <li class="${currentHeader=='Store'?'active':''}"><a href="/Final_Project/Store">Stores</a>
<%--              <ul class="dropdown">--%>
<%--                <li><a href="./about.html">About Us</a></li>--%>
<%--                <li><a href="./shop-details.html">Shop Details</a></li>--%>
<%--                <li><a href="./shopping-cart.html">Shopping Cart</a></li>--%>
<%--                <li><a href="./checkout.html">Check Out</a></li>--%>
<%--                <li><a href="./blog-details.html">Blog Details</a></li>--%>
<%--              </ul>--%>
            </li>
<%--            <li><a href="./blog.html">Blog</a></li>--%>
<%--            <li><a href="./contact.html">Contacts</a></li>--%>
          </ul>
        </nav>
        <c:if test="${sessionScope.message!=null}">
          <p style=" border-radius: 8px ;text-align: center; background-color: #44ff68; color: #ffffff" >${sessionScope.message} ${sessionScope.message =null}</p>
        </c:if>
        <c:if test="${sessionScope.messageError!=null}">
          <p style=" border-radius: 8px ;text-align: center; background-color: #ff0000; color: #ffffff" >${sessionScope.messageError} ${sessionScope.messageError =null}</p>
        </c:if>
      </div>

    </div>
    <div class="canvas__open"><i class="fa fa-bars"></i></div>
  </div>
</header>


