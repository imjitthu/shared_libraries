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
                    }
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
                    sh "sh inv.sh"
                    sh "cat inv"
                    git 'https://github.com/imjitthu/Ansible.git'
                    ansiblePlaybook credentialsId: 'DevOps321', installation: 'ansibletool', inventory: 'inv.txt', playbook: 'roboshop.yml'
                    }
                    }
                    }
                }
            } //stages
        // post { 
        //     always { 
        //         cleanWs()
        //     }
        // }    
    } //pipeline
}