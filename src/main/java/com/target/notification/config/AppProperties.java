package com.target.notification.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("mail")
public class AppProperties {

    private String userName;
    private String password;

    public static class smtp {
        private String auth;
        private String starttls;
        private String host;
        private String port;

        public String getAuth() {
            return auth;
        }

        public smtp setAuth(String auth) {
            this.auth = auth;
            return this;
        }

        public String getStarttls() {
            return starttls;
        }

        public smtp setStarttls(String starttls) {
            this.starttls = starttls;
            return this;
        }

        public String getHost() {
            return host;
        }

        public smtp setHost(String host) {
            this.host = host;
            return this;
        }

        public String getPort() {
            return port;
        }

        public smtp setPort(String port) {
            this.port = port;
            return this;
        }
    }

    public String getUserName() {
        return userName;
    }

    public AppProperties setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public AppProperties setPassword(String password) {
        this.password = password;
        return this;
    }
}
