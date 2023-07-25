import com.i27academy.builds.Calculator

def call(Map pipelineParams){
    library('com.i27academy.slb')
    Calculator cal = new Calculator(this)
    pipeline {
        agent any
        environment {
        APP_NAME = "${pipelineParams.appName}"
        }
        stages{
            stage('echo'){
                steps{
                    script{
                        echo "printing sum of 2 numbers"
                        println cal.add(3,4)
                        println cal.multiply(3,4)
                        echo "Microservice name is ${params.APP_NAME}"
                    }
                }
            }
        }
    }  
}
