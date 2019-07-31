class Employee {
    constructor(firstName, lastName, age, salary) {
        this._firstName = firstName;
        this._lastName = lastName;
        this._age = age;
        this._salary = salary;
    }

        get firstName() {
        return this._firstName;
    }

    set firstName(firstName) {
        this._firstName = firstName;
    }

    get lastName() {
        return this._lastName;
    }

    set lastName(lastName) {
        this._lastName = lastName;
    }

    get lge() {
        return this._age;
    }

    set lge(age) {
        this._age = age;
    }

    get salary() {
        return this._salary;
    }

    set salary(salary) {
        this._salary = salary;
    }

}

class RegularEmployee extends Employee{
    constructor(firstName, lastName, age, salary, vacationDays) {
        super(firstName, lastName, age, salary);
        this._vacationDays = vacationDays;
    }
    get vacationDays(){
        return this._vacationDays;
    }
    set vacationDays(vacationDays){
        this._vacationDays = vacationDays;
    }
}


let emp = new Employee("Barney", "Stinson", 25, 45000);
console.log(emp);

let regularemp = new RegularEmployee("Barney", "Stinson", 25, 45000, 10);
console.log(regularemp);