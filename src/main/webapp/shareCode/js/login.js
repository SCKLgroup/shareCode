
$(function(){
$("#btnLogin").click(function(){
 user_id=$("#user_id").val();
 var user_pw=$("#user_pw").val(); if(user_id == ""){
  alert("아이디를 입력하세요");
  $("#user_id").focus(); //입력포커스 이동

  return; //함수 종료
}
if(user_pw==""){
 alert("비밀번호를 입력하세요"); 
 $("#user_pw").focus();
  return;
}
//폼 내부의 데이터를 전송할 주소
 document.form1.action= "${path}/shareCode/login_check.do";
 document.form1.submit(); //제출
 });
});