let vegDishes = ['Dosa', 'Idly', 'Pulav'];
let nonVeg = ['chicken-briyani','egg-rice'];

const dishes = ['noodles', ...vegDishes, ...nonVeg];
dishes.forEach(dish => console.log(dish));

const [veg , nonveg, ...remaining] =  dishes;

console.log(veg);
console.log(nonveg);
console.log(remaining);