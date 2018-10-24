package com.akadatsky.testdaggermvp.mvp

import com.akadatsky.testdaggermvp.BasePresenter
import com.akadatsky.testdaggermvp.BaseView

interface MainContract {

    interface View : BaseView<Presenter> {
        fun showMessage()
    }

    interface Presenter : BasePresenter<View>

}