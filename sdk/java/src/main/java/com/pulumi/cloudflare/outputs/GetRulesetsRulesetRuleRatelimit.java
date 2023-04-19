// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRulesetsRulesetRuleRatelimit {
    private @Nullable List<String> characteristics;
    private @Nullable String countingExpression;
    private @Nullable Integer mitigationTimeout;
    private @Nullable Integer period;
    private @Nullable Integer requestsPerPeriod;
    private @Nullable Boolean requestsToOrigin;
    private @Nullable Integer scorePerPeriod;
    private @Nullable String scoreResponseHeaderName;

    private GetRulesetsRulesetRuleRatelimit() {}
    public List<String> characteristics() {
        return this.characteristics == null ? List.of() : this.characteristics;
    }
    public Optional<String> countingExpression() {
        return Optional.ofNullable(this.countingExpression);
    }
    public Optional<Integer> mitigationTimeout() {
        return Optional.ofNullable(this.mitigationTimeout);
    }
    public Optional<Integer> period() {
        return Optional.ofNullable(this.period);
    }
    public Optional<Integer> requestsPerPeriod() {
        return Optional.ofNullable(this.requestsPerPeriod);
    }
    public Optional<Boolean> requestsToOrigin() {
        return Optional.ofNullable(this.requestsToOrigin);
    }
    public Optional<Integer> scorePerPeriod() {
        return Optional.ofNullable(this.scorePerPeriod);
    }
    public Optional<String> scoreResponseHeaderName() {
        return Optional.ofNullable(this.scoreResponseHeaderName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRulesetsRulesetRuleRatelimit defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> characteristics;
        private @Nullable String countingExpression;
        private @Nullable Integer mitigationTimeout;
        private @Nullable Integer period;
        private @Nullable Integer requestsPerPeriod;
        private @Nullable Boolean requestsToOrigin;
        private @Nullable Integer scorePerPeriod;
        private @Nullable String scoreResponseHeaderName;
        public Builder() {}
        public Builder(GetRulesetsRulesetRuleRatelimit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.characteristics = defaults.characteristics;
    	      this.countingExpression = defaults.countingExpression;
    	      this.mitigationTimeout = defaults.mitigationTimeout;
    	      this.period = defaults.period;
    	      this.requestsPerPeriod = defaults.requestsPerPeriod;
    	      this.requestsToOrigin = defaults.requestsToOrigin;
    	      this.scorePerPeriod = defaults.scorePerPeriod;
    	      this.scoreResponseHeaderName = defaults.scoreResponseHeaderName;
        }

        @CustomType.Setter
        public Builder characteristics(@Nullable List<String> characteristics) {
            this.characteristics = characteristics;
            return this;
        }
        public Builder characteristics(String... characteristics) {
            return characteristics(List.of(characteristics));
        }
        @CustomType.Setter
        public Builder countingExpression(@Nullable String countingExpression) {
            this.countingExpression = countingExpression;
            return this;
        }
        @CustomType.Setter
        public Builder mitigationTimeout(@Nullable Integer mitigationTimeout) {
            this.mitigationTimeout = mitigationTimeout;
            return this;
        }
        @CustomType.Setter
        public Builder period(@Nullable Integer period) {
            this.period = period;
            return this;
        }
        @CustomType.Setter
        public Builder requestsPerPeriod(@Nullable Integer requestsPerPeriod) {
            this.requestsPerPeriod = requestsPerPeriod;
            return this;
        }
        @CustomType.Setter
        public Builder requestsToOrigin(@Nullable Boolean requestsToOrigin) {
            this.requestsToOrigin = requestsToOrigin;
            return this;
        }
        @CustomType.Setter
        public Builder scorePerPeriod(@Nullable Integer scorePerPeriod) {
            this.scorePerPeriod = scorePerPeriod;
            return this;
        }
        @CustomType.Setter
        public Builder scoreResponseHeaderName(@Nullable String scoreResponseHeaderName) {
            this.scoreResponseHeaderName = scoreResponseHeaderName;
            return this;
        }
        public GetRulesetsRulesetRuleRatelimit build() {
            final var o = new GetRulesetsRulesetRuleRatelimit();
            o.characteristics = characteristics;
            o.countingExpression = countingExpression;
            o.mitigationTimeout = mitigationTimeout;
            o.period = period;
            o.requestsPerPeriod = requestsPerPeriod;
            o.requestsToOrigin = requestsToOrigin;
            o.scorePerPeriod = scorePerPeriod;
            o.scoreResponseHeaderName = scoreResponseHeaderName;
            return o;
        }
    }
}