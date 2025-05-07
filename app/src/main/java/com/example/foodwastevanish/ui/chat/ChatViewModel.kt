package com.example.foodwastevanish.ui.chat

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ChatViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is ChatFragment"
    }
    val text: LiveData<String> = _text

    companion object {
        val text: Any
            get() {
                TODO()
            }
    }
}