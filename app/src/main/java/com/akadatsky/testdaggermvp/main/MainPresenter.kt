package com.akadatsky.testdaggermvp.main

import javax.inject.Inject

class MainPresenter @Inject constructor() : MainContract.Presenter {

    @Inject
    lateinit var mView: MainContract.View

    override fun init() {
        mView.showMessage()
    }

}