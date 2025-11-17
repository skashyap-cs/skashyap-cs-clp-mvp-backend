package com.qcecuring.clp.repository;

import com.qcecuring.clp.domain.Key;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface KeyRepository extends MongoRepository<Key, String> {
    Optional<Key> findByKeyId(String keyId);
}
