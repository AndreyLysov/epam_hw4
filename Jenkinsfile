pipeline {
    agent any
    stage('UI::Firefox') {
        steps {
            sh(script: './gradlew chrome --info', returnStatus: true)
        }
    }
}