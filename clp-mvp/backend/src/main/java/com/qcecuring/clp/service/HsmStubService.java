package com.qcecuring.clp.service;

import org.springframework.stereotype.Service;
import java.util.Base64;

@Service
public class HsmStubService {
    public String sign(String keyId, String hash) {
        String payload = "SIGNED:" + keyId + ":" + hash;
        return Base64.getEncoder().encodeToString(payload.getBytes());
    }
}
