def call(String action) {
    pipeline {
        agent any
            stages {
                stage ('Share Library is working') {
                    script {
                    if (action == "plan") {
                    sh "terraform init"
                    sh "terrafrom plan"
                    }
                    }  
                    }
                }
            }
        }