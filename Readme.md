# Examen Cash Online con Spring Boot, MySQL, JPA, Hibernate Rest API 

## Requerimientos

1. Java - 1.8.x

2. Maven - 3.x.x

3. Mysql - 5.x.x

## Pasos

**1. Clonar aplicación**

```
git clone https://github.com/ignMango/testimangop2.git
```

**2. Cambiar usuario y clave  mysql**

+ abrir `src/main/resources/application.properties`

+ cambiar `spring.datasource.username` and `spring.datasource.password`

**3. correr app usando maven**

```
mvn package
java -jar target/examenp2-0.0.1-SNAPSHOT.jar
```

O -

```bash
mvn spring-boot:run
```

La app arrancara en <http://localhost:8080>.

## Rest APIs

The app defines following CRUD APIs.

    
    GET /loans?limit={1}&offset={0}
    
    GET /loans?limit={1}&offset={0}&user_id={1} 
    

Se puede testear con postman o rest-client(Firefox)

## Heroku

<https://examencashp1.herokuapp.com/>
