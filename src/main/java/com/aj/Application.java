package com.aj;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.aj.entity.Book;
import com.aj.repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = 
		SpringApplication.run(Application.class, args);
		
		BookRepository repo = ctx.getBean(BookRepository.class);
		//1. save(E) : saving a record
		
		/*Book b = new Book();
		b.setBookId(101);
		b.setBookName("Java");
		b.setBookPrice(199.99);
		
		repo.save(b);*/
		
		
		//2. saveAll() : save collection of records
		
		/*Book b1 = new Book();
		b1.setBookId(104);
		b1.setBookName("Angular");
		b1.setBookPrice(999.00);
		repo.save(b1);
		
		
		Book b2 = new Book();
		b2.setBookId(103);
		b2.setBookName("React ");
		b2.setBookPrice(1999.00);
		repo.save(b2);

		
		Book b3 = new Book();
		b3.setBookId(102);
		b3.setBookName("Vue Js");
		b3.setBookPrice(99.00);
		repo.save(b3);
		
		
		repo.saveAll(Arrays.asList(b1,b2,b3));
		
		*/
		
		//3. existsById () : check for the record
		
		/*boolean status = repo.existsById(104);
		System.out.println("Book Presence : "+ status);
		
		
		//4. findById : retrives by id and returns Optional Object		
		Optional<Book> findById = repo.findById(101);
		System.out.println(findById.get());
		
	
		
		//5. findAll() : retrive all the records
		Iterable<Book> allBook = repo.findAll();
		System.out.println(allBook);
		
		//6. findAllById
		
		Iterable<Book> findAllById = repo.findAllById(Arrays.asList(101,102,104));
		System.out.println(findAllById);
		
		7.count()
		
			long count = repo.count();
			System.out.println(count);
		
		
		*/
		
	
		
	
		
		/*
		 8.deleteById()
		 
		 	if(repo.existsById(503)) {
			repo.deleteById(503);

			}else {
			System.out.println("No record Found");
			}
		
		 
		 9.deleteAll()
		 10. deleteAllById() 
		 11. delete
		 12. deleteAll(Itereable entities)
		 
		  
		 
		 */
		
		
		//If we want to retrive book whose price is > 1000 . By using above methods  it is not possible
		//Jpa has given two wasy
		//1. findBy methods 
		List<Book> books = repo.findByBookPriceGreaterThan(200.00);
		for(Book b : books) {
			System.out.println(b);
		}		
		
		
	}

}
