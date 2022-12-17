<%-- 
    Document   : ManagerProduct
    Created on : Dec 28, 2020, 5:19:02 PM
    Author     : trinh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Bootstrap CRUD Data Table for Database with Modal Form</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="css/manager.css" rel="stylesheet" type="text/css"/>
        <style>
            img{
                width: 200px;
                height: 120px;
            }
        </style>
    <body>
        <div class="container">
            <div class="table-wrapper">
                <div class="table-title">
                    <div class="row">
                        <div class="col-sm-6">
                            <h2>Edit <b>Order</b></h2>
                        </div>
                        <div class="col-sm-6">
                        </div>
                    </div>
                </div>
            </div>
            <div id="editEmployeeModal">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <form action="EditDonhangControl" method="post">
                            <div class="modal-header">						
                                <h4 class="modal-title">Edit Order</h4>
                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                            </div>
                            <div class="modal-body">					
                                <div class="form-group">
                                    <label>ID</label>
                                    <input value="${detail.id}" name="id" type="text" class="form-control" readonly required>
                                </div>
                                <div class="form-group">
                                    <label>User Id</label>
                                    <input value="${detail.userid}" name="userid" type="text" class="form-control" required>
                                </div>
                                <div class="form-group">
                                    <label>Delivery Id</label>
                                    <input value="${detail.deliveryid}" name="deliveryid" type="text" class="form-control" required>
                                </div>
                                <div class="form-group">
                                    <label>Shipping Date</label>
                                    <input value="${detail.shippingdate}" name="shippingdate" type="text" class="form-control" required>
                                </div>
                                <div class="form-group">
                                    <label>Store Id</label>
                                    <input value="${detail.storeid}" name="storeid" type="text" class="form-control" required>
                                </div>
                                <div class="form-group">
                                    <label>Address</label>
                                    <input value="${detail.address}" name="address" type="text" class="form-control" required>
                                </div>
                                <div class="form-group">
                                    <label>Phone</label>
                                    <input value="${detail.phone}" name="phone" type="text" class="form-control" required>
                                </div>
                                <div class="form-group">
                                    <label>Status</label>
                                    <input value="${detail.status}" name="status" type="text" class="form-control" required>
                                </div>
                                <div class="form-group">
                                    <label>Paid Before</label>
                                    <input value="${detail.ispaidbefore}" name="paidbefore" type="text" class="form-control" required>
                                </div>
                                <div class="form-group">
                                    <label>Amount from User</label>
                                    <input value="${detail.amountfromuser}" name="afu" type="text" class="form-control" required>
                                </div>
                                <div class="form-group">
                                    <label>Amount from Store</label>
                                    <input value="${detail.amountfromstore}" name="afs" type="text" class="form-control" required>
                                </div>
                                <div class="form-group">
                                    <label>Amount to Store</label>
                                    <input value="${detail.amounttostore}" name="ats" type="text" class="form-control" required>
                                </div>
                                <div class="form-group">
                                    <label>Amount to GD</label>
                                    <input value="${detail.amounttogd}" name="atg" type="text" class="form-control" required>
                                </div>
                                <div class="form-group">
                                    <label>Create Date</label>
                                    <input value="${detail.create}" name="create" type="text" class="form-control" required>
                                </div>
                            </div>
                            <div class="modal-footer">
                                <input type="submit" class="btn btn-success" value="Edit">
                            </div>
                        </form>
                    </div>
                </div>
            </div>

        </div>


        <script src="js/manager.js" type="text/javascript"></script>
    </body>
</html>