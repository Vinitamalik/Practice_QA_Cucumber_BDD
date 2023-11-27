pipeline{

agent any

  stages{

    stage('clean the code')
    {
     steps{
              sh 'mvn clean'
          }
     }
    stage('Unit testing 2')
    {
     steps{
          sh 'mvn test'
          }
     }
     }
}