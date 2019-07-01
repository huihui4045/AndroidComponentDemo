package com.alizhezi.component.binding

import android.graphics.Bitmap
import android.util.Log
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import androidx.databinding.BindingAdapter
import com.alizhezi.component.R


 class BindingAdapterUtils {


    companion object{
        @BindingAdapter("android:src")
        @JvmStatic
        fun loadImage(imageView: ImageView, url: String) {
            Log.e("PersionViewAdapter",url+"$url")

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

}