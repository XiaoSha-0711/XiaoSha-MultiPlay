package com.shilapi.xcertplay

import android.content.Context
import android.media.AudioManager

// A CarPlay or Bluetooth call leaves Android's audio mode on call or communication, not normal.
internal fun inCall(context: Context): Boolean =
    (context.getSystemService(Context.AUDIO_SERVICE) as? AudioManager)?.mode.let { it != null && it != AudioManager.MODE_NORMAL }
