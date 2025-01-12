// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RulesetRuleActionParametersFromListArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesetRuleActionParametersFromListArgs Empty = new RulesetRuleActionParametersFromListArgs();

    @Import(name="key")
    private @Nullable Output<String> key;

    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
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

    private RulesetRuleActionParametersFromListArgs() {}

    private RulesetRuleActionParametersFromListArgs(RulesetRuleActionParametersFromListArgs $) {
        this.key = $.key;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesetRuleActionParametersFromListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesetRuleActionParametersFromListArgs $;

        public Builder() {
            $ = new RulesetRuleActionParametersFromListArgs();
        }

        public Builder(RulesetRuleActionParametersFromListArgs defaults) {
            $ = new RulesetRuleActionParametersFromListArgs(Objects.requireNonNull(defaults));
        }

        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
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

        public RulesetRuleActionParametersFromListArgs build() {
            return $;
        }
    }

}
