package com.qcecuring.clp.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;
import java.util.Map;

@Data @Document(collection = "keys")
public class Key {
    @Id
    private String id;

    @Indexed(unique = true)
    private String keyId;
    private String alias;
    private String algorithm;
    private Integer keySize;
    private String storage;
    private String vaultRef;
    private String status;
    private String ownerId;
    private Date createdAt;
    private Date rotatedAt;
    private Map<String,Object> metadata;
}
