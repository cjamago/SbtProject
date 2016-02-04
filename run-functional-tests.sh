#!/bin/sh

case $1 in

            "firefox"|"ie"|"chrome"|"safari"|"iphone"|"ipad"|"android"|"phantomjs"|"htmlunit")
#                java -Xms512M -Xmx1536M -Xss1M -XX:+CMSClassUnloadingEnabled -XX:MaxPermSize=384M -Dbrowser="$1" -jar `dirname $0`/sbt-launch.jar "test-only com.bility.test.scala.Chrome"
                 sbt clean compile test -Dbrowser="$1"
                ;;
             *) echo 'Missing browser. Usage: ./run-functional-tests.sh [firefox|ie|chrome|safari|iphone|ipad|android|phantomjs]'
                exit -1
                ;;
        esac
