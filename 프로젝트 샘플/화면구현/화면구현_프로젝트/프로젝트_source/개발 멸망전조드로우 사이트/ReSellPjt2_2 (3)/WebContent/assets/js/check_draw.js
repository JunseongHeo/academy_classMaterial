const clock_button = document.querySelector("#check_button");
const clock_button2 = document.querySelector("#check_button2");
const clock_button3 = document.querySelector("#check_button3");
//예약 기능을 사용할지 묻는 창
function set_time_draw(){ //예약 기능 사용할 것인가?
    alert("예약 기능은 드로우 10분 전에 알림창이 뜨며 5분 전에는 해당 드로우 사이트를 켜주는 기능입니다.")
    if (confirm("드로우 예약 기능을 이용하시겠습니까?") == true){    //확인
        localStorage.setItem("check", "true");
    }else{   //취소
        localStorage.setItem("check", "false");
    }
}
clock_button.addEventListener("click", set_time_draw);

function set_time_draw2(){ //예약 기능 사용할 것인가?
    alert("예약 기능은 드로우 10분 전에 알림창이 뜨며 5분 전에는 해당 드로우 사이트를 켜주는 기능입니다.")
    if (confirm("드로우 예약 기능을 이용하시겠습니까?") == true){ 
        localStorage.setItem("check2", "true");
    }else{   //취소
        localStorage.setItem("check2", "false");
    }
}
clock_button2.addEventListener("click", set_time_draw2);

function set_time_draw3(){
    alert("예약 기능은 드로우 10분 전에 알림창이 뜨며 5분 전에는 해당 드로우 사이트를 켜주는 기능입니다.")
    if (confirm("드로우 예약 기능을 이용하시겠습니까?") == true){  
        localStorage.setItem("check3", "true");
    }else{ 
        localStorage.setItem("check3", "false");
    }
}
clock_button3.addEventListener("click", set_time_draw3);