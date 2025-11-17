package com.qcecuring.clp.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;
import java.util.Map;

@Data @Document(collection = "auditLogs")
public class AuditLog {
    @Id
    private String id;

    private String eventType;
    private String entityId;
    private String performedBy;
    private Date timestamp;
    private Map<String,Object> details;
}
