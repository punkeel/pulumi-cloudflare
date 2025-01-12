// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.RulesetRuleActionParametersFromValueTargetUrlArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RulesetRuleActionParametersFromValueArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesetRuleActionParametersFromValueArgs Empty = new RulesetRuleActionParametersFromValueArgs();

    @Import(name="preserveQueryString")
    private @Nullable Output<Boolean> preserveQueryString;

    public Optional<Output<Boolean>> preserveQueryString() {
        return Optional.ofNullable(this.preserveQueryString);
    }

    @Import(name="statusCode")
    private @Nullable Output<Integer> statusCode;

    public Optional<Output<Integer>> statusCode() {
        return Optional.ofNullable(this.statusCode);
    }

    @Import(name="targetUrl")
    private @Nullable Output<RulesetRuleActionParametersFromValueTargetUrlArgs> targetUrl;

    public Optional<Output<RulesetRuleActionParametersFromValueTargetUrlArgs>> targetUrl() {
        return Optional.ofNullable(this.targetUrl);
    }

    private RulesetRuleActionParametersFromValueArgs() {}

    private RulesetRuleActionParametersFromValueArgs(RulesetRuleActionParametersFromValueArgs $) {
        this.preserveQueryString = $.preserveQueryString;
        this.statusCode = $.statusCode;
        this.targetUrl = $.targetUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesetRuleActionParametersFromValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesetRuleActionParametersFromValueArgs $;

        public Builder() {
            $ = new RulesetRuleActionParametersFromValueArgs();
        }

        public Builder(RulesetRuleActionParametersFromValueArgs defaults) {
            $ = new RulesetRuleActionParametersFromValueArgs(Objects.requireNonNull(defaults));
        }

        public Builder preserveQueryString(@Nullable Output<Boolean> preserveQueryString) {
            $.preserveQueryString = preserveQueryString;
            return this;
        }

        public Builder preserveQueryString(Boolean preserveQueryString) {
            return preserveQueryString(Output.of(preserveQueryString));
        }

        public Builder statusCode(@Nullable Output<Integer> statusCode) {
            $.statusCode = statusCode;
            return this;
        }

        public Builder statusCode(Integer statusCode) {
            return statusCode(Output.of(statusCode));
        }

        public Builder targetUrl(@Nullable Output<RulesetRuleActionParametersFromValueTargetUrlArgs> targetUrl) {
            $.targetUrl = targetUrl;
            return this;
        }

        public Builder targetUrl(RulesetRuleActionParametersFromValueTargetUrlArgs targetUrl) {
            return targetUrl(Output.of(targetUrl));
        }

        public RulesetRuleActionParametersFromValueArgs build() {
            return $;
        }
    }

}
