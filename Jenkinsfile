pipeline {

    agent any

    stages {
        stage('FW:Compile') {
            steps {
                sh(script: './gradlew clean')
                sh(script: './gradlew build')
            }
        }
    }
}