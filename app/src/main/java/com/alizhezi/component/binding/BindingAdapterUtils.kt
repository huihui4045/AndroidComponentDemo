package com.alizhezi.component.binding

import android.graphics.Bitmap
import android.util.Log
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import androidx.databinding.BindingAdapter
import com.alizhezi.component.R

/**
 * Copyright (C) 2019 The ziroom.com Inc. All rights reserved
 * Author: 吕鹏 lvp@ziroom.com
 * Time Created at 2019-07-01
 * Description：BindingAdapterUtils.kt
 */
object BindingAdapterUtils {


    @BindingAdapter("android:src")
    @JvmStatic
    fun loadImage(imageView: ImageView, url: String) {
        Log.e("PersionViewAdapter", url + "$url")

        val options = RequestOptions()
            .centerCrop()
            .placeholder(R.mipmap.ic_launcher_round)
            .dontAnimate()
        Glide.with(imageView.context).load(url).apply(options).into(imageView)
    }


    @BindingAdapter("app:imageUrl")
    @JvmStatic
    fun imageUrl(imageView: ImageView, url: String) {
        Log.e("PersionViewAimageUrl", url + "$url")

        val options = RequestOptions()
            .centerCrop()
            .placeholder(R.mipmap.ic_launcher_round)
            .dontAnimate()
        Glide.with(imageView.context).load(url).apply(options).into(imageView)

    }

    @BindingAdapter("android:src")
    @JvmStatic
    fun loadImage(imageView: ImageView, url: Bitmap) {
        imageView.setImageBitmap(url)

    }

}