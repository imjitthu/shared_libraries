def call (String action) {

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
        // stage ('Installing Redis') {
        //   steps {
        //     if (action == "apply") {
        //     build job: 'RoboShop_WebApp/redis', parameters: [string(name: 'tfaction', value: "terraform apply -auto-approve")]
        //     }
        //     if (action == "init") {
        //     build job: 'RoboShop_WebApp/redis', parameters: [string(name: 'tfaction', value: "terraform init")]
        //     }
        //     if (action == "plan") {
        //     build job: 'RoboShop_WebApp/redis', parameters: [string(name: 'tfaction', value: "terraform plan")]
        //     }
        //     if (action == "destroy") {
        //     build job: 'RoboShop_WebApp/redis', parameters: [string(name: 'tfaction', value: "terraform destory -auto-approve")]
        //     }
        //   }
        //   }
        // stage ('Installing Mongo') {
        //   steps {
        //     if (action == "apply") {
        //     build job: 'RoboShop_WebApp/mongo', parameters: [string(name: 'tfaction', value: "terraform apply -auto-approve")]
        //     }
        //     if (action == "init") {
        //     build job: 'RoboShop_WebApp/mongo', parameters: [string(name: 'tfaction', value: "terraform init")]
        //     }
        //     if (action == "plan") {
        //     build job: 'RoboShop_WebApp/mongo', parameters: [string(name: 'tfaction', value: "terraform plan")]
        //     }
        //     if (action == "destroy") {
        //     build job: 'RoboShop_WebApp/mongo', parameters: [string(name: 'tfaction', value: "terraform destory -auto-approve")]
        //     }
        //   }
        // }
        // stage ('Installing RabbitMQ Server') {
        //   steps {
        //     if (action == "apply") {
        //     build job: 'RoboShop_WebApp/rabbitmq', parameters: [string(name: 'tfaction', value: "terraform apply -auto-approve")]
        //     }
        //     if (action == "init") {
        //     build job: 'RoboShop_WebApp/rabbitmq', parameters: [string(name: 'tfaction', value: "terraform init")]
        //     }
        //     if (action == "plan") {
        //     build job: 'RoboShop_WebApp/rabbitmq', parameters: [string(name: 'tfaction', value: "terraform plan")]
        //     }
        //     if (action == "destroy") {
        //     build job: 'RoboShop_WebApp/rabbitmq', parameters: [string(name: 'tfaction', value: "terraform destory -auto-approve")]
        //     }
        //   }
        // }
        }
        }
    }
    }
    }
