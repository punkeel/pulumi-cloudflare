// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RulesetRuleActionParametersHeaderArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesetRuleActionParametersHeaderArgs Empty = new RulesetRuleActionParametersHeaderArgs();

    @Import(name="expression")
    private @Nullable Output<String> expression;

    public Optional<Output<String>> expression() {
        return Optional.ofNullable(this.expression);
    }

    /**
     * Name of the ruleset.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the ruleset.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="operation")
    private @Nullable Output<String> operation;

    public Optional<Output<String>> operation() {
        return Optional.ofNullable(this.operation);
    }

    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private RulesetRuleActionParametersHeaderArgs() {}

    private RulesetRuleActionParametersHeaderArgs(RulesetRuleActionParametersHeaderArgs $) {
        this.expression = $.expression;
        this.name = $.name;
        this.operation = $.operation;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesetRuleActionParametersHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesetRuleActionParametersHeaderArgs $;

        public Builder() {
            $ = new RulesetRuleActionParametersHeaderArgs();
        }

        public Builder(RulesetRuleActionParametersHeaderArgs defaults) {
            $ = new RulesetRuleActionParametersHeaderArgs(Objects.requireNonNull(defaults));
        }

        public Builder expression(@Nullable Output<String> expression) {
            $.expression = expression;
            return this;
        }

        public Builder expression(String expression) {
            return expression(Output.of(expression));
        }

        /**
         * @param name Name of the ruleset.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the ruleset.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder operation(@Nullable Output<String> operation) {
            $.operation = operation;
            return this;
        }

        public Builder operation(String operation) {
            return operation(Output.of(operation));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public RulesetRuleActionParametersHeaderArgs build() {
            return $;
        }
    }

}
