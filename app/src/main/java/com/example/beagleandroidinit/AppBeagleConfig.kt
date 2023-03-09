package com.example.beagleandroidinit

import br.com.zup.beagle.android.annotation.BeagleComponent
import br.com.zup.beagle.android.setup.BeagleConfig
import br.com.zup.beagle.android.setup.Environment
import br.com.zup.beagle.scaffold.BeagleConfigScaffold

@BeagleComponent
class AppBeagleConfig: BeagleConfigScaffold(
    baseUrl = "https://usebeagle.io/start",
    environment = Environment.DEBUG,
)
