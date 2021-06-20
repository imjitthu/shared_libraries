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
            stage ('Installing Roboshop WebApp') {
                steps{
                script {
                    if (action == "apply") {
                    sh "mkinv.sh"
                    git 'https://github.com/imjitthu/Ansible.git'
                    ansiblePlaybook credentialsId: 'DevOps321', installation: 'ansibletool', inventory: 'inv.txt', playbook: 'roboshop.yml'
                    }
                    }
                    }
                }
                }
            post { 
                always { 
                    cleanWs()
                }
            }
        }
    }