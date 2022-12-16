// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to look up [WAF Rule Packages](https://api.cloudflare.com/#waf-rule-packages-properties).
 *
 * ## Example Usage
 *
 * The example below matches all `high` sensitivity WAF Rule Packages, with a `challenge` action mode and an `anomaly` detection mode, that contain the word `example`. The matched WAF Rule Packages are then returned as output.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const test = cloudflare.getWafPackages({
 *     filter: {
 *         name: ".*example.*",
 *         detectionMode: "anomaly",
 *         sensitivity: "high",
 *         actionMode: "challenge",
 *     },
 * });
 * export const wafPackages = test.then(test => test.packages);
 * ```
 */
export function getWafPackages(args: GetWafPackagesArgs, opts?: pulumi.InvokeOptions): Promise<GetWafPackagesResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getWafPackages:getWafPackages", {
        "filter": args.filter,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getWafPackages.
 */
export interface GetWafPackagesArgs {
    /**
     * One or more values used to look up WAF Rule Packages. If more than one value is given all
     * values must match in order to be included, see below for full list.
     */
    filter?: inputs.GetWafPackagesFilter;
    /**
     * The ID of the DNS zone in which to search for the WAF Rule Packages.
     */
    zoneId: string;
}

/**
 * A collection of values returned by getWafPackages.
 */
export interface GetWafPackagesResult {
    readonly filter?: outputs.GetWafPackagesFilter;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A map of WAF Rule Packages details. Full list below:
     */
    readonly packages: outputs.GetWafPackagesPackage[];
    readonly zoneId: string;
}
/**
 * Use this data source to look up [WAF Rule Packages](https://api.cloudflare.com/#waf-rule-packages-properties).
 *
 * ## Example Usage
 *
 * The example below matches all `high` sensitivity WAF Rule Packages, with a `challenge` action mode and an `anomaly` detection mode, that contain the word `example`. The matched WAF Rule Packages are then returned as output.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const test = cloudflare.getWafPackages({
 *     filter: {
 *         name: ".*example.*",
 *         detectionMode: "anomaly",
 *         sensitivity: "high",
 *         actionMode: "challenge",
 *     },
 * });
 * export const wafPackages = test.then(test => test.packages);
 * ```
 */
export function getWafPackagesOutput(args: GetWafPackagesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetWafPackagesResult> {
    return pulumi.output(args).apply((a: any) => getWafPackages(a, opts))
}

/**
 * A collection of arguments for invoking getWafPackages.
 */
export interface GetWafPackagesOutputArgs {
    /**
     * One or more values used to look up WAF Rule Packages. If more than one value is given all
     * values must match in order to be included, see below for full list.
     */
    filter?: pulumi.Input<inputs.GetWafPackagesFilterArgs>;
    /**
     * The ID of the DNS zone in which to search for the WAF Rule Packages.
     */
    zoneId: pulumi.Input<string>;
}
