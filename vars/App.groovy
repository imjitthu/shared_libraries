def call(string tfaction) {
    pipeline {
        agent {
            environment {
                action = "${params.tfaction}"
            }
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