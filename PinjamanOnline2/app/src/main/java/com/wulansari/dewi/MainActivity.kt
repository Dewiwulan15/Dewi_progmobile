package com.wulansari.dewi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.wulansari.dewi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnHitung.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        val inputUang = binding.etInputUang.text.toString()
        val inputTenor = binding.etInputTenor.text.toString()

        var totalCair = inputUang.toDouble() - (inputUang.toDouble() * 0.05)

        var bunga = 0.0375 * inputTenor.toDouble()
        var totalBayar = inputUang.toDouble() + (inputUang.toDouble() * bunga)

        binding.tvTotalBayar.text = totalBayar.toString()
        binding.tvTotalCair.text = totalCair.toString()

    }
}