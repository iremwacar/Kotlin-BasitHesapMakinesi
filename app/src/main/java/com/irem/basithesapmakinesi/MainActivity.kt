package com.irem.basithesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.irem.basithesapmakinesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }


    val stringSayi1 = binding.editTextText.text.toString()
    val sayi1 = stringSayi1.toInt()

    val stringSayi2 = binding.editTextText3.text.toString()
    val sayi2  = stringSayi2.toInt()


    fun topla(view: View){
        if (stringSayi1=="" || stringSayi2 ==""){
            Toast.makeText(this@MainActivity,"Sayıları eksik girdiniz.",Toast.LENGTH_LONG).show()
        }
        else{
            val sonuc = sayi1+sayi2
            binding.textView2.text = "Sonuç: ${sonuc}"
        }
    }
    fun cikar(view: View){
        if (stringSayi1=="" || stringSayi2 ==""){
            Toast.makeText(this@MainActivity,"Sayıları eksik girdiniz.",Toast.LENGTH_LONG).show()
        }
        else{
            val sonuc = sayi1-sayi2
            binding.textView2.text = "Sonuç: ${sonuc}"
        }
    }
    fun carp(view: View){
        if (stringSayi1=="" || stringSayi2 ==""){
            Toast.makeText(this@MainActivity,"Sayıları eksik girdiniz.",Toast.LENGTH_LONG).show()
        }
        else{
            val sonuc = sayi1*sayi2
            binding.textView2.text = "Sonuç: ${sonuc}"
        }
    }
    fun bol(view: View){
        if (stringSayi1=="" || stringSayi2 ==""){
            Toast.makeText(this@MainActivity,"Sayıları eksik girdiniz.",Toast.LENGTH_LONG).show()
        }
        else{
            val sonuc = sayi1/sayi2
            binding.textView2.text = "Sonuç: ${sonuc}"
        }
    }
}