package com.github.customers.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(value = "trust_device")
public class TrustDevice implements Serializable {

    @Id
    private String id;

    private UUID employeeId;

    private String ip;

    private String osName;

    private EntityStatus status;

    @CreatedBy
    private UUID createBy;

    @LastModifiedBy
    private UUID updateBy;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updateAt;

    public TrustDevice(UUID employeeId, String ip, String osName) {
        this.employeeId = employeeId;
        this.ip = ip;
        this.osName = osName;
    }

    public TrustDevice ip(String ip) {
        this.ip = ip;
        return this;
    }

    public TrustDevice osName(String osName) {
        this.osName = osName;
        return this;
    }

    public TrustDevice status(EntityStatus status) {
        this.status = status;
        return this;
    }

}
