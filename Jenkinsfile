pipeline {
    agent {
//        your Jenkins slave node name
        label 'selenium'
    }
    stages {
        stage('FW:Compile') {
            steps {
                sh(script: './gradlew clean')
                sh(script: './gradlew build')
            }
        }
    }
}