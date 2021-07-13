import firebase from 'firebase/app';
import 'firebase/auth';
var firebaseConfig = {
    apiKey: "AIzaSyAHQ2369KRw1ql8z995wQN234nikhGbfX8",
    authDomain: "customer-page.firebaseapp.com",
    projectId: "customer-page",
    storageBucket: "customer-page.appspot.com",
    messagingSenderId: "1097166863025",
    appId: "1:1097166863025:web:d51726d22ce308ee8b8090"
  };
  // Initialize Firebase
  firebase.initializeApp(firebaseConfig);
  export default firebase;