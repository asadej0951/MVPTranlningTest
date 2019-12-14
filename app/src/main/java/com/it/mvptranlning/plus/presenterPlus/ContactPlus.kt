package com.it.mvptranlning.plus.presenterPlus

class ContactPlus {

    interface Persenter{
        fun calPlus(num1:String,num2:String)
    }
    interface View{
        fun ShowPlus(Plus:String)
    }
}