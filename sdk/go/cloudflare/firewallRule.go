// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package cloudflare

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Define Firewall rules using filter expressions for more control over how traffic is matched to the rule.
// A filter expression permits selecting traffic by multiple criteria allowing greater freedom in rule creation.
// 
// Filter expressions needs to be created first before using Firewall Rule. See Filter.
// 
// > This content is derived from https://github.com/terraform-providers/terraform-provider-cloudflare/blob/master/website/docs/r/firewall_rule.html.markdown.
type FirewallRule struct {
	pulumi.CustomResourceState

	// The action to apply to a matched request. Allowed values: "block", "challenge", "allow", "jsChallenge", "bypass". Enterprise plan also allows "log".
	Action pulumi.StringOutput `pulumi:"action"`
	// A description of the rule to help identify it.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	FilterId pulumi.StringOutput `pulumi:"filterId"`
	// Whether this filter based firewall rule is currently paused. Boolean value.
	Paused pulumi.BoolPtrOutput `pulumi:"paused"`
	// The priority of the rule to allow control of processing order. A lower number indicates high priority. If not provided, any rules with a priority will be sequenced before those without.
	Priority pulumi.IntPtrOutput `pulumi:"priority"`
	// List of products to bypass for a request when the bypass action is used. Allowed values: "zoneLockdown", "uaBlock", "bic", "hot", "securityLevel", "rateLimit", "waf".
	Products pulumi.StringArrayOutput `pulumi:"products"`
	// The DNS zone to which the Filter should be added.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewFirewallRule registers a new resource with the given unique name, arguments, and options.
func NewFirewallRule(ctx *pulumi.Context,
	name string, args *FirewallRuleArgs, opts ...pulumi.ResourceOption) (*FirewallRule, error) {
	if args == nil || args.Action == nil {
		return nil, errors.New("missing required argument 'Action'")
	}
	if args == nil || args.FilterId == nil {
		return nil, errors.New("missing required argument 'FilterId'")
	}
	if args == nil || args.ZoneId == nil {
		return nil, errors.New("missing required argument 'ZoneId'")
	}
	if args == nil {
		args = &FirewallRuleArgs{}
	}
	var resource FirewallRule
	err := ctx.RegisterResource("cloudflare:index/firewallRule:FirewallRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFirewallRule gets an existing FirewallRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFirewallRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FirewallRuleState, opts ...pulumi.ResourceOption) (*FirewallRule, error) {
	var resource FirewallRule
	err := ctx.ReadResource("cloudflare:index/firewallRule:FirewallRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FirewallRule resources.
type firewallRuleState struct {
	// The action to apply to a matched request. Allowed values: "block", "challenge", "allow", "jsChallenge", "bypass". Enterprise plan also allows "log".
	Action *string `pulumi:"action"`
	// A description of the rule to help identify it.
	Description *string `pulumi:"description"`
	FilterId *string `pulumi:"filterId"`
	// Whether this filter based firewall rule is currently paused. Boolean value.
	Paused *bool `pulumi:"paused"`
	// The priority of the rule to allow control of processing order. A lower number indicates high priority. If not provided, any rules with a priority will be sequenced before those without.
	Priority *int `pulumi:"priority"`
	// List of products to bypass for a request when the bypass action is used. Allowed values: "zoneLockdown", "uaBlock", "bic", "hot", "securityLevel", "rateLimit", "waf".
	Products []string `pulumi:"products"`
	// The DNS zone to which the Filter should be added.
	ZoneId *string `pulumi:"zoneId"`
}

type FirewallRuleState struct {
	// The action to apply to a matched request. Allowed values: "block", "challenge", "allow", "jsChallenge", "bypass". Enterprise plan also allows "log".
	Action pulumi.StringPtrInput
	// A description of the rule to help identify it.
	Description pulumi.StringPtrInput
	FilterId pulumi.StringPtrInput
	// Whether this filter based firewall rule is currently paused. Boolean value.
	Paused pulumi.BoolPtrInput
	// The priority of the rule to allow control of processing order. A lower number indicates high priority. If not provided, any rules with a priority will be sequenced before those without.
	Priority pulumi.IntPtrInput
	// List of products to bypass for a request when the bypass action is used. Allowed values: "zoneLockdown", "uaBlock", "bic", "hot", "securityLevel", "rateLimit", "waf".
	Products pulumi.StringArrayInput
	// The DNS zone to which the Filter should be added.
	ZoneId pulumi.StringPtrInput
}

func (FirewallRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*firewallRuleState)(nil)).Elem()
}

type firewallRuleArgs struct {
	// The action to apply to a matched request. Allowed values: "block", "challenge", "allow", "jsChallenge", "bypass". Enterprise plan also allows "log".
	Action string `pulumi:"action"`
	// A description of the rule to help identify it.
	Description *string `pulumi:"description"`
	FilterId string `pulumi:"filterId"`
	// Whether this filter based firewall rule is currently paused. Boolean value.
	Paused *bool `pulumi:"paused"`
	// The priority of the rule to allow control of processing order. A lower number indicates high priority. If not provided, any rules with a priority will be sequenced before those without.
	Priority *int `pulumi:"priority"`
	// List of products to bypass for a request when the bypass action is used. Allowed values: "zoneLockdown", "uaBlock", "bic", "hot", "securityLevel", "rateLimit", "waf".
	Products []string `pulumi:"products"`
	// The DNS zone to which the Filter should be added.
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a FirewallRule resource.
type FirewallRuleArgs struct {
	// The action to apply to a matched request. Allowed values: "block", "challenge", "allow", "jsChallenge", "bypass". Enterprise plan also allows "log".
	Action pulumi.StringInput
	// A description of the rule to help identify it.
	Description pulumi.StringPtrInput
	FilterId pulumi.StringInput
	// Whether this filter based firewall rule is currently paused. Boolean value.
	Paused pulumi.BoolPtrInput
	// The priority of the rule to allow control of processing order. A lower number indicates high priority. If not provided, any rules with a priority will be sequenced before those without.
	Priority pulumi.IntPtrInput
	// List of products to bypass for a request when the bypass action is used. Allowed values: "zoneLockdown", "uaBlock", "bic", "hot", "securityLevel", "rateLimit", "waf".
	Products pulumi.StringArrayInput
	// The DNS zone to which the Filter should be added.
	ZoneId pulumi.StringInput
}

func (FirewallRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*firewallRuleArgs)(nil)).Elem()
}

