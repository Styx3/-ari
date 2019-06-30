package net.project.qula10

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        init()
    }

    private fun init() {
        val regex = "^(514|551|555|557|558|568|570|571|574|577|578|579|591|592|593|595|596|597|598|599)".toRegex()
        LoginButton.setOnClickListener {
            if (regex.containsMatchIn(User.text.toString()) && User.text.toString().length==9 && Passw.text.isNotEmpty()){
                val intent  = Intent(this,InnerPageActivity::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(this,"Please Enter Valid Phone Number",Toast.LENGTH_LONG).show()
            }
        }
        RegisterButton.setOnClickListener {
            val intent  = Intent(this,RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}