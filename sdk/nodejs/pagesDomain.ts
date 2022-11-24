// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a resource for managing Cloudflare Pages domains.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const my_domain = new cloudflare.PagesDomain("my-domain", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     domain: "example.com",
 *     projectName: "my-example-project",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import cloudflare:index/pagesDomain:PagesDomain example <account_id>/<project_name>/<domain-name>
 * ```
 */
export class PagesDomain extends pulumi.CustomResource {
    /**
     * Get an existing PagesDomain resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PagesDomainState, opts?: pulumi.CustomResourceOptions): PagesDomain {
        return new PagesDomain(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/pagesDomain:PagesDomain';

    /**
     * Returns true if the given object is an instance of PagesDomain.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PagesDomain {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PagesDomain.__pulumiType;
    }

    /**
     * The account identifier to target for the resource.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * Custom domain.
     */
    public readonly domain!: pulumi.Output<string>;
    /**
     * Name of the Pages Project.
     */
    public readonly projectName!: pulumi.Output<string>;
    /**
     * Status of the custom domain.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a PagesDomain resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PagesDomainArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PagesDomainArgs | PagesDomainState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PagesDomainState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["domain"] = state ? state.domain : undefined;
            resourceInputs["projectName"] = state ? state.projectName : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as PagesDomainArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.domain === undefined) && !opts.urn) {
                throw new Error("Missing required property 'domain'");
            }
            if ((!args || args.projectName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectName'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["domain"] = args ? args.domain : undefined;
            resourceInputs["projectName"] = args ? args.projectName : undefined;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PagesDomain.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PagesDomain resources.
 */
export interface PagesDomainState {
    /**
     * The account identifier to target for the resource.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Custom domain.
     */
    domain?: pulumi.Input<string>;
    /**
     * Name of the Pages Project.
     */
    projectName?: pulumi.Input<string>;
    /**
     * Status of the custom domain.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PagesDomain resource.
 */
export interface PagesDomainArgs {
    /**
     * The account identifier to target for the resource.
     */
    accountId: pulumi.Input<string>;
    /**
     * Custom domain.
     */
    domain: pulumi.Input<string>;
    /**
     * Name of the Pages Project.
     */
    projectName: pulumi.Input<string>;
}
