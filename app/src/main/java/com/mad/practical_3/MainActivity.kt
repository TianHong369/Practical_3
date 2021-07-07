package com.mad.practical_3


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.mad.practical_3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var aPerson = Person("Ali", "1233456", "ali@gmail.com", "123Jalan ali")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.personData = aPerson
        //binding.name_textView.text = "Ali";
//        binding.nameTextView.text =aPerson.name;
//        binding.ICTextView2.text =aPerson.ic;

        binding.btnUpdate.setOnClickListener() {
            aPerson.email = "abu@gmail.com"
            binding.apply { invalidateAll() }
        }

    }
}