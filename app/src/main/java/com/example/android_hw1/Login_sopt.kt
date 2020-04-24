package com.example.android_hw1

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login_sopt.*
import kotlinx.android.synthetic.main.activity_new_account.*

class Login_sopt : AppCompatActivity() {
    val JOIN = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_sopt)

        btn_login.setOnClickListener { view ->
            if(email.text.isNullOrBlank() || pwd.text.isNullOrBlank())
                Toast.makeText(this, "이메일과 비밀번호를 입력하세요.", Toast.LENGTH_SHORT).show()
            else {
                var intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }

        join.setOnClickListener {
            var intent = Intent(this, NewAccount::class.java)
            startActivityForResult(intent, JOIN)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == JOIN) {
            if(resultCode == Activity.RESULT_OK) {
                email.setText(data!!.getStringExtra("email"))
                pwd.setText(data!!.getStringExtra("password"))
                Toast.makeText(this, "회원가입에 성공했습니다.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
