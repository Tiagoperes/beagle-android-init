package com.example.beagleandroidinit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import br.com.zup.beagle.android.networking.RequestData
import br.com.zup.beagle.android.utils.newServerDrivenIntent
import br.com.zup.beagle.android.view.ServerDrivenActivity

val JSON = """{
    "_beagleComponent_": "beagle:text",
    "text": "Hello from Beagle"
}"""

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        startActivity(newServerDrivenIntent<ServerDrivenActivity>(RequestData("https://usebeagle.io/start/welcome")))
    }
}
