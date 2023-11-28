pipeline{

agent any
 triggers {
    githubPush()
  }

  stages{

    stage('clean the code')
    {
     steps{
              sh 'mvn clean'
          }
     }
    stage('Unit testing 5')
    {
     steps{
          sh 'mvn test'
          }
     }


     }
}
