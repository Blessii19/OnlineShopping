pipeline {
    agent any

    tools {
        maven 'Maven-3.9.16'
    }

    stages {

        stage('Build') {
            steps {
                bat 'mvn clean package -DskipTests'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Generate Report') {
            steps {
                junit 'target/surefire-reports/*.xml'
            }
        }

        stage('Deploy') {
            steps {
                bat 'if not exist deployment mkdir deployment'
                bat 'copy target\\OnlineShopping-1.0-SNAPSHOT.jar deployment\\'
            }
        }
    }
}