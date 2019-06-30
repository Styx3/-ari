package net.project.qula10

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_register.*
import java.util.regex.Pattern

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        init()
    }

    private fun init() {
        val regex = "^(514|551|555|557|558|568|570|571|574|577|578|579|591|592|593|595|596|597|598|599)".toRegex()
        RegisterButtonR.setOnClickListener{
            if(regex.containsMatchIn(UserR.text.toString()) && UserR.text.toString().length==9 && PasswR.text.isNotEmpty() && isValidEmail(EmailR.text.toString()) && NicknameR.text.isNotEmpty()){
                val intent  = Intent(this,LoginActivity::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(this,"Please Enter Correct Information in Fields :)", Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun isValidEmail(email: String): Boolean {
        val EMAIL_PATTERN =
            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"
        val pattern = Pattern.compile(EMAIL_PATTERN)
        val matcher = pattern.matcher(email)
        return matcher.matches()
    }
}
