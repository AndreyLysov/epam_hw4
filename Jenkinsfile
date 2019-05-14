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
    List<String> browsers = {"chrome"; "firefox"}
    browsers.stream(){s ->
        echo "test $s"
        bat(script: "./gradlew $s")
    }
}