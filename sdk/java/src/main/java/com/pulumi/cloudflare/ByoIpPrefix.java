// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.ByoIpPrefixArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.ByoIpPrefixState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides the ability to manage Bring-Your-Own-IP prefixes (BYOIP)
 * which are used with or without Magic Transit.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.ByoIpPrefix;
 * import com.pulumi.cloudflare.ByoIpPrefixArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new ByoIpPrefix(&#34;example&#34;, ByoIpPrefixArgs.builder()        
 *             .accountId(&#34;f037e56e89293a057740de681ac9abbe&#34;)
 *             .advertisement(&#34;on&#34;)
 *             .description(&#34;Example IP Prefix&#34;)
 *             .prefixId(&#34;d41d8cd98f00b204e9800998ecf8427e&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import cloudflare:index/byoIpPrefix:ByoIpPrefix example &lt;account_id&gt;/&lt;prefix_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/byoIpPrefix:ByoIpPrefix")
public class ByoIpPrefix extends com.pulumi.resources.CustomResource {
    /**
     * The account identifier to target for the resource.
     * 
     */
    @Export(name="accountId", type=String.class, parameters={})
    private Output<String> accountId;

    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * Whether or not the prefix shall be announced. A prefix can be activated or deactivated once every 15 minutes (attempting more regular updates will trigger rate limiting). Available values: `on`, `off`.
     * 
     */
    @Export(name="advertisement", type=String.class, parameters={})
    private Output<String> advertisement;

    /**
     * @return Whether or not the prefix shall be announced. A prefix can be activated or deactivated once every 15 minutes (attempting more regular updates will trigger rate limiting). Available values: `on`, `off`.
     * 
     */
    public Output<String> advertisement() {
        return this.advertisement;
    }
    /**
     * Description of the BYO IP prefix.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Description of the BYO IP prefix.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The assigned Bring-Your-Own-IP prefix ID. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="prefixId", type=String.class, parameters={})
    private Output<String> prefixId;

    /**
     * @return The assigned Bring-Your-Own-IP prefix ID. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> prefixId() {
        return this.prefixId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ByoIpPrefix(String name) {
        this(name, ByoIpPrefixArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ByoIpPrefix(String name, ByoIpPrefixArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ByoIpPrefix(String name, ByoIpPrefixArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/byoIpPrefix:ByoIpPrefix", name, args == null ? ByoIpPrefixArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ByoIpPrefix(String name, Output<String> id, @Nullable ByoIpPrefixState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/byoIpPrefix:ByoIpPrefix", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ByoIpPrefix get(String name, Output<String> id, @Nullable ByoIpPrefixState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ByoIpPrefix(name, id, state, options);
    }
}
