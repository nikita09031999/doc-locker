import React from 'react';

function Dashboard()
{
    return(
        <div

    
        style={{
          backgroundImage: "url(assets/img/blue.png)",
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
        <center>
        <i class="bi bi-list mobile-nav-toggle d-xl-none"></i>
<section>
    <header id="header">
    <div class="d-flex flex-column">

      <div class="profile">
      {/*<nav id="navbar" class="nav-menu navbar">*/}
        <img src="assets/img/userprofile.png" width={100} alt=""  class="img-fluid rounded-circle"/>
        {/*</nav>*/}
       
        <h1 class="text-light"><a href="index.html">Welcome User</a></h1>
       
        
      </div>

      {/*}
      <ul>
      <li><a href="/dashboard"><h5 class="text-light"><i class="bi bi-file-earmark-plus"></i><span>  Create folder</span></h5></a></li>
   </ul>
    

     
        <ul>
        <li><a href="/ResetPassword"><h5 class="text-light"><i class="bi bi-folder2-open"></i><span>  Show Folders</span></h5></a></li>
        
     </ul>
    

     
        <ul>
          <li><a href="/share"><h5 class="text-light"><i class="bi bi-share-fill"></i><span>  Share</span></h5></a></li>
       </ul>
     
        <ul>
         <li><a href="/updateprofile" ><h5 class="text-light"><i class="bi bi-person"></i><span>  Update Profile</span></h5></a></li>
       </ul>
      
       
      <ul>
      <li><a href="/dashboard"><h5 class="text-light"><i class="bi bi-box-arrow-left"></i><span>  Logout</span></h5></a></li>
   </ul>
    */}
   

      {/*
      <nav id="navbar" class="nav-menu navbar">
        <ul>
        <li><a href="/dashboard"><i class="bi bi-box-arrow-left"></i><span>Logout</span></a></li>
     </ul>
      </nav>
    */}

    
  {/*
    <nav id="navbar" class="nav-menu navbar">
        <ul>
        <li><a href="/dashboard"><i class="bi bi-file-earmark-plus"></i><span>  Create folder</span></a></li>
     </ul>
      
      
        <ul>
        <li><a href="/dashboard"><i class="bi bi-folder2-open"></i><span>  Show folder</span></a></li>
     </ul>
      
        <ul>
        <li><a href="/dashboard"><i class="bi bi-share-fill"></i><span>  Share</span></a></li>
     </ul>
     
        <ul>
        <li><a href="/dashboard"><i class="bi bi-person"></i><span>  Update Profile</span></a></li>
     </ul>
      
        <ul>
        <li><a href="/dashboard"><i class="bi bi-box-arrow-left"></i><span>  Logout</span></a></li>
     </ul>
      </nav>
    */}


    <div class="sidebar">
    <a href="#home"><i class="bi bi-file-earmark-plus"></i><span>  Create folder</span></a>
    <a href="#news"><i class="bi bi-folder2-open"></i><span>  Show folder</span></a>
    <a href="#contact"><i class="bi bi-share-fill"></i><span>  Share</span></a>
    <a href="#about"><i class="bi bi-person"></i><span>  Update Profile</span></a>
    <a href="#about"><i class="bi bi-box-arrow-left"></i><span>  Logout</span></a>
  </div>



    </div>
  </header>

  {/*
  <br />
  <br />
  <p><h1>Secure your files and folders..!</h1></p>
  <p><h1>Sharing folders is just few clicks away..!</h1></p>
*/}


  </section>
  </center>
        



      </div> 
      )
}
export default Dashboard;
