<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
    <div class="container">
        <a class="navbar-brand" href="/BTct6/Home">Simple Ecommerce</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse justify-content-end" id="navbarsExampleDefault">
            <ul class="navbar-nav m-auto">
                <li class="nav-item ${headerId == 'Home' ? 'active':''} ">
                    <a class="nav-link" href="/BTct6/Home">Home <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item ${headerId == 'Categories' ? 'active':''}">
                    <a class="nav-link" href="/JPACT6/admin-category">Categories</a>
                </li>
                <li class="nav-item ${headerId == 'Video' ? 'active':''}">
                    <a class="nav-link" href="/JPACT6/admin-video">Video</a>
                </li>
                <li class="nav-item ${headerId == 'Cart' ? 'active':''}">
                    <a class="nav-link" href="/JPACT6/Products">Cart</a>
                </li>
                <li class="nav-item ${headerId == 'Contact' ? 'active':''}">
                    <a class="nav-link" href="contact.html">Contact</a>
                </li>
                <c:if test="${sessionScope.acc.roleId == 1}">
					<li class="nav-item"><a class="nav-link" href="#">Manager
							Account</a></li>
				</c:if>
				<c:if test="${sessionScope.acc.roleId == 2}">
					<li class="nav-item"><a class="nav-link" href="/Project_CuoiKy/ManagerProduct">Manager
							Product</a></li>
				</c:if>
                <c:if test="${sessionScope.acc != null}">
					<li class="nav-item"><a class="nav-link" href="#">Hello
							${sessionScope.acc.username}</a></li>
					<li class="nav-item"><a class="nav-link" href="logout">Logout</a></li>
				</c:if>
				<c:if test="${sessionScope.acc == null}">
					<li class="nav-item"><a class="nav-link"
						href="/BTct6/Loginsv">Login</a></li>
				</c:if>
            </ul>

            <form action="search" method="post" class="form-inline my-2 my-lg-0">
                <div class="input-group input-group-sm">
                    <input name="txt" type="text" class="form-control" placeholder="Search...">
                    <div class="input-group-append">
                        <button type="submit" class="btn btn-secondary btn-number">
                            <i class="fa fa-search"></i>
                        </button>
                    </div>
                </div>
                <a class="btn btn-success btn-sm ml-3" href="cart.html">
                    <i class="fa fa-shopping-cart"></i> Cart
                    <span class="badge badge-light">3</span>
                </a>
            </form>
        </div>
    </div>
</nav>
