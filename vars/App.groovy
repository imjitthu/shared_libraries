def call(String tfaction) {
    //define a String variable, s must be capital (S) in String.  
    pipeline {
        agent {
            stages {
                stage ('Terraform apply') {
                    steps {
                        sh "terraform apply --auto-approve"
                    }
                stage ('Terraform init') {
                    steps {
                        sh "Terraform init"
                    }
                    }
                stage ('Terraform destroy') {
                    steps {
                        sh "terraform destroy --auto-approve"
                    }
                    }
                stage ('Terraform plan') {
                    steps {
                        sh "terraform plan"
                    }
                    }
                }
            }
        }
    }
}