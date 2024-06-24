def call(String ecrRepoUrl) {
    stage('Docker Build & Push') {
        def imageName = "${ecrRepoUrl}:${env.BUILD_NUMBER}"
        sh "docker build -t ${imageName} ."
        sh "docker push ${imageName}"
    }
}
