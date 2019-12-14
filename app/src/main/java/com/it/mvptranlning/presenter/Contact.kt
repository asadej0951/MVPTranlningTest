package com.it.mvptranlning.presenter

class Contact {
    interface Presenter{
        fun calculate(w:String,h:String)



    }
    interface View {
        fun showBMI(bmi: String)

    }

}