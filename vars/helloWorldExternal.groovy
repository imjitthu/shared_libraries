def call(Map config = [:]) {
    loadLinuxScript(name: 'hello-world.sh') //load file from resource library
    sh "./hello-world.sh ${config.name} ${config.dayOfWeek}"
}
