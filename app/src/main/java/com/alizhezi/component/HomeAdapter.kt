package com.alizhezi.component

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_info.view.*


/**
 * Copyright (C) 2019 The ailizhezi.com Inc. All rights reserved
 * Author: 吕鹏 gavin6116@gmail.com
 * Time Created at 2019-06-26
 * Description：
 */
class HomeAdapter(var context: Context, var mDatas: ArrayList<ItemInfo>) :
    RecyclerView.Adapter<HomeAdapter.ViewHolder>() {

    var onItemClickListener: OnItemClickListener<ItemInfo>? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_info, null))

    }

    override fun getItemCount(): Int {
        return mDatas.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        var itemInfo = mDatas[position]
        holder.containerView.tv_title.text = itemInfo.title

        holder.containerView.setOnClickListener {
            onItemClickListener?.onItemClick(itemInfo, position, holder.itemView)
        }
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), LayoutContainer {
        override val containerView: View = itemView


    }
}