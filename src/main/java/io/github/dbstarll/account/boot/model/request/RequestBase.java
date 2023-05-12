package io.github.dbstarll.account.boot.model.request;

import java.util.StringJoiner;

public abstract class RequestBase {
    @Override
    public final String toString() {
        return addToStringEntry(new StringJoiner(", ", getClass().getSimpleName() + "[", "]")).toString();
    }

    /**
     * 为toString添加成员属性信息.
     *
     * @param joiner StringJoiner from super
     * @return StringJoiner
     */
    protected StringJoiner addToStringEntry(final StringJoiner joiner) {
        return joiner;
    }
}
