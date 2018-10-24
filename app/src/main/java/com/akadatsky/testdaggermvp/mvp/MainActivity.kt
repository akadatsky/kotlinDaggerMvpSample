package com.akadatsky.testdaggermvp.mvp

import android.os.Bundle
import com.akadatsky.testdaggermvp.R
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity(), MainContract.View {

    @Inject
    lateinit var mPresenter: MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        mPresenter.takeView(this)
    }

    override fun onDestroy() {
        mPresenter.dropView()
        super.onDestroy()
    }

    override fun showMessage() {
        textView.text = "ASDF"
    }

}
