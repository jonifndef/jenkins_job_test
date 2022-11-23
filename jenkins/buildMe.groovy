pipeline {
    agent any
    stages {
        stage("build") {
            steps {
                sh 'mkdir build; \
                cd build; \
                cmake ..; \
                make;'
            }
        }
    }
    post {
        always {
            echo "What is love?"
        }
        success {
            archiveArtifacts artifacts: 'build/jenkins_job_test', fingerprint: true
        }
        failure {
            echo "Send me an email, plez"
        }
    }
}
