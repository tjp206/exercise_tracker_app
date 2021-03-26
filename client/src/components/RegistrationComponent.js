import React, {useState} from 'react';
import './RegistrationComponent.css';


function RegistrationComponent(props){

    const [state, setState] = useState({
        firstName: "",
        lastName: "",
        dob: "",
        sex: "",
        height: "",
        email: "",
        password: "",
        confirmPassword: ""
    })

    const handleChange = (e) => {
        const {id, value} = e.target
        setState(prevState => ({
            ...prevState,
            [id] : value
        }))
    }

    const handleSubmitClick = (e) => {
        console.log(e)
        e.preventDefault();
        if(state.password === state.confirmPassword) {
            // sendDetailsToServer()    
        } else {
            props.showError('Passwords do not match');
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
                    required
                    onChange={handleChange}
                />
                <br /><br />

                <label htmlFor="lastName">Last Name: </label>
                <input 
                    id="lastName"
                    name="lastName"
                    type="text"
                    className="form-control"
                    placeholder="Wayne"
                    required
                    onChange={handleChange}
                />
                <br /><br />

                <label htmlFor="dob">Date of Birth: </label>
                <input 
                    id="dob"
                    name="dob"
                    type="date"
                    className="form-control"
                    placeholder="Select your date of birth"
                    required
                    onChange={handleChange}
                />
                <br /><br />

                <label htmlFor="sex">Sex: </label>
                <select id="sex" name="sex" className="form-control" onChange={handleChange}>
                    <option value="" disabled selected>- Please select your sex -</option>
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
                    required
                    onChange={handleChange}
                />
                <br /><br />

                <label htmlFor="confirmPassword">Confirm Password: </label>
                <input
                    id="confirmPassword"
                    name="confirmPassword"
                    type="password"
                    className="form-control"
                    placeholder="Confirm password"
                    required
                    onChange={handleChange}
                />
                <br /><br />

                <button type="submit" onClick={handleSubmitClick}>Register</button>
            </form>
        </div>
    )
}

export default RegistrationComponent;