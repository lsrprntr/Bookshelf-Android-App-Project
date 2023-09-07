package com.example.bookshelf

import com.example.bookshelf.data.BookList
import com.example.bookshelf.network.BookshelfApiService

class FakeBookshelfApiService : BookshelfApiService {
    override suspend fun getList(): BookList {
        return FakeDataSource.fakeList
    }

}