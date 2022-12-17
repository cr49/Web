<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<br>
<!-- Footer Section Begin -->
<footer class="footer">
    <div class="container">
        <div class="row">
            <div class="col-lg-3 col-md-6 col-sm-6">
                <div class="footer__about">
                    <div class="footer__logo">
                        <a href="#"><img src="/templates/Tu/img/footer-logo.png" alt=""></a>
                    </div>
                    <p>The customer is at the heart of our unique business model, which includes design.</p>
                    <a href="#"><img src="/templates/Tu/img/payment.png" alt=""></a>
                </div>
            </div>
            <div class="col-lg-2 offset-lg-1 col-md-3 col-sm-6">
                <div class="footer__widget">
                    <h6>Shopping</h6>
                    <ul>
                        <li><a href="#">Clothing Store</a></li>
                        <li><a href="#">Trending Shoes</a></li>
                        <li><a href="#">Accessories</a></li>
                        <li><a href="#">Sale</a></li>
                    </ul>
                </div>
            </div>
            <div class="col-lg-2 col-md-3 col-sm-6">
                <div class="footer__widget">
                    <h6>Shopping</h6>
                    <ul>
                        <li><a href="#">Contact Us</a></li>
                        <li><a href="#">Payment Methods</a></li>
                        <li><a href="#">Delivary</a></li>
                        <li><a href="#">Return & Exchanges</a></li>
                    </ul>
                </div>
            </div>
            <div class="col-lg-3 offset-lg-1 col-md-6 col-sm-6">
                <div class="footer__widget">
                    <h6>NewLetter</h6>
                    <div class="footer__newslatter">
                        <p>Be the first to know about new arrivals, look books, sales & promos!</p>
                        <form action="#">
                            <input type="text" placeholder="Your email">
                            <button type="submit"><span class="icon_mail_alt"></span></button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-12 text-center">
                <div class="footer__copyright__text">
                    <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                    <p>Copyright ©
                        <script>
                            document.write(new Date().getFullYear());
                        </script>2020
                        All rights reserved | This template is made with <i class="fa fa-heart-o"
                                                                            aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
                    </p>
                    <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                </div>
            </div>
        </div>
    </div>
</footer>

<!-- Mở menu user -->
<script>
    const app = document.querySelector('.app__header-user-display');
    const menuClick = document.querySelector('.app__header-user-menu');
    function user_menu_click() {
        // hideUserMenu();

        menuClick.classList.toggle("show");
    }

    app.addEventListener('click', user_menu_click);
    menuClick.addEventListener('click', function () {
        event.stopPropagation();
    });
    app.addEventListener('click', function () {
        event.stopPropagation();
    });
    document.addEventListener('click', function () {
        menuClick.classList.remove('show')
    })
    console.log("Link js thanh cong");
</script>
<!-- Js Plugins -->
<script type="module" src="<c:url value="/templates/Tu/js/jquery-3.3.1.min.js"/>"></script>
<script type="module" src="<c:url value="/templates/Tu/js/bootstrap.min.js"/>"></script>
<script type="module" src="<c:url value="/templates/Tu/js/jquery.nice-select.min.js"/>"></script>
<script type="module" src="<c:url value="/templates/Tu/js/jquery.nicescroll.min.js"/>"></script>
<script type="module" src="<c:url value="/templates/Tu/js/jquery.magnific-popup.min.js"/>"></script>
<script type="module" src="<c:url value="/templates/Tu/js/jquery.countdown.min.js"/>"></script>
<script type="module" src="<c:url value="/templates/Tu/js/jquery.slicknav.js"/>"></script>
<script type="module" src="<c:url value="/templates/Tu/js/mixitup.min.js"/>"></script>
<script type="module" src="<c:url value="/templates/Tu/js/owl.carousel.min.js"/>"></script>
<script type="module" src="<c:url value="/templates/Tu/js/main.js"/>"></script>
<!-- Footer Section End -->
