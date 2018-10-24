package com.akadatsky.testdaggermvp.main

import dagger.Binds
import dagger.Module

@Module
abstract class MainModule {

    @Binds
    abstract fun bindPresenter(presenter: MainPresenter): MainContract.Presenter

    @Binds
    abstract fun bindView(view: MainActivity): MainContract.View

}