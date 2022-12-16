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
    /// Provides a Cloudflare Access Group resource. Access Groups are used
    /// in conjunction with Access Policies to restrict access to a
    /// particular resource based on group membership.
    /// 
    /// &gt; It's required that an `account_id` or `zone_id` is provided and in
    /// most cases using either is fine. However, if you're using a scoped
    /// access token, you must provide the argument that matches the token's
    /// scope. For example, an access token that is scoped to the "example.com"
    /// zone needs to use the `zone_id` argument.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Allowing access to `test@example.com` email address only
    ///     var testGroupAccessGroup = new Cloudflare.AccessGroup("testGroupAccessGroup", new()
    ///     {
    ///         AccountId = "f037e56e89293a057740de681ac9abbe",
    ///         Name = "staging group",
    ///         Includes = new[]
    ///         {
    ///             new Cloudflare.Inputs.AccessGroupIncludeArgs
    ///             {
    ///                 Emails = new[]
    ///                 {
    ///                     "test@example.com",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     // Allowing `test@example.com` to access but only when coming from a
    ///     // specific IP.
    ///     var testGroupIndex_accessGroupAccessGroup = new Cloudflare.AccessGroup("testGroupIndex/accessGroupAccessGroup", new()
    ///     {
    ///         AccountId = "f037e56e89293a057740de681ac9abbe",
    ///         Name = "staging group",
    ///         Includes = new[]
    ///         {
    ///             new Cloudflare.Inputs.AccessGroupIncludeArgs
    ///             {
    ///                 Emails = new[]
    ///                 {
    ///                     "test@example.com",
    ///                 },
    ///             },
    ///         },
    ///         Requires = 
    ///         {
    ///             { "ips", new[]
    ///             {
    ///                 @var.Office_ip,
    ///             } },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/accessGroup:AccessGroup example &lt;account_id&gt;/&lt;group_id&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/accessGroup:AccessGroup")]
    public partial class AccessGroup : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("accountId")]
        public Output<string?> AccountId { get; private set; } = null!;

        [Output("excludes")]
        public Output<ImmutableArray<Outputs.AccessGroupExclude>> Excludes { get; private set; } = null!;

        [Output("includes")]
        public Output<ImmutableArray<Outputs.AccessGroupInclude>> Includes { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("requires")]
        public Output<ImmutableArray<Outputs.AccessGroupRequire>> Requires { get; private set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource. Conflicts with `account_id`.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a AccessGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AccessGroup(string name, AccessGroupArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/accessGroup:AccessGroup", name, args ?? new AccessGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AccessGroup(string name, Input<string> id, AccessGroupState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/accessGroup:AccessGroup", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AccessGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AccessGroup Get(string name, Input<string> id, AccessGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new AccessGroup(name, id, state, options);
        }
    }

    public sealed class AccessGroupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        [Input("excludes")]
        private InputList<Inputs.AccessGroupExcludeArgs>? _excludes;
        public InputList<Inputs.AccessGroupExcludeArgs> Excludes
        {
            get => _excludes ?? (_excludes = new InputList<Inputs.AccessGroupExcludeArgs>());
            set => _excludes = value;
        }

        [Input("includes", required: true)]
        private InputList<Inputs.AccessGroupIncludeArgs>? _includes;
        public InputList<Inputs.AccessGroupIncludeArgs> Includes
        {
            get => _includes ?? (_includes = new InputList<Inputs.AccessGroupIncludeArgs>());
            set => _includes = value;
        }

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("requires")]
        private InputList<Inputs.AccessGroupRequireArgs>? _requires;
        public InputList<Inputs.AccessGroupRequireArgs> Requires
        {
            get => _requires ?? (_requires = new InputList<Inputs.AccessGroupRequireArgs>());
            set => _requires = value;
        }

        /// <summary>
        /// The zone identifier to target for the resource. Conflicts with `account_id`.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public AccessGroupArgs()
        {
        }
        public static new AccessGroupArgs Empty => new AccessGroupArgs();
    }

    public sealed class AccessGroupState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        [Input("excludes")]
        private InputList<Inputs.AccessGroupExcludeGetArgs>? _excludes;
        public InputList<Inputs.AccessGroupExcludeGetArgs> Excludes
        {
            get => _excludes ?? (_excludes = new InputList<Inputs.AccessGroupExcludeGetArgs>());
            set => _excludes = value;
        }

        [Input("includes")]
        private InputList<Inputs.AccessGroupIncludeGetArgs>? _includes;
        public InputList<Inputs.AccessGroupIncludeGetArgs> Includes
        {
            get => _includes ?? (_includes = new InputList<Inputs.AccessGroupIncludeGetArgs>());
            set => _includes = value;
        }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("requires")]
        private InputList<Inputs.AccessGroupRequireGetArgs>? _requires;
        public InputList<Inputs.AccessGroupRequireGetArgs> Requires
        {
            get => _requires ?? (_requires = new InputList<Inputs.AccessGroupRequireGetArgs>());
            set => _requires = value;
        }

        /// <summary>
        /// The zone identifier to target for the resource. Conflicts with `account_id`.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public AccessGroupState()
        {
        }
        public static new AccessGroupState Empty => new AccessGroupState();
    }
}
