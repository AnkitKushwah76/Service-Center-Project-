
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>signup page</title>
<link href="/view/css/style.css" rel="stylesheet" type="text/css">
<%@include file="/view/Navbar/UserNavbar.jsp"%>
<link href="/view/css/a.css" rel="stylesheet" type="text/css">




</head>
<body>
	<section>
		<div class="container">
			<div class="row">
				<div class="col-md-6 offset-md-3">

					<div class="my-card mt-5">
						<h1 class="text-center">BookServiceCenter Here !!</h1>

						<span id="errMsg"></span>
						<h2 class="text-center text-success">${sucessfull}</h2>
						<form name="form1" action="/register" method="post"
							onsubmit="return checkCaptcha()">

							<!--  name-field -->


							<div class="form-group">
								<label for="name_field">Your Name</label> <input type="text"
									name="userName" ;
									class="form-control "
									id="name_field" aria-describedby="emailHelp"
									placeholder="Enter Name" required />
							</div>

							<!--  email-field -->

							<div class="form-group">
								<label for="email_field">Your Email</label> <input type="email"
									name="userEmail" class="form-control" id="email_field"
									aria-describedby="emailHelp" placeholder="Enter email" required />

							</div>
							<!--  password-field -->

							<div class="form-group">
								<label for="password_field">Your Password</label> <input
									name="userPassword" type="password" class="form-control"
									id="password_field" aria-describedby="emailHelp"
									placeholder="Enter password" required>
								<tr>
									<td>Choose Role</td>
									<td><select id="choice" name="role" required>
											<option selected>Open this select menu</option>
											<option value="Clint">Clint</option>
											<option value="ServiceCenterOwner">Service-Center-Owner</option>
											<option value="Admin">Admin</option> Service Center Owner
									</select></td>
								</tr>
								<br> <br>
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
