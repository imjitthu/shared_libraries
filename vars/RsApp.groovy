def call(String action) {
    //define a String variable, s must be capital (S) in String.  

    pipeline {

        agent any

            stages ('Robosho App with Terrafor & Ansible') {
                stage ('Terraform apply') {
                    steps {
                        if (action == 'apply'){
                        sh "terraform apply --auto-approve"
                    }    
                    }
                    }
                stage ('Terraform init') {
                    steps {
                        if (action == 'init'){
                        sh "Terraform init"
                    }
                    }
                    }
                stage ('Terraform destroy') {
                    steps {
                    if (action == 'destroy'){
                        sh "terraform destroy --auto-approve"
                    }
                    }
                    }
                stage ('Terraform plan') {
                    steps {
                        if (tfaction == 'plan') {
                        sh "terraform plan"
                    }
                    }
                    }
                }
            }
        }