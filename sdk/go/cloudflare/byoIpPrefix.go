// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides the ability to manage Bring-Your-Own-IP prefixes (BYOIP) which are used with or without Magic Transit.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-cloudflare/sdk/v2/go/cloudflare"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := cloudflare.NewByoIpPrefix(ctx, "example", &cloudflare.ByoIpPrefixArgs{
// 			Advertisement: pulumi.String("on"),
// 			Description:   pulumi.String("Example IP Prefix"),
// 			PrefixId:      pulumi.String("d41d8cd98f00b204e9800998ecf8427e"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type ByoIpPrefix struct {
	pulumi.CustomResourceState

	// Whether or not the prefix shall be announced. A prefix can be activated or deactivated once every 15 minutes (attempting more regular updates will trigger rate limiting). Valid values: `on` or `off`.
	Advertisement pulumi.StringOutput `pulumi:"advertisement"`
	// The description of the prefix.
	Description pulumi.StringOutput `pulumi:"description"`
	// The assigned Bring-Your-Own-IP prefix ID.
	PrefixId pulumi.StringOutput `pulumi:"prefixId"`
}

// NewByoIpPrefix registers a new resource with the given unique name, arguments, and options.
func NewByoIpPrefix(ctx *pulumi.Context,
	name string, args *ByoIpPrefixArgs, opts ...pulumi.ResourceOption) (*ByoIpPrefix, error) {
	if args == nil || args.PrefixId == nil {
		return nil, errors.New("missing required argument 'PrefixId'")
	}
	if args == nil {
		args = &ByoIpPrefixArgs{}
	}
	var resource ByoIpPrefix
	err := ctx.RegisterResource("cloudflare:index/byoIpPrefix:ByoIpPrefix", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetByoIpPrefix gets an existing ByoIpPrefix resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetByoIpPrefix(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ByoIpPrefixState, opts ...pulumi.ResourceOption) (*ByoIpPrefix, error) {
	var resource ByoIpPrefix
	err := ctx.ReadResource("cloudflare:index/byoIpPrefix:ByoIpPrefix", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ByoIpPrefix resources.
type byoIpPrefixState struct {
	// Whether or not the prefix shall be announced. A prefix can be activated or deactivated once every 15 minutes (attempting more regular updates will trigger rate limiting). Valid values: `on` or `off`.
	Advertisement *string `pulumi:"advertisement"`
	// The description of the prefix.
	Description *string `pulumi:"description"`
	// The assigned Bring-Your-Own-IP prefix ID.
	PrefixId *string `pulumi:"prefixId"`
}

type ByoIpPrefixState struct {
	// Whether or not the prefix shall be announced. A prefix can be activated or deactivated once every 15 minutes (attempting more regular updates will trigger rate limiting). Valid values: `on` or `off`.
	Advertisement pulumi.StringPtrInput
	// The description of the prefix.
	Description pulumi.StringPtrInput
	// The assigned Bring-Your-Own-IP prefix ID.
	PrefixId pulumi.StringPtrInput
}

func (ByoIpPrefixState) ElementType() reflect.Type {
	return reflect.TypeOf((*byoIpPrefixState)(nil)).Elem()
}

type byoIpPrefixArgs struct {
	// Whether or not the prefix shall be announced. A prefix can be activated or deactivated once every 15 minutes (attempting more regular updates will trigger rate limiting). Valid values: `on` or `off`.
	Advertisement *string `pulumi:"advertisement"`
	// The description of the prefix.
	Description *string `pulumi:"description"`
	// The assigned Bring-Your-Own-IP prefix ID.
	PrefixId string `pulumi:"prefixId"`
}

// The set of arguments for constructing a ByoIpPrefix resource.
type ByoIpPrefixArgs struct {
	// Whether or not the prefix shall be announced. A prefix can be activated or deactivated once every 15 minutes (attempting more regular updates will trigger rate limiting). Valid values: `on` or `off`.
	Advertisement pulumi.StringPtrInput
	// The description of the prefix.
	Description pulumi.StringPtrInput
	// The assigned Bring-Your-Own-IP prefix ID.
	PrefixId pulumi.StringInput
}

func (ByoIpPrefixArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*byoIpPrefixArgs)(nil)).Elem()
}
