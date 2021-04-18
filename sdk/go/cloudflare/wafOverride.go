// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cloudflare WAF override resource. This enables the ability to toggle
// WAF rules and groups on or off based on URIs.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-cloudflare/sdk/v3/go/cloudflare"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := cloudflare.NewWafOverride(ctx, "shopEcxample", &cloudflare.WafOverrideArgs{
// 			ZoneId: pulumi.String("1d5fdc9e88c8a8c4518b068cd94331fe"),
// 			Urls: pulumi.StringArray{
// 				pulumi.String("example.com/no-waf-here"),
// 				pulumi.String("example.com/another/path/*"),
// 			},
// 			Rules: pulumi.StringMap{
// 				"100015": pulumi.String("disable"),
// 			},
// 			Groups: pulumi.StringMap{
// 				"ea8687e59929c1fd05ba97574ad43f77": pulumi.String("default"),
// 			},
// 			RewriteAction: pulumi.StringMap{
// 				"default":   pulumi.String("block"),
// 				"challenge": pulumi.String("block"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// WAF Overrides can be imported using a composite ID formed of zone ID and override ID.
//
// ```sh
//  $ pulumi import cloudflare:index/wafOverride:WafOverride my_example_waf_override 3abe5b950053dbddf1516d89f9ef1e8a/9d4e66d7649c178663bf62e06dbacb23
// ```
type WafOverride struct {
	pulumi.CustomResourceState

	// Description of what the WAF override does.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Similar to `rules`; which WAF groups you want to alter.
	Groups     pulumi.StringMapOutput `pulumi:"groups"`
	OverrideId pulumi.StringOutput    `pulumi:"overrideId"`
	// Whether this package is currently paused.
	Paused pulumi.BoolPtrOutput `pulumi:"paused"`
	// Relative priority of this configuration when multiple configurations match a single URL.
	Priority pulumi.IntPtrOutput `pulumi:"priority"`
	// When a WAF rule matches, substitute its configured action for a different action specified by this definition.
	RewriteAction pulumi.StringMapOutput `pulumi:"rewriteAction"`
	// A list of WAF rule ID to rule action you intend to apply.
	Rules pulumi.StringMapOutput `pulumi:"rules"`
	// An array of URLs to apply the WAF override to.
	Urls pulumi.StringArrayOutput `pulumi:"urls"`
	// The DNS zone to which the WAF override condition should be added.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewWafOverride registers a new resource with the given unique name, arguments, and options.
func NewWafOverride(ctx *pulumi.Context,
	name string, args *WafOverrideArgs, opts ...pulumi.ResourceOption) (*WafOverride, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Rules == nil {
		return nil, errors.New("invalid value for required argument 'Rules'")
	}
	if args.Urls == nil {
		return nil, errors.New("invalid value for required argument 'Urls'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	var resource WafOverride
	err := ctx.RegisterResource("cloudflare:index/wafOverride:WafOverride", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWafOverride gets an existing WafOverride resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWafOverride(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WafOverrideState, opts ...pulumi.ResourceOption) (*WafOverride, error) {
	var resource WafOverride
	err := ctx.ReadResource("cloudflare:index/wafOverride:WafOverride", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WafOverride resources.
type wafOverrideState struct {
	// Description of what the WAF override does.
	Description *string `pulumi:"description"`
	// Similar to `rules`; which WAF groups you want to alter.
	Groups     map[string]string `pulumi:"groups"`
	OverrideId *string           `pulumi:"overrideId"`
	// Whether this package is currently paused.
	Paused *bool `pulumi:"paused"`
	// Relative priority of this configuration when multiple configurations match a single URL.
	Priority *int `pulumi:"priority"`
	// When a WAF rule matches, substitute its configured action for a different action specified by this definition.
	RewriteAction map[string]string `pulumi:"rewriteAction"`
	// A list of WAF rule ID to rule action you intend to apply.
	Rules map[string]string `pulumi:"rules"`
	// An array of URLs to apply the WAF override to.
	Urls []string `pulumi:"urls"`
	// The DNS zone to which the WAF override condition should be added.
	ZoneId *string `pulumi:"zoneId"`
}

type WafOverrideState struct {
	// Description of what the WAF override does.
	Description pulumi.StringPtrInput
	// Similar to `rules`; which WAF groups you want to alter.
	Groups     pulumi.StringMapInput
	OverrideId pulumi.StringPtrInput
	// Whether this package is currently paused.
	Paused pulumi.BoolPtrInput
	// Relative priority of this configuration when multiple configurations match a single URL.
	Priority pulumi.IntPtrInput
	// When a WAF rule matches, substitute its configured action for a different action specified by this definition.
	RewriteAction pulumi.StringMapInput
	// A list of WAF rule ID to rule action you intend to apply.
	Rules pulumi.StringMapInput
	// An array of URLs to apply the WAF override to.
	Urls pulumi.StringArrayInput
	// The DNS zone to which the WAF override condition should be added.
	ZoneId pulumi.StringPtrInput
}

func (WafOverrideState) ElementType() reflect.Type {
	return reflect.TypeOf((*wafOverrideState)(nil)).Elem()
}

type wafOverrideArgs struct {
	// Description of what the WAF override does.
	Description *string `pulumi:"description"`
	// Similar to `rules`; which WAF groups you want to alter.
	Groups map[string]string `pulumi:"groups"`
	// Whether this package is currently paused.
	Paused *bool `pulumi:"paused"`
	// Relative priority of this configuration when multiple configurations match a single URL.
	Priority *int `pulumi:"priority"`
	// When a WAF rule matches, substitute its configured action for a different action specified by this definition.
	RewriteAction map[string]string `pulumi:"rewriteAction"`
	// A list of WAF rule ID to rule action you intend to apply.
	Rules map[string]string `pulumi:"rules"`
	// An array of URLs to apply the WAF override to.
	Urls []string `pulumi:"urls"`
	// The DNS zone to which the WAF override condition should be added.
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a WafOverride resource.
type WafOverrideArgs struct {
	// Description of what the WAF override does.
	Description pulumi.StringPtrInput
	// Similar to `rules`; which WAF groups you want to alter.
	Groups pulumi.StringMapInput
	// Whether this package is currently paused.
	Paused pulumi.BoolPtrInput
	// Relative priority of this configuration when multiple configurations match a single URL.
	Priority pulumi.IntPtrInput
	// When a WAF rule matches, substitute its configured action for a different action specified by this definition.
	RewriteAction pulumi.StringMapInput
	// A list of WAF rule ID to rule action you intend to apply.
	Rules pulumi.StringMapInput
	// An array of URLs to apply the WAF override to.
	Urls pulumi.StringArrayInput
	// The DNS zone to which the WAF override condition should be added.
	ZoneId pulumi.StringInput
}

func (WafOverrideArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*wafOverrideArgs)(nil)).Elem()
}

type WafOverrideInput interface {
	pulumi.Input

	ToWafOverrideOutput() WafOverrideOutput
	ToWafOverrideOutputWithContext(ctx context.Context) WafOverrideOutput
}

func (*WafOverride) ElementType() reflect.Type {
	return reflect.TypeOf((*WafOverride)(nil))
}

func (i *WafOverride) ToWafOverrideOutput() WafOverrideOutput {
	return i.ToWafOverrideOutputWithContext(context.Background())
}

func (i *WafOverride) ToWafOverrideOutputWithContext(ctx context.Context) WafOverrideOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WafOverrideOutput)
}

func (i *WafOverride) ToWafOverridePtrOutput() WafOverridePtrOutput {
	return i.ToWafOverridePtrOutputWithContext(context.Background())
}

func (i *WafOverride) ToWafOverridePtrOutputWithContext(ctx context.Context) WafOverridePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WafOverridePtrOutput)
}

type WafOverridePtrInput interface {
	pulumi.Input

	ToWafOverridePtrOutput() WafOverridePtrOutput
	ToWafOverridePtrOutputWithContext(ctx context.Context) WafOverridePtrOutput
}

type wafOverridePtrType WafOverrideArgs

func (*wafOverridePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**WafOverride)(nil))
}

func (i *wafOverridePtrType) ToWafOverridePtrOutput() WafOverridePtrOutput {
	return i.ToWafOverridePtrOutputWithContext(context.Background())
}

func (i *wafOverridePtrType) ToWafOverridePtrOutputWithContext(ctx context.Context) WafOverridePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WafOverridePtrOutput)
}

// WafOverrideArrayInput is an input type that accepts WafOverrideArray and WafOverrideArrayOutput values.
// You can construct a concrete instance of `WafOverrideArrayInput` via:
//
//          WafOverrideArray{ WafOverrideArgs{...} }
type WafOverrideArrayInput interface {
	pulumi.Input

	ToWafOverrideArrayOutput() WafOverrideArrayOutput
	ToWafOverrideArrayOutputWithContext(context.Context) WafOverrideArrayOutput
}

type WafOverrideArray []WafOverrideInput

func (WafOverrideArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*WafOverride)(nil))
}

func (i WafOverrideArray) ToWafOverrideArrayOutput() WafOverrideArrayOutput {
	return i.ToWafOverrideArrayOutputWithContext(context.Background())
}

func (i WafOverrideArray) ToWafOverrideArrayOutputWithContext(ctx context.Context) WafOverrideArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WafOverrideArrayOutput)
}

// WafOverrideMapInput is an input type that accepts WafOverrideMap and WafOverrideMapOutput values.
// You can construct a concrete instance of `WafOverrideMapInput` via:
//
//          WafOverrideMap{ "key": WafOverrideArgs{...} }
type WafOverrideMapInput interface {
	pulumi.Input

	ToWafOverrideMapOutput() WafOverrideMapOutput
	ToWafOverrideMapOutputWithContext(context.Context) WafOverrideMapOutput
}

type WafOverrideMap map[string]WafOverrideInput

func (WafOverrideMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*WafOverride)(nil))
}

func (i WafOverrideMap) ToWafOverrideMapOutput() WafOverrideMapOutput {
	return i.ToWafOverrideMapOutputWithContext(context.Background())
}

func (i WafOverrideMap) ToWafOverrideMapOutputWithContext(ctx context.Context) WafOverrideMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WafOverrideMapOutput)
}

type WafOverrideOutput struct {
	*pulumi.OutputState
}

func (WafOverrideOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*WafOverride)(nil))
}

func (o WafOverrideOutput) ToWafOverrideOutput() WafOverrideOutput {
	return o
}

func (o WafOverrideOutput) ToWafOverrideOutputWithContext(ctx context.Context) WafOverrideOutput {
	return o
}

func (o WafOverrideOutput) ToWafOverridePtrOutput() WafOverridePtrOutput {
	return o.ToWafOverridePtrOutputWithContext(context.Background())
}

func (o WafOverrideOutput) ToWafOverridePtrOutputWithContext(ctx context.Context) WafOverridePtrOutput {
	return o.ApplyT(func(v WafOverride) *WafOverride {
		return &v
	}).(WafOverridePtrOutput)
}

type WafOverridePtrOutput struct {
	*pulumi.OutputState
}

func (WafOverridePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**WafOverride)(nil))
}

func (o WafOverridePtrOutput) ToWafOverridePtrOutput() WafOverridePtrOutput {
	return o
}

func (o WafOverridePtrOutput) ToWafOverridePtrOutputWithContext(ctx context.Context) WafOverridePtrOutput {
	return o
}

type WafOverrideArrayOutput struct{ *pulumi.OutputState }

func (WafOverrideArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]WafOverride)(nil))
}

func (o WafOverrideArrayOutput) ToWafOverrideArrayOutput() WafOverrideArrayOutput {
	return o
}

func (o WafOverrideArrayOutput) ToWafOverrideArrayOutputWithContext(ctx context.Context) WafOverrideArrayOutput {
	return o
}

func (o WafOverrideArrayOutput) Index(i pulumi.IntInput) WafOverrideOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) WafOverride {
		return vs[0].([]WafOverride)[vs[1].(int)]
	}).(WafOverrideOutput)
}

type WafOverrideMapOutput struct{ *pulumi.OutputState }

func (WafOverrideMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]WafOverride)(nil))
}

func (o WafOverrideMapOutput) ToWafOverrideMapOutput() WafOverrideMapOutput {
	return o
}

func (o WafOverrideMapOutput) ToWafOverrideMapOutputWithContext(ctx context.Context) WafOverrideMapOutput {
	return o
}

func (o WafOverrideMapOutput) MapIndex(k pulumi.StringInput) WafOverrideOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) WafOverride {
		return vs[0].(map[string]WafOverride)[vs[1].(string)]
	}).(WafOverrideOutput)
}

func init() {
	pulumi.RegisterOutputType(WafOverrideOutput{})
	pulumi.RegisterOutputType(WafOverridePtrOutput{})
	pulumi.RegisterOutputType(WafOverrideArrayOutput{})
	pulumi.RegisterOutputType(WafOverrideMapOutput{})
}
