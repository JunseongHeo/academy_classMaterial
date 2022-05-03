alert("hi");


// Boolean
const amIFat0 = true; // definde 켜져있음 
const amIFat = false; // definde 꺼져있음
const amIFat2 = null; // defined 비어있음
let something; // undefined 값정의되지 않음

console.log(amIFat2);
console.log("null");
console.log(something); // undefined

// Array

const mon = "mon";
const tue = "tue";
const wed = "wed";
const thu = "thu";
const fri = "fri";
const sat = "sat";
const sun = "sun";

// 배열은 요소들을 대괄호로 묶고, 요소들을 따옴표(,)로 구분
const daysOfWeek = ["mon", "tue", "wed", "thu", "fri", "sat"];
// ctrl+d로 같은 단어 여러개 선택가능

const nonsense = [1, 2, "heoll", false, null, true, undefined, "준성"];
console.log(daysOfWeek, nonsense);

// Get Item from Array
console.log(daysOfWeek[5]);

// Add one more day to the array
daysOfWeek.push("sun");
console.log(daysOfWeek);

// Objects 
//객체의 속성을 표현하는 방법들... 
const playerName = "junseong";
const playerPoints = 121212;
const playerHandsome = true;

const playerArray = ["junseong", 121212, true];

const player = {
    name: "junseong",
    points: 10,
    fat: true,
};

console.log(player);
console.log(player.fat);

player.fat = false;
player.lastname = "kim";
console.log(player);

// functions

console.log("Hello my name is Junseong");
console.log("Hello my name is JS");
console.log("Hello my name is Jun");
console.log("Hello my name is seong");

function sayHello() {
    console.log("Hello my name is ")
}

sayHello();
sayHello();
sayHello();
sayHello();
sayHello();