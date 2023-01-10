// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificatePackValidationErrorArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificatePackValidationErrorArgs Empty = new CertificatePackValidationErrorArgs();

    @Import(name="message")
    private @Nullable Output<String> message;

    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    private CertificatePackValidationErrorArgs() {}

    private CertificatePackValidationErrorArgs(CertificatePackValidationErrorArgs $) {
        this.message = $.message;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificatePackValidationErrorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificatePackValidationErrorArgs $;

        public Builder() {
            $ = new CertificatePackValidationErrorArgs();
        }

        public Builder(CertificatePackValidationErrorArgs defaults) {
            $ = new CertificatePackValidationErrorArgs(Objects.requireNonNull(defaults));
        }

        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        public Builder message(String message) {
            return message(Output.of(message));
        }

        public CertificatePackValidationErrorArgs build() {
            return $;
        }
    }

}