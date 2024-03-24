def call() {
    sh 'trivy image pavanhgowda/youtube:latest > trivyimage.txt'
}