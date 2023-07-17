import com.i27academy.builds.Calculator
pipeline{
    agent any
    stages{
        stage('echo'){
            steps{
                script{
                    echo "printig sum of 2 numbers"
                    println Calculator.add(3,4)
                }
            }
        }
    }
}