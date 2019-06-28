package com.alizhezi.component

import android.content.Intent
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.alizhezi.component.base.BaseActivity
import com.alizhezi.component.navigation.NavigationActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {


    override fun initView() {

        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        mAdapter = HomeAdapter(this, getDatas())

        mAdapter.onItemClickListener = object : OnItemClickListener<ItemInfo> {
            override fun onItemClick(info: ItemInfo, position: Int, itemView: View) {


                var itemInfo = mAdapter.mDatas[position]


                var intent = Intent(this@MainActivity, itemInfo.clz)
                intent.putExtra("title", itemInfo.title)

                startActivity(intent)

            }


        }

        recyclerView.adapter = mAdapter
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun initData() {
        super.initData()
    }

    lateinit var mAdapter: HomeAdapter


    fun getDatas(): ArrayList<ItemInfo> {

        var datas = arrayListOf<ItemInfo>()


        datas.add(ItemInfo("Navigation 用法", NavigationActivity::class.java))


        return datas
    }


}
