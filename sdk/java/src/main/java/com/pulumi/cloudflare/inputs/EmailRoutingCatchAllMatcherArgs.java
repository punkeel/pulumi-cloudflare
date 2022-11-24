// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class EmailRoutingCatchAllMatcherArgs extends com.pulumi.resources.ResourceArgs {

    public static final EmailRoutingCatchAllMatcherArgs Empty = new EmailRoutingCatchAllMatcherArgs();

    /**
     * Type of matcher. Available values: `all`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of matcher. Available values: `all`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private EmailRoutingCatchAllMatcherArgs() {}

    private EmailRoutingCatchAllMatcherArgs(EmailRoutingCatchAllMatcherArgs $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EmailRoutingCatchAllMatcherArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EmailRoutingCatchAllMatcherArgs $;

        public Builder() {
            $ = new EmailRoutingCatchAllMatcherArgs();
        }

        public Builder(EmailRoutingCatchAllMatcherArgs defaults) {
            $ = new EmailRoutingCatchAllMatcherArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type Type of matcher. Available values: `all`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of matcher. Available values: `all`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public EmailRoutingCatchAllMatcherArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
