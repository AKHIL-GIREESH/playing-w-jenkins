node {
    stage('Checkout Code') {
        checkout scm
    }
    
    stage('Installing Dependencies') {
        sh 'npm install'
    }

    stage('Build') {
        sh 'nohup node app.js > app.log 2>&1 &'
        sh 'sleep 10'
    }
}