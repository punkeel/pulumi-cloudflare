// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.DlpProfileArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.DlpProfileState;
import com.pulumi.cloudflare.outputs.DlpProfileEntry;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare DLP Profile resource. Data Loss Prevention profiles
 * are a set of entries that can be matched in HTTP bodies or files.
 * They are referenced in Zero Trust Gateway rules.
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import cloudflare:index/dlpProfile:DlpProfile example &lt;account_id&gt;/&lt;dlp_profile_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/dlpProfile:DlpProfile")
public class DlpProfile extends com.pulumi.resources.CustomResource {
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
     * Brief summary of the profile and its intended use.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Brief summary of the profile and its intended use.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * List of entries to apply to the profile.
     * 
     */
    @Export(name="entries", type=List.class, parameters={DlpProfileEntry.class})
    private Output<List<DlpProfileEntry>> entries;

    /**
     * @return List of entries to apply to the profile.
     * 
     */
    public Output<List<DlpProfileEntry>> entries() {
        return this.entries;
    }
    /**
     * Name of the profile.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the profile.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The type of the profile. Available values: `custom`, `predefined`.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the profile. Available values: `custom`, `predefined`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DlpProfile(String name) {
        this(name, DlpProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DlpProfile(String name, DlpProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DlpProfile(String name, DlpProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/dlpProfile:DlpProfile", name, args == null ? DlpProfileArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DlpProfile(String name, Output<String> id, @Nullable DlpProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/dlpProfile:DlpProfile", name, state, makeResourceOptions(options, id));
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
    public static DlpProfile get(String name, Output<String> id, @Nullable DlpProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DlpProfile(name, id, state, options);
    }
}
