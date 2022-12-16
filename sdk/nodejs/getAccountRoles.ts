// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to lookup [Account Roles](https://api.cloudflare.com/#account-roles-properties).
 */
export function getAccountRoles(args: GetAccountRolesArgs, opts?: pulumi.InvokeOptions): Promise<GetAccountRolesResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getAccountRoles:getAccountRoles", {
        "accountId": args.accountId,
    }, opts);
}

/**
 * A collection of arguments for invoking getAccountRoles.
 */
export interface GetAccountRolesArgs {
    /**
     * The account for which to list the roles.
     */
    accountId: string;
}

/**
 * A collection of values returned by getAccountRoles.
 */
export interface GetAccountRolesResult {
    readonly accountId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of roles object. See below for nested attributes.
     */
    readonly roles: outputs.GetAccountRolesRole[];
}
/**
 * Use this data source to lookup [Account Roles](https://api.cloudflare.com/#account-roles-properties).
 */
export function getAccountRolesOutput(args: GetAccountRolesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAccountRolesResult> {
    return pulumi.output(args).apply((a: any) => getAccountRoles(a, opts))
}

/**
 * A collection of arguments for invoking getAccountRoles.
 */
export interface GetAccountRolesOutputArgs {
    /**
     * The account for which to list the roles.
     */
    accountId: pulumi.Input<string>;
}
