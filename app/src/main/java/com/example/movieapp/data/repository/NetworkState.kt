package com.example.movieapp.data.repository


enum class Status{
    RUNNING,
    SUCCESS,
    FAILED
}
class NetworkState(val status:Status , val msg:String){

    companion object{
        val LOADED :NetworkState
        val LOADING:NetworkState
        val ERROR:NetworkState

        init {
            LOADED = NetworkState(Status.SUCCESS , "Successful" )
            LOADING = NetworkState(Status.RUNNING ,"Loading")
            ERROR = NetworkState(Status.FAILED , "Something Went Wrong")
        }
    }

}