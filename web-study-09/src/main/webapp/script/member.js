function loginCheck(){
	if(document.frm.userid.value.length==0){
		alert("아이디 작성해");
		frm.userid.focus();
		return false
	}
	if(document.frm.pwd.value ==""){
		alert("암호필수");
		frm.pwd.focus();
		return false
	}
	return true;
}