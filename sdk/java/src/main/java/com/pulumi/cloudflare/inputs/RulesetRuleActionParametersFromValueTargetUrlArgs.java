// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RulesetRuleActionParametersFromValueTargetUrlArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesetRuleActionParametersFromValueTargetUrlArgs Empty = new RulesetRuleActionParametersFromValueTargetUrlArgs();

    @Import(name="expression")
    private @Nullable Output<String> expression;

    public Optional<Output<String>> expression() {
        return Optional.ofNullable(this.expression);
    }

    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private RulesetRuleActionParametersFromValueTargetUrlArgs() {}

    private RulesetRuleActionParametersFromValueTargetUrlArgs(RulesetRuleActionParametersFromValueTargetUrlArgs $) {
        this.expression = $.expression;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesetRuleActionParametersFromValueTargetUrlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesetRuleActionParametersFromValueTargetUrlArgs $;

        public Builder() {
            $ = new RulesetRuleActionParametersFromValueTargetUrlArgs();
        }

        public Builder(RulesetRuleActionParametersFromValueTargetUrlArgs defaults) {
            $ = new RulesetRuleActionParametersFromValueTargetUrlArgs(Objects.requireNonNull(defaults));
        }

        public Builder expression(@Nullable Output<String> expression) {
            $.expression = expression;
            return this;
        }

        public Builder expression(String expression) {
            return expression(Output.of(expression));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public RulesetRuleActionParametersFromValueTargetUrlArgs build() {
            return $;
        }
    }

}
