package com.example.eticaret.di

import com.example.eticaret.data.remote.FakeStoreApi
import com.example.eticaret.data.repository.ProductRepositoryImpl
import com.example.eticaret.domain.repository.ProductRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideFakeStoreApi(): FakeStoreApi {
        return Retrofit.Builder()
            .baseUrl("https://fakestoreapi.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(FakeStoreApi::class.java)
    }

    @Provides
    @Singleton
    fun provideProductRepository(api: FakeStoreApi): ProductRepository {
        return ProductRepositoryImpl(api)
    }
}
