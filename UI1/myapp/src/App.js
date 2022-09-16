import React from 'react';
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Home from './Pages/Home/Home';
import SignIn from './Pages/SignIn/SignIn';
import SignUp from './Pages/SignUp/SignUp';
import ResetPassword from './Pages/ResetPassword/ResetPassword'
import UpdateProfile from './Pages/UpdateProfile/UpdateProfile'
import Dashboard4 from './Pages/Dashboard/Dashboard4';
import Share from './Pages/Share/Share';

function App() {
  return (
   
    
      <BrowserRouter>
        <Routes>
          <Route exact path="/" element={<Home />} />
          <Route path="/signin" element={<SignIn />} />
          <Route path="/signup" element={<SignUp />} />
          <Route path="/password" element={<ResetPassword />} />
          <Route path="/dashboard" element={<Dashboard4 />} />
          <Route path="/updateprofile" element={<UpdateProfile />} />
          <Route path="/share" element={<Share />} />
          


          
        </Routes>
      </BrowserRouter>

  );
<div>
  <Home></Home>
  </div>

}

export default App;






{/*}
import logo from './logo.svg';
import './App.css';
import './Pages/SignUp/SignUp'
import './Pages/SignIn/SignIn'
import './Pages/Details/details'
import './Pages/Share/Share'
import './Pages/UpdateProfile/UpdateProfile'
import './Pages/ResetPassword/ResetPassword'
import './Pages/Home/Home'
import './Pages/Dashboard/Dashboard1'
import SignUp from './Pages/SignUp/SignUp';
import SignIn from './Pages/SignIn/SignIn';
import details from './Pages/Details/details';
import Share from './Pages/Share/Share';
import UpdateProfile from './Pages/UpdateProfile/UpdateProfile';
import ResetPassword from './Pages/ResetPassword/ResetPassword';
import Home from './Pages/Home/Home';
import Dashboard1 from './Pages/Dashboard/Dashboard1';



function App() {
  return (
    <div>
   {/*  
        <Home></Home>
        <SignUp></SignUp>
        <SignIn></SignIn>
        <Share></Share>
        <UpdateProfile></UpdateProfile>
  <ResetPassword></ResetPassword>
 <Dashboard></Dashboard>

  
<Dashboard1></Dashboard1>
       
    </div>
  );
}

export default App;
*/}



{/*


*/}

{/*


*/}
 


  

{/*
import logo from './logo.svg';
import './App.css';
import './Pages/SignUp/SignUp'
import './Pages/SignIn/SignIn'
import './Pages/Details/details'
import './Pages/Share/Share'
import './Pages/UpdateProfile/UpdateProfile'
import './Pages/ResetPassword/ResetPassword'
import './Pages/Home/Home'
import SignUp from './Pages/SignUp/SignUp';
import SignIn from './Pages/SignIn/SignIn';
import details from './Pages/Details/details';
import Share from './Pages/Share/Share';
import UpdateProfile from './Pages/UpdateProfile/UpdateProfile';
import ResetPassword from './Pages/ResetPassword/ResetPassword';
import Home from './Pages/Home/Home';


function App() {
  return (
    <div>
   {/*  
        <Home></Home>
        <SignUp></SignUp>
        <SignIn></SignIn>
        <Share></Share>
        <UpdateProfile></UpdateProfile>
        <ResetPassword></ResetPassword>
        
        
 <SignIn></SignIn>
       
    </div>
  );
}

export default App;
*/}







