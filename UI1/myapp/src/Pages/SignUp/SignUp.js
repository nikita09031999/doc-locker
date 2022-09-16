import React from 'react'
import { Link } from 'react-router-dom'



export default function SignUp() {

	return (
        <div>
			<head>
				<title>Student Login</title>
				<meta charset="utf-8" />
				<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
				<link href="https://fonts.googleapis.com/css?family=Lato:300,400,700&display=swap" rel="stylesheet" />
				<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" />
                <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/css/all.min.css" />
				<link rel="stylesheet" href="assets/css/stylel.css" />
			</head>
			<body>
				<section class="ftco-section">
					<div class="container-fluid">

						<div class="row justify-content-center">
							<div class="col-md-8 col-lg-9">
								<div class="wrap d-md-flex">
									<div class="img" style={{ 'background-image': 'url(assets/img/signup2.png)' }}>
									</div>
									<div class="login-wrap p-4 p-md-5">
										<div class="d-flex">
											<div class="w-100 ">
												<h3 class="mb-4">Sign Up</h3>
											</div>
											<div class="w-80">
												<p class="social-media d-flex justify-content-end">
												</p>
											</div>
										</div>
										<form action="/admin/index.html" class="signin-form">
											<div class="form-group mb-3">
											<i class="fa fa-user"></i>
												<label class="label" for="name">First Name</label>
												<input type="text" class="form-control" placeholder="First Name" required />
											</div>
                                            <div class="form-group mb-3">
											<i class="fa fa-user"></i>
											<label class="label" for="password">Last Name</label>
											<input type="text" class="form-control" placeholder="Last Name" required />
										</div>

										
                                        <div class="form-group mb-3">
											<i class="fa fa-envelope-square"></i>
												<label class="label" for="password">Email Id</label>
												<input type="email" class="form-control" placeholder="Email Id" required />
										</div>
	
											<div class="form-group mb-3">
											<i class="fa fa-phone"></i>
												<label class="label" for="password">Mobile No</label>
												<input type="number" class="form-control" placeholder="Mobile No" required />
											</div>
											
											
										</form>
									</div>
									<div class="login-wrap p-4 p-md-5">
										<div class="d-flex">
											<div class="w-100 ">
												<h3 class="mb-4">
													<br />
												</h3>
											</div>


											<div class="w-80">
												<p class="social-media d-flex justify-content-end">
												</p>
											</div>
										</div>
                                        <div class="form-group mb-3">
											<i class="fa fa-user-circle"></i>
												<label class="label" for="password">User Name</label>
												<input type="text" class="form-control" placeholder="User Name" required />
										</div>
										
                                        
										
										<div class="form-group mb-3">
										<i class="fa fa-unlock-alt"></i>
											<label class="label" for="password">Password</label>
											<input type="password" class="form-control" placeholder="Password" required />
                                            
										</div>
                                        <div class="form-group mb-3">
										<i class="fa fa-unlock-alt"></i>
											<label class="label" for="password">Confirm Password</label>
											<input type="password" class="form-control" placeholder="Password" required />
                                            
										</div>
										
										<div class="form-group mb-3">
											<label class="label" style={{ 'padding-top': '18px', 'height': '55px' }}></label>
											<button type="submit" 
												class="form-control btn btn-primary rounded submit px-3">Sign Up</button>
										</div>

										

										<div className="row">
										<div className="col">
										<Link to ={'/signin'}>Already an user? Sign In</Link>
										
										</div>
										<div className="col">
										{/*<p class="text-center"><a href="/signin">Already an user? Sign In</a></p>*/}
										<p class="text-center"><a href="/">Home</a><i class="bi bi-house-fill"></i></p>

										</div>
										</div>
										
										
									</div>
								</div>
							</div>
						</div>
						
					</div>
				</section>
				
			</body>
			
			
		</div>
		
	)
}
