// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.AccessPolicyArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.AccessPolicyState;
import com.pulumi.cloudflare.outputs.AccessPolicyApprovalGroup;
import com.pulumi.cloudflare.outputs.AccessPolicyExclude;
import com.pulumi.cloudflare.outputs.AccessPolicyInclude;
import com.pulumi.cloudflare.outputs.AccessPolicyRequire;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare Access Policy resource. Access Policies are
 * used in conjunction with Access Applications to restrict access to
 * a particular resource.
 * 
 * &gt; It&#39;s required that an `account_id` or `zone_id` is provided and in
 * most cases using either is fine. However, if you&#39;re using a scoped
 * access token, you must provide the argument that matches the token&#39;s
 * scope. For example, an access token that is scoped to the &#34;example.com&#34;
 * zone needs to use the `zone_id` argument.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.AccessPolicy;
 * import com.pulumi.cloudflare.AccessPolicyArgs;
 * import com.pulumi.cloudflare.inputs.AccessPolicyIncludeArgs;
 * import com.pulumi.cloudflare.inputs.AccessPolicyRequireArgs;
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
 *         var testPolicyAccessPolicy = new AccessPolicy(&#34;testPolicyAccessPolicy&#34;, AccessPolicyArgs.builder()        
 *             .applicationId(&#34;cb029e245cfdd66dc8d2e570d5dd3322&#34;)
 *             .zoneId(&#34;0da42c8d2132a9ddaf714f9e7c920711&#34;)
 *             .name(&#34;staging policy&#34;)
 *             .precedence(&#34;1&#34;)
 *             .decision(&#34;allow&#34;)
 *             .includes(AccessPolicyIncludeArgs.builder()
 *                 .emails(&#34;test@example.com&#34;)
 *                 .build())
 *             .requires(AccessPolicyRequireArgs.builder()
 *                 .emails(&#34;test@example.com&#34;)
 *                 .build())
 *             .build());
 * 
 *         var testPolicyIndex_accessPolicyAccessPolicy = new AccessPolicy(&#34;testPolicyIndex/accessPolicyAccessPolicy&#34;, AccessPolicyArgs.builder()        
 *             .applicationId(&#34;cb029e245cfdd66dc8d2e570d5dd3322&#34;)
 *             .zoneId(&#34;0da42c8d2132a9ddaf714f9e7c920711&#34;)
 *             .name(&#34;staging policy&#34;)
 *             .precedence(&#34;1&#34;)
 *             .decision(&#34;allow&#34;)
 *             .includes(AccessPolicyIncludeArgs.builder()
 *                 .emails(&#34;test@example.com&#34;)
 *                 .build())
 *             .requires(AccessPolicyRequireArgs.builder()
 *                 .ips(var_.office_ip())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Account level import.
 * 
 * ```sh
 *  $ pulumi import cloudflare:index/accessPolicy:AccessPolicy example account/&lt;account_id&gt;/&lt;application_id&gt;/&lt;policy_id&gt;
 * ```
 * 
 *  Zone level import.
 * 
 * ```sh
 *  $ pulumi import cloudflare:index/accessPolicy:AccessPolicy example zone/&lt;zone_id&gt;/&lt;application_id&gt;/&lt;policy_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/accessPolicy:AccessPolicy")
public class AccessPolicy extends com.pulumi.resources.CustomResource {
    /**
     * The account identifier to target for the resource. Conflicts with `zone_id`.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return The account identifier to target for the resource. Conflicts with `zone_id`.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * The ID of the application the policy is associated with.
     * 
     */
    @Export(name="applicationId", refs={String.class}, tree="[0]")
    private Output<String> applicationId;

    /**
     * @return The ID of the application the policy is associated with.
     * 
     */
    public Output<String> applicationId() {
        return this.applicationId;
    }
    @Export(name="approvalGroups", refs={List.class,AccessPolicyApprovalGroup.class}, tree="[0,1]")
    private Output</* @Nullable */ List<AccessPolicyApprovalGroup>> approvalGroups;

    public Output<Optional<List<AccessPolicyApprovalGroup>>> approvalGroups() {
        return Codegen.optional(this.approvalGroups);
    }
    @Export(name="approvalRequired", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> approvalRequired;

    public Output<Optional<Boolean>> approvalRequired() {
        return Codegen.optional(this.approvalRequired);
    }
    /**
     * Defines the action Access will take if the policy matches the user. Available values: `allow`, `deny`, `non_identity`, `bypass`.
     * 
     */
    @Export(name="decision", refs={String.class}, tree="[0]")
    private Output<String> decision;

    /**
     * @return Defines the action Access will take if the policy matches the user. Available values: `allow`, `deny`, `non_identity`, `bypass`.
     * 
     */
    public Output<String> decision() {
        return this.decision;
    }
    /**
     * A series of access conditions, see Access Groups.
     * 
     */
    @Export(name="excludes", refs={List.class,AccessPolicyExclude.class}, tree="[0,1]")
    private Output</* @Nullable */ List<AccessPolicyExclude>> excludes;

    /**
     * @return A series of access conditions, see Access Groups.
     * 
     */
    public Output<Optional<List<AccessPolicyExclude>>> excludes() {
        return Codegen.optional(this.excludes);
    }
    /**
     * A series of access conditions, see Access Groups.
     * 
     */
    @Export(name="includes", refs={List.class,AccessPolicyInclude.class}, tree="[0,1]")
    private Output<List<AccessPolicyInclude>> includes;

    /**
     * @return A series of access conditions, see Access Groups.
     * 
     */
    public Output<List<AccessPolicyInclude>> includes() {
        return this.includes;
    }
    /**
     * Require this application to be served in an isolated browser for users matching this policy.
     * 
     */
    @Export(name="isolationRequired", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> isolationRequired;

    /**
     * @return Require this application to be served in an isolated browser for users matching this policy.
     * 
     */
    public Output<Optional<Boolean>> isolationRequired() {
        return Codegen.optional(this.isolationRequired);
    }
    /**
     * Friendly name of the Access Policy.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Friendly name of the Access Policy.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The unique precedence for policies on a single application.
     * 
     */
    @Export(name="precedence", refs={Integer.class}, tree="[0]")
    private Output<Integer> precedence;

    /**
     * @return The unique precedence for policies on a single application.
     * 
     */
    public Output<Integer> precedence() {
        return this.precedence;
    }
    /**
     * The prompt to display to the user for a justification for accessing the resource. Required when using `purpose_justification_required`.
     * 
     */
    @Export(name="purposeJustificationPrompt", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> purposeJustificationPrompt;

    /**
     * @return The prompt to display to the user for a justification for accessing the resource. Required when using `purpose_justification_required`.
     * 
     */
    public Output<Optional<String>> purposeJustificationPrompt() {
        return Codegen.optional(this.purposeJustificationPrompt);
    }
    /**
     * Whether to prompt the user for a justification for accessing the resource.
     * 
     */
    @Export(name="purposeJustificationRequired", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> purposeJustificationRequired;

    /**
     * @return Whether to prompt the user for a justification for accessing the resource.
     * 
     */
    public Output<Optional<Boolean>> purposeJustificationRequired() {
        return Codegen.optional(this.purposeJustificationRequired);
    }
    /**
     * A series of access conditions, see Access Groups.
     * 
     */
    @Export(name="requires", refs={List.class,AccessPolicyRequire.class}, tree="[0,1]")
    private Output</* @Nullable */ List<AccessPolicyRequire>> requires;

    /**
     * @return A series of access conditions, see Access Groups.
     * 
     */
    public Output<Optional<List<AccessPolicyRequire>>> requires() {
        return Codegen.optional(this.requires);
    }
    /**
     * The zone identifier to target for the resource. Conflicts with `account_id`.
     * 
     */
    @Export(name="zoneId", refs={String.class}, tree="[0]")
    private Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource. Conflicts with `account_id`.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccessPolicy(String name) {
        this(name, AccessPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccessPolicy(String name, AccessPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccessPolicy(String name, AccessPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/accessPolicy:AccessPolicy", name, args == null ? AccessPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AccessPolicy(String name, Output<String> id, @Nullable AccessPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/accessPolicy:AccessPolicy", name, state, makeResourceOptions(options, id));
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
    public static AccessPolicy get(String name, Output<String> id, @Nullable AccessPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AccessPolicy(name, id, state, options);
    }
}
