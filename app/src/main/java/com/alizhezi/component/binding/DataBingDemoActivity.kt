package com.alizhezi.component.binding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.alizhezi.component.R
import com.alizhezi.component.base.BaseActivity
import com.alizhezi.component.bean.PersionInfo
import com.alizhezi.component.databinding.ActivityDataBingDemoBinding

class DataBingDemoActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        //setContentView(this, R.layout.activity_data_bing_demo)


        var dataBinding =
            DataBindingUtil.setContentView<ActivityDataBingDemoBinding>(this, R.layout.activity_data_bing_demo)


        dataBinding.user = UserInfo("lv", 20)


        var layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        dataBinding.recyclerView.layoutManager = layoutManager

        dataBinding.recyclerView.adapter = PersionViewAdapter(getDatas())


    }


    fun getDatas(): ArrayList<PersionInfo> {

        var persions = arrayListOf<PersionInfo>()


        persions.add(
            PersionInfo(
                "曹操4",
                "http://hbimg.b0.upaiyun.com/c999a12ebdc52d6be8592404254f36e4a76266241e90d-cNSF1k_fw658",
                "http://hbimg.b0.upaiyun.com/c999a12ebdc52d6be8592404254f36e4a76266241e90d-cNSF1k_fw658"
            )
        )
        persions.add(
            PersionInfo(
                "曹操5",
                "http://hbimg.b0.upaiyun.com/16880e1f05dc8807c3e5336d1d8eb4eeeb6130ac3423e-xa0xnN_fw658",
                "http://hbimg.b0.upaiyun.com/16880e1f05dc8807c3e5336d1d8eb4eeeb6130ac3423e-xa0xnN_fw658"
            )
        )

        persions.add(
            PersionInfo(
                "曹操6",
                "http://pic16.nipic.com/20110817/2839526_152333630088_2.jpg",
                "http://pic16.nipic.com/20110817/2839526_152333630088_2.jpg"
            )
        )

        persions.add(
            PersionInfo(
                "曹操2",
                "https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=4138850978,2612460506&fm=200&gp=0.jpg",
                "https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=4138850978,2612460506&fm=200&gp=0.jpg"
            )
        )
        persions.add(
            PersionInfo(
                "曹操3",
                "http://img5.duitang.com/uploads/item/201411/16/20141116124947_xBNxM.jpeg",
                "http://img5.duitang.com/uploads/item/201411/16/20141116124947_xBNxM.jpeg"
            )
        )

        persions.add(
            PersionInfo(
                "曹操1",
                "http://img5.duitang.com/uploads/item/201411/16/20141116124947_xBNxM.jpeg",
                "http://img5.duitang.com/uploads/item/201411/16/20141116124947_xBNxM.jpeg"
            )
        )

        return persions
    }

}
