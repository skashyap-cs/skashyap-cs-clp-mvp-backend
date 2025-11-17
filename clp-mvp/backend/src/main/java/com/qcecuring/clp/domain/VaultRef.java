package com.qcecuring.clp.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data @Document(collection = "vaultRefs")
public class VaultRef {
    @Id
    private String id;

    private String vaultRefId;
    private String type;
    private String connectionInfo;
}
