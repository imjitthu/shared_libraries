def call(String action) {
    pipeline {
        agent any
            stages {
                stage ('Share Library is working') {
                    steps {
                    script {
                    if (action == "plan") {
                    sh "terraform init"
                    sh "terraform plan"
                    }
                    }  
                    }
                }
            }
        }
    }