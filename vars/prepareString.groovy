class Testi{
    def inputRandomString(){
        double rnd = Math.random()
        sh "echo Hello "
    }
}

Testi testi = new Testi()
testi.inputRandomString()


def call(Map config = [:]){
    String i = ${config.name}
    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}"
    return i
}


