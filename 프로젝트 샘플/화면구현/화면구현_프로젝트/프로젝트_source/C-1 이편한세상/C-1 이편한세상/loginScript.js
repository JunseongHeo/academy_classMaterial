// Get the modal
var modal = document.getElementById('id01');

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}

function login(){
  var message = "admin";
  var pass = "1234";
  var id = document.getElementById("user-id").value;
  var pwd = document.getElementById("user-pass").value;
    if(id=='admin'&&pwd==pass){
      alert("환영합니다!");
      location.href='customerInquiry02.html';
    }else {
      alert("회원정보가 없습니다.");
      document.getElementById("user-id").value="";
      document.getElementById("user-pass").value="";
      document.getElementById("user-id").focus();
    }
}
