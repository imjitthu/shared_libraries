def call(String action) {
//   if (action == "apply") {

        pipeline {
            agent any 
            environment {
                action = "abc"
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