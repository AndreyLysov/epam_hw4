pipeline {
    agent any
    stages {
        stage('UI::Firefox') {
            steps {
                sh(script: './gradlew chrome --info', returnStatus: true)
            }
        }
    }
}