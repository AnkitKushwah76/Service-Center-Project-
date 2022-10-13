
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>signup page</title>
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

						<h1 class="text-center">AddServices Here !!</h1>

						<span id="errMsg"></span>
						<h2 class="text-center text-success">${sucessfull}</h2>
						<form name="form1" action="/addService" method="post"
							onsubmit="return checkCaptcha()">

							<!--  name-field -->


							<div class="form-group">
								<label for="name_field">AddServices</label> <input type="text"
									name="addServices" ;
									class="form-control "
									id="name_field" aria-describedby="emailHelp"
									placeholder="Add-Services" required />



							</div>
                         <div class="container text-center">

									<button onsubmit="checkCaptcha" type="submit"
										class="btn bg-primary  text-white">Add</button>
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
