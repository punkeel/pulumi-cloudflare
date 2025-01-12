// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerRuleFixedResponseArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerRuleFixedResponseArgs Empty = new LoadBalancerRuleFixedResponseArgs();

    @Import(name="contentType")
    private @Nullable Output<String> contentType;

    public Optional<Output<String>> contentType() {
        return Optional.ofNullable(this.contentType);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    @Import(name="messageBody")
    private @Nullable Output<String> messageBody;

    public Optional<Output<String>> messageBody() {
        return Optional.ofNullable(this.messageBody);
    }

    @Import(name="statusCode")
    private @Nullable Output<Integer> statusCode;

    public Optional<Output<Integer>> statusCode() {
        return Optional.ofNullable(this.statusCode);
    }

    private LoadBalancerRuleFixedResponseArgs() {}

    private LoadBalancerRuleFixedResponseArgs(LoadBalancerRuleFixedResponseArgs $) {
        this.contentType = $.contentType;
        this.location = $.location;
        this.messageBody = $.messageBody;
        this.statusCode = $.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerRuleFixedResponseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerRuleFixedResponseArgs $;

        public Builder() {
            $ = new LoadBalancerRuleFixedResponseArgs();
        }

        public Builder(LoadBalancerRuleFixedResponseArgs defaults) {
            $ = new LoadBalancerRuleFixedResponseArgs(Objects.requireNonNull(defaults));
        }

        public Builder contentType(@Nullable Output<String> contentType) {
            $.contentType = contentType;
            return this;
        }

        public Builder contentType(String contentType) {
            return contentType(Output.of(contentType));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder messageBody(@Nullable Output<String> messageBody) {
            $.messageBody = messageBody;
            return this;
        }

        public Builder messageBody(String messageBody) {
            return messageBody(Output.of(messageBody));
        }

        public Builder statusCode(@Nullable Output<Integer> statusCode) {
            $.statusCode = statusCode;
            return this;
        }

        public Builder statusCode(Integer statusCode) {
            return statusCode(Output.of(statusCode));
        }

        public LoadBalancerRuleFixedResponseArgs build() {
            return $;
        }
    }

}
