pipeline {
    agent any

    stages {
        stage ('Compile Stage') {
            steps {
                 withMaven(maven: 'Maven') {
                    sh 'mvn clean compile'
                }
            }

        }
        stage ('Building Stage') {
                    steps {
                         withMaven(maven: 'Maven') {
                            sh 'mvn clean install'
                        }
                    }

                }
    }
}