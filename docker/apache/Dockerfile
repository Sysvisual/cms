FROM httpd:2.4
LABEL authors="Paul Schmeing"

WORKDIR /usr/local/apache2/data/
VOLUME ["/usr/local/apache2/data/", "/usr/local/apache2/conf/"]

#$ docker build -t my-apache2 .
#$ docker run -dit --name my-running-app -p 8080:80 my-apache2
