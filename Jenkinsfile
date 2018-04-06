#!groovy

/* Only keep the 10 most recent builds. */
properties([[$class: 'BuildDiscarderProperty',
                strategy: [$class: 'LogRotator', numToKeepStr: '10']]])

stage ('Build') {

  node {
    // Checkout
    checkout scm
	sh "/var/jenkins_home/tools/hudson.tasks.Maven_MavenInstallation/Maven_Install/bin/mvn clean verify"

   
    // publish html
   publishHTML([allowMissing: false, 
   alwaysLinkToLastBuild: false, 
   keepAll: false, 
   reportDir: 'target/site/serenity', 
   reportFiles: 'index.html', 
   reportName: 'HTML Report', 
   reportTitles: ''])


  }
}