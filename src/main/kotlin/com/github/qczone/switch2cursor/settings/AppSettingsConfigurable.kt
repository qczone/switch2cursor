package com.github.qczone.switch2cursor.settings

import com.intellij.openapi.options.Configurable
import javax.swing.JComponent
import javax.swing.JPanel
import javax.swing.JTextField
import com.intellij.ui.components.JBLabel
import com.intellij.util.ui.FormBuilder

class AppSettingsConfigurable : Configurable {
    private var mySettingsComponent: AppSettingsComponent? = null

    override fun getDisplayName(): String = "Open In Cursor"

    override fun createComponent(): JComponent {
        mySettingsComponent = AppSettingsComponent()
        return mySettingsComponent!!.panel
    }

    override fun isModified(): Boolean {
        val settings = AppSettingsState.getInstance()
        return mySettingsComponent!!.cursorPath != settings.cursorPath
    }

    override fun apply() {
        val settings = AppSettingsState.getInstance()
        settings.cursorPath = mySettingsComponent!!.cursorPath
    }

    override fun reset() {
        val settings = AppSettingsState.getInstance()
        mySettingsComponent!!.cursorPath = settings.cursorPath
    }

    override fun disposeUIResources() {
        mySettingsComponent = null
    }
}

class AppSettingsComponent {
    val panel: JPanel
    private val cursorPathText = JTextField()

    init {
        panel = FormBuilder.createFormBuilder()
            .addLabeledComponent(JBLabel("Cursor Path: "), cursorPathText, 1, false)
            .addComponentFillVertically(JPanel(), 0)
            .panel
    }

    var cursorPath: String
        get() = cursorPathText.text
        set(value) {
            cursorPathText.text = value
        }
} 