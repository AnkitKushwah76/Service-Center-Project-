<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.serviceCenter.dto.ShowOwnerProfileDto"%>
<%@page import="com.serviceCenter.entitiy.CreateShops"%>
<%@include file="/view/Navbar/UserNavbar.jsp"%>
<%@page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>this is about page</title>

</head>
<body>
	<h1 class="text-center">Show All ServiceCenter</h1>
	<
	<%
		ArrayList<CreateShops> ShowAllServiceCenter = (ArrayList<CreateShops>) request.getAttribute("findAllServices");
	%>

	-

	<div class="container mt-5">
		<div class="row">
			<%
				if (ShowAllServiceCenter.size() > 0) {
				for (int i = 0; i < ShowAllServiceCenter.size(); i++) {
			%>
			<div class="col-md-3">
				<div class="card" style="width: 15rem;">
					<samp>
						<img height="300" width="300"
							src="../view/ServiceCenterImage/<%=ShowAllServiceCenter.get(i).getShopImage()%>"
							class="card-img-top">
					</samp>
					<samp>

						<h6>
							OwnerName:-<%=ShowAllServiceCenter.get(i).getOwnerId().getUserName()%></h6>
						<h6>
							ShopName:-<%=ShowAllServiceCenter.get(i).getShopName()%></h6>
						<h6>
							Location:-<%=ShowAllServiceCenter.get(i).getLocation()%></h6>
					</samp>
					<%=ShowAllServiceCenter.get(i).getId()%>
					<a
						href="showAllService?servicesCenterId=<%=ShowAllServiceCenter.get(i).getId()%> "
						class="item">ClickHere:- </a>
				</div>

			</div>
			<%
				}
			}
			%>
		</div>
	</div>
</body>
</html>
