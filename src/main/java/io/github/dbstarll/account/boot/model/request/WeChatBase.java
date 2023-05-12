package io.github.dbstarll.account.boot.model.request;

import java.util.StringJoiner;

/**
 * 基于微信体系的请求参数基础.
 */
public abstract class WeChatBase extends RequestBase {
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

    /**
     * 为toString添加成员属性信息.
     *
     * @param joiner StringJoiner from super
     * @return StringJoiner
     */
    protected StringJoiner addToStringEntry(final StringJoiner joiner) {
        return joiner.add("appId='" + getAppId() + "'");
    }
}
