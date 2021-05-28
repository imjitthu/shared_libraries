def rs(String action) {

pipeline {

  agent any

  environment {
      apply   = "terraform apply -auto-approve"
      init    = "terraform init"
      plan    = "terraform plan"
      destroy = "terraform destroy -auto-approve"
  }

  stages {
    stage('Installing DataBases, Redis & RabbitMQ Server') {
      parallel {
        stage ('Installing Mysql') {
          steps {
            script {
            if (action == "apply") {
            build job: 'RoboShop_WebApp/mysql', parameters: [string(name: 'tfaction', value: "${env.apply}")]
            }
            if (action == "init") {
            build job: 'RoboShop_WebApp/mysql', parameters: [string(name: 'tfaction', value: "${env.init}")]
            }
            if (action == "plan") {
            build job: 'RoboShop_WebApp/mysql', parameters: [string(name: 'tfaction', value: "${env.plan}")]
            }
            if (action == "destroy") {
            build job: 'RoboShop_WebApp/mysql', parameters: [string(name: 'tfaction', value: "${env.destroy}")]
            }
            }
          }
        }
        stage ('Installing Redis') {
          steps {
            script {
            if (action == "apply") {
            build job: 'RoboShop_WebApp/redis', parameters: [string(name: 'tfaction', value: "${env.apply}")]
            }
            if (action == "init") {
            build job: 'RoboShop_WebApp/redis', parameters: [string(name: 'tfaction', value: "${env.init}")]
            }
            if (action == "plan") {
            build job: 'RoboShop_WebApp/redis', parameters: [string(name: 'tfaction', value: "${env.plan}")]
            }
            if (action == "destroy") {
            build job: 'RoboShop_WebApp/redis', parameters: [string(name: 'tfaction', value: "${env.destroy}")]
            }
            }
          }
          }
        stage ('Installing Mongo') {
          steps {
            script {
            if (action == "apply") {
            build job: 'RoboShop_WebApp/mongo', parameters: [string(name: 'tfaction', value: "${env.apply}")]
            }
            if (action == "init") {
            build job: 'RoboShop_WebApp/mongo', parameters: [string(name: 'tfaction', value: "${env.init}")]
            }
            if (action == "plan") {
            build job: 'RoboShop_WebApp/mongo', parameters: [string(name: 'tfaction', value: "${env.plan}")]
            }
            if (action == "destroy") {
            build job: 'RoboShop_WebApp/mongo', parameters: [string(name: 'tfaction', value: "${env.destroy}")]
            }
            }
          }
        }
        stage ('Installing RabbitMQ Server') {
          steps {
            script {
            if (action == "apply") {
            build job: 'RoboShop_WebApp/rabbitmq', parameters: [string(name: 'tfaction', value: "${env.apply}")]
            }
            if (action == "init") {
            build job: 'RoboShop_WebApp/rabbitmq', parameters: [string(name: 'tfaction', value: "${env.init}")]
            }
            if (action == "plan") {
            build job: 'RoboShop_WebApp/rabbitmq', parameters: [string(name: 'tfaction', value: "${env.plan}")]
            }
            if (action == "destroy") {
            build job: 'RoboShop_WebApp/rabbitmq', parameters: [string(name: 'tfaction', value: "${env.destroy}")]
            }
            }
          }
        }
        } //parallel
        } //stage
    stage ('Installing RoboShop Components') {
      parallel {
        stage ('Installing Catalogue') {
          steps {
            script {
            if (action == "apply") {
            build job: 'RoboShop_WebApp/catalogue', parameters: [string(name: 'tfaction', value: "${env.apply}")]
            }
            if (action == "init") {
            build job: 'RoboShop_WebApp/catalogue', parameters: [string(name: 'tfaction', value: "${env.init}")]
            }
            if (action == "plan") {
            build job: 'RoboShop_WebApp/catalogue', parameters: [string(name: 'tfaction', value: "${env.plan}")]
            }
            if (action == "destroy") {
            build job: 'RoboShop_WebApp/catalogue', parameters: [string(name: 'tfaction', value: "${env.destroy}")]
            }
            }
          }
        }
        stage ('Installing Cart') {
          steps {
            script {
            if (action == "apply") {
            build job: 'RoboShop_WebApp/cart', parameters: [string(name: 'tfaction', value: "${env.apply}")]
            }
            if (action == "init") {
            build job: 'RoboShop_WebApp/cart', parameters: [string(name: 'tfaction', value: "${env.init}")]
            }
            if (action == "plan") {
            build job: 'RoboShop_WebApp/cart', parameters: [string(name: 'tfaction', value: "${env.plan}")]
            }
            if (action == "destroy") {
            build job: 'RoboShop_WebApp/cart', parameters: [string(name: 'tfaction', value: "${env.destroy}")]
            }
            }
          }
        }
        stage ('Installing user') {
          steps {
            script {
            if (action == "apply") {
            build job: 'RoboShop_WebApp/user', parameters: [string(name: 'tfaction', value: "${env.apply}")]
            }
            if (action == "init") {
            build job: 'RoboShop_WebApp/user', parameters: [string(name: 'tfaction', value: "${env.init}")]
            }
            if (action == "plan") {
            build job: 'RoboShop_WebApp/user', parameters: [string(name: 'tfaction', value: "${env.plan}")]
            }
            if (action == "destroy") {
            build job: 'RoboShop_WebApp/user', parameters: [string(name: 'tfaction', value: "${env.destroy}")]
            }
            }
          }
        }
        stage ('Installing Payment') {
          steps {
            script {
            if (action == "apply") {
            build job: 'RoboShop_WebApp/payment', parameters: [string(name: 'tfaction', value: "${env.apply}")]
            }
            if (action == "init") {
            build job: 'RoboShop_WebApp/payment', parameters: [string(name: 'tfaction', value: "${env.init}")]
            }
            if (action == "plan") {
            build job: 'RoboShop_WebApp/payment', parameters: [string(name: 'tfaction', value: "${env.plan}")]
            }
            if (action == "destroy") {
            build job: 'RoboShop_WebApp/payment', parameters: [string(name: 'tfaction', value: "${env.destroy}")]
            }
            }
          }
        }
        stage ('Installing Shipping') {
          steps {
            script {
            if (action == "apply") {
            build job: 'RoboShop_WebApp/shipping', parameters: [string(name: 'tfaction', value: "${env.apply}")]
            }
            if (action == "init") {
            build job: 'RoboShop_WebApp/shipping', parameters: [string(name: 'tfaction', value: "${env.init}")]
            }
            if (action == "plan") {
            build job: 'RoboShop_WebApp/shipping', parameters: [string(name: 'tfaction', value: "${env.plan}")]
            }
            if (action == "destroy") {
            build job: 'RoboShop_WebApp/shipping', parameters: [string(name: 'tfaction', value: "${env.destroy}")]
            }
            }
            }
            }
            } //parallel
            } //stage
    stage ('Installing Frontend') {
        steps {
            script {
            if (action == "apply") {
            build job: 'RoboShop_WebApp/frontend', parameters: [string(name: 'tfaction', value: "${env.apply}")]
            }
            if (action == "init") {
            build job: 'RoboShop_WebApp/frontend', parameters: [string(name: 'tfaction', value: "${env.init}")]
            }
            if (action == "plan") {
            build job: 'RoboShop_WebApp/frontend', parameters: [string(name: 'tfaction', value: "${env.plan}")]
            }
            if (action == "destroy") {
            build job: 'RoboShop_WebApp/frontend', parameters: [string(name: 'tfaction', value: "${env.destroy}")]
            }
            }
          }
        }
    }
    }
    }
