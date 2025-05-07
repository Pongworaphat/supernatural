package com.example.foodwastevanish.ui.more

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MoreViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is MoreFragment"
    }
    val text: LiveData<String> = _text

    companion object {
        val text: Any
            get() {
                TODO()
            }
    }
}