let sum = function (a, b) {
    return a+b;
};
let sub = function (a, b) {
    return a-b;
};
let mul = function (a, b) {
    return a*b;
};
let div = function (a, b) {
    return a/b;
};

let calculate = function (a, b, fun) {
  return fun(a, b);
};

//console.log(calculate("hello", "world", sum));

var returnFunction = function (first, last) {
  var greet = function (message) {
      console.log(message, first, last);
  };
  return greet;
};

var result = returnFunction("Barney", "Stinson");

result("Hello");
