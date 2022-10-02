pipelineJob('configservice') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/hugojesusmr/microservicesjenkins.git'
                    }
                    branch 'master'
                    scriptPath('config-server/Jenkinsfile')
                }
            }
        }
    }
}  



