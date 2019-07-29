// let outerFunction = function () {
//     var name = "Barney Stinson";
//
//     var innerFunction = function () {
//         console.log("Welcome "+name);
//     };
//     //innerFunction();
//     return innerFunction;
// };
// outerFunction()();
// var fun = outerFunction();
// fun();


// function foo(outer_arg) {
//
//     function inner(inner_arg, outer = outer_arg) {
//         return outer + inner_arg;
//     }
//     return inner;
// }
// var get_func_inner = foo(5);
//
// console.log(get_func_inner(4 , 10));
// console.log(get_func_inner(3));

var _ = function () {
    var id = 0;
    var name = "";
    var price = 0.0;
    var obj = {
        setId: function (argId) {
            id = argId;
        },
        getId: function () {
            return id;
        },
        setName: function (argId) {
            id = argId;
        },
        getName: function () {
            return id;
        },
        getDesc: function () {
            return `Id : ${id} Name : ${name} Price : ${price}`;
        }
    };
    return obj;
}();

_.setId(23);
console.log(_.getId());
console.log(_.getDesc());