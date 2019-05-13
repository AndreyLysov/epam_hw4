pipeline {

    agent any

    stages {
        stage('FW:Compile') {
            steps {
                bat(script: './gradlew clean')
                bat(script: './gradlew compileJava')
            }
        }
        stage('Test') {
            steps {
                bat(script: './gradlew chrome')
            }
        }
    }
}