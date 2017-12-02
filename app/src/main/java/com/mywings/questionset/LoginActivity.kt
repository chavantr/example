package com.mywings.questionset

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        MobileAds.initialize(applicationContext, APP_ID)
        val adRequest = AdRequest.Builder().build()
        adView!!.loadAd(adRequest)
    }

    companion object {
        const val APP_ID = "ca-app-pub-2738415697577555~3743517785"

    }

}
