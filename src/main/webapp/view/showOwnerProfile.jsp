<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.serviceCenter.dto.ShowOwnerProfileDto"%>
<%@page import="com.serviceCenter.entitiy.CreateShops"%>
<%@include file="/view/Navbar/ServiceCenterOwner.jsp"%>
<%@page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>this is about page</title>

</head>
<body>
<h1 class="text-center">Show All Shops </h1>
<%
 ShowOwnerProfileDto profile = (ShowOwnerProfileDto) request.getAttribute("OwnerProfileDto");
ArrayList<CreateShops> ShowOwnerProfile = (ArrayList<CreateShops>) profile.getCreateShops();
%>	
	 

		<div class="container mt-5">
			<div class="row">
				<%
					if (ShowOwnerProfile.size() > 0) {
					for (int i = 0; i < ShowOwnerProfile.size(); i++) {
				%>
				<div class="col-md-3">
					<div class="card" style="width: 15rem;">
						<samp>
							<img height="300" width="300"
							src="../view/ServiceCenterImage/<%=ShowOwnerProfile.get(i).getShopImage()%>"
							class="card-img-top">
							</samp>
							<samp>
								
						<h6>OwnerName:-<%=ShowOwnerProfile.get(i).getOwnerId().getUserName() %></h6>
						<h6>ShopName:-<%=ShowOwnerProfile.get(i).getShopName() %></h6>
							</samp>
							
							<a href="addServices?servicesCenterId=<%=ShowOwnerProfile.get(i).getId()%>&servicesCenterName=<%=ShowOwnerProfile.get(i).getShopName()%> "class="item">AddServices:-
						 </a> 

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
 