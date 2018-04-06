#!groovy

/* Only keep the 10 most recent builds. */
properties([[$class: 'BuildDiscarderProperty',
                strategy: [$class: 'LogRotator', numToKeepStr: '10']]])

stage ('Build') {

  node {
    // Checkout
    checkout scm
    withEnv( ["PATH+MAVEN=${tool Maven_Install}/bin"] ) {
    	sh "mvn clean verify"
	}

   
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