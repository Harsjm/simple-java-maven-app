def call(String helmChartPath, String releaseName, String namespace) {
    stage('Deploy to EKS') {
        sh "helm upgrade --install ${releaseName} ${helmChartPath} --namespace ${namespace} --set image.tag=${env.BUILD_NUMBER}"
    }
}
