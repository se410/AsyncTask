package com.example.asynctaskexample

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.AsyncTask
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.net.HttpURLConnection
import java.net.URL


class MyTask(val context: MainActivity) : AsyncTask<String, Integer, Bitmap>() {


    override fun onPreExecute() {
        context.progressBar.visibility = View.VISIBLE
    }

    override fun doInBackground(vararg params: String?): Bitmap {

        publishProgress(10 as Integer)

        var mIcon11: Bitmap? = null
        val url = URL(params.random())

        mIcon11 = BitmapFactory.decodeStream(url.openConnection().getInputStream())
        publishProgress(30 as Integer)

        val connect: HttpURLConnection = url.openConnection() as HttpURLConnection
        connect.requestMethod = "GET"
        publishProgress(90 as Integer)

        connect.connect()
        publishProgress(100 as Integer)


        return mIcon11
    }

    override fun onProgressUpdate(vararg values: Integer?) {
        context.progressBar.progress = values[0] as Int
    }

    override fun onPostExecute(result: Bitmap?) {
        context.progressBar.visibility = View.INVISIBLE

        //display image
        context.image.setImageBitmap(result)
        context.image.visibility = View.VISIBLE
    }
}