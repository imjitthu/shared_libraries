def call(String action) {
    pipeline {
        agent any
            stages {
                stage ('Share Library is working') {
                    if (action == "plan") {
                        sh "terraform init"
                        sh "terrafrom plan"
                        }
                    }
                }
            }
        }


// stage ('Terraform apply') {
//                     steps {
//                         if (action == "apply"){
//                         sh "terraform apply --auto-approve"
//                     }    
//                     }
//                     }
//                 stage ('Terraform init') {
//                     steps {
//                         if (action == "init"){
//                         sh "Terraform init"
//                     }
//                     }
//                     }
//                 stage ('Terraform destroy') {
//                     steps {
//                     if (action == "destroy"){
//                         sh "terraform destroy --auto-approve"
//                     }
//                     }
//                     }
//                 stage ('Terraform plan') {
//                     steps {
//                         if (action == "plan") {
//                         sh "terraform plan"
//                     }
//                     }
//                     }