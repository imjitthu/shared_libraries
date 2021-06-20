def call(string action) {
    pipeline {
        agent {
            environment {
                action =
            }
            stage {
                stages ('Terraform apply') {
                    steps {
                        
                    }
                }
            }
        }
    }
}