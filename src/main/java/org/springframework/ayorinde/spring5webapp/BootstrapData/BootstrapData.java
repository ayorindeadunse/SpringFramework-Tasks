package org.springframework.ayorinde.spring5webapp.BootstrapData;

import org.springframework.ayorinde.spring5webapp.domain.Author;
import org.springframework.ayorinde.spring5webapp.domain.Book;
import org.springframework.ayorinde.spring5webapp.domain.Publisher;
import org.springframework.ayorinde.spring5webapp.repositories.AuthorRepository;
import org.springframework.ayorinde.spring5webapp.repositories.BookRepository;
import org.springframework.ayorinde.spring5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository,PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Publisher pubs = new Publisher();
        pubs.setName("Ayodot");
        pubs.setAddressLine1("Lekki Phase 1");
        pubs.setCity("Lagos");
        pubs.setState("Lagos");
        pubs.setZip("101502");

        publisherRepository.save(pubs);

        System.out.println("Displaying Publishers");
        System.out.println("Total number of publishers is " + publisherRepository.count());
        System.out.println("Publisher name is " + pubs.getName());

    Author auth = new Author("Ayo","Adunse");
    Book bk = new Book("Domain Driven design","123456");

    auth.getBooks().add(bk);
    bk.getAuthors().add(auth);

    bk.setPublisher(pubs);
    pubs.getBooks().add(bk);


    authorRepository.save(auth);
    bookRepository.save(bk);
    publisherRepository.save(pubs);

    Author auth1 = new Author("Femi","Johnson");
    Book bk1 = new Book("Osei","Yaw Ababio");

    auth1.getBooks().add(bk1);
    bk1.getAuthors().add(auth1);

    bk1.setPublisher(pubs);
    pubs.getBooks().add(bk1);

    authorRepository.save(auth1);
    bookRepository.save(bk1);
    publisherRepository.save(pubs);

    System.out.println("Bootstrapping JEE JPA Project with Spring");
    System.out.println("Number of books is " + bookRepository.count());
    System.out.println("Number of books assigned to a publisher is " + pubs.getBooks().size());



    }
}
