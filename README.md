# rest_sample

brew install jq


Get
curl http://localhost:8080/greeting | jq .
curl http://localhost:8080/greeting?name=User  | jq .


Post
curl -X POST --data-urlencode 'name=太郎' http://localhost:8080/greeting_post | jq .
curl -X POST -d 'name=taro' http://localhost:8080/greeting_post | jq .
curl -X POST http://localhost:8080/greeting_post | jq .
aaa

Put
curl -X PUT -d 'name=iiro' http://localhost:8080/greeting_put | jq .
curl -X PUT http://localhost:8080/greeting_put | jq .

Delete
curl -X DELETE -d 'name=saburo' http://localhost:8080/greeting_delete | jq .
curl -X DELETE http://localhost:8080/greeting_delete | jq .

