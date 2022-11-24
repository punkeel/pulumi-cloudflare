// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to lookup a single [Access Identity Provider][accessIdentityProviderGuide] by name.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const mainAccessIdentityProvider = cloudflare.getAccessIdentityProvider({
 *     name: "Google SSO",
 *     accountId: "example-account-id",
 * });
 * const mainAccessApplication = new cloudflare.AccessApplication("mainAccessApplication", {
 *     zoneId: "example.com",
 *     name: "name",
 *     domain: "name.example.com",
 *     type: "self_hosted",
 *     sessionDuration: "24h",
 *     allowedIdps: [mainAccessIdentityProvider.then(mainAccessIdentityProvider => mainAccessIdentityProvider.id)],
 *     autoRedirectToIdentity: true,
 * });
 * ```
 */
export function getAccessIdentityProvider(args: GetAccessIdentityProviderArgs, opts?: pulumi.InvokeOptions): Promise<GetAccessIdentityProviderResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("cloudflare:index/getAccessIdentityProvider:getAccessIdentityProvider", {
        "accountId": args.accountId,
        "name": args.name,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getAccessIdentityProvider.
 */
export interface GetAccessIdentityProviderArgs {
    /**
     * The account for which to look for an Access Identity Provider. Conflicts with `zoneId`.
     */
    accountId?: string;
    /**
     * Access Identity Provider name to search for.
     */
    name: string;
    /**
     * The Zone's ID. Conflicts with `accountId`.
     */
    zoneId?: string;
}

/**
 * A collection of values returned by getAccessIdentityProvider.
 */
export interface GetAccessIdentityProviderResult {
    readonly accountId?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Access Identity Provider Name
     */
    readonly name: string;
    /**
     * Access Identity Provider Type
     */
    readonly type: string;
    readonly zoneId?: string;
}

export function getAccessIdentityProviderOutput(args: GetAccessIdentityProviderOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAccessIdentityProviderResult> {
    return pulumi.output(args).apply(a => getAccessIdentityProvider(a, opts))
}

/**
 * A collection of arguments for invoking getAccessIdentityProvider.
 */
export interface GetAccessIdentityProviderOutputArgs {
    /**
     * The account for which to look for an Access Identity Provider. Conflicts with `zoneId`.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Access Identity Provider name to search for.
     */
    name: pulumi.Input<string>;
    /**
     * The Zone's ID. Conflicts with `accountId`.
     */
    zoneId?: pulumi.Input<string>;
}
