def call(String action) {
//   if (action == "apply") {

        pipeline {
            agent any 
            environment {
                envvar = "${call.action}"
            }

        stages {
            stage ('Shared Library') {
                steps {
                echo "action is ${env.envvar}"
            }
            }
            }
        }
    // }
    // else {
    //     echo action is "${call.action}"
    // }
}