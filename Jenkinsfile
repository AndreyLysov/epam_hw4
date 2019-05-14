pipeline {

    agent any

    stages {
        stage('Clean') {
            steps {
                echo 'Cleaning...'
                bat(script: './gradlew clean')
            }
        }
        stage('Test') {
            steps {
                echo 'Testing'
                bat(script: './gradlew chrome')
            }
        }
    }
}