package com.example.api_basic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.widget.TextView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val retrofit= Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .build()
        val jsonapi=retrofit.create(jsonapi::class.java)
        val mcall : Call<List<model>> = jsonapi.getInfo()
        mcall.enqueue(object : Callback<List<model>>
        {
            override fun onFailure(call: Call<List<model>>, t: Throwable) {
                Log.e("Error", t.message.toString())
            }
            override fun onResponse(call: Call<List<model>>, response: Response<List<model>>) {
               val mmodel:List<model> = response.body()!!
                val stringBuilder= StringBuilder()
                for (i in mmodel){
                    stringBuilder.append((i.userId))
                    stringBuilder.append("\n")
                    stringBuilder.append((i.id))
                    stringBuilder.append("\n")
                    stringBuilder.append((i.mtitle))
                    stringBuilder.append(("\n"))
                    stringBuilder.append((i.completed))
                    stringBuilder.append("\n")
                    stringBuilder.append(("\n"))
                }
                var resultText: TextView = findViewById(R.id.txtUser)
                resultText.movementMethod= ScrollingMovementMethod()
                resultText.text = stringBuilder
            }
        })

    }
}
