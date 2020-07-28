package com.example.homework19

import javax.inject.Inject

class Student @Inject constructor() {
    private val studentType = if(BuildConfig.DEBUG){
        "bakalavr"
    }else{
        "master"
    }
}