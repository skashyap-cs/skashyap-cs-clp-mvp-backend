package com.qcecuring.clp.repository;

import com.qcecuring.clp.domain.Certificate;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CertificateRepository extends MongoRepository<Certificate, String> {
}
