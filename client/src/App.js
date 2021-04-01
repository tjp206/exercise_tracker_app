import React, {useState} from 'react';
import './App.css';
import { BrowserRouter, Route, Switch } from 'react-router-dom';
import Dashboard from './components/DashboardComponent';
import Preferences from './components/PreferencesComponent';
import Login from './components/LoginComponent';
import RegistrationComponent from './components/RegistrationComponent';
import MainAppComponent from './components/MainAppComponent';
import AlertComponent from './components/AlertComponent';


function App() {

  // const [token, setToken] = useState();

  // if(token){
  //   return <Login setToken={setToken} />
  // }
  const [errorMessage, updateErrorMessage] = useState(null);

  return (
    <div className="App">
      <h1>Application</h1>
      <BrowserRouter>
        <Switch>
         
          <Route path="/dashboard">
            <Dashboard />
          </Route>
          <Route path="/preferences">
            <Preferences />
          </Route>
          <Route path="/registration">
            <RegistrationComponent showError={updateErrorMessage}/>
          </Route>
          <Route path="/" exact={true}>
            <MainAppComponent/>
          </Route>
        </Switch>
        <AlertComponent errorMessage={errorMessage} hideError={updateErrorMessage}/>
      </BrowserRouter>
      
    </div>
  );
}

export default App;


