package com.example.pockettale.ui.summaries

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SummariesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is summaries Fragment"
    }
    val text: LiveData<String> = _text
}