package io.github.dbstarll.account.boot.model.request;

import javax.validation.constraints.NotBlank;
import java.util.StringJoiner;

/**
 * 基于微信体系的请求参数基础.
 */
public abstract class WeChatBase extends RequestBase {
    @NotBlank
    private String appId;

    /**
     * 获得appId.
     *
     * @return appId
     */
    public final String getAppId() {
        return appId;
    }

    /**
     * 设置appId.
     *
     * @param appId appId
     */
    public final void setAppId(final String appId) {
        this.appId = appId;
    }

    @Override
    protected StringJoiner addToStringEntry(final StringJoiner joiner) {
        return super.addToStringEntry(joiner).add("appId='" + getAppId() + "'");
    }
}
