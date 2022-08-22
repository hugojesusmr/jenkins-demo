pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('employee-job-sonarqube') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/hugojesusmr/config-server.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}  



