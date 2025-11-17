package com.qcecuring.clp.repository;

import com.qcecuring.clp.domain.SigningRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SigningRequestRepository extends MongoRepository<SigningRequest, String> {
    SigningRequest findByRequestId(String requestId);
}
