
var chance = 3; //db연동 하루에 한번 초기화 컬럼 추가필요
var sum = 0; //db연동 포인트합계 
var star = '★'
var inform = '오늘의 기회는 모두 소진되었습니다'
var getPoint = new Array(3);
var random = new Array(3);
var pointA = document.querySelector('.minigame_pointA');
var pointB = document.querySelector('.minigame_pointB');
var pointC = document.querySelector('.minigame_pointC');
var point = document.querySelector('#point').value;
var first = document.querySelector('.first').value;
var second = document.querySelector('.second').value;
var third = document.querySelector('.third').value;






function init(){
if(chance !== 0){
    for(i = 0; i < 3; i++){
    random[i] = (Math.random() * 1000) - (Math.random() * 1000);
    } 

    for(i = 0; i < 3; i++){
    getPoint[i] = Math.ceil(random[i] /100) * 100;
    }

    } else {
        document.querySelector('.first').value = star;
        document.querySelector('.second').value = star;
        document.querySelector('.third').value = star;
        alert(inform);
    }
}
var setValue = {

    setValues : function(self){
        if(self.value === point){
            self.value = star;
        }
    },

    setPointA : function(self){
        if(chance !== 0){
            pointA.innerText = getPoint[0] + 'p!';
            sum += getPoint[0];
            chance--;
            
        }
    },
    setPointB : function(self){
        if(chance !== 0){
            pointB.innerText = getPoint[1] + 'p!';
            sum += getPoint[1];
            chance--;
        }
    },
    setPointC : function(self){
        if(chance !== 0){
            pointC.innerText = getPoint[2] + 'p!';
            sum += getPoint[2];
            chance--; 
        } 
    }
}

init();


