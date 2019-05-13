pipeline {

    agent any

    stages {
        stage('FW:Compile') {
            steps {
                echo 'Compiling....'
                bat(script: './gradlew clean')
                bat(script: './gradlew build')
            }
        }
    }
}