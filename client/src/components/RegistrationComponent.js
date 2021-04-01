import React, {useState} from 'react';
import Request from '../helpers/request';
import './RegistrationComponent.css';

const bcrypt = require('bcryptjs');
const saltRounds = 10;

function RegistrationComponent(props){

    const [state, setState] = useState({
        firstName: "",
        lastName: "",
        dob: "",
        sex: "",
        height: "",
        email: "",
        password: ""
    })

    const handleChange = (e) => {
        const {id, value} = e.target
        setState(prevState => ({
            ...prevState,
            [id] : value
        }))
    }

    const handleSubmitClick = (e) => {
        e.preventDefault();
        if(state.password === state.confirmPassword) {
            sendDetailsToServer()   
        } else {
            props.showError('Passwords do not match');
        }
    }

    const validateEmail = function (emailAddress){
        var mailformat = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;
        if(emailAddress.match(mailformat))
            {
            return true;
            } else {
                props.showError("You have entered an invalid email address!");
            return false;
            }
        }

    const sendDetailsToServer = () => {
        if(validateEmail(state.email) && state.password.length) {
            props.showError(null);
            const payload = {
                "firstName": state.firstName,
                "lastName": state.lastName,
                "dob": state.dob,
                "sex": state.sex,
                "height": state.height,
                "email": state.email,
                "password": bcrypt.hashSync(state.password, saltRounds),
            }
            const request = new Request();
            request.post('/users', payload)
                .then(function (response) {
                    if(response.status === 200 || 201){
                        setState(prevState => ({
                            ...prevState,
                            'successMessage' : 'Registration successful. Redirecting to home page..'
                        }))
                        // redirectToHome();
                        props.showError(null)
                        console.log("response status true");
                    } else{
                        props.showError("Some error ocurred");
                        console.log(response.status);
                    }
                })
                .catch(function (error) {
                    console.log(error);
                });    
        } else {
            props.showError('Please enter valid username and password') 
            console.log("Please enter valid username and password");   
        }
        
    }

    return(
        <div className="register-form">
            <form>
            <label htmlFor="firstName">First Name: </label>
                <input 
                    id="firstName"
                    name="firstName"
                    type="text"
                    className="form-control"
                    placeholder="Bruce"
                    onChange={handleChange}
                    required
                />
                <br /><br />

                <label htmlFor="lastName">Last Name: </label>
                <input 
                    id="lastName"
                    name="lastName"
                    type="text"
                    className="form-control"
                    placeholder="Wayne"
                    onChange={handleChange}
                    required
                />
                <br /><br />

                <label htmlFor="dob">Date of Birth: </label>
                <input 
                    id="dob"
                    name="dob"
                    type="date"
                    className="form-control"
                    placeholder="Select your date of birth"
                    onChange={handleChange}
                    required
                />
                <br /><br />

                <label htmlFor="sex">Sex: </label>
                <select id="sex" name="sex" className="form-control" defaultValue={'DEFAULT'} onChange={handleChange}>
                    <option value="DEFAULT" disabled>- Please select your sex -</option>
                    <option value="male">Male</option>
                    <option value="female">Female</option>
                    <option value="other">Other</option>
                </select>
                <br /><br />

                <label htmlFor="height">Height: </label>
                <input 
                    id="height"
                    name="height"
                    type="number"
                    className="form-control"
                    placeholder="185"
                    required
                    onChange={handleChange}
                />
                <label> cm</label>
                <br /><br />
                
                <label htmlFor="email">Email Address: </label>
                <input
                    id="email"
                    name="email"
                    type="email"
                    className="form-control"
                    placeholder="batman@wayne-enterprises.com"
                    required
                    onChange={handleChange}
                />
                <br /><br />

                <label htmlFor="password">Password: </label>
                <input
                    id="password"
                    name="password"
                    type="password"
                    className="form-control"
                    placeholder="Create password"
                    onChange={handleChange}
                    required
                />
                <br /><br />

                <label htmlFor="confirmPassword">Confirm Password: </label>
                <input
                    id="confirmPassword"
                    name="confirmPassword"
                    type="password"
                    className="form-control"
                    placeholder="Confirm password"
                    onChange={handleChange}
                    required
                />
                <br /><br />

                <button type="submit" onClick={handleSubmitClick}>Register</button>
            </form>
        </div>
    )
}

export default RegistrationComponent;