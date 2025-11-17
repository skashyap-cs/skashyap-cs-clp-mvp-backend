package com.qcecuring.clp.service;

import com.qcecuring.clp.domain.SigningRequest;
import com.qcecuring.clp.repository.SigningRequestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class SigningService {
    private final SigningRequestRepository repo;
    private final HsmStubService hsm;

    public SigningRequest submit(SigningRequest req) {
        req.setCreatedAt(new Date());
        req.setStatus("PENDING");
        return repo.save(req);
    }

    public SigningRequest approveAndSign(String requestId, String approverId) {
        SigningRequest req = repo.findByRequestId(requestId);
        req.setStatus("APPROVED");

        // sign automatically
        String signature = hsm.sign(req.getKeyId(), req.getArtefactHash());
        req.setSignature(signature);
        req.setStatus("SIGNED");

        return repo.save(req);
    }
}
