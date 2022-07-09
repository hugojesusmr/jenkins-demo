pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('employee-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/hugojesusmr/employee.git'
                    }
                    branch 'main'
                }
            }
        }
    }
}  
pipelineJob('employee-job-dockerTwo') {
        definition {
            cpsScm {
                scm {
                    git {
                        remote {
                            url 'https://github.com/hugojesusmr/employee.git'
                        }
                        branch 'master'
                        scriptPath('Jenkinsfile-docker')
                }
            }
        }
    }  
}
