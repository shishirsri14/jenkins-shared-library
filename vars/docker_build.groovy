def call(String projectName, String imageTag){
    echo "Building Docker image ${projectName}:${imageTag}..."
    sh "docker build -t ${projectName}:${imageTag} ."
    echo "Docker image built successfully!"
}
