pipeline {
    agent any
    stages {
        stage('Polling Repositorio') {
            steps {
                git branch: 'main', credentialsId: '287604c8-6a74-443e-bed0-96acf3747a4e', url: 'https://github.com/Evocuer/CI-CD-QA'
            }
        }
    }

    post {
        success {
            echo 'Lectura y polling de repositorio exitosa'
        }
        failure {
            echo 'la lectura ha fallado'
        }
        always{
            echo 'Buen dia!'
        }
    }
}
