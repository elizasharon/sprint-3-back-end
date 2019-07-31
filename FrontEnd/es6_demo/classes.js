let vehicle = {};
let goodsVehicle = {};
let passengerVehicle = {};

vehicle.commute = function (startLoc, endLoc) {
    console.log(`commuting from ${startLoc} to ${endLoc}`);
};
console.log(vehicle);

goodsVehicle.__proto__ = vehicle;
goodsVehicle.__proto__.commute("Chennai", "Bangalore");
goodsVehicle.commute("Bangalore", "Chennai");