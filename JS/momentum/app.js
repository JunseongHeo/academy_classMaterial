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