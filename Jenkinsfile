pipeline {
    agent any

    tools {
        maven '3.9.9'
    }

    stages {
        stage('Prebuild') {
            steps {
                sh 'mvn clean'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn package'
            }
        }

        stage('Analysis') {
            steps {
                sh 'mvn spotbugs:check'
            }
        }
    }
}
