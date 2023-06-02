node('linux')
{
  stage('Build') {
    build job: 'Port-Pipeline', parameters: [string(name: 'PORT_GITHUB_REPO', value: 'https://github.com/ZOSOpenTools/byaccport.git'), string(name: 'PORT_DESCRIPTION', value: 'Berkeley Yacc (byacc) is generally conceded to be the best yacc variant available' )]
  }
}
