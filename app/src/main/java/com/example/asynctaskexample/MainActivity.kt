package com.example.asynctaskexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startTask(view: View) {
        val task : MyTask = MyTask(this)
        task.execute(
            "https://thumbs.dreamstime.com/b/tiger-standing-back-paws-not-typicall-pose-big-cat-dancing-amur-panthera-tigris-altaica-blurred-background-funny-picture-147142975.jpg",
            "https://p.bigstockphoto.com/GeFvQkBbSLaMdpKXF1Zv_bigstock-Aerial-View-Of-Blue-Lakes-And--227291596.jpg",
            "https://images.fineartamerica.com/images-medium-large-5/africas-big-five-david-stribbling.jpg",
            "https://image.shutterstock.com/image-vector/vector-abstract-3d-big-data-260nw-1007122360.jpg",
            "https://static.posters.cz/image/750/plakatok/african-big-five-i918.jpg")

    }
}
