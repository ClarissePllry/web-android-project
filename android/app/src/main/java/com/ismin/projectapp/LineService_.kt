package com.ismin.projectapp

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface LineService_ {
    @GET("lignes")
    fun getAllLines(@Query("rows") nbRows:Int): Call<DataFormat>

    @GET("lignes")
    fun getNbLines():Call<DataFormat>
}
