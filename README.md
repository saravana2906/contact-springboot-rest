# springboot-contact-rest

Spring boot Contact Management API developed using spring boot concepts like  Spring Rest Repository , HAL Browser. <br>

This project same as previous learning project - Spring Boot Contact - https://github.com/saravana2906/spring-boot-Contact <br>

**Learnings** from this are follows - 

- By annotating Repository interfaces with **@RepositoryRestResource** - Entities are exposed as rest services at ease and <br>
  it follows Open API specifications (Best Prcatices) like returning response status 201 - created , 404 -Not found etc.
- Annotations exposes resources by adding "s" to Entities(Noun) - Contact(Entity) - contacts(resources). contacts/1 - gives contact information for contactId -1.
- By adding HAL Browser dependencies - It exposes UI to easily check the resources and URI like swagger UI .
- The one main enlightening is , I thought Hateoas , is High level standard to include navigation and documentation for Rest services , so that self link , next link while          pagination to reach resources but its not only that it also represents entity mapping object as link instead of actual resource.<br>
As we can see it treats resource reference as actual link points to the resource .
**Sample request to create new contact for User with user id - 1 **
```
{
  "name": "dharani",
  "emailId": "Dharani@gmail.com",
  "user": " http://localhost:7000/users/1"
}
```

