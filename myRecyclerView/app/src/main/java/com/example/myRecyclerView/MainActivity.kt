package com.example.myRecyclerView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myRecyclerView.recyclerVIew.Adapter
import com.example.myRecyclerView.recyclerVIew.MyData

class MainActivity : AppCompatActivity() {

    private lateinit var rv_list : RecyclerView
    private lateinit var rv_Adapter : Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()

    }

    private fun initRecyclerView() {
        rv_list = findViewById(R.id.rv_list)
        rv_Adapter = Adapter(this)
        rv_list.adapter = rv_Adapter
        rv_list.layoutManager = LinearLayoutManager(this)
        /**  xml에서 이렇게 설정할수도 있음
        app:layoutManager="androidx.recyclerview.widget.LinearLayoutManager"
        android:orientation="vertical" **/

        rv_Adapter.data = listOf(
            MyData(
                img = R.drawable.ic_launcher_background,
                name = "짱구",
                age = 20
            ),
            MyData(
                img = R.drawable.ic_launcher_background,
                name = "김철수",
                age = 30
            ),
            MyData(
                img = R.drawable.ic_launcher_background,
                name = "박철수",
                age = 40
            ),
            MyData(
                img = R.drawable.ic_launcher_background,
                name = "이철수",
                age = 50
            ),
            MyData(
                img = R.drawable.ic_launcher_background,
                name = "배철수",
                age = 10
            ),
            MyData(
                img = R.drawable.ic_launcher_background,
                name = "안철수",
                age = 24
            ),
        )
        rv_Adapter.notifyDataSetChanged()
    }
}