// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides the ability to manage Bring-Your-Own-IP prefixes (BYOIP)
// which are used with or without Magic Transit.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-cloudflare/sdk/v4/go/cloudflare"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudflare.NewByoIpPrefix(ctx, "example", &cloudflare.ByoIpPrefixArgs{
//				AccountId:     pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				Advertisement: pulumi.String("on"),
//				Description:   pulumi.String("Example IP Prefix"),
//				PrefixId:      pulumi.String("d41d8cd98f00b204e9800998ecf8427e"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// ```sh
//
//	$ pulumi import cloudflare:index/byoIpPrefix:ByoIpPrefix example <account_id>/<prefix_id>
//
// ```
type ByoIpPrefix struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Whether or not the prefix shall be announced. A prefix can be activated or deactivated once every 15 minutes (attempting more regular updates will trigger rate limiting). Available values: `on`, `off`.
	Advertisement pulumi.StringOutput `pulumi:"advertisement"`
	// Description of the BYO IP prefix.
	Description pulumi.StringOutput `pulumi:"description"`
	// The assigned Bring-Your-Own-IP prefix ID. **Modifying this attribute will force creation of a new resource.**
	PrefixId pulumi.StringOutput `pulumi:"prefixId"`
}

// NewByoIpPrefix registers a new resource with the given unique name, arguments, and options.
func NewByoIpPrefix(ctx *pulumi.Context,
	name string, args *ByoIpPrefixArgs, opts ...pulumi.ResourceOption) (*ByoIpPrefix, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.PrefixId == nil {
		return nil, errors.New("invalid value for required argument 'PrefixId'")
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
	// The account identifier to target for the resource.
	AccountId *string `pulumi:"accountId"`
	// Whether or not the prefix shall be announced. A prefix can be activated or deactivated once every 15 minutes (attempting more regular updates will trigger rate limiting). Available values: `on`, `off`.
	Advertisement *string `pulumi:"advertisement"`
	// Description of the BYO IP prefix.
	Description *string `pulumi:"description"`
	// The assigned Bring-Your-Own-IP prefix ID. **Modifying this attribute will force creation of a new resource.**
	PrefixId *string `pulumi:"prefixId"`
}

type ByoIpPrefixState struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringPtrInput
	// Whether or not the prefix shall be announced. A prefix can be activated or deactivated once every 15 minutes (attempting more regular updates will trigger rate limiting). Available values: `on`, `off`.
	Advertisement pulumi.StringPtrInput
	// Description of the BYO IP prefix.
	Description pulumi.StringPtrInput
	// The assigned Bring-Your-Own-IP prefix ID. **Modifying this attribute will force creation of a new resource.**
	PrefixId pulumi.StringPtrInput
}

func (ByoIpPrefixState) ElementType() reflect.Type {
	return reflect.TypeOf((*byoIpPrefixState)(nil)).Elem()
}

type byoIpPrefixArgs struct {
	// The account identifier to target for the resource.
	AccountId string `pulumi:"accountId"`
	// Whether or not the prefix shall be announced. A prefix can be activated or deactivated once every 15 minutes (attempting more regular updates will trigger rate limiting). Available values: `on`, `off`.
	Advertisement *string `pulumi:"advertisement"`
	// Description of the BYO IP prefix.
	Description *string `pulumi:"description"`
	// The assigned Bring-Your-Own-IP prefix ID. **Modifying this attribute will force creation of a new resource.**
	PrefixId string `pulumi:"prefixId"`
}

// The set of arguments for constructing a ByoIpPrefix resource.
type ByoIpPrefixArgs struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringInput
	// Whether or not the prefix shall be announced. A prefix can be activated or deactivated once every 15 minutes (attempting more regular updates will trigger rate limiting). Available values: `on`, `off`.
	Advertisement pulumi.StringPtrInput
	// Description of the BYO IP prefix.
	Description pulumi.StringPtrInput
	// The assigned Bring-Your-Own-IP prefix ID. **Modifying this attribute will force creation of a new resource.**
	PrefixId pulumi.StringInput
}

func (ByoIpPrefixArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*byoIpPrefixArgs)(nil)).Elem()
}

type ByoIpPrefixInput interface {
	pulumi.Input

	ToByoIpPrefixOutput() ByoIpPrefixOutput
	ToByoIpPrefixOutputWithContext(ctx context.Context) ByoIpPrefixOutput
}

func (*ByoIpPrefix) ElementType() reflect.Type {
	return reflect.TypeOf((**ByoIpPrefix)(nil)).Elem()
}

func (i *ByoIpPrefix) ToByoIpPrefixOutput() ByoIpPrefixOutput {
	return i.ToByoIpPrefixOutputWithContext(context.Background())
}

func (i *ByoIpPrefix) ToByoIpPrefixOutputWithContext(ctx context.Context) ByoIpPrefixOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ByoIpPrefixOutput)
}

// ByoIpPrefixArrayInput is an input type that accepts ByoIpPrefixArray and ByoIpPrefixArrayOutput values.
// You can construct a concrete instance of `ByoIpPrefixArrayInput` via:
//
//	ByoIpPrefixArray{ ByoIpPrefixArgs{...} }
type ByoIpPrefixArrayInput interface {
	pulumi.Input

	ToByoIpPrefixArrayOutput() ByoIpPrefixArrayOutput
	ToByoIpPrefixArrayOutputWithContext(context.Context) ByoIpPrefixArrayOutput
}

type ByoIpPrefixArray []ByoIpPrefixInput

func (ByoIpPrefixArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ByoIpPrefix)(nil)).Elem()
}

func (i ByoIpPrefixArray) ToByoIpPrefixArrayOutput() ByoIpPrefixArrayOutput {
	return i.ToByoIpPrefixArrayOutputWithContext(context.Background())
}

func (i ByoIpPrefixArray) ToByoIpPrefixArrayOutputWithContext(ctx context.Context) ByoIpPrefixArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ByoIpPrefixArrayOutput)
}

// ByoIpPrefixMapInput is an input type that accepts ByoIpPrefixMap and ByoIpPrefixMapOutput values.
// You can construct a concrete instance of `ByoIpPrefixMapInput` via:
//
//	ByoIpPrefixMap{ "key": ByoIpPrefixArgs{...} }
type ByoIpPrefixMapInput interface {
	pulumi.Input

	ToByoIpPrefixMapOutput() ByoIpPrefixMapOutput
	ToByoIpPrefixMapOutputWithContext(context.Context) ByoIpPrefixMapOutput
}

type ByoIpPrefixMap map[string]ByoIpPrefixInput

func (ByoIpPrefixMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ByoIpPrefix)(nil)).Elem()
}

func (i ByoIpPrefixMap) ToByoIpPrefixMapOutput() ByoIpPrefixMapOutput {
	return i.ToByoIpPrefixMapOutputWithContext(context.Background())
}

func (i ByoIpPrefixMap) ToByoIpPrefixMapOutputWithContext(ctx context.Context) ByoIpPrefixMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ByoIpPrefixMapOutput)
}

type ByoIpPrefixOutput struct{ *pulumi.OutputState }

func (ByoIpPrefixOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ByoIpPrefix)(nil)).Elem()
}

func (o ByoIpPrefixOutput) ToByoIpPrefixOutput() ByoIpPrefixOutput {
	return o
}

func (o ByoIpPrefixOutput) ToByoIpPrefixOutputWithContext(ctx context.Context) ByoIpPrefixOutput {
	return o
}

// The account identifier to target for the resource.
func (o ByoIpPrefixOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *ByoIpPrefix) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// Whether or not the prefix shall be announced. A prefix can be activated or deactivated once every 15 minutes (attempting more regular updates will trigger rate limiting). Available values: `on`, `off`.
func (o ByoIpPrefixOutput) Advertisement() pulumi.StringOutput {
	return o.ApplyT(func(v *ByoIpPrefix) pulumi.StringOutput { return v.Advertisement }).(pulumi.StringOutput)
}

// Description of the BYO IP prefix.
func (o ByoIpPrefixOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *ByoIpPrefix) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// The assigned Bring-Your-Own-IP prefix ID. **Modifying this attribute will force creation of a new resource.**
func (o ByoIpPrefixOutput) PrefixId() pulumi.StringOutput {
	return o.ApplyT(func(v *ByoIpPrefix) pulumi.StringOutput { return v.PrefixId }).(pulumi.StringOutput)
}

type ByoIpPrefixArrayOutput struct{ *pulumi.OutputState }

func (ByoIpPrefixArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ByoIpPrefix)(nil)).Elem()
}

func (o ByoIpPrefixArrayOutput) ToByoIpPrefixArrayOutput() ByoIpPrefixArrayOutput {
	return o
}

func (o ByoIpPrefixArrayOutput) ToByoIpPrefixArrayOutputWithContext(ctx context.Context) ByoIpPrefixArrayOutput {
	return o
}

func (o ByoIpPrefixArrayOutput) Index(i pulumi.IntInput) ByoIpPrefixOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ByoIpPrefix {
		return vs[0].([]*ByoIpPrefix)[vs[1].(int)]
	}).(ByoIpPrefixOutput)
}

type ByoIpPrefixMapOutput struct{ *pulumi.OutputState }

func (ByoIpPrefixMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ByoIpPrefix)(nil)).Elem()
}

func (o ByoIpPrefixMapOutput) ToByoIpPrefixMapOutput() ByoIpPrefixMapOutput {
	return o
}

func (o ByoIpPrefixMapOutput) ToByoIpPrefixMapOutputWithContext(ctx context.Context) ByoIpPrefixMapOutput {
	return o
}

func (o ByoIpPrefixMapOutput) MapIndex(k pulumi.StringInput) ByoIpPrefixOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ByoIpPrefix {
		return vs[0].(map[string]*ByoIpPrefix)[vs[1].(string)]
	}).(ByoIpPrefixOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ByoIpPrefixInput)(nil)).Elem(), &ByoIpPrefix{})
	pulumi.RegisterInputType(reflect.TypeOf((*ByoIpPrefixArrayInput)(nil)).Elem(), ByoIpPrefixArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ByoIpPrefixMapInput)(nil)).Elem(), ByoIpPrefixMap{})
	pulumi.RegisterOutputType(ByoIpPrefixOutput{})
	pulumi.RegisterOutputType(ByoIpPrefixArrayOutput{})
	pulumi.RegisterOutputType(ByoIpPrefixMapOutput{})
}
