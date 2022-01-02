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
@Document(value = "accounts")
public class Account implements Serializable {

    private static final long serialVersionUID = -7822776482285231836L;

    @Id
    private String id;

    private Profile profile;

    private Contact contact;

    private Address address;

    private UUID employeeId;

    private EntityStatus status = EntityStatus.on;

    @CreatedBy
    private UUID createBy;

    @LastModifiedBy
    private UUID updateBy;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updateAt;

    public Account(Profile profile, Contact contact, Address address, UUID employeeId, EntityStatus status) {
        this.profile = profile;
        this.contact = contact;
        this.address = address;
        this.employeeId = employeeId;
        this.status = status;
    }

    public static Account defaultAccount(Customers employee) {
        return new Account(
                Profile.defaultProfile(
                        employee.getFirstName(),
                        employee.getLastName(),
                        employee.getPatronymic()
                ),
                Contact.defaultContact(),
                Address.defaultAddress(),
                employee.getId(),
                EntityStatus.off
        );
    }

    public Account employeeId(UUID employeeId) {
        this.employeeId = employeeId;
        return this;
    }

    public Account status(EntityStatus status) {
        this.status = status;
        return this;
    }

}
