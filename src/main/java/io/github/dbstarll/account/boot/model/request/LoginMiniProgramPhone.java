package io.github.dbstarll.account.boot.model.request;

import javax.validation.constraints.NotBlank;
import java.util.StringJoiner;

public final class LoginMiniProgramPhone extends LoginMiniProgram {
    @NotBlank
    private String phoneCode;

    /**
     * 获得phoneCode.
     *
     * @return phoneCode
     */
    public String getPhoneCode() {
        return phoneCode;
    }

    /**
     * 设置phoneCode.
     *
     * @param phoneCode phoneCode
     */
    public void setPhoneCode(final String phoneCode) {
        this.phoneCode = phoneCode;
    }

    @Override
    protected StringJoiner addToStringEntry(final StringJoiner joiner) {
        return super.addToStringEntry(joiner).add("phoneCode='" + getPhoneCode() + "'");
    }
}
