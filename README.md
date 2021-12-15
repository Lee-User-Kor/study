# ACG
port :: 3306 > mysql, 80 > websvr, 8080 > tomcat, 443 > https, 21 > ftp, 465 > smtp, 22 > sftp

# Linux Svr
80 port 접근 시 8080 port redirect :: sudo iptables -A PREROUTING -t nat -i eth0 -p tcp --dport 80 -j REDIRECT --to-port 8080

# tomcat
톰캣 종료 sudo /usr/local/tomcat9.0/bin/shutdown.sh, 톰캣 시작 sudo /usr/local/tomcat9.0/bin/startup.sh

# URL hide projectname
https://offetuoso.tistory.com/m/entry/JSP-Web-Project-URL-%EC%83%9D%EB%9E%B5-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8-%EB%AA%85-%ED%8F%AC%ED%8A%B8
