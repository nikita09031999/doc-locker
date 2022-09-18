import { Link } from "react-router-dom";
import React from "react";

export default function Home() {
  return (
    <div>
<head>
<link rel="stylesheet" href="assets/css/style3.css" />
</head>
    <i class="bi bi-list mobile-nav-toggle d-xl-none"></i>

    <header id="header">
    <div class="d-flex flex-column">

      <div class="profile">
        <img src="assets/img/userprofile.png" alt="" class="img-fluid rounded-circle"/>
        <h1 class="text-light"><a href="index.html">Heyy!!</a></h1>
      </div>

      <nav id="navbar" class="nav-menu navbar">
      <ul>
      <li><a href="/dashboard"><i class="bi bi-file-earmark-plus"></i><span>Create folder</span></a></li>
   </ul>
    </nav>

      <nav id="navbar" class="nav-menu navbar">
        <ul>
        <li><a href="/ResetPassword"><i class="bi bi-folder2-open"></i><span>Show Folders</span></a></li>
     </ul>
      </nav>

      <nav id="navbar" class="nav-menu navbar">
        <ul>
          <li><a href="/share"><i class="bi bi-share-fill"></i><span>Share</span></a></li>
       </ul>
      </nav>

      <nav id="navbar" class="nav-menu navbar">
        <ul>
         <li><a href="/updateprofile" ><i class="bi bi-person"></i><span>Update Profile</span></a></li>
       </ul>
      </nav>

      <nav id="navbar" class="nav-menu navbar">
        <ul>
        <li><a href="/dashboard"><i class="bi bi-box-arrow-left"></i><span>Logout</span></a></li>
     </ul>
      </nav>


    </div>
  </header>


 
  <div class="w-100 text-md-right" id="searchbar">
    <i class="bi bi-search"></i>
  <input type="text" class="bi bi-search" placeholder="Search document here" />


  
</div>  

  <div id="hero" class="d-flex flex-column justify-content-center align-items-center">
    <div class="hero-container" data-aos="fade-in">
      <img src="assets/img/Logo.png" height={100}/><h1>jaa ghari........udya ye</h1>
      {/*<p>I'm <span class="typed" data-typed-items="Designer, Developer, Freelancer, Photographer"></span></p>*/}
    </div>

    
  </div>


    </div>
  );
}

