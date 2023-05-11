// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class RulesetRuleActionParametersArgs : global::Pulumi.ResourceArgs
    {
        [Input("automaticHttpsRewrites")]
        public Input<bool>? AutomaticHttpsRewrites { get; set; }

        [Input("autominify")]
        public Input<Inputs.RulesetRuleActionParametersAutominifyArgs>? Autominify { get; set; }

        [Input("bic")]
        public Input<bool>? Bic { get; set; }

        [Input("browserTtl")]
        public Input<Inputs.RulesetRuleActionParametersBrowserTtlArgs>? BrowserTtl { get; set; }

        [Input("cache")]
        public Input<bool>? Cache { get; set; }

        [Input("cacheKey")]
        public Input<Inputs.RulesetRuleActionParametersCacheKeyArgs>? CacheKey { get; set; }

        [Input("content")]
        public Input<string>? Content { get; set; }

        [Input("contentType")]
        public Input<string>? ContentType { get; set; }

        [Input("cookieFields")]
        private InputList<string>? _cookieFields;
        public InputList<string> CookieFields
        {
            get => _cookieFields ?? (_cookieFields = new InputList<string>());
            set => _cookieFields = value;
        }

        [Input("disableApps")]
        public Input<bool>? DisableApps { get; set; }

        [Input("disableRailgun")]
        public Input<bool>? DisableRailgun { get; set; }

        [Input("disableZaraz")]
        public Input<bool>? DisableZaraz { get; set; }

        [Input("edgeTtl")]
        public Input<Inputs.RulesetRuleActionParametersEdgeTtlArgs>? EdgeTtl { get; set; }

        [Input("emailObfuscation")]
        public Input<bool>? EmailObfuscation { get; set; }

        [Input("fromList")]
        public Input<Inputs.RulesetRuleActionParametersFromListArgs>? FromList { get; set; }

        [Input("fromValue")]
        public Input<Inputs.RulesetRuleActionParametersFromValueArgs>? FromValue { get; set; }

        [Input("headers")]
        private InputList<Inputs.RulesetRuleActionParametersHeaderArgs>? _headers;
        public InputList<Inputs.RulesetRuleActionParametersHeaderArgs> Headers
        {
            get => _headers ?? (_headers = new InputList<Inputs.RulesetRuleActionParametersHeaderArgs>());
            set => _headers = value;
        }

        [Input("hostHeader")]
        public Input<string>? HostHeader { get; set; }

        [Input("hotlinkProtection")]
        public Input<bool>? HotlinkProtection { get; set; }

        /// <summary>
        /// The identifier of this resource.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("increment")]
        public Input<int>? Increment { get; set; }

        [Input("matchedData")]
        public Input<Inputs.RulesetRuleActionParametersMatchedDataArgs>? MatchedData { get; set; }

        [Input("mirage")]
        public Input<bool>? Mirage { get; set; }

        [Input("opportunisticEncryption")]
        public Input<bool>? OpportunisticEncryption { get; set; }

        [Input("origin")]
        public Input<Inputs.RulesetRuleActionParametersOriginArgs>? Origin { get; set; }

        [Input("originErrorPagePassthru")]
        public Input<bool>? OriginErrorPagePassthru { get; set; }

        [Input("overrides")]
        public Input<Inputs.RulesetRuleActionParametersOverridesArgs>? Overrides { get; set; }

        [Input("phases")]
        private InputList<string>? _phases;
        public InputList<string> Phases
        {
            get => _phases ?? (_phases = new InputList<string>());
            set => _phases = value;
        }

        [Input("polish")]
        public Input<string>? Polish { get; set; }

        [Input("products")]
        private InputList<string>? _products;
        public InputList<string> Products
        {
            get => _products ?? (_products = new InputList<string>());
            set => _products = value;
        }

        [Input("requestFields")]
        private InputList<string>? _requestFields;
        public InputList<string> RequestFields
        {
            get => _requestFields ?? (_requestFields = new InputList<string>());
            set => _requestFields = value;
        }

        [Input("respectStrongEtags")]
        public Input<bool>? RespectStrongEtags { get; set; }

        [Input("response")]
        public Input<Inputs.RulesetRuleActionParametersResponseArgs>? Response { get; set; }

        [Input("responseFields")]
        private InputList<string>? _responseFields;
        public InputList<string> ResponseFields
        {
            get => _responseFields ?? (_responseFields = new InputList<string>());
            set => _responseFields = value;
        }

        [Input("rocketLoader")]
        public Input<bool>? RocketLoader { get; set; }

        [Input("rules")]
        private InputMap<string>? _rules;

        /// <summary>
        /// List of rules to apply to the ruleset.
        /// </summary>
        public InputMap<string> Rules
        {
            get => _rules ?? (_rules = new InputMap<string>());
            set => _rules = value;
        }

        [Input("ruleset")]
        public Input<string>? Ruleset { get; set; }

        [Input("rulesets")]
        private InputList<string>? _rulesets;
        public InputList<string> Rulesets
        {
            get => _rulesets ?? (_rulesets = new InputList<string>());
            set => _rulesets = value;
        }

        [Input("securityLevel")]
        public Input<string>? SecurityLevel { get; set; }

        [Input("serveStale")]
        public Input<Inputs.RulesetRuleActionParametersServeStaleArgs>? ServeStale { get; set; }

        [Input("serverSideExcludes")]
        public Input<bool>? ServerSideExcludes { get; set; }

        [Input("sni")]
        public Input<Inputs.RulesetRuleActionParametersSniArgs>? Sni { get; set; }

        [Input("ssl")]
        public Input<string>? Ssl { get; set; }

        [Input("statusCode")]
        public Input<int>? StatusCode { get; set; }

        [Input("sxg")]
        public Input<bool>? Sxg { get; set; }

        [Input("uri")]
        public Input<Inputs.RulesetRuleActionParametersUriArgs>? Uri { get; set; }

        [Input("version")]
        public Input<string>? Version { get; set; }

        public RulesetRuleActionParametersArgs()
        {
        }
        public static new RulesetRuleActionParametersArgs Empty => new RulesetRuleActionParametersArgs();
    }
}
