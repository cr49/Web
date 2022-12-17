<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
  <!-- Font Awesome -->
  <link
          href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"
          rel="stylesheet" />
  <!-- Google Fonts -->
  <link
          href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap"
          rel="stylesheet" />
  <!-- MDB -->
  <link
          href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.0.0/mdb.min.css"
          rel="stylesheet" />
</head>

<body>
<div class="body  d-flex align-items-center justify-content-center ">

  <div class="content_body pt-200 "
       style="height: auto; width: 500px; padding-top: 25px;">
    <!-- Pills navs -->
    <ul class="nav nav-pills nav-justified mb-3" id="ex1" role="tablist">

      <li class="nav-item" role="presentation"><a class="nav-link"
                                                  id="tab-register" data-mdb-toggle="pill" href="#pills-register"
                                                  role="tab" aria-controls="pills-register" aria-selected="false">Update Store</a>
      </li>
    </ul>
    <!-- Pills navs -->

    <!-- Pills content -->
    <div class="tab-content">
      <div class="tab-pane fade" id="pills-register" role="tabpanel"
           aria-labelledby="tab-register">
        <form action="/Final_Project/vendor/stores/update?id=${store._id}" method="post" enctype="multipart/form-data">

          <!-- FirstName input -->
          <div class="form-outline mb-4">
            <input type="text" name="name" id="name" class="form-control" value="${store.name}" />
            <label class="form-label" for="name">Name</label>
          </div>

          <!-- LastName input -->
          <div class="form-outline mb-4">
            <input type="text" name="bio" id="bio" class="form-control"  value="${store.bio}" />
            <label class="form-label" for="bio">Description</label>
          </div>

          <div class="form-outline mb-4" hidden="hidden">
            <input type="text" name="ownerId" id="ownerId" class="form-control" value="${sessionScope.User._id}"/>
            <label class="form-label" for="ownerId">ownerID</label>
          </div>


          <div class="form-outline mb-4">
            <c:url value="/image?fname=store/${store.avatar!=null?store.avatar:'store_default.jpg'}"
                   var="imgUrl"></c:url>
            <img src="${imgUrl}" alt=""
                 class="img-fluid p-1" height="100px" width="100px">
          </div>

          <div class="form-outline mb-4">
            <%--							<label for="images">Images:</label> <input type="file"--%>
            <%--						   class="form-control" name="images" id="images"--%>
            <%--						   value="${category.images}" />--%>

            <input type="file" name="images" id="images" class="form-control" />
            <label class="form-label" for="images">Images</label>

          </div>

          <!-- Submit button -->
          <button type="submit" class="btn btn-primary btn-block mb-3">Update Store</button>
        </form>
      </div>
    </div>
    <!-- Pills content -->
  </div>
</div>

<!-- MDB -->
<script type="text/javascript"
        src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.0.0/mdb.min.js"></script>
</body>

</html>