def call(Map config = [:]) {
    loadLinuxScript(name: 'hello-world.sh')
    sh ".\resources\com\planetpope\scripts\linux\hello-world.sh ${config.name} ${config.dayOfWeek}"
}
