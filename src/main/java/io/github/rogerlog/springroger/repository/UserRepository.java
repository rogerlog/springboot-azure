package io.github.rogerlog.springroger.repository;

import io.github.rogerlog.springroger.document.UserDocument;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface UserRepository  extends ReactiveMongoRepository<UserDocument, String> {
}
