package novoda.ping.android

import android.app.Activity
import android.os.Bundle

class HelloKotlin(): Activity() {

    protected override fun onCreate(savedInstanceState: Bundle?) {
        super<Activity>.onCreate(savedInstanceState)
        setContentView(R.layout.main)
    }
}

