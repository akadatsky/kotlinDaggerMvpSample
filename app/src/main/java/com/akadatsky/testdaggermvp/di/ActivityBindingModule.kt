package com.akadatsky.testdaggermvp.di

import com.akadatsky.testdaggermvp.mvp.MainActivity
import com.akadatsky.testdaggermvp.mvp.MainModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ContributesAndroidInjector(modules = [MainModule::class])
    internal abstract fun mainActivity(): MainActivity

}
