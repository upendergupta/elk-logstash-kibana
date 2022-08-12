# elk-logstash-kibana
Step 1
download
https://www.elastic.co/downloads/past-releases/elasticsearch-7-6-2
https://www.elastic.co/downloads/past-releases/logstash-7-6-2
https://www.elastic.co/downloads/past-releases/logstash-7-6-2


Step 2 elk
start elastic seach
D:\software\ELK-kibana-logstash\elasticsearch-7.6.2-windows-x86_64\elasticsearch-7.6.2\bin>elasticsearch.bat

Step 3 kibana
go to conf folder
D:\software\ELK-kibana-logstash\kibana-7.6.2-windows-x86_64\kibana-7.6.2-windows-x86_64\config

open kibana.yml
uncomment this line
elasticsearch.hosts: ["http://localhost:9200"]

step 4 start kibana
D:\software\ELK-kibana-logstash\kibana-7.6.2-windows-x86_64\kibana-7.6.2-windows-x86_64\bin> kibana.bat

Step 5 create you application with log.info statement 

step 6 to start logstash

create logstsh.cong 
====================
input { 
   file { 
        path => "C:/Users/Upender Gupta/Desktop/logs/elk-stack.log"
		start_position => "beginning"
		} 
	}




output {
 
  stdout { 
    codec => rubydebug 
  }
  elasticsearch { 
  hosts => ["localhost:9200"] 
  index => "upender-%{+yyyy.MM.dd}"
  }
}
=====================================

Step 7 copy logstash.cong and  paste into bin folder
D:\software\ELK-kibana-logstash\logstash-7.6.2\logstash-7.6.2\bin

Step 8 start logstash
D:\software\ELK-kibana-logstash\logstash-7.6.2\logstash-7.6.2\bin> logstash -f logstash.conf

Step 9
Follow video link
=================
https://www.youtube.com/watch?v=9g-h1biMn2E
https://www.youtube.com/watch?v=5s9pR9UUtAU
