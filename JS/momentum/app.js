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
