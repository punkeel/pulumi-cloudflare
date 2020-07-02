// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Cloudflare Access Identity Provider resource. Identity Providers are
// used as an authentication or authorisation source within Access.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"fmt"
//
// 	"github.com/pulumi/pulumi-cloudflare/sdk/v2/go/cloudflare"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := cloudflare.NewAccessIdentityProvider(ctx, "pinLogin", &cloudflare.AccessIdentityProviderArgs{
// 			AccountId: pulumi.String("1d5fdc9e88c8a8c4518b068cd94331fe"),
// 			Name:      pulumi.String("PIN login"),
// 			Type:      pulumi.String("onetimepin"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = cloudflare.NewAccessIdentityProvider(ctx, "githubOauth", &cloudflare.AccessIdentityProviderArgs{
// 			AccountId: pulumi.String("1d5fdc9e88c8a8c4518b068cd94331fe"),
// 			Configs: cloudflare.AccessIdentityProviderConfigArray{
// 				&cloudflare.AccessIdentityProviderConfigArgs{
// 					ClientId:     pulumi.String("example"),
// 					ClientSecret: pulumi.String("secret_key"),
// 				},
// 			},
// 			Name: pulumi.String("GitHub OAuth"),
// 			Type: pulumi.String("github"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = cloudflare.NewAccessIdentityProvider(ctx, "jumpcloudSaml", &cloudflare.AccessIdentityProviderArgs{
// 			AccountId: pulumi.String("1d5fdc9e88c8a8c4518b068cd94331fe"),
// 			Configs: cloudflare.AccessIdentityProviderConfigArray{
// 				&cloudflare.AccessIdentityProviderConfigArgs{
// 					Attributes: pulumi.StringArray{
// 						pulumi.String("email"),
// 						pulumi.String("username"),
// 					},
// 					IdpPublicCert: pulumi.String(fmt.Sprintf("%v%v", "MIIDpDCCAoygAwIBAgIGAV2ka+55MA0GCSqGSIb3DQEBCwUAMIGSMQswCQ...GF/Q2/MHadws97cZg\n", "uTnQyuOqPuHbnN83d/2l1NSYKCbHt24o\n")),
// 					IssuerUrl:     pulumi.String("jumpcloud"),
// 					SignRequest:   pulumi.Bool(false),
// 					SsoTargetUrl:  pulumi.String("https://sso.myexample.jumpcloud.com/saml2/cloudflareaccess"),
// 				},
// 			},
// 			Name: pulumi.String("JumpCloud SAML"),
// 			Type: pulumi.String("saml"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// Please refer to the [developers.cloudflare.com Access documentation][accessIdentityProviderGuide]
// for full reference on what is available and how to configure your provider.
type AccessIdentityProvider struct {
	pulumi.CustomResourceState

	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Provider configuration from the [developer documentation][accessIdentityProviderGuide].
	Configs AccessIdentityProviderConfigArrayOutput `pulumi:"configs"`
	// Friendly name of the Access Identity Provider configuration.
	Name pulumi.StringOutput `pulumi:"name"`
	// The provider type to use. Must be one of: `"centrify"`,
	// `"facebook"`, `"google-apps"`, `"oidc"`, `"github"`, `"google"`, `"saml"`,
	// `"linkedin"`, `"azureAD"`, `"okta"`, `"onetimepin"`, `"onelogin"`, `"yandex"`.
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewAccessIdentityProvider registers a new resource with the given unique name, arguments, and options.
func NewAccessIdentityProvider(ctx *pulumi.Context,
	name string, args *AccessIdentityProviderArgs, opts ...pulumi.ResourceOption) (*AccessIdentityProvider, error) {
	if args == nil || args.AccountId == nil {
		return nil, errors.New("missing required argument 'AccountId'")
	}
	if args == nil || args.Name == nil {
		return nil, errors.New("missing required argument 'Name'")
	}
	if args == nil || args.Type == nil {
		return nil, errors.New("missing required argument 'Type'")
	}
	if args == nil {
		args = &AccessIdentityProviderArgs{}
	}
	var resource AccessIdentityProvider
	err := ctx.RegisterResource("cloudflare:index/accessIdentityProvider:AccessIdentityProvider", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAccessIdentityProvider gets an existing AccessIdentityProvider resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAccessIdentityProvider(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AccessIdentityProviderState, opts ...pulumi.ResourceOption) (*AccessIdentityProvider, error) {
	var resource AccessIdentityProvider
	err := ctx.ReadResource("cloudflare:index/accessIdentityProvider:AccessIdentityProvider", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AccessIdentityProvider resources.
type accessIdentityProviderState struct {
	AccountId *string `pulumi:"accountId"`
	// Provider configuration from the [developer documentation][accessIdentityProviderGuide].
	Configs []AccessIdentityProviderConfig `pulumi:"configs"`
	// Friendly name of the Access Identity Provider configuration.
	Name *string `pulumi:"name"`
	// The provider type to use. Must be one of: `"centrify"`,
	// `"facebook"`, `"google-apps"`, `"oidc"`, `"github"`, `"google"`, `"saml"`,
	// `"linkedin"`, `"azureAD"`, `"okta"`, `"onetimepin"`, `"onelogin"`, `"yandex"`.
	Type *string `pulumi:"type"`
}

type AccessIdentityProviderState struct {
	AccountId pulumi.StringPtrInput
	// Provider configuration from the [developer documentation][accessIdentityProviderGuide].
	Configs AccessIdentityProviderConfigArrayInput
	// Friendly name of the Access Identity Provider configuration.
	Name pulumi.StringPtrInput
	// The provider type to use. Must be one of: `"centrify"`,
	// `"facebook"`, `"google-apps"`, `"oidc"`, `"github"`, `"google"`, `"saml"`,
	// `"linkedin"`, `"azureAD"`, `"okta"`, `"onetimepin"`, `"onelogin"`, `"yandex"`.
	Type pulumi.StringPtrInput
}

func (AccessIdentityProviderState) ElementType() reflect.Type {
	return reflect.TypeOf((*accessIdentityProviderState)(nil)).Elem()
}

type accessIdentityProviderArgs struct {
	AccountId string `pulumi:"accountId"`
	// Provider configuration from the [developer documentation][accessIdentityProviderGuide].
	Configs []AccessIdentityProviderConfig `pulumi:"configs"`
	// Friendly name of the Access Identity Provider configuration.
	Name string `pulumi:"name"`
	// The provider type to use. Must be one of: `"centrify"`,
	// `"facebook"`, `"google-apps"`, `"oidc"`, `"github"`, `"google"`, `"saml"`,
	// `"linkedin"`, `"azureAD"`, `"okta"`, `"onetimepin"`, `"onelogin"`, `"yandex"`.
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a AccessIdentityProvider resource.
type AccessIdentityProviderArgs struct {
	AccountId pulumi.StringInput
	// Provider configuration from the [developer documentation][accessIdentityProviderGuide].
	Configs AccessIdentityProviderConfigArrayInput
	// Friendly name of the Access Identity Provider configuration.
	Name pulumi.StringInput
	// The provider type to use. Must be one of: `"centrify"`,
	// `"facebook"`, `"google-apps"`, `"oidc"`, `"github"`, `"google"`, `"saml"`,
	// `"linkedin"`, `"azureAD"`, `"okta"`, `"onetimepin"`, `"onelogin"`, `"yandex"`.
	Type pulumi.StringInput
}

func (AccessIdentityProviderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*accessIdentityProviderArgs)(nil)).Elem()
}
