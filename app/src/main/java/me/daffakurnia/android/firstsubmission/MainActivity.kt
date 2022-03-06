package me.daffakurnia.android.firstsubmission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recycleUser: RecyclerView
    private var list = ArrayList<User>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "Github User"
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
            val userList = ArrayList<User>()
            for (i in name.indices) {
                userList.add(User(name[i], username[i], photo.getResourceId(i, -1)))
            }
            return userList
        }

    private fun showRecyclerList() {
        recycleUser.layoutManager = LinearLayoutManager(this)
        recycleUser.adapter = ListUserAdapter(list)
    }
}