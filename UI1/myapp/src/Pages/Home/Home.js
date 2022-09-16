import React from 'react'

const Home = () => {
  return (
    
    <div

    
    style={{
      backgroundImage: "url(assets/img/lock.png)",
      left: 0,
      right: 0,
      position: "absolute",
      backgroundPosition: "center",
      backgroundSize: "cover",
      backgroundRepeat: "no-repeat",
      width: "100vw",
      height: "100vh",
    }}
    >
    

    {/*---------------HEADER-----------------*/}

    <header id="header" class="d-flex align-items-center fixed-top">
    <div class="container d-flex align-items-center"><img src="assets/img/Logo.png" alt="" width="50" height="200"
        class="img-fluid"/>

      <h1 class="logo me-auto"><a href="index.html">&nbsp; DocLocker</a></h1>
     
      <a href="index.html" class="logo me-auto"></a>

      <nav id="navbar" class="navbar">
        <ul>
          <li><a class="nav-link scrollto active" href="#hero">Home</a></li>
          <li><a class="nav-link scrollto" href="#about">About</a></li>
          <li><a class="nav-link scrollto" href="#faq">F.A.Q.</a></li>
          <li class="dropdown"><a href="#"><span>Login</span> <i class="bi bi-chevron-down"></i></a>
            <ul>
              <li><a href="login/index.html">Admin</a></li>
              <li><a href="/signup">User</a></li>
            </ul>
          </li>
        </ul>
        <i class="bi bi-list mobile-nav-toggle"></i>
      </nav>  

    </div>
  </header>




   {/*---------------TEMPLATE-----------------*/}
   {/*<section id="hero" class="hero">*/}
   <section id="hero" class="d-flex align-items-center">
   
    <div class="d-flex align-items-center">
      <div class="container position-relative text-center text-lg-start" data-aos="zoom-in" data-aos-delay="100">
        <div class="row">
          <div class="col-lg-12">
            <h1>Welcome to <span>DocLocker</span></h1>
            <h2>Secure your documents!!</h2>

            <div class="btns">
              <a href="/signup" class="btn-menu animated fadeInUp scrollto">SignUp</a>
              <a href="/signin" class="btn-book animated fadeInUp scrollto">SignIn</a>

                {/*<a href="#menu" class="btn-menu animated fadeInUp scrollto">SignUp</a>
                <a href="#book-a-table" class="btn-book animated fadeInUp scrollto">SignIn</a>*/}
           
            </div>
          </div>
        <div class="col-lg-4 d-flex align-items-center justify-content-center position-relative" data-aos="zoom-in" data-aos-delay="200"></div>
        </div>
      </div>
    </div>
    </section>
    


    {/*---------------About-us-----------------*/}

    <section id="about" class="faq section-bg" style={{"backgroundColor":"white"}}>
      <div class="container" data-aos="fade-up">

        <div class="section-title">
          <h1>About Us</h1>
        </div>

        <p> &nbsp;Doc locker provides a service to access authentic documents/certificates like PAN Card, passport, mark sheets and degree certificates in digital format which eliminates the use of physical documents. Doc Locker provides an online platform for personal storage space in the cloud. Users can also manage and securely store the copies of legacy documents in Doc Locker. Doc locker services enable users to upload their own content or provide synchronization software with other people using links or QR code without sending large attachments. The service is intended to minimize the use of physical documents, provide authenticity of the e-documents to make it easy for the third person to receive services. Documents will be made available for the third person virtually where user will provide link or QR code to the third person who will be able to view or download the requested document as per users accessibility.</p>
        <p> Today Online Examination System has become fast growing examination method because of its speed and
          accuracy. Online Examination System is the simplest to use web-based application for institute, completely
          automated paperless examinations. E-Pariksha is web-based application provides facility to conduct online
          examination. </p>
          {/*
        <p> The Administrator can manage Students as well as teachers. Admin can manage subjects and can analyse
          performance of students. </p>
        <div class="row content">
          <div class="col-lg-6"> </div>
        </div>
        <p> Student can register, login and attend the exam with his PRN No on scheduled date. Also students can see the
          score after submitting the exam. Students can view all previous exam scores. </p>
              */}

      </div>
    </section>






{/*---------------FAQ-----------------*/}


<section id="faq" class="basic h6">
      <div class="container" data-aos="fade-up">

        <div class="section-title">
          <h2>Frequently Asked Questions</h2>
        </div>

        <div class="faq-list">
          <ul>
            <li data-aos="fade-up" data-aos-delay="100">
              <i class="bx bx-help-circle icon-help"></i> <a data-bs-toggle="collapse" class="collapse"
                data-bs-target="#faq-list-1">How many attempt that I can take the exam? <i
                  class="bx bx-chevron-down icon-show"></i><i class="bx bx-chevron-up icon-close"></i></a>
              <div id="faq-list-1" class="collapse " data-bs-parent=".faq-list">
                <p>
                  Only once.
               </p>
              </div>
            </li>

            <li data-aos="fade-up" data-aos-delay="200">
              <i class="bx bx-help-circle icon-help"></i> <a data-bs-toggle="collapse" data-bs-target="#faq-list-2"
                class="collapsed">Feugiat scelerisque varius morbi enim nunc? <i
                  class="bx bx-chevron-down icon-show"></i><i class="bx bx-chevron-up icon-close"></i></a>
              <div id="faq-list-2" class="collapse" data-bs-parent=".faq-list">
                <p>
                  Dolor sit amet consectetur adipiscing elit pellentesque habitant morbi. Id interdum velit laoreet id
                  donec ultrices. Fringilla phasellus faucibus scelerisque eleifend donec pretium. Est pellentesque elit
                  ullamcorper dignissim. Mauris ultrices eros in cursus turpis massa tincidunt dui.
                </p>
              </div>
            </li>

            <li data-aos="fade-up" data-aos-delay="300">
              <i class="bx bx-help-circle icon-help"></i> <a data-bs-toggle="collapse" data-bs-target="#faq-list-3"
                class="collapsed">Dolor sit amet consectetur adipiscing elit? <i
                  class="bx bx-chevron-down icon-show"></i><i class="bx bx-chevron-up icon-close"></i></a>
              <div id="faq-list-3" class="collapse" data-bs-parent=".faq-list">
                <p>
                  Eleifend mi in nulla posuere sollicitudin aliquam ultrices sagittis orci. Faucibus pulvinar elementum
                  integer enim. Sem nulla pharetra diam sit amet nisl suscipit. Rutrum tellus pellentesque eu tincidunt.
                  Lectus urna duis convallis convallis tellus. Urna molestie at elementum eu facilisis sed odio morbi
                  quis
                </p>
              </div>
            </li>

            <li data-aos="fade-up" data-aos-delay="400">
              <i class="bx bx-help-circle icon-help"></i> <a data-bs-toggle="collapse" data-bs-target="#faq-list-4"
                class="collapsed">Tempus quam pellentesque nec nam aliquam sem et tortor consequat? <i
                  class="bx bx-chevron-down icon-show"></i><i class="bx bx-chevron-up icon-close"></i></a>
              <div id="faq-list-4" class="collapse" data-bs-parent=".faq-list">
                <p>
                  Molestie a iaculis at erat pellentesque adipiscing commodo. Dignissim suspendisse in est ante in. Nunc
                  vel risus commodo viverra maecenas accumsan. Sit amet nisl suscipit adipiscing bibendum est. Purus
                  gravida quis blandit turpis cursus in.
                </p>
              </div>
            </li>

            <li data-aos="fade-up" data-aos-delay="500">
              <i class="bx bx-help-circle icon-help"></i> <a data-bs-toggle="collapse" data-bs-target="#faq-list-5"
                class="collapsed">Tortor vitae purus faucibus ornare. Varius vel pharetra vel turpis nunc eget lorem
                dolor? <i class="bx bx-chevron-down icon-show"></i><i class="bx bx-chevron-up icon-close"></i></a>
              <div id="faq-list-5" class="collapse" data-bs-parent=".faq-list">
                <p>
                  Laoreet sit amet cursus sit amet dictum sit amet justo. Mauris vitae ultricies leo integer malesuada
                  nunc vel. Tincidunt eget nullam non nisi est sit amet. Turpis nunc eget lorem dolor sed. Ut venenatis
                  tellus in metus vulputate eu scelerisque.
                </p>
              </div>
            </li>

          </ul>
        </div>

      </div>
    </section>



  </div>


      
  
  )
}

export default Home