package io.github.rogerlog.springroger.service;

import io.github.rogerlog.springroger.document.UserDocument;
import io.github.rogerlog.springroger.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import javax.annotation.PostConstruct;
import java.util.UUID;

@Service
public class DummyDataService {

    @Autowired
    UserRepository userRepository;

    //@PostConstruct
    public void createUsers(){

        userRepository.deleteAll()
                .thenMany(
                        Flux.just("Joao", "Maria", "Paulo",
                                "Adao", "Lucas")
                                .map(nome -> new UserDocument(UUID.randomUUID().toString(), nome))
                                .flatMap(userRepository::save))
                .subscribe(System.out::println);

    }
}
