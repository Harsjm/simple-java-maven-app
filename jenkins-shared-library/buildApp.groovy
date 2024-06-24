def call() {
    stage('Build') {
        sh 'mvn clean install'
    }
}
