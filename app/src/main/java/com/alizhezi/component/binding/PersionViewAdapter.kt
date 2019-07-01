package com.alizhezi.component.binding

import android.content.Context
import android.graphics.Bitmap
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.alizhezi.component.R
import com.alizhezi.component.bean.PersionInfo
import com.alizhezi.component.databinding.ItemBindInfoBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions




/**
 * Copyright (C) 2019 The ailizhezi.com Inc. All rights reserved
 * Author: 吕鹏 gavin6116@gmail.com
 * Time Created at 2019-07-01
 * Description：
 */
class PersionViewAdapter(var mDatas: ArrayList<PersionInfo>) : RecyclerView.Adapter<PersionViewAdapter.ViewHolder>() {


   lateinit var mContext:Context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        mContext=parent.context.applicationContext

        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_bind_info, parent, false))
    }

    override fun getItemCount(): Int {

        return mDatas.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var persionInfo = mDatas[position]
        holder.bindInfoBinding.persion = persionInfo


      //  Glide.with(mContext).load(persionInfo.headUrl).placeholder(R.mipmap.ic_launcher_round).into(holder.bindInfoBinding.ivHead)
       // Glide.with(mContext).load(persionInfo.headUrl2).placeholder(R.mipmap.ic_launcher_round).into(holder.bindInfoBinding.ivHead2)

        holder.bindInfoBinding.executePendingBindings()

    }


    class ViewHolder : RecyclerView.ViewHolder {

        var bindInfoBinding: ItemBindInfoBinding

        constructor(itemView: View) : super(itemView) {
            bindInfoBinding = DataBindingUtil.bind<ItemBindInfoBinding>(itemView)!!
        }

    }
}