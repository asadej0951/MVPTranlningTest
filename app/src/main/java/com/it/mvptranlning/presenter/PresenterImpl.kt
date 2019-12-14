package com.it.mvptranlning.presenter//ใช้ในหาคำนวน

class PresenterImpl (var view: Contact.View) :Contact.Presenter{
    override fun calculate(w: String, h: String) {

        var bmi :Double?=null

        var hm:Double=h.toDouble()/100

        bmi=w.toDouble()/(hm*hm)



        view.showBMI(bmi.toString())
    }

}