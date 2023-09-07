package com.example.bookshelf.network

import com.example.bookshelf.data.BookList
import retrofit2.http.GET



//retrofit instructions to API service
interface BookshelfApiService {
    @GET("?q=jazz+history")
    suspend fun getList(): BookList
}


// Now i just use BookshelfApi.retrofitService to call it.