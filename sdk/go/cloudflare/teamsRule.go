// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cloudflare Teams rule resource. Teams rules comprise secure web gateway policies.
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
// 		_, err := cloudflare.NewTeamsRule(ctx, "rule1", &cloudflare.TeamsRuleArgs{
// 			AccountId:   pulumi.String("1d5fdc9e88c8a8c4518b068cd94331fe"),
// 			Action:      pulumi.String("l4_override"),
// 			Description: pulumi.String("desc"),
// 			Filters: pulumi.StringArray{
// 				pulumi.String("l4"),
// 			},
// 			Name:       pulumi.String("office"),
// 			Precedence: pulumi.Int(1),
// 			RuleSettings: &cloudflare.TeamsRuleRuleSettingsArgs{
// 				BlockPageEnabled: pulumi.Bool(false),
// 				BlockPageReason:  pulumi.String("access not permitted"),
// 				L4override: &cloudflare.TeamsRuleRuleSettingsL4overrideArgs{
// 					Ip:   pulumi.String("192.0.2.1"),
// 					Port: pulumi.Int(1234),
// 				},
// 			},
// 			Traffic: pulumi.String("any(dns.domains[*] == \"com.example\")"),
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
// Teams Rules can be imported using a composite ID formed of account ID and teams rule ID.
//
// ```sh
//  $ pulumi import cloudflare:index/teamsRule:TeamsRule rule1 cb029e245cfdd66dc8d2e570d5dd3322/d41d8cd98f00b204e9800998ecf8427e
// ```
type TeamsRule struct {
	pulumi.CustomResourceState

	// The account to which the teams rule should be added.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// The action executed by matched teams rule.
	Action pulumi.StringOutput `pulumi:"action"`
	// The description of the teams rule.
	Description pulumi.StringOutput `pulumi:"description"`
	// Indicator of rule enablement.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// The protocol or layer to evaluate the traffic and identity expressions.
	Filters pulumi.StringArrayOutput `pulumi:"filters"`
	// The wirefilter expression to be used for identity matching.
	Identity pulumi.StringPtrOutput `pulumi:"identity"`
	// The name of the teams rule.
	Name pulumi.StringOutput `pulumi:"name"`
	// The evaluation precedence of the teams rule.
	Precedence pulumi.IntOutput `pulumi:"precedence"`
	// Additional rule settings.
	RuleSettings TeamsRuleRuleSettingsPtrOutput `pulumi:"ruleSettings"`
	// The wirefilter expression to be used for traffic matching.
	Traffic pulumi.StringPtrOutput `pulumi:"traffic"`
	Version pulumi.IntOutput       `pulumi:"version"`
}

// NewTeamsRule registers a new resource with the given unique name, arguments, and options.
func NewTeamsRule(ctx *pulumi.Context,
	name string, args *TeamsRuleArgs, opts ...pulumi.ResourceOption) (*TeamsRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.Action == nil {
		return nil, errors.New("invalid value for required argument 'Action'")
	}
	if args.Description == nil {
		return nil, errors.New("invalid value for required argument 'Description'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	if args.Precedence == nil {
		return nil, errors.New("invalid value for required argument 'Precedence'")
	}
	var resource TeamsRule
	err := ctx.RegisterResource("cloudflare:index/teamsRule:TeamsRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTeamsRule gets an existing TeamsRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTeamsRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TeamsRuleState, opts ...pulumi.ResourceOption) (*TeamsRule, error) {
	var resource TeamsRule
	err := ctx.ReadResource("cloudflare:index/teamsRule:TeamsRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TeamsRule resources.
type teamsRuleState struct {
	// The account to which the teams rule should be added.
	AccountId *string `pulumi:"accountId"`
	// The action executed by matched teams rule.
	Action *string `pulumi:"action"`
	// The description of the teams rule.
	Description *string `pulumi:"description"`
	// Indicator of rule enablement.
	Enabled *bool `pulumi:"enabled"`
	// The protocol or layer to evaluate the traffic and identity expressions.
	Filters []string `pulumi:"filters"`
	// The wirefilter expression to be used for identity matching.
	Identity *string `pulumi:"identity"`
	// The name of the teams rule.
	Name *string `pulumi:"name"`
	// The evaluation precedence of the teams rule.
	Precedence *int `pulumi:"precedence"`
	// Additional rule settings.
	RuleSettings *TeamsRuleRuleSettings `pulumi:"ruleSettings"`
	// The wirefilter expression to be used for traffic matching.
	Traffic *string `pulumi:"traffic"`
	Version *int    `pulumi:"version"`
}

type TeamsRuleState struct {
	// The account to which the teams rule should be added.
	AccountId pulumi.StringPtrInput
	// The action executed by matched teams rule.
	Action pulumi.StringPtrInput
	// The description of the teams rule.
	Description pulumi.StringPtrInput
	// Indicator of rule enablement.
	Enabled pulumi.BoolPtrInput
	// The protocol or layer to evaluate the traffic and identity expressions.
	Filters pulumi.StringArrayInput
	// The wirefilter expression to be used for identity matching.
	Identity pulumi.StringPtrInput
	// The name of the teams rule.
	Name pulumi.StringPtrInput
	// The evaluation precedence of the teams rule.
	Precedence pulumi.IntPtrInput
	// Additional rule settings.
	RuleSettings TeamsRuleRuleSettingsPtrInput
	// The wirefilter expression to be used for traffic matching.
	Traffic pulumi.StringPtrInput
	Version pulumi.IntPtrInput
}

func (TeamsRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*teamsRuleState)(nil)).Elem()
}

type teamsRuleArgs struct {
	// The account to which the teams rule should be added.
	AccountId string `pulumi:"accountId"`
	// The action executed by matched teams rule.
	Action string `pulumi:"action"`
	// The description of the teams rule.
	Description string `pulumi:"description"`
	// Indicator of rule enablement.
	Enabled *bool `pulumi:"enabled"`
	// The protocol or layer to evaluate the traffic and identity expressions.
	Filters []string `pulumi:"filters"`
	// The wirefilter expression to be used for identity matching.
	Identity *string `pulumi:"identity"`
	// The name of the teams rule.
	Name string `pulumi:"name"`
	// The evaluation precedence of the teams rule.
	Precedence int `pulumi:"precedence"`
	// Additional rule settings.
	RuleSettings *TeamsRuleRuleSettings `pulumi:"ruleSettings"`
	// The wirefilter expression to be used for traffic matching.
	Traffic *string `pulumi:"traffic"`
}

// The set of arguments for constructing a TeamsRule resource.
type TeamsRuleArgs struct {
	// The account to which the teams rule should be added.
	AccountId pulumi.StringInput
	// The action executed by matched teams rule.
	Action pulumi.StringInput
	// The description of the teams rule.
	Description pulumi.StringInput
	// Indicator of rule enablement.
	Enabled pulumi.BoolPtrInput
	// The protocol or layer to evaluate the traffic and identity expressions.
	Filters pulumi.StringArrayInput
	// The wirefilter expression to be used for identity matching.
	Identity pulumi.StringPtrInput
	// The name of the teams rule.
	Name pulumi.StringInput
	// The evaluation precedence of the teams rule.
	Precedence pulumi.IntInput
	// Additional rule settings.
	RuleSettings TeamsRuleRuleSettingsPtrInput
	// The wirefilter expression to be used for traffic matching.
	Traffic pulumi.StringPtrInput
}

func (TeamsRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*teamsRuleArgs)(nil)).Elem()
}

type TeamsRuleInput interface {
	pulumi.Input

	ToTeamsRuleOutput() TeamsRuleOutput
	ToTeamsRuleOutputWithContext(ctx context.Context) TeamsRuleOutput
}

func (*TeamsRule) ElementType() reflect.Type {
	return reflect.TypeOf((*TeamsRule)(nil))
}

func (i *TeamsRule) ToTeamsRuleOutput() TeamsRuleOutput {
	return i.ToTeamsRuleOutputWithContext(context.Background())
}

func (i *TeamsRule) ToTeamsRuleOutputWithContext(ctx context.Context) TeamsRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamsRuleOutput)
}

func (i *TeamsRule) ToTeamsRulePtrOutput() TeamsRulePtrOutput {
	return i.ToTeamsRulePtrOutputWithContext(context.Background())
}

func (i *TeamsRule) ToTeamsRulePtrOutputWithContext(ctx context.Context) TeamsRulePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamsRulePtrOutput)
}

type TeamsRulePtrInput interface {
	pulumi.Input

	ToTeamsRulePtrOutput() TeamsRulePtrOutput
	ToTeamsRulePtrOutputWithContext(ctx context.Context) TeamsRulePtrOutput
}

type teamsRulePtrType TeamsRuleArgs

func (*teamsRulePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**TeamsRule)(nil))
}

func (i *teamsRulePtrType) ToTeamsRulePtrOutput() TeamsRulePtrOutput {
	return i.ToTeamsRulePtrOutputWithContext(context.Background())
}

func (i *teamsRulePtrType) ToTeamsRulePtrOutputWithContext(ctx context.Context) TeamsRulePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamsRulePtrOutput)
}

// TeamsRuleArrayInput is an input type that accepts TeamsRuleArray and TeamsRuleArrayOutput values.
// You can construct a concrete instance of `TeamsRuleArrayInput` via:
//
//          TeamsRuleArray{ TeamsRuleArgs{...} }
type TeamsRuleArrayInput interface {
	pulumi.Input

	ToTeamsRuleArrayOutput() TeamsRuleArrayOutput
	ToTeamsRuleArrayOutputWithContext(context.Context) TeamsRuleArrayOutput
}

type TeamsRuleArray []TeamsRuleInput

func (TeamsRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*TeamsRule)(nil))
}

func (i TeamsRuleArray) ToTeamsRuleArrayOutput() TeamsRuleArrayOutput {
	return i.ToTeamsRuleArrayOutputWithContext(context.Background())
}

func (i TeamsRuleArray) ToTeamsRuleArrayOutputWithContext(ctx context.Context) TeamsRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamsRuleArrayOutput)
}

// TeamsRuleMapInput is an input type that accepts TeamsRuleMap and TeamsRuleMapOutput values.
// You can construct a concrete instance of `TeamsRuleMapInput` via:
//
//          TeamsRuleMap{ "key": TeamsRuleArgs{...} }
type TeamsRuleMapInput interface {
	pulumi.Input

	ToTeamsRuleMapOutput() TeamsRuleMapOutput
	ToTeamsRuleMapOutputWithContext(context.Context) TeamsRuleMapOutput
}

type TeamsRuleMap map[string]TeamsRuleInput

func (TeamsRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*TeamsRule)(nil))
}

func (i TeamsRuleMap) ToTeamsRuleMapOutput() TeamsRuleMapOutput {
	return i.ToTeamsRuleMapOutputWithContext(context.Background())
}

func (i TeamsRuleMap) ToTeamsRuleMapOutputWithContext(ctx context.Context) TeamsRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamsRuleMapOutput)
}

type TeamsRuleOutput struct {
	*pulumi.OutputState
}

func (TeamsRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*TeamsRule)(nil))
}

func (o TeamsRuleOutput) ToTeamsRuleOutput() TeamsRuleOutput {
	return o
}

func (o TeamsRuleOutput) ToTeamsRuleOutputWithContext(ctx context.Context) TeamsRuleOutput {
	return o
}

func (o TeamsRuleOutput) ToTeamsRulePtrOutput() TeamsRulePtrOutput {
	return o.ToTeamsRulePtrOutputWithContext(context.Background())
}

func (o TeamsRuleOutput) ToTeamsRulePtrOutputWithContext(ctx context.Context) TeamsRulePtrOutput {
	return o.ApplyT(func(v TeamsRule) *TeamsRule {
		return &v
	}).(TeamsRulePtrOutput)
}

type TeamsRulePtrOutput struct {
	*pulumi.OutputState
}

func (TeamsRulePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TeamsRule)(nil))
}

func (o TeamsRulePtrOutput) ToTeamsRulePtrOutput() TeamsRulePtrOutput {
	return o
}

func (o TeamsRulePtrOutput) ToTeamsRulePtrOutputWithContext(ctx context.Context) TeamsRulePtrOutput {
	return o
}

type TeamsRuleArrayOutput struct{ *pulumi.OutputState }

func (TeamsRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]TeamsRule)(nil))
}

func (o TeamsRuleArrayOutput) ToTeamsRuleArrayOutput() TeamsRuleArrayOutput {
	return o
}

func (o TeamsRuleArrayOutput) ToTeamsRuleArrayOutputWithContext(ctx context.Context) TeamsRuleArrayOutput {
	return o
}

func (o TeamsRuleArrayOutput) Index(i pulumi.IntInput) TeamsRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) TeamsRule {
		return vs[0].([]TeamsRule)[vs[1].(int)]
	}).(TeamsRuleOutput)
}

type TeamsRuleMapOutput struct{ *pulumi.OutputState }

func (TeamsRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]TeamsRule)(nil))
}

func (o TeamsRuleMapOutput) ToTeamsRuleMapOutput() TeamsRuleMapOutput {
	return o
}

func (o TeamsRuleMapOutput) ToTeamsRuleMapOutputWithContext(ctx context.Context) TeamsRuleMapOutput {
	return o
}

func (o TeamsRuleMapOutput) MapIndex(k pulumi.StringInput) TeamsRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) TeamsRule {
		return vs[0].(map[string]TeamsRule)[vs[1].(string)]
	}).(TeamsRuleOutput)
}

func init() {
	pulumi.RegisterOutputType(TeamsRuleOutput{})
	pulumi.RegisterOutputType(TeamsRulePtrOutput{})
	pulumi.RegisterOutputType(TeamsRuleArrayOutput{})
	pulumi.RegisterOutputType(TeamsRuleMapOutput{})
}
