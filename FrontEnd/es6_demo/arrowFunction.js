let sum =  (a, b) => a+b;

let sub =  (a, b) => a-b;

let mul =  (a, b) => a*b;

let div =  (a, b) => a/b;

let calculate = (a, b, fun) => fun(a, b);

console.log(calculate("Barney" , "Stinson" , sum));

// numbers = [2,3,4,5,6,7,8];
//
// numbers.map(num => num*2).filter( n => n%2 === 0).forEach(number => console.log(number));
