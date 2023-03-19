package com.example.lesson_6_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson_6_recyclerview.adapter.UserAdapter
import com.example.lesson_6_recyclerview.databinding.ActivityMainBinding
import com.example.lesson_6_recyclerview.model.UserModel

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var adapter: UserAdapter
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initial()
    }

    private fun initial() {
        recyclerView = binding.rvUser
        adapter = UserAdapter()
        recyclerView.adapter = adapter
        adapter.setList(myUser())
    }

    fun myUser(): ArrayList<UserModel>{
        val userList = ArrayList<UserModel>()

        val user = UserModel("Ulug", "Ulug")
        userList.add(user)

        val user2 = UserModel("Ulug", "Ulug")
        userList.add(user2)

        val user3 = UserModel("Ulug", "Ulug")
        userList.add(user3)

        val user4 = UserModel("Ulug", "Ulug")
        userList.add(user4)

        val user5 = UserModel("Ulug", "Ulug")
        userList.add(user5)

        val user6 = UserModel("Ulug", "Ulug")
        userList.add(user6)
        return userList
    }
}