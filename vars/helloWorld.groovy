def call () {
    pipeline {
        agent any
        stages {
            stage ('Hellow World') {
                steps {
                    sh "echo Hello World!"                    
                }
            }
        }
    }
}