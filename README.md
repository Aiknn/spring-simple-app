# Simple Project App (Spring Guru)

### Environment
* java -version
* javac -version
* mvn -v
* gradle -v

### Create a new simple project
* go to spring initializr on start.spring.io
* add dependencies (spring web, spring data jpa, h2 database)
* unzip and relocate source file
* open its folder from IDE

### JPA Entities
* create package - domain
* create POJO classes
* add @Entity above class
* add private Long id
* add to id - @Id, @GeneratedValue(startegy=GenerationType.AUTO)
* add empty constructor
* add full constructor without id
* add @ManyToMany or other data mapping
* add getters and setters (id included)
* add equals and hashcode only for id
* add toString for all fields

### Data Repository
* create package - repositories
* create interface (eg BookRepository)
* extend it from CrudRepository<Book, Long>

### Populating data with Spring
* create package - bootstrap
* create class BootStrapData and implements CommandLineRunner
* put @Component above class
* create constructor injection with repositories  
* implement run method
* in this function add params and save in repository

### H2 database console
* add to application.properties > spring.h2.console.enabled=true
* after run application and find h2 database name in console
* after go web > localhost:8080/h2-console
* in web form update jdbc url (from IDE console)

### MVC
* Model - simple POJO with collection of properties
* View - data is requested by client (through HTTP, JSON, Thymeleaf, etc)
* Controller - handle request mapping and use business logic (the last one delegated to services)

### Controller
* create controllers package
* create BookController class
* add @Controller annotation above the class
* inject repository through constructor
* create String class, and put Model model in params
* model.addAttribute (“book”, bookRepository.findAll())
* return any String name

### Thymeleaf Templates
* create templates/books/list.html
* add - html lang="en" xmlns:th="http://www.thymeleaf.org"
* iterate data - tr th:each="book : ${books}" — td th:text="${book.id}"
* run and check localhost:8080/books
