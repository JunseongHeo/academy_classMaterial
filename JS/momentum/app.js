let a = 10; // 새로운 변수를 생성. 이후 변수값 바꿀수 있음.
const b = 3; // constant 상수. 값이 바뀔수 없음
const myName = "junseong"
let myName2 = "junseong"
var c = 10;


console.log(a+b);
console.log(a*b);
console.log(a/b);
console.log("hello "+myName);
console.log(c);

a = 12;
// myName = "Heojunseong"; // 에러. 상수값은 변경될수 없음.
myName2= "Heojunseong"; // 변수값 변경

console.log("hello "+myName2);

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

function sayHello(nameOfPerson) {
    console.log("Hello my name is "+nameOfPerson)
}

sayHello("Junseong");
sayHello("dal");
sayHello("nico");
sayHello("lynn");

const player2 = {
    name : "junseong",
    sayHello2 : function(yourName) {
        console.log("hi "+yourName)
    },
};

player2.sayHello2("jam")


// calculator
function plus(a, b) {
    console.log(a+b);
}

plus(10,20);

// 실습예제

console.log("실습예제");

const calculator0 = {
    add: function(a,b) {
        console.log(a+b);
    },
    divide: function(a,b) {
        console.log(a/b);
    },
    subtract: function(a,b) {
        console.log(a-b);
    },
    multiple: function(a,b) {
        console.log(a*b);
    },
    square: function(a,b) {
        console.log(a**b);
    }

}; 

calculator0.add(1,2);
calculator0.divide(1,2);
calculator0.subtract(1,2);
calculator0.multiple(1,2);
calculator0.square(2,2);

// return

const age = 96;
function calculateKrAge (ageOfForeigner) {
    return ageOfForeigner+2;
}
const KrAge = calculateKrAge(age);
console.log(KrAge);

// if

const drinkAge = prompt ("how old are you?");

console.log(isNaN(drinkAge));

if(isNaN(drinkAge)) {  // 숫자가 아니면 true 반환, 숫자면 false 반환.
    console.log("숫자를 입력해주세요");
} else if (drinkAge >= 18) {
    console.log("18세 이상 음주가능");
} else {
    console.log("음주 불가능한 연령입니다.");
}

// document

document.title = "자바스크립트 끝내자";

const title = document.getElementById("title")

console.log(title);

console.dir(title); 

