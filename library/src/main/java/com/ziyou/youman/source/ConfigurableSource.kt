package com.ziyou.youman.source

interface ConfigurableSource {

    fun setupPreferenceScreen(screen: android.support.v7.preference.PreferenceScreen)

    fun setupPreferenceScreen(screen: androidx.preference.PreferenceScreen)

}
