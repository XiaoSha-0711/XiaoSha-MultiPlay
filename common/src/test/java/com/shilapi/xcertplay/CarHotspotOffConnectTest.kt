package com.shilapi.xcertplay

import android.content.Context
import org.robolectric.annotation.Implementation
import org.robolectric.annotation.Implements

/** Test double shared by the wireless-startup tests; the home-screen tests that used it belonged to the replaced home. */
class CarHotspotOffConnectTest {
    /** Whether the car hotspot is on, as Android's Wi-Fi state reports it. */
    @Implements(className = "com.shilapi.xcertplay.network.CarHotspotStatus", isInAndroidSdk = false)
    class HotspotState {
        @Implementation fun isEnabled(context: Context): Boolean? = on

        companion object {
            @Volatile var on: Boolean? = false
        }
    }
}
