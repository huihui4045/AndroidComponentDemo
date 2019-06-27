package com.alizhezi.component

import android.view.View

interface OnItemClickListener<T> {

    fun onItemClick(info: T, position: Int, itemView: View)
}