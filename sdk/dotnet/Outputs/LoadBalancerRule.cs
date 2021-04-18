// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Outputs
{

    [OutputType]
    public sealed class LoadBalancerRule
    {
        /// <summary>
        /// The statement to evaluate to determine if this rules effects should be applied. An empty condition is always true. See [load balancing rules](https://developers.cloudflare.com/load-balancing/understand-basics/load-balancing-rules).
        /// </summary>
        public readonly string? Condition;
        /// <summary>
        /// A disabled rule will be be executed.
        /// </summary>
        public readonly bool? Disabled;
        /// <summary>
        /// Settings for a HTTP response to return directly to the eyeball if the condition is true. Note: overrides or fixed_response must be set. See the field documentation below.
        /// </summary>
        public readonly Outputs.LoadBalancerRuleFixedResponse? FixedResponse;
        /// <summary>
        /// Human readable name for this rule.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The Load Balancer settings to alter if this rules condition is true. Note: overrides or fixed_response must be set. See the field documentation below.
        /// </summary>
        public readonly ImmutableArray<Outputs.LoadBalancerRuleOverride> Overrides;
        /// <summary>
        /// Priority used when determining the order of rule execution. Lower values are executed first. If not provided list order will be used.
        /// </summary>
        public readonly int? Priority;
        /// <summary>
        /// Terminates indicates that if this rule is true no further rules should be executed. Note: setting a fixed_response forces this field to true.
        /// </summary>
        public readonly bool? Terminates;

        [OutputConstructor]
        private LoadBalancerRule(
            string? condition,

            bool? disabled,

            Outputs.LoadBalancerRuleFixedResponse? fixedResponse,

            string name,

            ImmutableArray<Outputs.LoadBalancerRuleOverride> overrides,

            int? priority,

            bool? terminates)
        {
            Condition = condition;
            Disabled = disabled;
            FixedResponse = fixedResponse;
            Name = name;
            Overrides = overrides;
            Priority = priority;
            Terminates = terminates;
        }
    }
}
