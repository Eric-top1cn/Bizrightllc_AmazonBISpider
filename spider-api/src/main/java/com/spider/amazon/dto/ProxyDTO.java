package com.spider.amazon.dto;

import com.spider.amazon.model.ProxyProvider;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProxyDTO {

    /**
     * Internal id
     */
    private Long id;

    /**
     * Provider id
     */
    private String proxyId;

    private ProxyProvider provider;

    /**
     * Proxy host
     */
    private String ip;

    private String port;

    private String username;

    private String password;

    /**
     * HTTP, SOCK
     */
    private String ipType;

    /**
     * Public, Resident
     */
    private String secretType;

    private String location;

    private String country;

    private String responeSp;

    private Date lastCheckTime;

    private LocalDateTime expiredAt;

    private String ipStatus;

    private Boolean selfRotating;

    private Boolean active;

    private LocalDateTime lastUsedAt;

    private LocalDateTime insertedAt;

    private LocalDateTime updatedAt;

    @Override
    public String toString() {
        return "ProxyDTO{" +
                "ip='" + ip + '\'' +
                ", port='" + port + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
