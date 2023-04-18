package com.example.utspraktikum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: myAdapterlist

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        showList()
    }

    private fun init() {
        recyclerView = findViewById(R.id.recycler_view)

        var data = ArrayList<Data>()
        data.add(Data(R.drawable.p1,"Spongeboob","kuning"))
        data.add(Data(R.drawable.p2,"Dora","pink"))
        data.add(Data(R.drawable.p3,"Plankton","hijau"))
        data.add(Data(R.drawable.p4,"Patrick","merah"))
        data.add(Data(R.drawable.p5,"Sandy","putih"))
        data.add(Data(R.drawable.p6,"Tuankrab","merah"))
        data.add(Data(R.drawable.p1,"Spongeboob","kuning"))
        data.add(Data(R.drawable.p2,"Dora","pink"))
        data.add(Data(R.drawable.p3,"Plankton","hijau"))
        data.add(Data(R.drawable.p4,"Patrick","merah"))
        data.add(Data(R.drawable.p5,"Sandy","putih"))
        data.add(Data(R.drawable.p6,"Tuankrab","merah"))
        data.add(Data(R.drawable.p1,"Spongeboob","kuning"))
        data.add(Data(R.drawable.p2,"Dora","pink"))
        data.add(Data(R.drawable.p3,"Plankton","hijau"))
        data.add(Data(R.drawable.p4,"Patrick","merah"))
        data.add(Data(R.drawable.p5,"Sandy","putih"))
        data.add(Data(R.drawable.p6,"Tuankrab","merah"))
        data.add(Data(R.drawable.p1,"Spongeboob","kuning"))
        data.add(Data(R.drawable.p2,"Dora","pink"))

        adapter = myAdapterlist(data)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.example_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.item1 -> {
                showList()
                return true
            }
            R.id.item2 -> {
                showGrid()
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }

    private fun showList() {
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
    }

    private fun showGrid() {
        val layoutManager = GridLayoutManager(this, 2)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
    }
}
