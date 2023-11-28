pipeline{

agent any

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

     node
     stage("checkout"){
     git branch: 'master', CredentialsId: '48a4631aa79049a08c89f14fc5fcf2bc', url: 'https://github.com/Vinitamalik/Practice_QA_Cucumber_BDD.git'
     }
     }
}
