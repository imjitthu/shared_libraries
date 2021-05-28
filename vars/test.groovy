def call(String action) {
  if (action == "apply") {

        pipeline {
            agent any 
            environment {
                action = "abc" //"${call.action}"
            }

        stages {
            stage ('Shared Library') {
                steps {
                sh 'echo "action is "${env.action}"'
            }
            }
            }
        }
    }
    else {
        echo action is "${call.action}"
    }
}