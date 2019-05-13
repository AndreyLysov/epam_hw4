pipeline {

    agent any

    stages {
        stage('FW:Compile') {
            steps {
                bat(script: './gradlew clean')
                bat(script: './gradlew build')
            }
        }
        stage('Test') {
            echo 'Testing'
            steps {
                bat(script: './gradlew chrome')
            }
        }
    }
}