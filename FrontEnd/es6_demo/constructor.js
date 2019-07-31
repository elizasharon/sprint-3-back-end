const User = function (firstName, lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    //console.log(this);
};

User.prototype.getFirstName = function(){
    return this.firstName;
};

User.prototype.getLastName = function(){
    return this.lastName;
};

User.prototype.getFullName = function(){
    return `${this.firstName} ${this.lastName}`;
};

let u = new User("Sheldon", "Cooper");
console.log(u.getFullName());