// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    /// <summary>
    /// Provides a Cloudflare WAF override resource. This enables the ability to toggle
    /// WAF rules and groups on or off based on URIs.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var shopEcxample = new Cloudflare.WafOverride("shopEcxample", new Cloudflare.WafOverrideArgs
    ///         {
    ///             ZoneId = "1d5fdc9e88c8a8c4518b068cd94331fe",
    ///             Urls = 
    ///             {
    ///                 "example.com/no-waf-here",
    ///                 "example.com/another/path/*",
    ///             },
    ///             Rules = 
    ///             {
    ///                 { "100015", "disable" },
    ///             },
    ///             Groups = 
    ///             {
    ///                 { "ea8687e59929c1fd05ba97574ad43f77", "default" },
    ///             },
    ///             RewriteAction = 
    ///             {
    ///                 { "default", "block" },
    ///                 { "challenge", "block" },
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    public partial class WafOverride : Pulumi.CustomResource
    {
        /// <summary>
        /// Description of what the WAF override does.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Similar to `rules`; which WAF groups you want to alter.
        /// </summary>
        [Output("groups")]
        public Output<ImmutableDictionary<string, string>?> Groups { get; private set; } = null!;

        [Output("overrideId")]
        public Output<string> OverrideId { get; private set; } = null!;

        /// <summary>
        /// Whether this package is currently paused.
        /// </summary>
        [Output("paused")]
        public Output<bool?> Paused { get; private set; } = null!;

        /// <summary>
        /// Relative priority of this configuration when multiple configurations match a single URL.
        /// </summary>
        [Output("priority")]
        public Output<int?> Priority { get; private set; } = null!;

        /// <summary>
        /// When a WAF rule matches, substitute its configured action for a different action specified by this definition.
        /// </summary>
        [Output("rewriteAction")]
        public Output<ImmutableDictionary<string, string>?> RewriteAction { get; private set; } = null!;

        /// <summary>
        /// A list of WAF rule ID to rule action you intend to apply.
        /// </summary>
        [Output("rules")]
        public Output<ImmutableDictionary<string, string>> Rules { get; private set; } = null!;

        /// <summary>
        /// An array of URLs to apply the WAF override to.
        /// </summary>
        [Output("urls")]
        public Output<ImmutableArray<string>> Urls { get; private set; } = null!;

        /// <summary>
        /// The DNS zone to which the WAF override condition should be added.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a WafOverride resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public WafOverride(string name, WafOverrideArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/wafOverride:WafOverride", name, args ?? new WafOverrideArgs(), MakeResourceOptions(options, ""))
        {
        }

        private WafOverride(string name, Input<string> id, WafOverrideState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/wafOverride:WafOverride", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing WafOverride resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static WafOverride Get(string name, Input<string> id, WafOverrideState? state = null, CustomResourceOptions? options = null)
        {
            return new WafOverride(name, id, state, options);
        }
    }

    public sealed class WafOverrideArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of what the WAF override does.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("groups")]
        private InputMap<string>? _groups;

        /// <summary>
        /// Similar to `rules`; which WAF groups you want to alter.
        /// </summary>
        public InputMap<string> Groups
        {
            get => _groups ?? (_groups = new InputMap<string>());
            set => _groups = value;
        }

        /// <summary>
        /// Whether this package is currently paused.
        /// </summary>
        [Input("paused")]
        public Input<bool>? Paused { get; set; }

        /// <summary>
        /// Relative priority of this configuration when multiple configurations match a single URL.
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        [Input("rewriteAction")]
        private InputMap<string>? _rewriteAction;

        /// <summary>
        /// When a WAF rule matches, substitute its configured action for a different action specified by this definition.
        /// </summary>
        public InputMap<string> RewriteAction
        {
            get => _rewriteAction ?? (_rewriteAction = new InputMap<string>());
            set => _rewriteAction = value;
        }

        [Input("rules", required: true)]
        private InputMap<string>? _rules;

        /// <summary>
        /// A list of WAF rule ID to rule action you intend to apply.
        /// </summary>
        public InputMap<string> Rules
        {
            get => _rules ?? (_rules = new InputMap<string>());
            set => _rules = value;
        }

        [Input("urls", required: true)]
        private InputList<string>? _urls;

        /// <summary>
        /// An array of URLs to apply the WAF override to.
        /// </summary>
        public InputList<string> Urls
        {
            get => _urls ?? (_urls = new InputList<string>());
            set => _urls = value;
        }

        /// <summary>
        /// The DNS zone to which the WAF override condition should be added.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public WafOverrideArgs()
        {
        }
    }

    public sealed class WafOverrideState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of what the WAF override does.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("groups")]
        private InputMap<string>? _groups;

        /// <summary>
        /// Similar to `rules`; which WAF groups you want to alter.
        /// </summary>
        public InputMap<string> Groups
        {
            get => _groups ?? (_groups = new InputMap<string>());
            set => _groups = value;
        }

        [Input("overrideId")]
        public Input<string>? OverrideId { get; set; }

        /// <summary>
        /// Whether this package is currently paused.
        /// </summary>
        [Input("paused")]
        public Input<bool>? Paused { get; set; }

        /// <summary>
        /// Relative priority of this configuration when multiple configurations match a single URL.
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        [Input("rewriteAction")]
        private InputMap<string>? _rewriteAction;

        /// <summary>
        /// When a WAF rule matches, substitute its configured action for a different action specified by this definition.
        /// </summary>
        public InputMap<string> RewriteAction
        {
            get => _rewriteAction ?? (_rewriteAction = new InputMap<string>());
            set => _rewriteAction = value;
        }

        [Input("rules")]
        private InputMap<string>? _rules;

        /// <summary>
        /// A list of WAF rule ID to rule action you intend to apply.
        /// </summary>
        public InputMap<string> Rules
        {
            get => _rules ?? (_rules = new InputMap<string>());
            set => _rules = value;
        }

        [Input("urls")]
        private InputList<string>? _urls;

        /// <summary>
        /// An array of URLs to apply the WAF override to.
        /// </summary>
        public InputList<string> Urls
        {
            get => _urls ?? (_urls = new InputList<string>());
            set => _urls = value;
        }

        /// <summary>
        /// The DNS zone to which the WAF override condition should be added.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public WafOverrideState()
        {
        }
    }
}
