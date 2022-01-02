package com.github.customers.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrustDeviceDto implements Serializable {

    private static final long serialVersionUID = 1284176889701663210L;

    private String id;

    private String ip;

    private String deviceType;

    private String osName;

}
