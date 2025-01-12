// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RateLimitActionResponseArgs extends com.pulumi.resources.ResourceArgs {

    public static final RateLimitActionResponseArgs Empty = new RateLimitActionResponseArgs();

    @Import(name="body", required=true)
    private Output<String> body;

    public Output<String> body() {
        return this.body;
    }

    @Import(name="contentType", required=true)
    private Output<String> contentType;

    public Output<String> contentType() {
        return this.contentType;
    }

    private RateLimitActionResponseArgs() {}

    private RateLimitActionResponseArgs(RateLimitActionResponseArgs $) {
        this.body = $.body;
        this.contentType = $.contentType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RateLimitActionResponseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RateLimitActionResponseArgs $;

        public Builder() {
            $ = new RateLimitActionResponseArgs();
        }

        public Builder(RateLimitActionResponseArgs defaults) {
            $ = new RateLimitActionResponseArgs(Objects.requireNonNull(defaults));
        }

        public Builder body(Output<String> body) {
            $.body = body;
            return this;
        }

        public Builder body(String body) {
            return body(Output.of(body));
        }

        public Builder contentType(Output<String> contentType) {
            $.contentType = contentType;
            return this;
        }

        public Builder contentType(String contentType) {
            return contentType(Output.of(contentType));
        }

        public RateLimitActionResponseArgs build() {
            $.body = Objects.requireNonNull($.body, "expected parameter 'body' to be non-null");
            $.contentType = Objects.requireNonNull($.contentType, "expected parameter 'contentType' to be non-null");
            return $;
        }
    }

}
