id = prompt('아이디 입력');
if(id == 'admin') {
    password = prompt('비밀전호 입력');
    if(password==='123456') {
        location.href="예제20_login.html"
    } else {
        location.href="예제20_error.html"
    }
} else {
    location.href="./예제20_error.html"
}