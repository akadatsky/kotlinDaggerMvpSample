package com.akadatsky.testdaggermvp.mvp

import dagger.Binds
import dagger.Module

@Module
abstract class MainModule {

    @Binds
    internal abstract fun mainPresenter(presenter: MainPresenter): MainContract.Presenter

}