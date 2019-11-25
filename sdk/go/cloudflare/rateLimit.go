// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a Cloudflare rate limit resource for a given zone. This can be used to limit the traffic you receive zone-wide, or matching more specific types of requests/responses.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-cloudflare/blob/master/website/docs/r/rate_limit.html.markdown.
type RateLimit struct {
	s *pulumi.ResourceState
}

// NewRateLimit registers a new resource with the given unique name, arguments, and options.
func NewRateLimit(ctx *pulumi.Context,
	name string, args *RateLimitArgs, opts ...pulumi.ResourceOpt) (*RateLimit, error) {
	if args == nil || args.Action == nil {
		return nil, errors.New("missing required argument 'Action'")
	}
	if args == nil || args.Period == nil {
		return nil, errors.New("missing required argument 'Period'")
	}
	if args == nil || args.Threshold == nil {
		return nil, errors.New("missing required argument 'Threshold'")
	}
	if args == nil || args.ZoneId == nil {
		return nil, errors.New("missing required argument 'ZoneId'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["action"] = nil
		inputs["bypassUrlPatterns"] = nil
		inputs["correlate"] = nil
		inputs["description"] = nil
		inputs["disabled"] = nil
		inputs["match"] = nil
		inputs["period"] = nil
		inputs["threshold"] = nil
		inputs["zoneId"] = nil
	} else {
		inputs["action"] = args.Action
		inputs["bypassUrlPatterns"] = args.BypassUrlPatterns
		inputs["correlate"] = args.Correlate
		inputs["description"] = args.Description
		inputs["disabled"] = args.Disabled
		inputs["match"] = args.Match
		inputs["period"] = args.Period
		inputs["threshold"] = args.Threshold
		inputs["zoneId"] = args.ZoneId
	}
	s, err := ctx.RegisterResource("cloudflare:index/rateLimit:RateLimit", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &RateLimit{s: s}, nil
}

// GetRateLimit gets an existing RateLimit resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRateLimit(ctx *pulumi.Context,
	name string, id pulumi.ID, state *RateLimitState, opts ...pulumi.ResourceOpt) (*RateLimit, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["action"] = state.Action
		inputs["bypassUrlPatterns"] = state.BypassUrlPatterns
		inputs["correlate"] = state.Correlate
		inputs["description"] = state.Description
		inputs["disabled"] = state.Disabled
		inputs["match"] = state.Match
		inputs["period"] = state.Period
		inputs["threshold"] = state.Threshold
		inputs["zoneId"] = state.ZoneId
	}
	s, err := ctx.ReadResource("cloudflare:index/rateLimit:RateLimit", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &RateLimit{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *RateLimit) URN() pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *RateLimit) ID() pulumi.IDOutput {
	return r.s.ID()
}

// The action to be performed when the threshold of matched traffic within the period defined is exceeded.
func (r *RateLimit) Action() pulumi.Output {
	return r.s.State["action"]
}

// URLs matching the patterns specified here will be excluded from rate limiting.
func (r *RateLimit) BypassUrlPatterns() pulumi.ArrayOutput {
	return (pulumi.ArrayOutput)(r.s.State["bypassUrlPatterns"])
}

// Determines how rate limiting is applied. By default if not specified, rate limiting applies to the clients IP address.
func (r *RateLimit) Correlate() pulumi.Output {
	return r.s.State["correlate"]
}

// A note that you can use to describe the reason for a rate limit. This value is sanitized and all tags are removed.
func (r *RateLimit) Description() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["description"])
}

// Whether this ratelimit is currently disabled. Default: `false`.
func (r *RateLimit) Disabled() pulumi.BoolOutput {
	return (pulumi.BoolOutput)(r.s.State["disabled"])
}

// Determines which traffic the rate limit counts towards the threshold. By default matches all traffic in the zone. See definition below.
func (r *RateLimit) Match() pulumi.Output {
	return r.s.State["match"]
}

// The time in seconds to count matching traffic. If the count exceeds threshold within this period the action will be performed (min: 1, max: 86,400).
func (r *RateLimit) Period() pulumi.IntOutput {
	return (pulumi.IntOutput)(r.s.State["period"])
}

// The threshold that triggers the rate limit mitigations, combine with period. i.e. threshold per period (min: 2, max: 1,000,000).
func (r *RateLimit) Threshold() pulumi.IntOutput {
	return (pulumi.IntOutput)(r.s.State["threshold"])
}

// The DNS zone ID to apply rate limiting to.
func (r *RateLimit) ZoneId() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["zoneId"])
}

// Input properties used for looking up and filtering RateLimit resources.
type RateLimitState struct {
	// The action to be performed when the threshold of matched traffic within the period defined is exceeded.
	Action interface{}
	// URLs matching the patterns specified here will be excluded from rate limiting.
	BypassUrlPatterns interface{}
	// Determines how rate limiting is applied. By default if not specified, rate limiting applies to the clients IP address.
	Correlate interface{}
	// A note that you can use to describe the reason for a rate limit. This value is sanitized and all tags are removed.
	Description interface{}
	// Whether this ratelimit is currently disabled. Default: `false`.
	Disabled interface{}
	// Determines which traffic the rate limit counts towards the threshold. By default matches all traffic in the zone. See definition below.
	Match interface{}
	// The time in seconds to count matching traffic. If the count exceeds threshold within this period the action will be performed (min: 1, max: 86,400).
	Period interface{}
	// The threshold that triggers the rate limit mitigations, combine with period. i.e. threshold per period (min: 2, max: 1,000,000).
	Threshold interface{}
	// The DNS zone ID to apply rate limiting to.
	ZoneId interface{}
}

// The set of arguments for constructing a RateLimit resource.
type RateLimitArgs struct {
	// The action to be performed when the threshold of matched traffic within the period defined is exceeded.
	Action interface{}
	// URLs matching the patterns specified here will be excluded from rate limiting.
	BypassUrlPatterns interface{}
	// Determines how rate limiting is applied. By default if not specified, rate limiting applies to the clients IP address.
	Correlate interface{}
	// A note that you can use to describe the reason for a rate limit. This value is sanitized and all tags are removed.
	Description interface{}
	// Whether this ratelimit is currently disabled. Default: `false`.
	Disabled interface{}
	// Determines which traffic the rate limit counts towards the threshold. By default matches all traffic in the zone. See definition below.
	Match interface{}
	// The time in seconds to count matching traffic. If the count exceeds threshold within this period the action will be performed (min: 1, max: 86,400).
	Period interface{}
	// The threshold that triggers the rate limit mitigations, combine with period. i.e. threshold per period (min: 2, max: 1,000,000).
	Threshold interface{}
	// The DNS zone ID to apply rate limiting to.
	ZoneId interface{}
}
