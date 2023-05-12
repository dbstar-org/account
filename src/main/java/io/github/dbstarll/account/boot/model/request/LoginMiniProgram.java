package io.github.dbstarll.account.boot.model.request;

import java.util.StringJoiner;

public class LoginMiniProgram extends WeChatBase {
    private String code;

    /**
     * 获取小程序前端登录获得的code.
     *
     * @return code
     */
    public final String getCode() {
        return code;
    }

    /**
     * 设置小程序前端登录获得的code.
     *
     * @param code code
     */
    public final void setCode(final String code) {
        this.code = code;
    }

    @Override
    protected StringJoiner addToStringEntry(final StringJoiner joiner) {
        return super.addToStringEntry(joiner).add("code='" + getCode() + "'");
    }
}
