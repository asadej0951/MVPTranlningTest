package com.it.mvptranlning.plus.presenterPlus

class PresenterImplPlus (var view: ContactPlus.View) :ContactPlus.Persenter {
    override fun calPlus(num1: String, num2: String) {

        var plus =num1.toDouble()+num2.toDouble()
        view.ShowPlus(plus.toString())
    }

}