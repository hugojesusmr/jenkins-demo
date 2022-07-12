FROM jenkins/jenkins:lts
FROM python:latest as py

RUN curl -sSL https://get.docker.com/ | sh
RUN usermod -a -G docker jenkins
USER jenkins
COPY --from=py /usr/local/lib /usr/local/lib
COPY --from=py /usr/local/bin /usr/local/bin
COPY --from=py /usr/local/include /usr/local/include
COPY --from=py /usr/local/man /usr/local/man
COPY --from=py /usr/local/share /usr/local/share
COPY plugins.txt /usr/share/jenkins/ref/plugins.txt
RUN /usr/local/bin/install-plugins.sh < /usr/share/jenkins/ref/plugins.txt

COPY seedJob.xml /usr/share/jenkins/ref/jobs/seed-job/config.xml

ENV JAVA_OPTS -Djenkins.install.runSetupWizard=false
