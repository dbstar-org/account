package io.github.dbstarll.account.boot.model.request;

import javax.validation.constraints.NotBlank;
import java.util.StringJoiner;

public class MobileBase extends RequestBase {
    @NotBlank
    private String mobile;

    /**
     * get mobile.
     *
     * @return mobile
     */
    public final String getMobile() {
        return mobile;
    }

    /**
     * set mobile.
     *
     * @param mobile mobile
     */
    public final void setMobile(final String mobile) {
        this.mobile = mobile;
    }

    @Override
    protected StringJoiner addToStringEntry(final StringJoiner joiner) {
        return super.addToStringEntry(joiner).add("mobile='" + getMobile() + "'");
    }
}
