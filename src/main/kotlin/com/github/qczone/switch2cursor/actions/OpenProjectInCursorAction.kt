package com.github.qczone.switch2cursor.actions

import com.github.qczone.switch2cursor.settings.AppSettingsState
import com.github.qczone.switch2cursor.utils.WindowUtils
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.project.Project
import com.intellij.openapi.actionSystem.ActionUpdateThread

class OpenProjectInCursorAction : AnAction() {
    private val logger = Logger.getInstance(OpenProjectInCursorAction::class.java)

    override fun getActionUpdateThread(): ActionUpdateThread {
        return ActionUpdateThread.BGT
    }

    override fun actionPerformed(e: AnActionEvent) {
        val project: Project = e.project ?: return
        val projectPath = project.basePath ?: return

        val settings = AppSettingsState.getInstance()
        val cursorPath = settings.cursorPath

        val command = when {
            System.getProperty("os.name").lowercase().contains("mac") -> {
                arrayOf("open", "-a", "$cursorPath", projectPath)
            }

            System.getProperty("os.name").lowercase().contains("windows") -> {
                arrayOf("cmd", "/c", "$cursorPath", projectPath)
            }

            else -> {
                arrayOf(cursorPath, projectPath)
            }
        }
        try {
            logger.info("Executing command: ${command.joinToString(" ")}")
            ProcessBuilder(*command).start()
        } catch (ex: Exception) {
            logger.error("Failed to execute cursor command: ${ex.message}", ex)
            com.intellij.openapi.ui.Messages.showErrorDialog(
                project,
                """
                ${ex.message}
                
                Please check:
                1. Cursor path is correctly configured in Settings > Tools > Switch2Cursor
                2. Cursor is properly installed on your system
                3. The configured path points to a valid Cursor executable
                """.trimIndent(),
                "Error"
            )
        }

        WindowUtils.activeWindow()
    }

    override fun update(e: AnActionEvent) {
        val project = e.project
        e.presentation.isEnabledAndVisible = project != null
    }
} 