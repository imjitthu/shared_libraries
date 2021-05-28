def call (String action) {

pipeline {

  agent any

  environment {
      tfaction = "${action}"
  }

  stages {
    stage('Installing DataBases, Redis & RabbitMQ Server') {
      parallel {
        stage ('Installing Mysql') {
          steps {
            build job: 'RoboShop_WebApp/mysql', parameters: [string(name: 'tfaction', value: "${env.tfaction}")]
          }
        }
        stage ('Installing Redis') {
          steps {
            build job: 'RoboShop_WebApp/redis', parameters: [string(name: 'tfaction', value: "${env.tfaction}")]
          }
          }
        stage ('Installing Mongo') {
          steps {
            build job: 'RoboShop_WebApp/mongo', parameters: [string(name: 'tfaction', value: "${env.tfaction}")]
          }
        }
        stage ('Installing RabbitMQ Server') {
          steps {
            build job: 'RoboShop_WebApp/rabbitmq', parameters: [string(name: 'tfaction', value: "${env.tfaction}")]
          }
        }
      }
    }
  }
}
}
