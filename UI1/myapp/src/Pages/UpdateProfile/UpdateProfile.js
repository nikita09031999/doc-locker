import React from 'react'

export default function UpdateProfile() {
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
							<div class="col-md-8 col-lg-8">
								<div class="wrap d-md-flex">
									<div class="img" style={{ 'background-image': 'url(assets/img/profile.png)' }}>
									</div>
									
									<div class="login-wrap p-4 p-md-5">
										<div class="d-flex">
											<div class="w-80 ">
												<h3 class="mb-4"><u>Update Profile</u></h3>
											</div>
											<div class="w-80">
												<p class="social-media d-flex justify-content-end">
												</p>
											</div>
										</div>
										<div class="form-group mb-3">
										<label class="label" style={{ 'padding-top': '18px', 'height': '55px' }}></label>
                                            <button type="submit"
                                        	    class="form-control btn btn-primary rounded submit px-3">Change Profile Photo</button>
                                    	</div>
										
										<div class="form-group mb-3">
										<label class="label" style={{ 'padding-top': '18px', 'height': '55px' }}></label>
											<button type="submit"
												class="form-control btn btn-primary rounded submit px-3">Change Username</button>
										</div>

                                        <div class="form-group mb-3">
										<label class="label" style={{ 'padding-top': '18px', 'height': '55px' }}></label>
                                            <button type="submit"
                                        	    class="form-control btn btn-primary rounded submit px-3">Reset Password</button>
                                    	</div>
										<div class="form-group mb-3">
											<label class="label" style={{ 'padding-top': '18px', 'height': '55px' }}></label>
											<button type="submit"
												class="form-control btn btn-primary rounded submit px-3">Update</button>
										</div>

										<p class="text-right"><u><a href="/dashboard4">Home<i class="bi bi-house-fill"></i></a></u></p>
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
