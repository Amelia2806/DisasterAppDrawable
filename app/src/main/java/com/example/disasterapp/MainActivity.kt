package com.example.disasterapp  // Pastikan nama paket sesuai dengan struktur Anda

import ImageAdapter
import ImageItem
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 3)

        // Buat daftar gambar dari drawable
        val imageList = listOf(
            ImageItem(R.drawable.image1),
            ImageItem(R.drawable.image2),
            ImageItem(R.drawable.image3),
            ImageItem(R.drawable.image4),
            ImageItem(R.drawable.image5),
            ImageItem(R.drawable.image6),
            ImageItem(R.drawable.image7),
            ImageItem(R.drawable.image8),
            ImageItem(R.drawable.image9),
            ImageItem(R.drawable.image10),
            ImageItem(R.drawable.image11),
            ImageItem(R.drawable.image12),
            ImageItem(R.drawable.image13),
            ImageItem(R.drawable.image14),
            ImageItem(R.drawable.image15),
            ImageItem(R.drawable.image16),
            ImageItem(R.drawable.image17),
            ImageItem(R.drawable.image18)
        )

        recyclerView.adapter = ImageAdapter(imageList)
    }
}
