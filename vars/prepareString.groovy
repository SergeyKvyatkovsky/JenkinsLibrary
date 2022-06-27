def call(Map config = [:]){
    String i = ${config.name}
    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}"
    return i
}
