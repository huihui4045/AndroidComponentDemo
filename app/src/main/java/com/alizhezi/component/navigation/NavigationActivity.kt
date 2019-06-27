package com.alizhezi.component.navigation

import com.alizhezi.component.BaseActivity
import com.alizhezi.component.R
import kotlinx.android.synthetic.main.activity_navigation.*

class NavigationActivity : BaseActivity() {


    override fun getLayoutId(): Int {
        return R.layout.activity_navigation
    }

    override fun initData() {
        super.initData()
        toolbar.title = title
    }

    override fun initView() {
        setSupportActionBar(toolbar)


    }
}
