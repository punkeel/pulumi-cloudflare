// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class RulesetRuleActionParametersOverridesGetArgs : Pulumi.ResourceArgs
    {
        [Input("categories")]
        private InputList<Inputs.RulesetRuleActionParametersOverridesCategoryGetArgs>? _categories;

        /// <summary>
        /// List of tag-based overrides (refer to the nested schema).
        /// </summary>
        public InputList<Inputs.RulesetRuleActionParametersOverridesCategoryGetArgs> Categories
        {
            get => _categories ?? (_categories = new InputList<Inputs.RulesetRuleActionParametersOverridesCategoryGetArgs>());
            set => _categories = value;
        }

        /// <summary>
        /// Defines if the current rule-level override enables or disables the rule.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("rules")]
        private InputList<Inputs.RulesetRuleActionParametersOverridesRuleGetArgs>? _rules;

        /// <summary>
        /// List of rule-based overrides (refer to the nested schema).
        /// </summary>
        public InputList<Inputs.RulesetRuleActionParametersOverridesRuleGetArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.RulesetRuleActionParametersOverridesRuleGetArgs>());
            set => _rules = value;
        }

        public RulesetRuleActionParametersOverridesGetArgs()
        {
        }
    }
}