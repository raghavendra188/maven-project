pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
               sh 'mvn clean package'
            }
            post{
            success{
            	echo 'Now Artifacting'
            	archiveArtifacts artifacts '**/target/*.war'
            }
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}