package com.example.exam6

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.exam6.network.Api
import kotlinx.coroutines.launch

class DisplayViewModel :ViewModel(){
    private var _variable1 = MutableLiveData("")
    val variable1: LiveData<String>
    get() = _variable1

    private fun  getData(){
        viewModelScope.launch{
            try{
                _variable1.value= Api.retrofitService.getData()[0].category
            }catch(e:Exception){
                _variable1.value = "e.message"
            }
        }
    }

}