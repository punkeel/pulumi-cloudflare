// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a resource for managing Email Routing settings.
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
//			_, err := cloudflare.NewEmailRoutingSettings(ctx, "myZone", &cloudflare.EmailRoutingSettingsArgs{
//				Enabled: pulumi.Bool(true),
//				ZoneId:  pulumi.String("0da42c8d2132a9ddaf714f9e7c920711"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type EmailRoutingSettings struct {
	pulumi.CustomResourceState

	// The date and time the settings have been created.
	Created pulumi.StringOutput `pulumi:"created"`
	// State of the zone settings for Email Routing. **Modifying this attribute will force creation of a new resource.**
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// The date and time the settings have been modified.
	Modified pulumi.StringOutput `pulumi:"modified"`
	// Domain of your zone.
	Name pulumi.StringOutput `pulumi:"name"`
	// Flag to check if the user skipped the configuration wizard.
	SkipWizard pulumi.BoolOutput `pulumi:"skipWizard"`
	// Show the state of your account, and the type or configuration error.
	Status pulumi.StringOutput `pulumi:"status"`
	// Email Routing settings identifier.
	Tag pulumi.StringOutput `pulumi:"tag"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewEmailRoutingSettings registers a new resource with the given unique name, arguments, and options.
func NewEmailRoutingSettings(ctx *pulumi.Context,
	name string, args *EmailRoutingSettingsArgs, opts ...pulumi.ResourceOption) (*EmailRoutingSettings, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Enabled == nil {
		return nil, errors.New("invalid value for required argument 'Enabled'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	var resource EmailRoutingSettings
	err := ctx.RegisterResource("cloudflare:index/emailRoutingSettings:EmailRoutingSettings", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEmailRoutingSettings gets an existing EmailRoutingSettings resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEmailRoutingSettings(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EmailRoutingSettingsState, opts ...pulumi.ResourceOption) (*EmailRoutingSettings, error) {
	var resource EmailRoutingSettings
	err := ctx.ReadResource("cloudflare:index/emailRoutingSettings:EmailRoutingSettings", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EmailRoutingSettings resources.
type emailRoutingSettingsState struct {
	// The date and time the settings have been created.
	Created *string `pulumi:"created"`
	// State of the zone settings for Email Routing. **Modifying this attribute will force creation of a new resource.**
	Enabled *bool `pulumi:"enabled"`
	// The date and time the settings have been modified.
	Modified *string `pulumi:"modified"`
	// Domain of your zone.
	Name *string `pulumi:"name"`
	// Flag to check if the user skipped the configuration wizard.
	SkipWizard *bool `pulumi:"skipWizard"`
	// Show the state of your account, and the type or configuration error.
	Status *string `pulumi:"status"`
	// Email Routing settings identifier.
	Tag *string `pulumi:"tag"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId *string `pulumi:"zoneId"`
}

type EmailRoutingSettingsState struct {
	// The date and time the settings have been created.
	Created pulumi.StringPtrInput
	// State of the zone settings for Email Routing. **Modifying this attribute will force creation of a new resource.**
	Enabled pulumi.BoolPtrInput
	// The date and time the settings have been modified.
	Modified pulumi.StringPtrInput
	// Domain of your zone.
	Name pulumi.StringPtrInput
	// Flag to check if the user skipped the configuration wizard.
	SkipWizard pulumi.BoolPtrInput
	// Show the state of your account, and the type or configuration error.
	Status pulumi.StringPtrInput
	// Email Routing settings identifier.
	Tag pulumi.StringPtrInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringPtrInput
}

func (EmailRoutingSettingsState) ElementType() reflect.Type {
	return reflect.TypeOf((*emailRoutingSettingsState)(nil)).Elem()
}

type emailRoutingSettingsArgs struct {
	// State of the zone settings for Email Routing. **Modifying this attribute will force creation of a new resource.**
	Enabled bool `pulumi:"enabled"`
	// Flag to check if the user skipped the configuration wizard.
	SkipWizard *bool `pulumi:"skipWizard"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a EmailRoutingSettings resource.
type EmailRoutingSettingsArgs struct {
	// State of the zone settings for Email Routing. **Modifying this attribute will force creation of a new resource.**
	Enabled pulumi.BoolInput
	// Flag to check if the user skipped the configuration wizard.
	SkipWizard pulumi.BoolPtrInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringInput
}

func (EmailRoutingSettingsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*emailRoutingSettingsArgs)(nil)).Elem()
}

type EmailRoutingSettingsInput interface {
	pulumi.Input

	ToEmailRoutingSettingsOutput() EmailRoutingSettingsOutput
	ToEmailRoutingSettingsOutputWithContext(ctx context.Context) EmailRoutingSettingsOutput
}

func (*EmailRoutingSettings) ElementType() reflect.Type {
	return reflect.TypeOf((**EmailRoutingSettings)(nil)).Elem()
}

func (i *EmailRoutingSettings) ToEmailRoutingSettingsOutput() EmailRoutingSettingsOutput {
	return i.ToEmailRoutingSettingsOutputWithContext(context.Background())
}

func (i *EmailRoutingSettings) ToEmailRoutingSettingsOutputWithContext(ctx context.Context) EmailRoutingSettingsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EmailRoutingSettingsOutput)
}

// EmailRoutingSettingsArrayInput is an input type that accepts EmailRoutingSettingsArray and EmailRoutingSettingsArrayOutput values.
// You can construct a concrete instance of `EmailRoutingSettingsArrayInput` via:
//
//	EmailRoutingSettingsArray{ EmailRoutingSettingsArgs{...} }
type EmailRoutingSettingsArrayInput interface {
	pulumi.Input

	ToEmailRoutingSettingsArrayOutput() EmailRoutingSettingsArrayOutput
	ToEmailRoutingSettingsArrayOutputWithContext(context.Context) EmailRoutingSettingsArrayOutput
}

type EmailRoutingSettingsArray []EmailRoutingSettingsInput

func (EmailRoutingSettingsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EmailRoutingSettings)(nil)).Elem()
}

func (i EmailRoutingSettingsArray) ToEmailRoutingSettingsArrayOutput() EmailRoutingSettingsArrayOutput {
	return i.ToEmailRoutingSettingsArrayOutputWithContext(context.Background())
}

func (i EmailRoutingSettingsArray) ToEmailRoutingSettingsArrayOutputWithContext(ctx context.Context) EmailRoutingSettingsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EmailRoutingSettingsArrayOutput)
}

// EmailRoutingSettingsMapInput is an input type that accepts EmailRoutingSettingsMap and EmailRoutingSettingsMapOutput values.
// You can construct a concrete instance of `EmailRoutingSettingsMapInput` via:
//
//	EmailRoutingSettingsMap{ "key": EmailRoutingSettingsArgs{...} }
type EmailRoutingSettingsMapInput interface {
	pulumi.Input

	ToEmailRoutingSettingsMapOutput() EmailRoutingSettingsMapOutput
	ToEmailRoutingSettingsMapOutputWithContext(context.Context) EmailRoutingSettingsMapOutput
}

type EmailRoutingSettingsMap map[string]EmailRoutingSettingsInput

func (EmailRoutingSettingsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EmailRoutingSettings)(nil)).Elem()
}

func (i EmailRoutingSettingsMap) ToEmailRoutingSettingsMapOutput() EmailRoutingSettingsMapOutput {
	return i.ToEmailRoutingSettingsMapOutputWithContext(context.Background())
}

func (i EmailRoutingSettingsMap) ToEmailRoutingSettingsMapOutputWithContext(ctx context.Context) EmailRoutingSettingsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EmailRoutingSettingsMapOutput)
}

type EmailRoutingSettingsOutput struct{ *pulumi.OutputState }

func (EmailRoutingSettingsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EmailRoutingSettings)(nil)).Elem()
}

func (o EmailRoutingSettingsOutput) ToEmailRoutingSettingsOutput() EmailRoutingSettingsOutput {
	return o
}

func (o EmailRoutingSettingsOutput) ToEmailRoutingSettingsOutputWithContext(ctx context.Context) EmailRoutingSettingsOutput {
	return o
}

// The date and time the settings have been created.
func (o EmailRoutingSettingsOutput) Created() pulumi.StringOutput {
	return o.ApplyT(func(v *EmailRoutingSettings) pulumi.StringOutput { return v.Created }).(pulumi.StringOutput)
}

// State of the zone settings for Email Routing. **Modifying this attribute will force creation of a new resource.**
func (o EmailRoutingSettingsOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *EmailRoutingSettings) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// The date and time the settings have been modified.
func (o EmailRoutingSettingsOutput) Modified() pulumi.StringOutput {
	return o.ApplyT(func(v *EmailRoutingSettings) pulumi.StringOutput { return v.Modified }).(pulumi.StringOutput)
}

// Domain of your zone.
func (o EmailRoutingSettingsOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *EmailRoutingSettings) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Flag to check if the user skipped the configuration wizard.
func (o EmailRoutingSettingsOutput) SkipWizard() pulumi.BoolOutput {
	return o.ApplyT(func(v *EmailRoutingSettings) pulumi.BoolOutput { return v.SkipWizard }).(pulumi.BoolOutput)
}

// Show the state of your account, and the type or configuration error.
func (o EmailRoutingSettingsOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *EmailRoutingSettings) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// Email Routing settings identifier.
func (o EmailRoutingSettingsOutput) Tag() pulumi.StringOutput {
	return o.ApplyT(func(v *EmailRoutingSettings) pulumi.StringOutput { return v.Tag }).(pulumi.StringOutput)
}

// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
func (o EmailRoutingSettingsOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *EmailRoutingSettings) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type EmailRoutingSettingsArrayOutput struct{ *pulumi.OutputState }

func (EmailRoutingSettingsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EmailRoutingSettings)(nil)).Elem()
}

func (o EmailRoutingSettingsArrayOutput) ToEmailRoutingSettingsArrayOutput() EmailRoutingSettingsArrayOutput {
	return o
}

func (o EmailRoutingSettingsArrayOutput) ToEmailRoutingSettingsArrayOutputWithContext(ctx context.Context) EmailRoutingSettingsArrayOutput {
	return o
}

func (o EmailRoutingSettingsArrayOutput) Index(i pulumi.IntInput) EmailRoutingSettingsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EmailRoutingSettings {
		return vs[0].([]*EmailRoutingSettings)[vs[1].(int)]
	}).(EmailRoutingSettingsOutput)
}

type EmailRoutingSettingsMapOutput struct{ *pulumi.OutputState }

func (EmailRoutingSettingsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EmailRoutingSettings)(nil)).Elem()
}

func (o EmailRoutingSettingsMapOutput) ToEmailRoutingSettingsMapOutput() EmailRoutingSettingsMapOutput {
	return o
}

func (o EmailRoutingSettingsMapOutput) ToEmailRoutingSettingsMapOutputWithContext(ctx context.Context) EmailRoutingSettingsMapOutput {
	return o
}

func (o EmailRoutingSettingsMapOutput) MapIndex(k pulumi.StringInput) EmailRoutingSettingsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EmailRoutingSettings {
		return vs[0].(map[string]*EmailRoutingSettings)[vs[1].(string)]
	}).(EmailRoutingSettingsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EmailRoutingSettingsInput)(nil)).Elem(), &EmailRoutingSettings{})
	pulumi.RegisterInputType(reflect.TypeOf((*EmailRoutingSettingsArrayInput)(nil)).Elem(), EmailRoutingSettingsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EmailRoutingSettingsMapInput)(nil)).Elem(), EmailRoutingSettingsMap{})
	pulumi.RegisterOutputType(EmailRoutingSettingsOutput{})
	pulumi.RegisterOutputType(EmailRoutingSettingsArrayOutput{})
	pulumi.RegisterOutputType(EmailRoutingSettingsMapOutput{})
}
