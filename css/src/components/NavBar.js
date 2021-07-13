import React, { useState } from "react";
import { NavLink } from "react-router-dom";
import "./NavBar.css";
import { Link } from 'react-router-dom';
import { Modal } from './Pages/Modal.js'

// For styled-components not necessary as of now 
import styled from "styled-components";
// const Container = styled.div`
// `


function NavBar() {
  const [click, setClick] = useState(false);
  const handleClick = () => setClick(!click);
  //whichPage implies to which (login or signup ) to open in the modal(popup)
  const [ whichPage , setWhichPage] = useState("login");
  //For the login/signup popup (modal)
  const [showModal , setShowModal ]= useState(false);

  const openModal = (whichPage) => {
    setShowModal(true);
    setWhichPage(whichPage);
  }



  return (
    <>
      <nav className="navbar">
        <div className="nav-container">
          <NavLink exact to="/" className="nav-logo">
            ABC:
            <b>Logo</b>
          </NavLink>
        {/* For the login button which appears for the small devices */}
          <Link to="/Modal">
          <span className='login-button' 
                   onClick={() => {
                      openModal();
                    }}>
                Login</span>
          </Link>

          <ul className={click ? "nav-menu active" : "nav-menu"}>

            <li className="nav-item">
              <NavLink
                exact
                to="/"
                activeClassName="active"
                className="nav-links"
                onClick={handleClick}
              >
                Home
              </NavLink>
            </li>

            <li className="nav-item">
              <NavLink
                exact
                to="/Partner"
                activeClassName="active"
                className="nav-links"
                onClick={handleClick}
              >
                Partner with us
              </NavLink>
            </li>

            <li  className='nav-item'>
            <NavLink
                exact
                to="/Modal"
                activeClassName="active"
                className="nav-links"
                onClick={() => {
                  openModal("login");
                  handleClick();
                }}
              >
                Login
              </NavLink>
            </li>
           
            <li className="nav-item">
              
              <NavLink
                exact
                to="/Modal"
                activeClassName="active"
                className="nav-links"
                onClick={() => {
                  openModal("signup");
                  handleClick();
                }}
              >
                Sign Up
              </NavLink>
            </li>
          </ul>
          <div className="nav-icon" onClick={handleClick}>
            <i className={click ? "fas fa-times" : "fas fa-bars"}></i>
          </div>
        </div>
      </nav>
            {/* Using the modal (popup) component and passing 3 properties */}
            <Modal showModal={showModal} setShowModal={
                setShowModal }  whichPage={whichPage} />
            
    </>
  );
}

export default NavBar;
