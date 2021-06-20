def call(String tfaction) {
    //define a String variable, s must be capital (S) in String.  
    pipeline {
        agent {
            // environment {
            //     action = "${params.env.tfaction}"
            // }
            stages {
                stage ('Terraform apply') {
                    when {expression {env.tfaction == 'apply'}}
                    steps {
                        sh "terraform apply --auto-approve"
                    }
                stage ('Terraform init') {
                    when {expression {env.tfaction == 'init'}}
                    steps {
                        sh "Terraform init"
                    }
                    }
                stage ('Terraform destroy') {
                    when {expression {env.tfaction == 'destroy'}}
                    steps {
                        sh "terraform destroy --auto-approve"
                    }
                    }
                stage ('Terraform plan') {
                    when {expression {env.tfaction == 'plan'}}
                    steps {
                        sh "terraform plan"
                    }
                    }
                }
            }
        }
    }
}