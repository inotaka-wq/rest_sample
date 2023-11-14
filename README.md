# rest_sample


https://note.com/hiroaki_abe_2004/n/nb4cc263f8234



brew install jq

Get
curl http://localhost:8080/greeting | jq .
curl http://localhost:8080/greeting?name=User | jq .
curl http://localhost:8080/book/1 | jq .
curl http://localhost:8080/book_all | jq .



Post
curl -X POST --data-urlencode 'name=太郎' http://localhost:8080/greeting_post | jq .
curl -X POST -d 'name=taro' http://localhost:8080/greeting_post | jq .
curl -X POST http://localhost:8080/greeting_post | jq .


Put
curl -X PUT -d 'name=iiro' http://localhost:8080/greeting_put | jq .
curl -X PUT http://localhost:8080/greeting_put | jq .

Delete
curl -X DELETE -d 'name=saburo' http://localhost:8080/greeting_delete | jq .
curl -X DELETE http://localhost:8080/greeting_delete | jq .




