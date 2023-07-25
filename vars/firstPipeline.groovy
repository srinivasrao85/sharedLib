import com.i27academy.builds.Calculator
def call(Map pipelineParams){
    library('com.i27academy.slb')
    Calculator cal = new Calculator(this)
    environment{
        APP_NAME = "${pipelineParams.appName}"
    }
    pipeline {
        agent any
        stages{
            stage('echo'){
                steps{
                    script{
                        echo "printig sum of 2 numbers"
                        println cal.add(3,4)
                        echo "Microservice name is ${APP_NAME}"
                    }
                }
            }
        }
    }  
}

