let p = prompt("Назови своё имя: ");
alert(`Привет ${p}`);

// let age = prompt("Введите свой возраст: ");
// if (age == 18) {
//    alert("Вы совершеннолетний, вам всё можно!");
//  } else if (age == 10) {
//    alert("Вам надо учить уроки!");
//  } else if (age == 30) {
//    alert("Ложитесь спать, завтра на работу");
//  } else {
//    alert("Мы не знаем, что вам делать");
//  }

let a = parseInt(prompt("Введите свой возраст: "));
// let age = 18;
switch (a) {
  case 18:
    alert("Вы совершеннолетний, вам всё можно!");
    break;
  case 10:
    alert("Вам надо учить уроки!");
    break;
  case 30:
    alert("Ложитесь спать, завтра на работу");
    break;
  default:
    alert("Мы не знаем, что вам делать");
}