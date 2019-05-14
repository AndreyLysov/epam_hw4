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
                browsers()
            }
        }
    }
}

void browsers(){
    def browsers = {"chrome"; "firefox"}
    browsers.each{
        echo "test $it"
        bat(script: "./gradlew $it")
    }
}