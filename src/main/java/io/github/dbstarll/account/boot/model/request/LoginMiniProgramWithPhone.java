package io.github.dbstarll.account.boot.model.request;

import java.util.StringJoiner;

public final class LoginMiniProgramWithPhone extends LoginMiniProgram {
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
