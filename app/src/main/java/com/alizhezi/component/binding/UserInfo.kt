package com.alizhezi.component.binding

import android.util.Log
import androidx.databinding.ObservableField

class UserInfo(var name: ObservableField<String>, var age: ObservableField<Int>) {


    fun addAge() {

        Log.e("======", "age=$age")

        var _age = age.get()
        _age = _age?.plus(1)
        age.set(_age)


    }
}