package com.example.androidtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var brojac = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(applicationContext, "onCreate", Toast.LENGTH_SHORT).show()
        Log.i("MyLog", "onCreate")
        Log.d("MyLog", "onCreate")
        Log.v("MyLog", "onCreate")
        Log.w("MyLog", "onCreate")
        Log.e("MyLog", "onCreate")
    }
    override fun onStart() {
        super.onStart()
        Toast.makeText(applicationContext, "onStart", Toast.LENGTH_SHORT).show()
        Log.i("MyLog", "onStart")
        Log.d("MyLog", "onStart")
        Log.v("MyLog", "onStart")
        Log.w("MyLog", "onStart")
        Log.e("MyLog", "onStart")
    }
    override fun onResume() {
        super.onResume()
        Toast.makeText(applicationContext, "onResume", Toast.LENGTH_SHORT).show()
        Log.i("MyLog", "onResume")
        Log.d("MyLog", "onResume")
        Log.v("MyLog", "onResume")
        Log.w("MyLog", "onResume")
        Log.e("MyLog", "onResume")
    }
    override fun onPause() {
        super.onPause()
        Toast.makeText(applicationContext, "onPause", Toast.LENGTH_SHORT).show()
        Log.i("MyLog", "onPause")
        Log.d("MyLog", "onPause")
        Log.v("MyLog", "onPause")
        Log.w("MyLog", "onPause")
        Log.e("MyLog", "onPause")
    }
    override fun onStop() {
        super.onStop()
        Toast.makeText(applicationContext, "onStop", Toast.LENGTH_SHORT).show()
        Log.i("MyLog", "onStop")
        Log.d("MyLog", "onStop")
        Log.v("MyLog", "onStop")
        Log.w("MyLog", "onStop")
        Log.e("MyLog", "onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(applicationContext, "onDestroy", Toast.LENGTH_SHORT).show()
        Log.i("MyLog", "onDestroy")
        Log.d("MyLog", "onDestroy")
        Log.v("MyLog", "onDestroy")
        Log.w("MyLog", "onDestroy")
        Log.e("MyLog", "onDestroy")
    }
    override fun onRestart() {
        super.onRestart()
        Toast.makeText(applicationContext, "onRestart", Toast.LENGTH_SHORT).show()
        Log.i("MyLog", "onRestart")
        Log.d("MyLog", "onRestart")
        Log.v("MyLog", "onRestart")
        Log.w("MyLog", "onRestart")
        Log.e("MyLog", "onRestart")
    }

    fun setOnClickListenerUp(view: View) {
        brojac++;
        val firstName = findViewById<TextView>(R.id.textViewCounter)
        firstName.text = "$brojac"
    }
    fun setOnClickListenerDown(view: View) {
        if(brojac > 0){
            brojac--;
            val firstName = findViewById<TextView>(R.id.textViewCounter)
            firstName.text = "$brojac"
        }
    }

}