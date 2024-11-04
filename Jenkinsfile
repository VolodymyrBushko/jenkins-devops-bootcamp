pipeline {
    agent any

    tools {
        maven '3.9.9'
    }

    stages {
        stage('Build') {
            steps {
                sh 'mvn -B clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn -B test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn -B package'
            }
        }
    }
}
