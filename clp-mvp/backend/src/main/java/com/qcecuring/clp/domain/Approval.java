package com.qcecuring.clp.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Data @Document(collection = "approvals")
public class Approval {
    @Id
    private String id;

    private String approvalId;
    private String requestId;
    private String approverId;
    private String decision;
    private Date createdAt;
}
