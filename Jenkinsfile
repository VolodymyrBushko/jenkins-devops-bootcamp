pipeline {
    agent any

    tools {
        maven '3.9.9'
    }

    stages {
        stage('Build') {
            steps {
            sh 'mvn --version'
            sh 'java --version'
            // sh 'mvn -B -DskipTests clean package'
            }
        }
    }
}