// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetRulesetsFilter;
import com.pulumi.cloudflare.outputs.GetRulesetsRuleset;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRulesetsResult {
    /**
     * @return The account identifier to target for the resource. Must provide only one of `zone_id`, `account_id`.
     * 
     */
    private @Nullable String accountId;
    private @Nullable GetRulesetsFilter filter;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Include rule data in response.
     * 
     */
    private @Nullable Boolean includeRules;
    private List<GetRulesetsRuleset> rulesets;
    /**
     * @return The zone identifier to target for the resource. Must provide only one of `zone_id`, `account_id`.
     * 
     */
    private @Nullable String zoneId;

    private GetRulesetsResult() {}
    /**
     * @return The account identifier to target for the resource. Must provide only one of `zone_id`, `account_id`.
     * 
     */
    public Optional<String> accountId() {
        return Optional.ofNullable(this.accountId);
    }
    public Optional<GetRulesetsFilter> filter() {
        return Optional.ofNullable(this.filter);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Include rule data in response.
     * 
     */
    public Optional<Boolean> includeRules() {
        return Optional.ofNullable(this.includeRules);
    }
    public List<GetRulesetsRuleset> rulesets() {
        return this.rulesets;
    }
    /**
     * @return The zone identifier to target for the resource. Must provide only one of `zone_id`, `account_id`.
     * 
     */
    public Optional<String> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRulesetsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String accountId;
        private @Nullable GetRulesetsFilter filter;
        private String id;
        private @Nullable Boolean includeRules;
        private List<GetRulesetsRuleset> rulesets;
        private @Nullable String zoneId;
        public Builder() {}
        public Builder(GetRulesetsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.filter = defaults.filter;
    	      this.id = defaults.id;
    	      this.includeRules = defaults.includeRules;
    	      this.rulesets = defaults.rulesets;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder accountId(@Nullable String accountId) {
            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder filter(@Nullable GetRulesetsFilter filter) {
            this.filter = filter;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder includeRules(@Nullable Boolean includeRules) {
            this.includeRules = includeRules;
            return this;
        }
        @CustomType.Setter
        public Builder rulesets(List<GetRulesetsRuleset> rulesets) {
            this.rulesets = Objects.requireNonNull(rulesets);
            return this;
        }
        public Builder rulesets(GetRulesetsRuleset... rulesets) {
            return rulesets(List.of(rulesets));
        }
        @CustomType.Setter
        public Builder zoneId(@Nullable String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public GetRulesetsResult build() {
            final var o = new GetRulesetsResult();
            o.accountId = accountId;
            o.filter = filter;
            o.id = id;
            o.includeRules = includeRules;
            o.rulesets = rulesets;
            o.zoneId = zoneId;
            return o;
        }
    }
}
