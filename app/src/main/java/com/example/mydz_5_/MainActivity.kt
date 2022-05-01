package com.example.mydz_5_

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.AttributeSet
import android.view.View
import android.widget.Toast
import com.example.mydz_5_.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initlistener()
    }

    private fun initlistener() {
        binding.button1.setOnClickListener {

            if (TextUtils.isEmpty(binding.editText.getText().toString())) {
                Toast.makeText(
                    this,
                    "Открой глаза ШИРЕ!!!",
                    Toast.LENGTH_SHORT
                ).show(); } else {




                val intent = Intent(this, Second_Activity2::class.java)
                intent.putExtra("key",binding.editText.text.toString())

                startActivity(intent)

            }

        }
        val textt = intent.getStringExtra("iii")
        binding.tvText.text = textt

    }

    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
        return super.onCreateView(name, context, attrs)

    }
}