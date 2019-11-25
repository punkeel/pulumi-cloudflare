// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a Cloudflare IP Firewall Access Rule resource. Access control can be applied on basis of IP addresses, IP ranges, AS numbers or countries.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-cloudflare/blob/master/website/docs/r/access_rule.html.markdown.
type AccessRule struct {
	s *pulumi.ResourceState
}

// NewAccessRule registers a new resource with the given unique name, arguments, and options.
func NewAccessRule(ctx *pulumi.Context,
	name string, args *AccessRuleArgs, opts ...pulumi.ResourceOpt) (*AccessRule, error) {
	if args == nil || args.Configuration == nil {
		return nil, errors.New("missing required argument 'Configuration'")
	}
	if args == nil || args.Mode == nil {
		return nil, errors.New("missing required argument 'Mode'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["configuration"] = nil
		inputs["mode"] = nil
		inputs["notes"] = nil
		inputs["zoneId"] = nil
	} else {
		inputs["configuration"] = args.Configuration
		inputs["mode"] = args.Mode
		inputs["notes"] = args.Notes
		inputs["zoneId"] = args.ZoneId
	}
	s, err := ctx.RegisterResource("cloudflare:index/accessRule:AccessRule", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &AccessRule{s: s}, nil
}

// GetAccessRule gets an existing AccessRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAccessRule(ctx *pulumi.Context,
	name string, id pulumi.ID, state *AccessRuleState, opts ...pulumi.ResourceOpt) (*AccessRule, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["configuration"] = state.Configuration
		inputs["mode"] = state.Mode
		inputs["notes"] = state.Notes
		inputs["zoneId"] = state.ZoneId
	}
	s, err := ctx.ReadResource("cloudflare:index/accessRule:AccessRule", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &AccessRule{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *AccessRule) URN() pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *AccessRule) ID() pulumi.IDOutput {
	return r.s.ID()
}

// Rule configuration to apply to a matched request. It's a complex value. See description below.
func (r *AccessRule) Configuration() pulumi.Output {
	return r.s.State["configuration"]
}

// The action to apply to a matched request. Allowed values: "block", "challenge", "whitelist", "jsChallenge"
func (r *AccessRule) Mode() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["mode"])
}

// A personal note about the rule. Typically used as a reminder or explanation for the rule.
func (r *AccessRule) Notes() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["notes"])
}

// The DNS zone to which the access rule should be added.
func (r *AccessRule) ZoneId() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["zoneId"])
}

// Input properties used for looking up and filtering AccessRule resources.
type AccessRuleState struct {
	// Rule configuration to apply to a matched request. It's a complex value. See description below.
	Configuration interface{}
	// The action to apply to a matched request. Allowed values: "block", "challenge", "whitelist", "jsChallenge"
	Mode interface{}
	// A personal note about the rule. Typically used as a reminder or explanation for the rule.
	Notes interface{}
	// The DNS zone to which the access rule should be added.
	ZoneId interface{}
}

// The set of arguments for constructing a AccessRule resource.
type AccessRuleArgs struct {
	// Rule configuration to apply to a matched request. It's a complex value. See description below.
	Configuration interface{}
	// The action to apply to a matched request. Allowed values: "block", "challenge", "whitelist", "jsChallenge"
	Mode interface{}
	// A personal note about the rule. Typically used as a reminder or explanation for the rule.
	Notes interface{}
	// The DNS zone to which the access rule should be added.
	ZoneId interface{}
}
