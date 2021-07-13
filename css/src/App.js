import "./App.css";
import NavBar from "./components/NavBar";
import { BrowserRouter as Router, Switch, Route } from "react-router-dom";
import { Home } from "./components/Pages/Home";
import  Partner  from "./components/Pages/Partner";
import Login from "./components/Pages/Login";
import React, { Component } from 'react'

 class App extends Component {
  render() {
    return (
      <>
        <Router>
          <NavBar />
  
          <div className="pages">
            <Switch>
              <Route exact path="/" component={Home} />
              <Route path="/Partner" component={Partner} />
              <Route path="/login" component={Login} />
            </Switch>
          </div>
        </Router>
      </>
    );
  }
}

export default App;


