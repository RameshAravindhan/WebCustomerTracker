<%--
  Created by IntelliJ IDEA.
  User: rames
  Date: 15-10-2021
  Time: 20:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>List Customers</title>

    <!-- reference our style sheet -->

    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/style.css"/>

</head>
<body>

<div id="wrapper">
    <div id="header">
        <h2>CRM - Customer Relationship Manager</h2>
    </div>
</div>

<div id="container">

    <div id="content">

        <input type="button" value="Add Customer" onclick="window.location.href='showFormForAdd';return false;"
               class="add-button"/>



        <!--  add our html table here -->

        <table>
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
                <th>Action</th>
            </tr>

            <!-- loop over and print our customers -->
            <c:forEach var="tempCustomer" items="${customers}">

                <tr>
                    <td> ${tempCustomer.firstName} </td>
                    <td> ${tempCustomer.lastName} </td>
                    <td> ${tempCustomer.email} </td>
                    <td><a href="/WebCustomerTracker_war_exploded/customer/UpdateCustomer?id=${tempCustomer.id}"	 type="button">Update</a>|<a href="/WebCustomerTracker_war_exploded/customer/DeleteCustomer?id=${tempCustomer.id}"	 type="button">Delete</a></td>
                </tr>

            </c:forEach>

        </table>

    </div>

</div>


</body>
</html>