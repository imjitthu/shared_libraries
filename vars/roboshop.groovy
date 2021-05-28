def call(String action) {
  if (action == "apply") {

      class Example {
      static def DisplayName() {
      println("This is how methods work in groovy");
      println("This is an example of a simple method");
   } 
	
   static void main(String[] args) {
      DisplayName();
    } 
    }
  }
}
//     pipeline {
//       agent any

//       tools {
//         terraform 'terraform14'
//       }

//       environment {
//         AWS = credentials('AWS')
//       }

//       parameters {
//         choice(name: 'ENVIRONMENT', choices: ['', 'dev', 'prod'], description: 'Pick Environment')
//       }
//       stages {

//         stage('INIT') {
//           steps {
//             sh '''
//               export AWS_ACCESS_KEY_ID=${AWS_USR}
//               export AWS_SECRET_ACCESS_KEY=${AWS_PSW}
//               export TF_VAR_APP_ARTIFACT_VERSION="*"
//               make ${ENVIRONMENT}-init
//             '''
//           }
//         }
//         stage('APPLY') {
//           steps {
//             sh '''
//               export AWS_ACCESS_KEY_ID=${AWS_USR}
//               export AWS_SECRET_ACCESS_KEY=${AWS_PSW}
//               export TF_VAR_APP_ARTIFACT_VERSION="*"
//               make ${ENVIRONMENT}-apply
//             '''
//           }
//         }

//       }
//     }
//   } else{
//     echo "Heloo to Else"
//   }
// }