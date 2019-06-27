package com.alizhezi.component

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

     var title = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        initView()
        initData()
    }

    open fun initData() {
        title = intent.getStringExtra("title")


    }

    abstract fun initView()

    abstract fun getLayoutId(): Int
}