package com.example.android_hw1

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_new_account.*

class NewAccount : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_account)

        btn_join.setOnClickListener { view ->
            if(new_email.text.isNullOrBlank() || new_pwd.text.isNullOrBlank() || check_pwd.text.isNullOrBlank() || git_id.text.isNullOrBlank()) {
                Toast.makeText(this, "이메일, 비밀번호, 비밀번호 확인, Github 닉네임 모두 입력했는지 확인해주세요", Toast.LENGTH_SHORT).show()
            }

            else {
                val intent = Intent()
                intent.putExtra("email", new_email.text.toString())
                intent.putExtra("password", new_pwd.text.toString())
                setResult(Activity.RESULT_OK, intent)
                finish()
            }
        }
    }
}
