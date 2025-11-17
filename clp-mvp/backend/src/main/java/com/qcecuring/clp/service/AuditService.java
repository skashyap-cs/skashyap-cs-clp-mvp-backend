package com.qcecuring.clp.service;

import com.qcecuring.clp.domain.AuditLog;
import com.qcecuring.clp.repository.AuditLogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class AuditService {
    private final AuditLogRepository repo;

    public void log(String eventType, String entityId) {
        AuditLog a = new AuditLog(null, eventType, entityId, "system", new Date(), Map.of());
        repo.save(a);
    }
}
