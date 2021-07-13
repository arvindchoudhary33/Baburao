import React, { Component } from 'react';
import './Login.css';
import InputAdornment from '@material-ui/core/InputAdornment';
import TextField from '@material-ui/core/TextField';
import AccountCircle from '@material-ui/icons/AccountCircle';
import PhoneIcon from '@material-ui/icons/Phone';
import PermPhoneMsgIcon from '@material-ui/icons/PermPhoneMsg';
import ArrowBackIosIcon from '@material-ui/icons/ArrowBackIos';
import firebase from './Firebase';
import { Redirect } from 'react-router-dom';
export default class Login extends Component {
  constructor(props){
    super(props);
    this.state={
      loginVisibility:"visible",
      signupVisibility:"hidden",
      otpContainerVisibility:"hidden",
      whichTab:false,
      previousState:"",
      isLogin:false,
      // phoneNumber:"",
      // userName:"",
    };


    this.handleform = this.handleform.bind(this);
    this.handleOtpBackButton = this.handleOtpBackButton.bind(this);
    this.handleform = this.handleform.bind(this);
  }

componentDidMount(props){
    if(this.props.whichPage ==="signup"){
      this.handleform("hidden","visible","hidden")  
    }
    else{
      this.handleform("visible","hidden","hidden") 
    }
}

//Used to get the previous state when clicked on back button in otp modal(popup)
//As of now it's deprecated ( might look for an alternative )
 componentWillReceiveProps(props){
    if(props.whichPage === "signup"){
      this.handleform("hidden","visible","hidden")  
    }
    else{
      this.handleform("visible","hidden","hidden") 
    } 
 }

  // Handles which container ( signup / login / otp) is visible 
  handleform(e,f,g) {
      console.log(e ,f ,g);
      //To change the login/signup slider accordingly
      let tab = true;
      if(e === "hidden"){
      tab = false; 
      }
      this.setState({...this.state,
        loginVisibility:e,
        signupVisibility:f,
        otpContainerVisibility:g,
        whichTab:tab,
      });
      console.log(this.state.visibility);
  }
 
  handleOtpBackButton() {
    this.setState(prevState => {
    return  prevState.previousState
    },
    );
    console.log(this.state);
  }


  handleChange = (e) =>{
    const {name, value } = e.target
    this.setState({
        [name]: value,
     

      })
  }

  //Firebase Phone auth 
  configureCaptcha = () =>{
    window.recaptchaVerifier = new firebase.auth.RecaptchaVerifier('sign-in-button', {
      'size': 'invisible',
      'callback': (response) => {
        // reCAPTCHA solved, allow signInWithPhoneNumber.
        this.onSignInSubmit();
        console.log(response)
      },
      defaultCountry: "IN"
    });
  }

  onSignInSubmit = (e) => {
    e.preventDefault();
    this.configureCaptcha()
    const phoneNumber = "+91" + this.state.mobile;
    console.log(phoneNumber);
    const appVerifier = window.recaptchaVerifier;
    firebase.auth().signInWithPhoneNumber(phoneNumber, appVerifier)
        .then((confirmationResult) => {
          // SMS sent. Prompt user to type the code from the message, then sign the
          // user in with confirmationResult.confirm(code).
          window.confirmationResult = confirmationResult;
          console.log("OTP has been sent");
          // ...
        }).catch((error) => {
          // Error; SMS not sent
          // ...
          console.log(error);
        });
  }

  onSubmitOTP = (e) =>{
    e.preventDefault()
    const code = this.state.otp
    console.log(code)
    //*******/
    window.confirmationResult.confirm(code).then((result) => {
      // User signed in successfully.
      const user = result.user;
      console.log(JSON.stringify(user))
      alert("User is verified")
      this.setState({
        isLogin:true,
     

      }) 
      // ...
    }).catch((error) => {
      // User couldn't sign in (bad verification code?)
      // ...
    });
  }


  render() {
    if(this.state.isLogin){
      return       <Redirect to={'/Partner'} />

    }
    
    return (
      <>
    <div className='body'>
      <div className='main-container'>
        <span className='logo'>Logo</span>
      {/* For the login/signup slider */}
      <div className="label-container">
              <input type='radio' name='slider' id='radio-login' checked={this.state.whichTab}/>
              <input type='radio' name='slider' id='radio-signup' checked={!this.state.whichTab} />
              <label for='radio-login'  className="slide log" onClick={() =>{
                this.handleform("visible" ,"hidden","hidden");
              }}>Login</label>
              <label for='radio-signup' className="slide sign" onClick={() =>{
                this.handleform("hidden","visible","hidden");
              }}>SignUp</label>
              <div className='slide-tab'></div>
      </div>
        {/* form-container  */}
        <div className="form-container">   
          <div className='sub-form-container' >
              {/* login-container  */}
              <div className="login" style={{
                  visibility:this.state.loginVisibility,
                  }}> <form onSubmit={this.onSignInSubmit} className="form">
                    <div id = 'sign-in-button'  />
                  <TextField id="standard-basic" placeholder="phone number" name='mobile' className='login-input-field btn' type='tele' InputProps={{
                  startAdornment: (
                    <InputAdornment position="start">
                      <PhoneIcon />
                    </InputAdornment>
                  ),
                }}  required onChange={this.handleChange} name='mobile'/>

                    <button className="submit" onClick={() =>{
                      this.setState(curState => ({...this.state ,
                        previousState:curState
                      }),
                      () => {this.handleform("hidden","hidden","visible");
                      }
                      )
                      }} > GET OTP</button> </form>
            </div>
            
             {/* signup-container  */}
            <div className="signup"  style={{
                visibility:this.state.signupVisibility,
              }}><form  onSubmit={this.onSignInSubmit}><div id = 'sign-in-button'>
              <TextField id="standard-basic" placeholder='name' className='signup-input-field-1 btn' InputProps={{
                startAdornment: (
                  <InputAdornment position="start">
                    <AccountCircle />
                  </InputAdornment>
                ),
              }}  value={this.state.userName}/>
              <TextField  id="standard-basic" placeholder="phone number" className='signup-input-field-2 btn' type='tele' InputProps={{
                startAdornment: (
                  <InputAdornment position="start">
                    <PhoneIcon />
                  </InputAdornment>
                ),
              }} onChange={this.handleChange}
              name='mobile' /> 

              <button className='sign-up submit' type='submit' onClick={() =>{
                    this.setState(curState => ({...this.state ,
                      previousState:curState
                    }),
                    () => {this.handleform("hidden","hidden","visible");
                    }
                    )
                    } } >SIGN UP</button></div></form>
            </div>

          {/* otp-container  */}
          <div className='otp-container signup'  style={{
                visibility:this.state.otpContainerVisibility,
              }}>
            <TextField id='standard-basic' placeholder='Enter the OTP' className='otp-field' type='tele' InputProps={{
                startAdornment: (
                  <InputAdornment position="start">
                    <PermPhoneMsgIcon />
                  </InputAdornment>
                ),
              }} name="otp" required onChange={this.handleChange}/>
            
              <button className='submit' onClick={ this.onSubmitOTP} > Verify </button>
              <ArrowBackIosIcon  fontSize="small" className='back-button-otp' onClick={() =>{
                      this.handleOtpBackButton();
                    
                    }} />

          </div>{/* otp-container div closing tag */} 

      </div> {/* sub-form-container div closing tag */} 
      </div> {/* form-container div closing tag */}
      </div> {/* main-container div closing tag */} 
      </div> {/* body div closing tag */}
      </>
    );
  }
}
