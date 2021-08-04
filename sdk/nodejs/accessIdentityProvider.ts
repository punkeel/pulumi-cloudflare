// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare Access Identity Provider resource. Identity Providers are
 * used as an authentication or authorisation source within Access.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * // one time pin
 * const pinLogin = new cloudflare.AccessIdentityProvider("pin_login", {
 *     accountId: "1d5fdc9e88c8a8c4518b068cd94331fe",
 *     name: "PIN login",
 *     type: "onetimepin",
 * });
 * // oauth
 * const githubOauth = new cloudflare.AccessIdentityProvider("github_oauth", {
 *     accountId: "1d5fdc9e88c8a8c4518b068cd94331fe",
 *     configs: [{
 *         clientId: "example",
 *         clientSecret: "secret_key",
 *     }],
 *     name: "GitHub OAuth",
 *     type: "github",
 * });
 * // saml
 * const jumpcloudSaml = new cloudflare.AccessIdentityProvider("jumpcloud_saml", {
 *     accountId: "1d5fdc9e88c8a8c4518b068cd94331fe",
 *     configs: [{
 *         attributes: [
 *             "email",
 *             "username",
 *         ],
 *         idpPublicCert: `MIIDpDCCAoygAwIBAgIGAV2ka+55MA0GCSqGSIb3DQEBCwUAMIGSMQswCQ...GF/Q2/MHadws97cZg
 * uTnQyuOqPuHbnN83d/2l1NSYKCbHt24o`,
 *         issuerUrl: "jumpcloud",
 *         signRequest: false,
 *         ssoTargetUrl: "https://sso.myexample.jumpcloud.com/saml2/cloudflareaccess",
 *     }],
 *     name: "JumpCloud SAML",
 *     type: "saml",
 * });
 * // okta
 * const okta = new cloudflare.AccessIdentityProvider("okta", {
 *     accountId: "1d5fdc9e88c8a8c4518b068cd94331fe",
 *     configs: [{
 *         apiToken: "okta_api_token",
 *         clientId: "example",
 *         clientSecret: "secret_key",
 *     }],
 *     name: "Okta",
 *     type: "okta",
 * });
 * ```
 *
 * Please refer to the [developers.cloudflare.com Access documentation][accessIdentityProviderGuide]
 * for full reference on what is available and how to configure your provider.
 *
 * ## Import
 *
 * Access Identity Providers can be imported using a composite ID formed of account ID and Access Identity Provider ID.
 *
 * ```sh
 *  $ pulumi import cloudflare:index/accessIdentityProvider:AccessIdentityProvider my_idp cb029e245cfdd66dc8d2e570d5dd3322/e00e1c13-e350-44fe-96c5-fb75c954871c
 * ```
 *
 *  [access_identity_provider_guide]https://developers.cloudflare.com/access/configuring-identity-providers/
 */
export class AccessIdentityProvider extends pulumi.CustomResource {
    /**
     * Get an existing AccessIdentityProvider resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccessIdentityProviderState, opts?: pulumi.CustomResourceOptions): AccessIdentityProvider {
        return new AccessIdentityProvider(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/accessIdentityProvider:AccessIdentityProvider';

    /**
     * Returns true if the given object is an instance of AccessIdentityProvider.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AccessIdentityProvider {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AccessIdentityProvider.__pulumiType;
    }

    /**
     * The account ID the provider should be associated with. Conflicts with `zoneId`.
     */
    public readonly accountId!: pulumi.Output<string | undefined>;
    /**
     * Provider configuration from the [developer documentation][accessIdentityProviderGuide].
     */
    public readonly configs!: pulumi.Output<outputs.AccessIdentityProviderConfig[] | undefined>;
    /**
     * Friendly name of the Access Identity Provider configuration.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The provider type to use. Must be one of: `"centrify"`,
     * `"facebook"`, `"google-apps"`, `"oidc"`, `"github"`, `"google"`, `"saml"`,
     * `"linkedin"`, `"azureAD"`, `"okta"`, `"onetimepin"`, `"onelogin"`, `"yandex"`.
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * The zone ID the provider should be associated with. Conflicts with `accountId`.
     */
    public readonly zoneId!: pulumi.Output<string | undefined>;

    /**
     * Create a AccessIdentityProvider resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AccessIdentityProviderArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AccessIdentityProviderArgs | AccessIdentityProviderState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AccessIdentityProviderState | undefined;
            inputs["accountId"] = state ? state.accountId : undefined;
            inputs["configs"] = state ? state.configs : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["type"] = state ? state.type : undefined;
            inputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as AccessIdentityProviderArgs | undefined;
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            inputs["accountId"] = args ? args.accountId : undefined;
            inputs["configs"] = args ? args.configs : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["type"] = args ? args.type : undefined;
            inputs["zoneId"] = args ? args.zoneId : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(AccessIdentityProvider.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AccessIdentityProvider resources.
 */
export interface AccessIdentityProviderState {
    /**
     * The account ID the provider should be associated with. Conflicts with `zoneId`.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Provider configuration from the [developer documentation][accessIdentityProviderGuide].
     */
    configs?: pulumi.Input<pulumi.Input<inputs.AccessIdentityProviderConfig>[]>;
    /**
     * Friendly name of the Access Identity Provider configuration.
     */
    name?: pulumi.Input<string>;
    /**
     * The provider type to use. Must be one of: `"centrify"`,
     * `"facebook"`, `"google-apps"`, `"oidc"`, `"github"`, `"google"`, `"saml"`,
     * `"linkedin"`, `"azureAD"`, `"okta"`, `"onetimepin"`, `"onelogin"`, `"yandex"`.
     */
    type?: pulumi.Input<string>;
    /**
     * The zone ID the provider should be associated with. Conflicts with `accountId`.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AccessIdentityProvider resource.
 */
export interface AccessIdentityProviderArgs {
    /**
     * The account ID the provider should be associated with. Conflicts with `zoneId`.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Provider configuration from the [developer documentation][accessIdentityProviderGuide].
     */
    configs?: pulumi.Input<pulumi.Input<inputs.AccessIdentityProviderConfig>[]>;
    /**
     * Friendly name of the Access Identity Provider configuration.
     */
    name: pulumi.Input<string>;
    /**
     * The provider type to use. Must be one of: `"centrify"`,
     * `"facebook"`, `"google-apps"`, `"oidc"`, `"github"`, `"google"`, `"saml"`,
     * `"linkedin"`, `"azureAD"`, `"okta"`, `"onetimepin"`, `"onelogin"`, `"yandex"`.
     */
    type: pulumi.Input<string>;
    /**
     * The zone ID the provider should be associated with. Conflicts with `accountId`.
     */
    zoneId?: pulumi.Input<string>;
}
