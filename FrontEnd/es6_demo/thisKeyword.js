let cast = {
   id:23,
   name:"Sheldon Cooper",
   role:"Hero",

    getName:function () {
        return this.name;
    },
    getRole:function () {
        return this.role;
    }
};

//console.log(cast.getRole());

var fun = function () {
    console.log(this.name + " works for "+this.company);
};
//fun();

var obj = {
  name : "Barney Stinson",
  company : 'Publicis Sapient'
};

fun.call(obj);
fun.call({name: "Ted Mosby" , company: "Global Bank"});

var fun = function (company = "Publicis Sapient.") {
    console.log(this.name + " works for "+company);
};
fun.call({name: "Marshell"});

var fun = function (array = []) {
    console.log(this.name + " works for "+array[0] + " at "+array[1]);
};

//fun.call({name:"Lily"});
fun.call({name:"Lily"}, ["Samsung", "Bangalore"]);

var rebindFun = fun.bind(obj,["Samsung", "Bangalore"]);
rebindFun();