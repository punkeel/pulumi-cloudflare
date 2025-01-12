// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CertificatePackValidationError {
    private @Nullable String message;

    private CertificatePackValidationError() {}
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificatePackValidationError defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String message;
        public Builder() {}
        public Builder(CertificatePackValidationError defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
        }

        @CustomType.Setter
        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }
        public CertificatePackValidationError build() {
            final var o = new CertificatePackValidationError();
            o.message = message;
            return o;
        }
    }
}
