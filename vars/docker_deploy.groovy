def call(String containerName, String port, String projectName, String imageTag){
    echo "Deploying container ${containerName}..."
    sh "docker rm -f ${containerName} || true"
    sh "docker run -d -p ${port}:${port} --name ${containerName} ${projectName}:${imageTag}"
    echo "Deployment successful on port ${port}!"
}
