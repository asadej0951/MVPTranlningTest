package com.it.mvptranlning.plus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.it.mvptranlning.R
import com.it.mvptranlning.plus.presenterPlus.ContactPlus
import com.it.mvptranlning.plus.presenterPlus.PresenterImplPlus
import com.it.mvptranlning.presenter.Contact
import kotlinx.android.synthetic.main.activity_plus.*

class plusActivity : AppCompatActivity(),ContactPlus.View {

    private lateinit var presenPlus: PresenterImplPlus
    private var num1:String?=null
    private var num2:String?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plus)
        presenPlus = PresenterImplPlus(this)
        initView()
    }

    private fun initView() {
        btn_plus.setOnClickListener(){
           num1 =editnum1.text.toString()
            num2=editnum2.text.toString()

            presenPlus.calPlus(num1?:"0",num2?:"0")

        }

    }

    override fun ShowPlus(Plus: String) {
       tv_showPlus.text=Plus
    }


}
