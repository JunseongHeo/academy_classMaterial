const clock = document.querySelector("#clock");
const clock_day = document.querySelector("#day");
const clock2 = document.querySelector("#clock2");
const clock_day2 = document.querySelector("#day2");
const clock3 = document.querySelector("#clock3");
const clock_day3 = document.querySelector("#day3");
//남은 시간 계산해주고 드로우 알림창과 팝업창 띄워주는 곳

//1번
function getClock() { //예약 기능을 이용할 경우에만 사용
    if (day === 0 && hour === "00" &&min === "10" && localStorage.getItem("check") === "true") {
        alert("드로우 10분 전입니다.");
    } else if (day === 0 && hour === "00" &&min === "05" && localStorage.getItem("check") === "true") {
        window.open("https://hypebeast.kr/footwear");
        localStorage.setItem("check", "false");
    }
}

function calculTime() { //남은 시간 계산
    let now = new Date();
    let end = new Date(2021,9,03,11,30,00);
    let nt = now.getTime();
    let et = end.getTime();

    sec =parseInt(et - nt) / 1000;
    day  = parseInt(sec/60/60/24);
    sec = (sec - (day * 60 * 60 * 24));
    hour = String(parseInt(sec/60/60)).padStart(2, "0");
    sec = (sec - (hour*60*60));
    min = String(parseInt(sec/60)).padStart(2, "0");
    sec = String(parseInt(sec-(min*60))).padStart(2, "0");
    clock_day.innerText = `D-day ${day}일`;
    clock.innerText = `${hour} : ${min} : ${sec}`;
} 

setInterval(calculTime,1000);
setInterval(getClock,30000);


//2번
function getClock2() { 
    if (day2 === 0 && hour2 === "00" &&min2 === "10" && localStorage.getItem("check2") === "true") {
        alert("드로우 10분 전입니다.");
    } else if (day2 === 0 && hour2 === "00" &&min2 === "05" && localStorage.getItem("check2") === "true") {
        window.open("https://hypebeast.kr/footwear");
        localStorage.setItem("check2", "false");
    }
}

function calculTime2() { 
    let now2 = new Date();
    let end2 = new Date(2021,9,5,10,00,00);
    let nt2 = now2.getTime();
    let et2 = end2.getTime();

    sec2 =parseInt(et2 - nt2) / 1000;
    day2  = parseInt(sec2/60/60/24);
    sec2 = (sec2 - (day2 * 60 * 60 * 24));
    hour2 = String(parseInt(sec2/60/60)).padStart(2, "0");
    sec2 = (sec2 - (hour2*60*60));
    min2 = String(parseInt(sec2/60)).padStart(2, "0");
    sec2 = String(parseInt(sec2-(min2*60))).padStart(2, "0");
    clock_day2.innerText = `D-day ${day2}일`;
    clock2.innerText = `${hour2} : ${min2} : ${sec2}`;
} 

setInterval(calculTime2,1000);
setInterval(getClock2,30000);


//3번
function getClock3() { 
    if (day3 === 0 && hour3 === "00" &&min3 === "10" && localStorage.getItem("check3") === "true") {
        alert("드로우 10분 전입니다.");
    } else if (day3 === 0 && hour3 === "00" &&min3 === "05" && localStorage.getItem("check3") === "true") {
        window.open("https://hypebeast.kr/footwear");
        localStorage.setItem("check3", "false");
    }
}

function calculTime3() { 
    let now3 = new Date();
    let end3 = new Date(2021,9,11,10,25,00);
    let nt3 = now3.getTime();
    let et3 = end3.getTime();

    sec3 =parseInt(et3 - nt3) / 1000;
    day3  = parseInt(sec3/60/60/24);
    sec3 = (sec3 - (day3 * 60 * 60 * 24));
    hour3 = String(parseInt(sec3/60/60)).padStart(2, "0");
    sec3 = (sec3 - (hour3*60*60));
    min3 = String(parseInt(sec3/60)).padStart(2, "0");
    sec3 = String(parseInt(sec3-(min3*60))).padStart(2, "0");
    clock_day3.innerText = `D-day ${day3}일`;
    clock3.innerText = `${hour3} : ${min3} : ${sec3}`;
} 

setInterval(calculTime3,1000);
setInterval(getClock3,30000);