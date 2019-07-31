let players = ['Virat', 'Rohit', 'Dhoni', 'Raina', 'Jadeija'];

[captain, vCaptain] = players;

//console.log(`Captain : ${captain}, Vice Captain : ${vCaptain}`);

[vCaptain, captain] = [captain, vCaptain];

//console.log(`Captain : ${captain}, Vice Captain : ${vCaptain}`);

const player = {
    name: 'Virat kholi',
    fifties: 30,
    centuries: 66,
    matches: 350
};

const {name : player_name, centuries, matches , wife : wife_name = "Anushka Sharma"} = player;

//console.log(`${player_name} has played ${matches} number of matches and has scored ${centuries} his wife name is ${wife_name}`);
let item = {
    name : "Pixel",
    price : 90000
};

let currentCalculator = function ({price:amount}) {
  return {
      "INR" : amount,
      "USD" : amount /68,
      "EURO" : amount /80
  }
};
const {USD : amountInDollars} = currentCalculator(item);
console.log(`Amount in Dollars : ${amountInDollars}`);