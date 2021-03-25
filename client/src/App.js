import React, {useState} from 'react';
import './App.css';
import { BrowserRouter, Route, Switch } from 'react-router-dom';
import Dashboard from './components/DashboardComponent';
import Preferences from './components/PreferencesComponent';
import Login from './components/LoginComponent';
import RegistrationComponent from './components/RegistrationComponent';
import MainAppComponent from './components/MainAppComponent';


function App() {

  // const [token, setToken] = useState();

  // if(token){
  //   return <Login setToken={setToken} />
  // }

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
            <RegistrationComponent/>
          </Route>
          <Route path="/">
            <MainAppComponent/>
          </Route>
        </Switch>
      </BrowserRouter>
      
    </div>
  );
}

export default App;


