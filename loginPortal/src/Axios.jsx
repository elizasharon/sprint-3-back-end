/**
  * 1990-2019 Publicis Sapient Corporation. All rights reserved.   
*/

// List of urls this api is going 
import axios from 'axios';

const register =  axios.create({
    baseURL: "http://localhost:8005/api/v1/users",
    responseType: "json"
})
const deRegister =  axios.create({
    baseURL: "http://10.150.176.143:8091/api/v1/users",
    responseType: "json"
})

const login =  axios.create({
    baseURL: "http://10.150.124.14:8013/api",
    responseType: "json"
})

// const register =  axios.create({
//     baseURL: "http://localhost:8005/api/v1/users",
//     responseType: "json"
// })
// const register =  axios.create({
//     baseURL: "http://localhost:8005/api/v1/users",
//     responseType: "json"
// })
// const register =  axios.create({
//     baseURL: "http://localhost:8005/api/v1/users",
//     responseType: "json"
// })
// const register =  axios.create({
//     baseURL: "http://localhost:8005/api/v1/users",
//     responseType: "json"
// })

export default{
    auth: {

        // to get all security questions from the database
        getSecurityQuestions(){
            return register.get("/securityquestions");
        },
        //to post users data into the database
        postusers(data){
            return register.post("/register",data);
        },


        postusersForget(data){
            return deRegister.post("/forgetuser",data);
        },
        getReviews(data){
            return deRegister.get("/getreviews",data);
        },
        postusersDeactivate(data){
            return deRegister.post("/deactivate",data);
        },


        postAuthentication(url, data){
            return login.post(url, data);
        }

    }
}
