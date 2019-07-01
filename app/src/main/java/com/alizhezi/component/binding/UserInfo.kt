package com.alizhezi.component.binding

import android.util.Log

class UserInfo(var name: String, var age: Int) {


    fun addAge() {

        Log.e("======","age=$age")

        age++
    }
}