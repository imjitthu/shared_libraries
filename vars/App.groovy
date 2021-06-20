def call(String tfaction) {
    //define a String variable, s must be capital (S) in String.  
    pipeline {
        agent {
            stages {
                stage ('Terraform apply') {
                    when {expression { "${tfaction}" == 'apply'}}
                    steps {
                        sh "terraform apply --auto-approve"
                    }
                stage ('Terraform init') {
                    when {expression {"${tfaction}" == 'init'}}
                    steps {
                        sh "Terraform init"
                    }
                    }
                stage ('Terraform destroy') {
                    when {expression {"${tfaction}" == 'destroy'}}
                    steps {
                        sh "terraform destroy --auto-approve"
                    }
                    }
                stage ('Terraform plan') {
                    when {expression {"${tfaction}" == 'plan'}}
                    steps {
                        sh "terraform plan"
                    }
                    }
                }
            }
        }
    }
}