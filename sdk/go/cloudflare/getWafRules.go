// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Use this data source to look up [WAF Rules](https://api.cloudflare.com/#waf-rule-groups-properties).
//
// ## Example Usage
//
// The example below matches all WAF Rules that are in the group of ID `de677e5818985db1285d0e80225f06e5`, contain `example` in their description, and are currently `on`. The matched WAF Rules are then returned as output.
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
// 		opt0 := "a25a9a7e9c00afc1fb2e0245519d725b"
// 		test, err := cloudflare.GetWafRules(ctx, &cloudflare.GetWafRulesArgs{
// 			ZoneId:    "ae36f999674d196762efcc5abb06b345",
// 			PackageId: &opt0,
// 			Filter: cloudflare.GetWafRulesFilter{
// 				Description: ".*example.*",
// 				Mode:        "on",
// 				GroupId:     "de677e5818985db1285d0e80225f06e5",
// 			},
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("wafRules", test.Rules)
// 		return nil
// 	})
// }
// ```
func GetWafRules(ctx *pulumi.Context, args *GetWafRulesArgs, opts ...pulumi.InvokeOption) (*GetWafRulesResult, error) {
	var rv GetWafRulesResult
	err := ctx.Invoke("cloudflare:index/getWafRules:getWafRules", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getWafRules.
type GetWafRulesArgs struct {
	Filter    *GetWafRulesFilter `pulumi:"filter"`
	PackageId *string            `pulumi:"packageId"`
	ZoneId    string             `pulumi:"zoneId"`
}

// A collection of values returned by getWafRules.
type GetWafRulesResult struct {
	Filter *GetWafRulesFilter `pulumi:"filter"`
	// The provider-assigned unique ID for this managed resource.
	Id        string            `pulumi:"id"`
	PackageId *string           `pulumi:"packageId"`
	Rules     []GetWafRulesRule `pulumi:"rules"`
	ZoneId    string            `pulumi:"zoneId"`
}
