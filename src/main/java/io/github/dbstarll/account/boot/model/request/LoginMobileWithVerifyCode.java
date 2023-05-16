package io.github.dbstarll.account.boot.model.request;

import javax.validation.constraints.NotBlank;
import java.util.StringJoiner;

public final class LoginMobileWithVerifyCode extends MobileBase {
    @NotBlank
    private String verifyCode;

    /**
     * 获得验证码.
     *
     * @return 验证码
     */
    public String getVerifyCode() {
        return verifyCode;
    }

    /**
     * 设置验证码.
     *
     * @param verifyCode 验证码
     */
    public void setVerifyCode(final String verifyCode) {
        this.verifyCode = verifyCode;
    }

    @Override
    protected StringJoiner addToStringEntry(final StringJoiner joiner) {
        return super.addToStringEntry(joiner).add("verifyCode='" + getVerifyCode() + "'");
    }
}
