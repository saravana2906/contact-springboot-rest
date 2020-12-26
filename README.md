# springboot-contact-rest.

Spring boot Contact Management API developed using spring boot concepts like  Spring Rest Repository , HAL Browser. <br>

This project same as previous learning project - Spring Boot Contact - https://github.com/saravana2906/spring-boot-Contact <br>

**Learnings** from this are follows - 

- By annotating Repository interfaces with **@RepositoryRestResource ** - Entities are exposed as rest services at ease and <br>
  it follows Open API specifications (Best Prcatices) like returning response status 201 - created , 404 -Not found etc.
- Annotations exposes resources by adding "s" to Entities(Noun) - Contact(Entity) - contacts(resources). contacts/1 - gives contact information for contactId -1.
- By adding HAL Browser dependencies - It exposes UI to easily check the resources and URI like swagger UI .


