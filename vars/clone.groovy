def call(String url, String branch){
    echo "Cloning code from ${url} on branch ${branch}..."
    git url: "${url}", branch: "${branch}"
    echo "Code cloning successful!"
}
