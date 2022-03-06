package me.daffakurnia.android.firstsubmission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_USER = "extra_user"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val imgDetailUser: ImageView = findViewById(R.id.img_detail_user)
        val textDetailUsername: TextView = findViewById(R.id.text_detail_username)
        val textDetailName: TextView = findViewById(R.id.text_detail_name)

        val detailUser = intent.getParcelableExtra<DetailUser>(EXTRA_USER)

        supportActionBar?.title = "${detailUser?.username.toString()} Detail Account"

        detailUser?.photo?.let { imgDetailUser.setImageResource(it) }
        textDetailUsername.text = detailUser?.username.toString()
        textDetailName.text = detailUser?.name.toString()

        val btnBack: Button = findViewById(R.id.btn_back)
        btnBack.setOnClickListener {
            startActivity(Intent(this@DetailActivity, MainActivity::class.java))
        }
    }
}