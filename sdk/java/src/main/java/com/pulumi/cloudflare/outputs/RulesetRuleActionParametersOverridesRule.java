// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RulesetRuleActionParametersOverridesRule {
    /**
     * @return Action to perform in the ruleset rule. Available values: `allow`, `block`, `challenge`, `ddos_dynamic`, `execute`, `force_connection_close`, `js_challenge`, `log`, `log_custom_field`, `managed_challenge`, `redirect`, `rewrite`, `route`, `score`, `set_cache_settings`, `set_config`, `serve_error`, `skip`.
     * 
     */
    private @Nullable String action;
    /**
     * @return Whether the rule is active.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return Unique rule identifier.
     * 
     */
    private @Nullable String id;
    private @Nullable Integer scoreThreshold;
    private @Nullable String sensitivityLevel;

    private RulesetRuleActionParametersOverridesRule() {}
    /**
     * @return Action to perform in the ruleset rule. Available values: `allow`, `block`, `challenge`, `ddos_dynamic`, `execute`, `force_connection_close`, `js_challenge`, `log`, `log_custom_field`, `managed_challenge`, `redirect`, `rewrite`, `route`, `score`, `set_cache_settings`, `set_config`, `serve_error`, `skip`.
     * 
     */
    public Optional<String> action() {
        return Optional.ofNullable(this.action);
    }
    /**
     * @return Whether the rule is active.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Unique rule identifier.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    public Optional<Integer> scoreThreshold() {
        return Optional.ofNullable(this.scoreThreshold);
    }
    public Optional<String> sensitivityLevel() {
        return Optional.ofNullable(this.sensitivityLevel);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesetRuleActionParametersOverridesRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String action;
        private @Nullable Boolean enabled;
        private @Nullable String id;
        private @Nullable Integer scoreThreshold;
        private @Nullable String sensitivityLevel;
        public Builder() {}
        public Builder(RulesetRuleActionParametersOverridesRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
    	      this.scoreThreshold = defaults.scoreThreshold;
    	      this.sensitivityLevel = defaults.sensitivityLevel;
        }

        @CustomType.Setter
        public Builder action(@Nullable String action) {
            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder scoreThreshold(@Nullable Integer scoreThreshold) {
            this.scoreThreshold = scoreThreshold;
            return this;
        }
        @CustomType.Setter
        public Builder sensitivityLevel(@Nullable String sensitivityLevel) {
            this.sensitivityLevel = sensitivityLevel;
            return this;
        }
        public RulesetRuleActionParametersOverridesRule build() {
            final var o = new RulesetRuleActionParametersOverridesRule();
            o.action = action;
            o.enabled = enabled;
            o.id = id;
            o.scoreThreshold = scoreThreshold;
            o.sensitivityLevel = sensitivityLevel;
            return o;
        }
    }
}
