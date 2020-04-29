# Android_HW1_Login_Join
Login, Make new account

#1주차 과제1  
###회원가입 및 로그인 기능 구현하기  

####구현방법  
#####intent.putExtra, intent.getStringExtra를 활용하여 데이터를 주고 받음(StartActivityForResult이용)    
#####setText를 통해 회원가입 성공 시 입력한 이메일과 비밀번호를 로그인 액티비티의 이메일, 비밀번호 editText로 받아옴.

####새로알게 된 내용  
#####setText로 textView나 editText에 값을 직접 입력하는 것이 아닌 다른 곳으로부터 받아오는 기능을 알게됨.  
#####onActivityResult의 requestCode 값을 상수로 선언하여 사용하는 것이 유용했다.
