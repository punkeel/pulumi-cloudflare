// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a resource which manages Cloudflare API tokens.
//
// Read more about permission groups and their applicable scopes in
// [the official documentation](https://developers.cloudflare.com/api/tokens/create/permissions).
//
// ## Example Usage
type ApiToken struct {
	pulumi.CustomResourceState

	// Condition block. See the definition below.
	Condition ApiTokenConditionPtrOutput `pulumi:"condition"`
	// The RFC3339 timestamp of when the API Token was issued.
	IssuedOn pulumi.StringOutput `pulumi:"issuedOn"`
	// The RFC3339 timestamp of when the API Token was last modified.
	ModifiedOn pulumi.StringOutput `pulumi:"modifiedOn"`
	// Name of the APIToken.
	Name pulumi.StringOutput `pulumi:"name"`
	// Permissions policy. Multiple policy blocks can be defined.
	// See the definition below.
	Policies ApiTokenPolicyArrayOutput `pulumi:"policies"`
	Status   pulumi.StringOutput       `pulumi:"status"`
	// The value of the API Token.
	Value pulumi.StringOutput `pulumi:"value"`
}

// NewApiToken registers a new resource with the given unique name, arguments, and options.
func NewApiToken(ctx *pulumi.Context,
	name string, args *ApiTokenArgs, opts ...pulumi.ResourceOption) (*ApiToken, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	if args.Policies == nil {
		return nil, errors.New("invalid value for required argument 'Policies'")
	}
	var resource ApiToken
	err := ctx.RegisterResource("cloudflare:index/apiToken:ApiToken", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetApiToken gets an existing ApiToken resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetApiToken(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ApiTokenState, opts ...pulumi.ResourceOption) (*ApiToken, error) {
	var resource ApiToken
	err := ctx.ReadResource("cloudflare:index/apiToken:ApiToken", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ApiToken resources.
type apiTokenState struct {
	// Condition block. See the definition below.
	Condition *ApiTokenCondition `pulumi:"condition"`
	// The RFC3339 timestamp of when the API Token was issued.
	IssuedOn *string `pulumi:"issuedOn"`
	// The RFC3339 timestamp of when the API Token was last modified.
	ModifiedOn *string `pulumi:"modifiedOn"`
	// Name of the APIToken.
	Name *string `pulumi:"name"`
	// Permissions policy. Multiple policy blocks can be defined.
	// See the definition below.
	Policies []ApiTokenPolicy `pulumi:"policies"`
	Status   *string          `pulumi:"status"`
	// The value of the API Token.
	Value *string `pulumi:"value"`
}

type ApiTokenState struct {
	// Condition block. See the definition below.
	Condition ApiTokenConditionPtrInput
	// The RFC3339 timestamp of when the API Token was issued.
	IssuedOn pulumi.StringPtrInput
	// The RFC3339 timestamp of when the API Token was last modified.
	ModifiedOn pulumi.StringPtrInput
	// Name of the APIToken.
	Name pulumi.StringPtrInput
	// Permissions policy. Multiple policy blocks can be defined.
	// See the definition below.
	Policies ApiTokenPolicyArrayInput
	Status   pulumi.StringPtrInput
	// The value of the API Token.
	Value pulumi.StringPtrInput
}

func (ApiTokenState) ElementType() reflect.Type {
	return reflect.TypeOf((*apiTokenState)(nil)).Elem()
}

type apiTokenArgs struct {
	// Condition block. See the definition below.
	Condition *ApiTokenCondition `pulumi:"condition"`
	// Name of the APIToken.
	Name string `pulumi:"name"`
	// Permissions policy. Multiple policy blocks can be defined.
	// See the definition below.
	Policies []ApiTokenPolicy `pulumi:"policies"`
}

// The set of arguments for constructing a ApiToken resource.
type ApiTokenArgs struct {
	// Condition block. See the definition below.
	Condition ApiTokenConditionPtrInput
	// Name of the APIToken.
	Name pulumi.StringInput
	// Permissions policy. Multiple policy blocks can be defined.
	// See the definition below.
	Policies ApiTokenPolicyArrayInput
}

func (ApiTokenArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*apiTokenArgs)(nil)).Elem()
}

type ApiTokenInput interface {
	pulumi.Input

	ToApiTokenOutput() ApiTokenOutput
	ToApiTokenOutputWithContext(ctx context.Context) ApiTokenOutput
}

func (*ApiToken) ElementType() reflect.Type {
	return reflect.TypeOf((*ApiToken)(nil))
}

func (i *ApiToken) ToApiTokenOutput() ApiTokenOutput {
	return i.ToApiTokenOutputWithContext(context.Background())
}

func (i *ApiToken) ToApiTokenOutputWithContext(ctx context.Context) ApiTokenOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApiTokenOutput)
}

func (i *ApiToken) ToApiTokenPtrOutput() ApiTokenPtrOutput {
	return i.ToApiTokenPtrOutputWithContext(context.Background())
}

func (i *ApiToken) ToApiTokenPtrOutputWithContext(ctx context.Context) ApiTokenPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApiTokenPtrOutput)
}

type ApiTokenPtrInput interface {
	pulumi.Input

	ToApiTokenPtrOutput() ApiTokenPtrOutput
	ToApiTokenPtrOutputWithContext(ctx context.Context) ApiTokenPtrOutput
}

type apiTokenPtrType ApiTokenArgs

func (*apiTokenPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**ApiToken)(nil))
}

func (i *apiTokenPtrType) ToApiTokenPtrOutput() ApiTokenPtrOutput {
	return i.ToApiTokenPtrOutputWithContext(context.Background())
}

func (i *apiTokenPtrType) ToApiTokenPtrOutputWithContext(ctx context.Context) ApiTokenPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApiTokenPtrOutput)
}

// ApiTokenArrayInput is an input type that accepts ApiTokenArray and ApiTokenArrayOutput values.
// You can construct a concrete instance of `ApiTokenArrayInput` via:
//
//          ApiTokenArray{ ApiTokenArgs{...} }
type ApiTokenArrayInput interface {
	pulumi.Input

	ToApiTokenArrayOutput() ApiTokenArrayOutput
	ToApiTokenArrayOutputWithContext(context.Context) ApiTokenArrayOutput
}

type ApiTokenArray []ApiTokenInput

func (ApiTokenArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*ApiToken)(nil))
}

func (i ApiTokenArray) ToApiTokenArrayOutput() ApiTokenArrayOutput {
	return i.ToApiTokenArrayOutputWithContext(context.Background())
}

func (i ApiTokenArray) ToApiTokenArrayOutputWithContext(ctx context.Context) ApiTokenArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApiTokenArrayOutput)
}

// ApiTokenMapInput is an input type that accepts ApiTokenMap and ApiTokenMapOutput values.
// You can construct a concrete instance of `ApiTokenMapInput` via:
//
//          ApiTokenMap{ "key": ApiTokenArgs{...} }
type ApiTokenMapInput interface {
	pulumi.Input

	ToApiTokenMapOutput() ApiTokenMapOutput
	ToApiTokenMapOutputWithContext(context.Context) ApiTokenMapOutput
}

type ApiTokenMap map[string]ApiTokenInput

func (ApiTokenMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*ApiToken)(nil))
}

func (i ApiTokenMap) ToApiTokenMapOutput() ApiTokenMapOutput {
	return i.ToApiTokenMapOutputWithContext(context.Background())
}

func (i ApiTokenMap) ToApiTokenMapOutputWithContext(ctx context.Context) ApiTokenMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApiTokenMapOutput)
}

type ApiTokenOutput struct {
	*pulumi.OutputState
}

func (ApiTokenOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ApiToken)(nil))
}

func (o ApiTokenOutput) ToApiTokenOutput() ApiTokenOutput {
	return o
}

func (o ApiTokenOutput) ToApiTokenOutputWithContext(ctx context.Context) ApiTokenOutput {
	return o
}

func (o ApiTokenOutput) ToApiTokenPtrOutput() ApiTokenPtrOutput {
	return o.ToApiTokenPtrOutputWithContext(context.Background())
}

func (o ApiTokenOutput) ToApiTokenPtrOutputWithContext(ctx context.Context) ApiTokenPtrOutput {
	return o.ApplyT(func(v ApiToken) *ApiToken {
		return &v
	}).(ApiTokenPtrOutput)
}

type ApiTokenPtrOutput struct {
	*pulumi.OutputState
}

func (ApiTokenPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ApiToken)(nil))
}

func (o ApiTokenPtrOutput) ToApiTokenPtrOutput() ApiTokenPtrOutput {
	return o
}

func (o ApiTokenPtrOutput) ToApiTokenPtrOutputWithContext(ctx context.Context) ApiTokenPtrOutput {
	return o
}

type ApiTokenArrayOutput struct{ *pulumi.OutputState }

func (ApiTokenArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ApiToken)(nil))
}

func (o ApiTokenArrayOutput) ToApiTokenArrayOutput() ApiTokenArrayOutput {
	return o
}

func (o ApiTokenArrayOutput) ToApiTokenArrayOutputWithContext(ctx context.Context) ApiTokenArrayOutput {
	return o
}

func (o ApiTokenArrayOutput) Index(i pulumi.IntInput) ApiTokenOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ApiToken {
		return vs[0].([]ApiToken)[vs[1].(int)]
	}).(ApiTokenOutput)
}

type ApiTokenMapOutput struct{ *pulumi.OutputState }

func (ApiTokenMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]ApiToken)(nil))
}

func (o ApiTokenMapOutput) ToApiTokenMapOutput() ApiTokenMapOutput {
	return o
}

func (o ApiTokenMapOutput) ToApiTokenMapOutputWithContext(ctx context.Context) ApiTokenMapOutput {
	return o
}

func (o ApiTokenMapOutput) MapIndex(k pulumi.StringInput) ApiTokenOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) ApiToken {
		return vs[0].(map[string]ApiToken)[vs[1].(string)]
	}).(ApiTokenOutput)
}

func init() {
	pulumi.RegisterOutputType(ApiTokenOutput{})
	pulumi.RegisterOutputType(ApiTokenPtrOutput{})
	pulumi.RegisterOutputType(ApiTokenArrayOutput{})
	pulumi.RegisterOutputType(ApiTokenMapOutput{})
}
