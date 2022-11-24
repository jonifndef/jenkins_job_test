pipeline {
    agent any
    stages {
         stage('Setup parameters') {
                    steps {
                        script { 
                            properties([
                                parameters([
                                    choice(
                                        choices: ['Release', 'Debug'], 
                                        name: 'build_type',
                                        description: 'Choose build type in cmake'
                                    ),
                                ])
                            ])
                        }
                    }
                }

        stage("build") {
            steps {
                sh 'mkdir build; \
                cd build; \
                cmake -DCMAKE_BUILD_TYPE=${params.build_type} ..; \
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
