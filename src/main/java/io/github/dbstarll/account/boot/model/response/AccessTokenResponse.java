package io.github.dbstarll.account.boot.model.response;

import java.io.Serializable;

public final class AccessTokenResponse implements Serializable {
    private final String accessToken;

    /**
     * 构建AccessTokenResponse.
     *
     * @param accessToken accessToken
     */
    public AccessTokenResponse(final String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * 获得accessToken.
     *
     * @return accessToken
     */
    public String getAccessToken() {
        return accessToken;
    }
}
