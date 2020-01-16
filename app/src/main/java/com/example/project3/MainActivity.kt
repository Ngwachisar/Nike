package com.example.project3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.project3.adapter.UsersAdapter
import com.example.project3.model.Users

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerView:RecyclerView =findViewById(R.id.recycler_view)

        var userArray = ArrayList<Users>()
        userArray.add(Users(R.drawable.selena,"Selena","posted",R.drawable.rainy2))
        userArray.add(Users(R.drawable.john,"John","posted",R.drawable.rainy3))

        var usersAdapter = UsersAdapter(userArray)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = usersAdapter

    }
}
