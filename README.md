

```bash
# run mongodb via docker
docker run --name local-mongo -p 27017:27017 -d mongo:latest

# connect to mongodb
docker exec -it local-mongo sh 
mongo 

# mongo commands
db.help()
db.stats()

# switch db
db 
show dbs
use <database>

# collections
show collections

# query document in collection
db.<collection>.find()
db.<collection>.find().pretty()
db.<collection>.findOne()




```

References
- <https://www.tutorialspoint.com/mongodb/>

