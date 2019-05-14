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
                echo "test chrome"
                bat(script: "./gradlew chrome")            }
        }
    }
}