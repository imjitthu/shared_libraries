def call(string action) {
//   if (action == "apply") {

        pipeline {
            agent any 
            environment {
                action = "${var.action}"
            }

        stages {
            stage ('Shared Library') {
                steps {
                echo "action is ${env.action}"
            }
            }
            }
        }
    // }
    // else {
    //     echo action is "${call.action}"
    // }
}