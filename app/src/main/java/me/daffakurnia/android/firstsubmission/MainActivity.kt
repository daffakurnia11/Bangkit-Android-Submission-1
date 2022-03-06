package me.daffakurnia.android.firstsubmission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import me.daffakurnia.android.firstsubmission.data.User

class MainActivity : AppCompatActivity() {

    private lateinit var recycleUser: RecyclerView
    private var list = ArrayList<User>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = resources.getString(R.string.text_title)
        recycleUser = findViewById(R.id.recycle_user)
        recycleUser.setHasFixedSize(true)

        list.addAll(listUsers)
        showRecyclerList()
    }

    private val listUsers: ArrayList<User>
        get() {
            val name = resources.getStringArray(R.array.name)
            val username = resources.getStringArray(R.array.username)
            val photo = resources.obtainTypedArray(R.array.avatar)
            val location = resources.getStringArray(R.array.location)
            val company = resources.getStringArray(R.array.company)
            val followers = resources.getIntArray(R.array.followers)
            val following = resources.getIntArray(R.array.following)
            val repository = resources.getIntArray(R.array.repository)

            val userList = ArrayList<User>()
            for (i in name.indices) {
                userList.add(User(username[i], name[i], photo.getResourceId(i, -1), location[i], company[i], followers[i], following[i], repository[i]))
            }
            return userList
        }

    private fun showRecyclerList() {
        recycleUser.layoutManager = LinearLayoutManager(this)
        recycleUser.adapter = ListUserAdapter(list)
    }
}