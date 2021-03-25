import React, {useState} from 'react';


function RegistrationComponent(props){

    const [state, setState] = useState({
        firstName: "",
        lastName: "",
        dob: "",
        gender: "",
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
                    type="text"
                    placeholder="Enter First Name"
                    onChange={handleChange}
                />
                <label htmlFor="lastName">Last Name: </label>
                <input 
                    id="lastName"
                    type="text"
                    placeholder="Enter Last Name"
                    onChange={handleChange}
                />
                <label htmlFor="dob">Date of Birth: </label>
                <input 
                    id="dob"
                    type="date"
                    placeholder="Enter date of birth"
                    onChange={handleChange}
                />
                <br></br>
                <label>Gender:</label><br></br>
                <input type="radio" id="male" name="gender" value="male" onChange={handleChange}/>
                <label for="male">Male</label>
                <input type="radio" id="female" name="gender" value="female" onChange={handleChange}/>
                <label for="female">Female</label>
                <input type="radio" id="other" name="gender" value="other" onChange={handleChange}/>
                <label for="other">Other</label>
                <br></br>

                <label htmlFor="height">Height: </label>
                <input className="height"
                    type="number"
                    placeholder="Enter height"
                    onChange={handleChange}
                />

                
                <label htmlFor="inputEmail">Email Address: </label>
                <input className="registerEmail"
                    type="email"
                    placeholder="Enter email"
                    onChange={handleChange}
                />
                <label htmlFor="registerPassword">Password: </label>
                <input className="registerPassword"
                    type="password"
                    placeholder="Password"
                    onChange={handleChange}
                ></input>

                <label htmlFor="registerPassword">Confirm Password: </label>
                <input className="registerPassword"
                    type="password"
                    placeholder="Confirm password"
                    onChange={handleChange}
                ></input>

                <button type="submit" onClick={handleSubmitClick}>Register</button>
            </form>
        </div>
    )
}

export default RegistrationComponent;