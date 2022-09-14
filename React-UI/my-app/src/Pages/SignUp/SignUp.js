//import React from 'react'
import React, { useState } from 'react'
import Axios from 'axios'

export default function SignUp() {

	
	const [firstName, setFirstName] = useState('')
	const [lastName, setLastName] = useState('')
	const [userName, setUserName] = useState('')
	const [password, setPassword] = useState('')
	const [email, setEmail] = useState('')
	const [mobileNo, setMobileNo] = useState('')
	

	const postData = async (e) => {
		e.preventDefault();
		try{
			
			const res = await Axios.post('http://localhost:8080/user/adduser',{firstName,lastName,userName,password,email,mobileNo})
			if(res.data !== ""){window.location.href = "/dashboard"}
			else{window.location.href = "/"}
			}
			catch (err){
				console.log(err)
			}
       
	 }
	
 
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
							<div class="col-md-8 col-lg-10">
								<div class="wrap d-md-flex">
									<div class="img" style={{ 'background-image': 'url(assets/img/Logo.png)', 'margin-left': '50px' }}>
									</div>
									<div class="login-wrap p-4 p-md-5">
										<div class="d-flex">
											<div class="w-100 ">
												<h3 class="mb-4"> Sign Up</h3>
											</div>
											<div class="w-100">
												<p class="social-media d-flex justify-content-end">
												</p>
											</div>
										</div>
										<form action="/admin/index.html" class="signin-form">
											<div class="form-group mb-3">
												<label class="label" for="name">First Name</label>
												<input type="text" class="form-control" placeholder="First Name" onChange={(e) => setFirstName(e.target.value)} required />
											</div>
                                            <div class="form-group mb-3">
											<label class="label" for="password">Last Name</label>
											<input type="text" class="form-control" placeholder="Last Name"  onChange={(e) => setLastName(e.target.value)} required />
										</div>
                                        <div class="form-group mb-3">
												<label class="label" for="password">Email Id</label>
												<input type="email" class="form-control" placeholder="Email Id"  onChange={(e) => setEmail(e.target.value)} required />
											</div>
											<div class="form-group mb-3">
												<label class="label" for="password">Mobile No</label>
												<input type="number" class="form-control" placeholder="Mobile No"  onChange={(e) => setMobileNo(e.target.value)} required />
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
											<div class="w-100">
												<p class="social-media d-flex justify-content-end">
												</p>
											</div>
										</div>
                                        <div class="form-group mb-3">
												<label class="label" for="password">User Name</label>
												<input type="text" class="form-control" placeholder="User Name"  onChange={(e) => setUserName(e.target.value)} required />
											</div>
										
                                        
										
										<div class="form-group mb-3">
											<label class="label" for="password">Password</label>
											<input type="password" class="form-control" placeholder="Password" onChange={(e) => setPassword(e.target.value)} required />
                                            <i class="far fa-eye"></i>
										</div>
                                        <div class="form-group mb-3">
											<label class="label" for="password">Confirm Password</label>
											<input type="password" class="form-control" placeholder="Password" required />
                                            <i class="far fa-eye"></i>
										</div>
										<div class="form-group mb-3">
											<label class="label" style={{ 'padding-top': '18px', 'height': '55px' }}></label>
											<button type="submit"
												class="form-control btn btn-primary rounded submit px-3" onClick={postData}>Sign Up</button>
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