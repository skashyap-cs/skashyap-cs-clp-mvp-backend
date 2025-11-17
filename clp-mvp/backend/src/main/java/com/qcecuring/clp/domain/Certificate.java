package com.qcecuring.clp.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Data @Document(collection = "certificates")
public class Certificate {
    @Id
    private String id;

    private String certId;
    private String fingerprint;
    private String serialNumber;
    private String keyId;
    private String subjectCn;
    private String issuerCn;
    private Date validFrom;
    private Date validTo;
    private String status;
    private String vaultRef;
}
