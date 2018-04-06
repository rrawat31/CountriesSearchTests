#!groovy

/* Only keep the 10 most recent builds. */
properties([[$class: 'BuildDiscarderProperty',
                strategy: [$class: 'LogRotator', numToKeepStr: '10']]])

stage ('Build') {

  node {
    // Checkout
    checkout scm

   
    // publish html
    publishHTML ([
        allowMissing: false,
        alwaysLinkToLastBuild: false,
        keepAll: true,
        reportDir: '$Workspace/target/site/serenity',
        reportFiles: 'index.html',
        reportName: "RCov Report"
      ])

  }
}