def call(String ProjectName, String Tag){
withCredentials([usernamePassword(credentialsId: 'dockerHub', usernameVariable: 'dockerHubUser', passwordVariable: 'dockerHubpass' )]){
                  sh '''
                    docker login -u "$dockerHubUser" -p "$dockerHubpass"
                    docker push "$dockerHubUser/${ProjectName}:${Tag}"
                    '''
                }
}
