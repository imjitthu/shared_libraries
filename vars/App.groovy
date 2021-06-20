def call(string tfaction) {
    pipeline {
        agent {
            environment {
                action = "${params.tfaction}"
            }
            stages {
                stage ('Terraform apply') {
                    when {expression {env.action == 'apply'}}
                    steps {
                        sh "terraform apply --auto-approve"
                    }
                stage ('Terraform init') {
                    when {expression {env.action == 'init'}}
                    steps {
                        sh "Terraform init"
                    }
                    }
                stage ('Terraform destroy') {
                    when {expression {env.action == 'destroy'}}
                    steps {
                        sh "terraform destroy --auto-approve"
                    }
                    }
                stage ('Terraform plan') {
                    when {expression {env.action == 'plan'}}
                    steps {
                        sh "terraform plan"
                    }
                    }
                }
            }
        }
    }
}