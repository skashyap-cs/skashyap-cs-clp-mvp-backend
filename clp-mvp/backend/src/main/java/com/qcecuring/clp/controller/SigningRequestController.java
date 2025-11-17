package com.qcecuring.clp.controller;

import com.qcecuring.clp.domain.SigningRequest;
import com.qcecuring.clp.service.SigningService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/signing-requests")
@RequiredArgsConstructor
public class SigningRequestController {
    private final SigningService service;

    @PostMapping
    public SigningRequest submit(@RequestBody SigningRequest req) {
        return service.submit(req);
    }

    @PostMapping("/{id}/approve")
    public SigningRequest approve(@PathVariable String id, @RequestParam String approverId) {
        return service.approveAndSign(id, approverId);
    }
}

