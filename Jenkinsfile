pipeline {

    agent any

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                sh 'javac -d . src/LaundryService.java tests/LaundryServiceTest.java'
            }
        }

        stage('Test') {
            steps {
                sh 'java LaundryServiceTest'
            }
        }

        stage('Result') {
            steps {
                echo 'Smart Laundry Service CI Pipeline completed successfully.'
            }
        }
    }
}