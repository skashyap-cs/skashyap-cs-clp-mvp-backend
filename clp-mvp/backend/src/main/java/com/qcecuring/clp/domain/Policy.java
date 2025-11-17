package com.qcecuring.clp.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data @Document(collection = "policies")
public class Policy {
    @Id
    private String id;
    private String policyId;
    private String name;
    private Integer requiredApprovals;
}
