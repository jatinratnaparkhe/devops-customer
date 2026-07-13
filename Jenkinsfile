pipeline {
    agent any

    options {
        timestamps()
    }

    tools {
        jdk 'jdk21'
        maven 'Maven3'
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package -DskipTests'
            }
        }

        stage('Archive Artifact') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }

    post {
        success {
            echo "Build #${env.BUILD_NUMBER} completed successfully."
        }

        failure {
            echo 'Pipeline failed.'
        }

        always {
            junit '**/target/surefire-reports/*.xml'
        }
    }
}