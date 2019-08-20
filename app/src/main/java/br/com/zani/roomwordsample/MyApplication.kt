package br.com.zani.roomwordsample

import android.app.Application
import br.com.zani.roomwordsample.di.dbModule
import br.com.zani.roomwordsample.di.repositoryModule
import br.com.zani.roomwordsample.di.uiModule
import br.com.zani.roomwordsample.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin


class MyApplication : Application() {
    override fun onCreate(){
        super.onCreate()
        // start Koin!
        startKoin {
            // declare used Android context
            androidContext(this@MyApplication)
            // declare modules
            modules(
                listOf(
                    viewModelModule,
                    uiModule,
                    dbModule,
                    repositoryModule
                )
            )
        }
    }
}