# Microservice Course

### Endpoints

### Save Course


POST /api/course HTTP/1.1
Host: localhost:3333
Authorization: Basic cmFuZG9tU2VjdXJlS2V5VXNlcm5hbWUhOnJhbmRvbVNlY3VyZUtleVBhc3N3b3JkIQ==
Content-Type: application/json
Cookie: JSESSIONID=E7FC329D68B7B87F33196C8908E68437
Content-Length: 92

{
"title": "test-course",
"subtitle": "test-course-subtitle",
"price": 10
}


### Get Courses


GET /api/course HTTP/1.1
Host: localhost:3333
Authorization: Basic cmFuZG9tU2VjdXJlS2V5VXNlcm5hbWUhOnJhbmRvbVNlY3VyZUtleVBhc3N3b3JkIQ==
Cookie: JSESSIONID=E7FC329D68B7B87F33196C8908E68437


### Delete Course

DELETE /api/course/1 HTTP/1.1
Host: localhost3333
Authorization: Basic cmFuZG9tU2VjdXJlS2V5VXNlcm5hbWUhOnJhbmRvbVNlY3VyZUtleVBhc3N3b3JkIQ==