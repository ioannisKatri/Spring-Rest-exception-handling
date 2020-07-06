# tells the terminal that we are using bash shell


# building the project
mvn install



echo --------------------------------Project was build.--------------------------------


docker-compose up -d --build

sleep 5

# OPEN BROWSER WITH THE url
/usr/bin/open -a "/Applications/Google Chrome.app" 'http://dev.security.com'
#/usr/bin/open -a "/Applications/Google Chrome.app" 'http://springmvcdocker.com'