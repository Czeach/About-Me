package com.example.android.about_me

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.android.about_me.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val myName: MyName = MyName("Ezichi Amarachi", "")

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.myName = myName

        binding.doneButton.setOnClickListener {
            addNickname(it)
        }
    }

    private fun addNickname(view: View) {


        binding.apply {
            invalidateAll()
            myName?.nickname = nickname_text.text.toString()
            editNickname.visibility = View.GONE
            doneButton.visibility =View.GONE
            nickname_text.visibility = View.VISIBLE
        }

    }

}
