package com.alizhezi.component

import android.app.Activity
import android.os.Parcel
import android.os.Parcelable
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.parcel.Parcelize
import org.intellij.lang.annotations.Pattern


class ItemInfo(var title: String, var clz: Class<*>)