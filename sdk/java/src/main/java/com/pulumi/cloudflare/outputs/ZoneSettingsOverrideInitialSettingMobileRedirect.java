// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ZoneSettingsOverrideInitialSettingMobileRedirect {
    private String mobileSubdomain;
    private String status;
    private Boolean stripUri;

    private ZoneSettingsOverrideInitialSettingMobileRedirect() {}
    public String mobileSubdomain() {
        return this.mobileSubdomain;
    }
    public String status() {
        return this.status;
    }
    public Boolean stripUri() {
        return this.stripUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZoneSettingsOverrideInitialSettingMobileRedirect defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String mobileSubdomain;
        private String status;
        private Boolean stripUri;
        public Builder() {}
        public Builder(ZoneSettingsOverrideInitialSettingMobileRedirect defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mobileSubdomain = defaults.mobileSubdomain;
    	      this.status = defaults.status;
    	      this.stripUri = defaults.stripUri;
        }

        @CustomType.Setter
        public Builder mobileSubdomain(String mobileSubdomain) {
            this.mobileSubdomain = Objects.requireNonNull(mobileSubdomain);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder stripUri(Boolean stripUri) {
            this.stripUri = Objects.requireNonNull(stripUri);
            return this;
        }
        public ZoneSettingsOverrideInitialSettingMobileRedirect build() {
            final var o = new ZoneSettingsOverrideInitialSettingMobileRedirect();
            o.mobileSubdomain = mobileSubdomain;
            o.status = status;
            o.stripUri = stripUri;
            return o;
        }
    }
}
