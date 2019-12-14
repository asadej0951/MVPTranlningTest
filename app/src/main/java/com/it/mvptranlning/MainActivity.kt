package com.it.mvptranlning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.it.mvptranlning.presenter.Contact
import com.it.mvptranlning.presenter.PresenterImpl
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),Contact.View {

    private lateinit var presenter :PresenterImpl
    private  var weight:String?= null
    private  var height:String?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = PresenterImpl(this)
        initView()
    }

    private fun initView() {
        btn_ok.setOnClickListener(){


            weight=edit_w.text.toString()
            height=edit_h.text.toString()

            presenter.calculate(weight ?:"0",height ?:"0")
        }
    }

    override fun showBMI(bmi: String) {
        tv_show.text=bmi
    }
}
