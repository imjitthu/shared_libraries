def call(String action) {
    pipeline {
        agent any
            stages {
                stage ('Creting Infra for Roboshop WebApp') {
                    steps {
                    script {
                    if (action == "plan") {
                    sh "terraform init"
                    sh "terraform plan"
                    }
                    if (action == "init") {
                    sh "terraform init"
                    }
                    if (action == "apply") {
                    sh "terraform init"
                    sh "terraform apply --auto-approve"
                    if (action == "destroy") {
                    sh "terraform init"
                    sh "terraform destroy --auto-approve"
                    }
                    if (action == "validate") {
                    sh "terraform init"
                    sh "terraform validate"
                    }
                    }  
                    }
                    }
                    }
            } //stages
        post { 
            always { 
                cleanWs()
            }
        }    
    } //pipeline
}