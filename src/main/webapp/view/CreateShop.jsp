
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>CreateShop page</title>
<link href="/view/css/style.css" rel="stylesheet" type="text/css">
<%@include file="/view/Navbar/ServiceCenterOwner.jsp"%>
<link href="/view/css/a.css" rel="stylesheet" type="text/css">




</head>
<body>
	<section>
		<div class="container">
			<div class="row">
				<div class="col-md-6 offset-md-3">

					<div class="my-card mt-5">

						<!-- <div class="contatiner text-center">
							<img style="width: 80px;" src="/view/img/membership.png" />
						</div>
 -->
						<h1 class="text-center">CreateShop !!</h1>


						<span id="errMsg"></span>
						<h2 class="text-center text-success">${createshop}</h2>
						<form id="fileupload" 
							name="form1" method ="post" action="/CreateShop" enctype="multipart/form-data">

							<!--  email-field -->

							<div class="form-group">
								<label for="shopName" class="text-info">ShopName</label> <input
									type="text" name="shopName" class="form-control" id="shopName"
									aria-describedby="emailHelp" placeholder="Enter ShopName"
									required />

							</div>
							<div class="form-group">
								<label for="address" class="text-info">Address</label> <input
									type="text" name="address" class="form-control" id="address"
									aria-describedby="emailHelp" placeholder="Enter ShopAddress"
									required />

							</div>
							<!--  password-field -->

							<div class="form-group">
								<label for="location" class="text-info">Location</label> <input
									name="location" type="text" class="form-control"
									id="password_field" aria-describedby="emailHelp"
									placeholder="Enter ShopLocation" required>

							</div>
							<div class="form-group">
								<label class="text-info">ShopImage</label><br> <input
									type="file" name="shopImage1" id="shopImage"
									class="form-control">
							</div>

							<div class="container text-center">

								<button onsubmit="checkCaptcha" type="submit"
									class="btn bg-primary  text-white">Submit</button>
								<button type="reset" class="btn btn-warning  ">Reset</button>
							</div>
						</form>

					</div>
				</div>

			</div>

		</div>
	</section>

</body>
</html>
