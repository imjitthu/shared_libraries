def call(String action) {

pipeline {

  agent any

  stages {
    stage('Installing DataBases, Redis & RabbitMQ Server') {
      parallel {
        stage ('Installing Mysql') {
          steps {
            script {
            if (action == "apply") {
            build job: 'RoboShop_WebApp/mysql', parameters: [string(name: 'tfaction', value: "terraform apply -auto-approve")]
            }
            if (action == "init") {
            build job: 'RoboShop_WebApp/mysql', parameters: [string(name: 'tfaction', value: "terraform init")]
            }
            if (action == "plan") {
            build job: 'RoboShop_WebApp/mysql', parameters: [string(name: 'tfaction', value: "terraform plan")]
            }
            if (action == "destroy") {
            build job: 'RoboShop_WebApp/mysql', parameters: [string(name: 'tfaction', value: "terraform destory -auto-approve")]
            }
            }
          }
        }
        stage ('Installing Redis') {
          steps {
            script {
            if (action == "apply") {
            build job: 'RoboShop_WebApp/redis', parameters: [string(name: 'tfaction', value: "terraform apply -auto-approve")]
            }
            if (action == "init") {
            build job: 'RoboShop_WebApp/redis', parameters: [string(name: 'tfaction', value: "terraform init")]
            }
            if (action == "plan") {
            build job: 'RoboShop_WebApp/redis', parameters: [string(name: 'tfaction', value: "terraform plan")]
            }
            if (action == "destroy") {
            build job: 'RoboShop_WebApp/redis', parameters: [string(name: 'tfaction', value: "terraform destory -auto-approve")]
            }
            }
          }
          }
        stage ('Installing Mongo') {
          steps {
            script {
            if (action == "apply") {
            build job: 'RoboShop_WebApp/mongo', parameters: [string(name: 'tfaction', value: "terraform apply -auto-approve")]
            }
            if (action == "init") {
            build job: 'RoboShop_WebApp/mongo', parameters: [string(name: 'tfaction', value: "terraform init")]
            }
            if (action == "plan") {
            build job: 'RoboShop_WebApp/mongo', parameters: [string(name: 'tfaction', value: "terraform plan")]
            }
            if (action == "destroy") {
            build job: 'RoboShop_WebApp/mongo', parameters: [string(name: 'tfaction', value: "terraform destory -auto-approve")]
            }
            }
          }
        }
        stage ('Installing RabbitMQ Server') {
          steps {
            script {
            if (action == "apply") {
            build job: 'RoboShop_WebApp/rabbitmq', parameters: [string(name: 'tfaction', value: "terraform apply -auto-approve")]
            }
            if (action == "init") {
            build job: 'RoboShop_WebApp/rabbitmq', parameters: [string(name: 'tfaction', value: "terraform init")]
            }
            if (action == "plan") {
            build job: 'RoboShop_WebApp/rabbitmq', parameters: [string(name: 'tfaction', value: "terraform plan")]
            }
            if (action == "destroy") {
            build job: 'RoboShop_WebApp/rabbitmq', parameters: [string(name: 'tfaction', value: "terraform destory -auto-approve")]
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
            build job: 'RoboShop_WebApp/catalogue', parameters: [string(name: 'tfaction', value: "terraform apply -auto-approve")]
            }
            if (action == "init") {
            build job: 'RoboShop_WebApp/catalogue', parameters: [string(name: 'tfaction', value: "terraform init")]
            }
            if (action == "plan") {
            build job: 'RoboShop_WebApp/catalogue', parameters: [string(name: 'tfaction', value: "terraform plan")]
            }
            if (action == "destroy") {
            build job: 'RoboShop_WebApp/catalogue', parameters: [string(name: 'tfaction', value: "terraform destory -auto-approve")]
            }
            }
          }
        }
        stage ('Installing Cart') {
          steps {
            script {
            if (action == "apply") {
            build job: 'RoboShop_WebApp/cart', parameters: [string(name: 'tfaction', value: "terraform apply -auto-approve")]
            }
            if (action == "init") {
            build job: 'RoboShop_WebApp/cart', parameters: [string(name: 'tfaction', value: "terraform init")]
            }
            if (action == "plan") {
            build job: 'RoboShop_WebApp/cart', parameters: [string(name: 'tfaction', value: "terraform plan")]
            }
            if (action == "destroy") {
            build job: 'RoboShop_WebApp/cart', parameters: [string(name: 'tfaction', value: "terraform destory -auto-approve")]
            }
            }
          }
        }
        stage ('Installing user') {
          steps {
            script {
            if (action == "apply") {
            build job: 'RoboShop_WebApp/user', parameters: [string(name: 'tfaction', value: "terraform apply -auto-approve")]
            }
            if (action == "init") {
            build job: 'RoboShop_WebApp/user', parameters: [string(name: 'tfaction', value: "terraform init")]
            }
            if (action == "plan") {
            build job: 'RoboShop_WebApp/user', parameters: [string(name: 'tfaction', value: "terraform plan")]
            }
            if (action == "destroy") {
            build job: 'RoboShop_WebApp/user', parameters: [string(name: 'tfaction', value: "terraform destory -auto-approve")]
            }
            }
          }
        }
        stage ('Installing Payment') {
          steps {
            script {
            if (action == "apply") {
            build job: 'RoboShop_WebApp/payment', parameters: [string(name: 'tfaction', value: "terraform apply -auto-approve")]
            }
            if (action == "init") {
            build job: 'RoboShop_WebApp/payment', parameters: [string(name: 'tfaction', value: "terraform init")]
            }
            if (action == "plan") {
            build job: 'RoboShop_WebApp/payment', parameters: [string(name: 'tfaction', value: "terraform plan")]
            }
            if (action == "destroy") {
            build job: 'RoboShop_WebApp/payment', parameters: [string(name: 'tfaction', value: "terraform destory -auto-approve")]
            }
            }
          }
        }
        stage ('Installing Shipping') {
          steps {
            script {
            if (action == "apply") {
            build job: 'RoboShop_WebApp/shipping', parameters: [string(name: 'tfaction', value: "terraform apply -auto-approve")]
            }
            if (action == "init") {
            build job: 'RoboShop_WebApp/shipping', parameters: [string(name: 'tfaction', value: "terraform init")]
            }
            if (action == "plan") {
            build job: 'RoboShop_WebApp/shipping', parameters: [string(name: 'tfaction', value: "terraform plan")]
            }
            if (action == "destroy") {
            build job: 'RoboShop_WebApp/shipping', parameters: [string(name: 'tfaction', value: "terraform destory -auto-approve")]
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
            build job: 'RoboShop_WebApp/frontend', parameters: [string(name: 'tfaction', value: "terraform apply -auto-approve")]
            }
            if (action == "init") {
            build job: 'RoboShop_WebApp/frontend', parameters: [string(name: 'tfaction', value: "terraform init")]
            }
            if (action == "plan") {
            build job: 'RoboShop_WebApp/frontend', parameters: [string(name: 'tfaction', value: "terraform plan")]
            }
            if (action == "destroy") {
            build job: 'RoboShop_WebApp/frontend', parameters: [string(name: 'tfaction', value: "terraform destory -auto-approve")]
            }
            }
          }
        }
    }
    }
    }
