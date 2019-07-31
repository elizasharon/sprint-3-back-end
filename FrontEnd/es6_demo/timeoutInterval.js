let timeOut = function (time, message) {
    console.log("TIMEOUT CALLED");
    setTimeout(function () {
        console.log(`${message} after 2 seconds`);
    }, time, message);
};
// timeOut(2000, "Bazinga");

//let timeOut = (time=2000, message="legendary") => setTimeout(()=>console.log(`${message} after 2 seconds`), time, message);

// timeOut(2000, "Bazinga");
// console.log("CHECKING ASYNC");

let handle;

let timeInterval = function (time=2000, message="BAZINGA") {
   handle = setInterval(function () {+
        console.log(`${message} after 2 seconds`);
    }, time, message);
};

timeInterval();
setTimeout(()=>{
    console.log("Interval terminated");
    clearInterval(handle)},5000);
