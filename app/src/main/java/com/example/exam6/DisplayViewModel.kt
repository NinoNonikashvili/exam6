package com.example.exam6

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.exam6.network.Api
import com.example.exam6.network.Content
import kotlinx.coroutines.launch

class DisplayViewModel :ViewModel(){
    private var _data = MutableLiveData<List<Content>>()
    val data: LiveData<List<Content>>
    get() = _data
    init{
        getData()
    }

    private fun  getData(){
        viewModelScope.launch{
            try{
                _data.value= Api.retrofitService.getData().content
            }catch(e:Exception){
                Log.d("MyError", "${e.message}")
            }
        }
    }

}