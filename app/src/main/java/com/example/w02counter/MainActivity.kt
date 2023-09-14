package com.example.w02counter

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.w02counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var main: ActivityMainBinding
    private var count = 0 // 숫자를 추적하기 위한 변수
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        main = ActivityMainBinding.inflate(layoutInflater)

        setContentView(main.root)
        // 초기 텍스트 설정
//        main.txtCount.text = count.toString()

        // 버튼 클릭 시 숫자 증가
        main.btnAdd.setOnClickListener {
//            count++
//            main.txtCount.text = count.toString()
            main.txtCount.text = "${++count}"//""+ ++count
        }

        main.btnMinus.setOnClickListener {
            if (count>0){
                main.txtCount.text = "${--count}"
            }

        }

        main.btnReset.setOnClickListener {
            count = 0
            main.txtCount.text = "$count"

        }
    }
}