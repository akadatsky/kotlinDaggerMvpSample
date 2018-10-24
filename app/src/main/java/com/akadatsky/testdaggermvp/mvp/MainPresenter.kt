package com.akadatsky.testdaggermvp.mvp

import javax.inject.Inject

class MainPresenter @Inject constructor() : MainContract.Presenter {

    private var mView: MainContract.View? = null

    private fun init() {
        mView?.showMessage()
    }

    override fun takeView(view: MainContract.View) {
        mView = view
        init()
    }

    override fun dropView() {
        mView = null
    }

}