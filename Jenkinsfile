pipeline {

    agent any

    stages {
        stage('Test::Firefox') {
            steps {
                step{
                    echo 'Cleaning...'
                    bat(script: './gradlew clean')
                }
                step{
                    echo 'Testing...'
                    bat(script: './gradlew chrome')
                }
            }
        }/*
        stage('Test') {
            steps {
                bat(script: './gradlew chrome')
            }
        }*/
    }
}