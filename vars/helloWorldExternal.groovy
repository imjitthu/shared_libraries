def call(Map config = [:]) {
    loadLinuxScript(name: 'hello-world.sh') //load file from resource library
    sh "sh hello-world.sh ${config.dayOfWeek} ${config.name}"
}
