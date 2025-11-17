package com.qcecuring.clp.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data @Document(collection = "signingRequests")
public class SigningRequest {
    @Id
    private String id;

    private String requestId;
    private String requesterId;
    private String keyId;
    private String certId;
    private String artefactType;
    private String artefactHash;
    private String status;
    private List<String> approvalIds;
    private String signature;
    private String policyId;
    private Date createdAt;
    private Map<String,Object> metadata;
}
