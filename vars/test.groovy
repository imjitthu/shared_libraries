def call(String action) {
  if (action == "apply") {

        pipeline {
            agent any 
            environment {
                action = "${string.action}"
            }

        stages {
            stage {
                steps {
                sh 'echo "action is "${env.action}"'
            }
            }
            }
        }
    }
}