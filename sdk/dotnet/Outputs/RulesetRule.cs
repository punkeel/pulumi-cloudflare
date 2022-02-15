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
    public sealed class RulesetRule
    {
        /// <summary>
        /// Action to perform in the rule-level override. Valid values are `"block"`, `"challenge"`, `"ddos_dynamic"`, `"execute"`, `"force_connection_close"`, `"js_challenge"`, `"log"`, `"rewrite"`, `"score"`, or  `"skip"`.
        /// </summary>
        public readonly string? Action;
        /// <summary>
        /// List of parameters that configure the behavior of the ruleset rule action (refer to the nested schema).
        /// </summary>
        public readonly Outputs.RulesetRuleActionParameters? ActionParameters;
        /// <summary>
        /// Brief summary of the ruleset rule and its intended use.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Defines if the current rule-level override enables or disables the rule.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// Expression that defines the updated (dynamic) value of the URI path or query string component. Conflicts with `value`.
        /// </summary>
        public readonly string Expression;
        /// <summary>
        /// Rule ID to apply the override to.
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// List of parameters that configure HTTP rate limiting behaviour (refer to the nested schema).
        /// </summary>
        public readonly Outputs.RulesetRuleRatelimit? Ratelimit;
        /// <summary>
        /// Rule reference.
        /// </summary>
        public readonly string? Ref;
        public readonly string? Version;

        [OutputConstructor]
        private RulesetRule(
            string? action,

            Outputs.RulesetRuleActionParameters? actionParameters,

            string description,

            bool? enabled,

            string expression,

            string? id,

            Outputs.RulesetRuleRatelimit? ratelimit,

            string? @ref,

            string? version)
        {
            Action = action;
            ActionParameters = actionParameters;
            Description = description;
            Enabled = enabled;
            Expression = expression;
            Id = id;
            Ratelimit = ratelimit;
            Ref = @ref;
            Version = version;
        }
    }
}
