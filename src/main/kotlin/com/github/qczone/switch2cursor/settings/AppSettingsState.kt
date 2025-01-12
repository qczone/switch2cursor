package com.github.qczone.switch2cursor.settings

import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.components.PersistentStateComponent
import com.intellij.openapi.components.State
import com.intellij.openapi.components.Storage
import com.intellij.util.xmlb.XmlSerializerUtil

@State(
    name = "com.github.qczone.switch2cursor.settings.AppSettingsState",
    storages = [Storage("Switch2CursorSettings.xml")]
)
class AppSettingsState : PersistentStateComponent<AppSettingsState> {
    var cursorPath: String = "cursor"

    override fun getState(): AppSettingsState = this

    override fun loadState(state: AppSettingsState) {
        XmlSerializerUtil.copyBean(state, this)
    }

    companion object {
        fun getInstance(): AppSettingsState = ApplicationManager.getApplication().getService(AppSettingsState::class.java)
    }
} 