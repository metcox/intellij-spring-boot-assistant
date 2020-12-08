package com.github.metcox.intellijspringbootassistant.services

import com.intellij.openapi.project.Project
import com.github.metcox.intellijspringbootassistant.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
