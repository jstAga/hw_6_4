package com.geektech.hw_6_4

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainSharedViewModel : ViewModel() {
    val count = MutableLiveData(0)
    val history = MutableLiveData("")

    fun increment(){
        history.value += "+ "
        count.value = count.value?.plus(1)
    }

    fun decrement(){
        history.value += "- "
        count.value = count.value?.minus(1)
    }
}