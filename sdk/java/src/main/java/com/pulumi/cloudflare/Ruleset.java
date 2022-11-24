// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.RulesetArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.RulesetState;
import com.pulumi.cloudflare.outputs.RulesetRule;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.Ruleset;
 * import com.pulumi.cloudflare.RulesetArgs;
 * import com.pulumi.cloudflare.inputs.RulesetRuleArgs;
 * import com.pulumi.cloudflare.inputs.RulesetRuleActionParametersArgs;
 * import com.pulumi.cloudflare.inputs.RulesetRuleActionParametersOverridesArgs;
 * import com.pulumi.cloudflare.inputs.RulesetRuleActionParametersUriArgs;
 * import com.pulumi.cloudflare.inputs.RulesetRuleActionParametersUriPathArgs;
 * import com.pulumi.cloudflare.inputs.RulesetRuleActionParametersUriQueryArgs;
 * import com.pulumi.cloudflare.inputs.RulesetRuleRatelimitArgs;
 * import com.pulumi.cloudflare.inputs.RulesetRuleActionParametersOriginArgs;
 * import com.pulumi.cloudflare.inputs.RulesetRuleActionParametersBrowserTtlArgs;
 * import com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCacheKeyArgs;
 * import com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCacheKeyCustomKeyArgs;
 * import com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCacheKeyCustomKeyCookieArgs;
 * import com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCacheKeyCustomKeyHeaderArgs;
 * import com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCacheKeyCustomKeyHostArgs;
 * import com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCacheKeyCustomKeyQueryStringArgs;
 * import com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCacheKeyCustomKeyUserArgs;
 * import com.pulumi.cloudflare.inputs.RulesetRuleActionParametersEdgeTtlArgs;
 * import com.pulumi.cloudflare.inputs.RulesetRuleActionParametersServeStaleArgs;
 * import com.pulumi.cloudflare.inputs.RulesetRuleActionParametersFromListArgs;
 * import com.pulumi.cloudflare.inputs.RulesetRuleActionParametersFromValueArgs;
 * import com.pulumi.cloudflare.inputs.RulesetRuleActionParametersFromValueTargetUrlArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var magicTransitExample = new Ruleset(&#34;magicTransitExample&#34;, RulesetArgs.builder()        
 *             .accountId(&#34;f037e56e89293a057740de681ac9abbe&#34;)
 *             .description(&#34;example magic transit ruleset description&#34;)
 *             .kind(&#34;root&#34;)
 *             .name(&#34;account magic transit&#34;)
 *             .phase(&#34;magic_transit&#34;)
 *             .rules(RulesetRuleArgs.builder()
 *                 .action(&#34;allow&#34;)
 *                 .description(&#34;Allow TCP Ephemeral Ports&#34;)
 *                 .expression(&#34;tcp.dstport in { 32768..65535 }&#34;)
 *                 .build())
 *             .build());
 * 
 *         var zoneLevelManagedWaf = new Ruleset(&#34;zoneLevelManagedWaf&#34;, RulesetArgs.builder()        
 *             .description(&#34;managed WAF ruleset description&#34;)
 *             .kind(&#34;zone&#34;)
 *             .name(&#34;managed WAF&#34;)
 *             .phase(&#34;http_request_firewall_managed&#34;)
 *             .rules(RulesetRuleArgs.builder()
 *                 .action(&#34;execute&#34;)
 *                 .actionParameters(RulesetRuleActionParametersArgs.builder()
 *                     .id(&#34;efb7b8c949ac4650a09736fc376e9aee&#34;)
 *                     .build())
 *                 .description(&#34;Execute Cloudflare Managed Ruleset on my zone-level phase entry point ruleset&#34;)
 *                 .enabled(true)
 *                 .expression(&#34;(http.host eq \&#34;example.host.com\&#34;)&#34;)
 *                 .build())
 *             .zoneId(&#34;0da42c8d2132a9ddaf714f9e7c920711&#34;)
 *             .build());
 * 
 *         var zoneLevelManagedWafWithCategoryBasedOverrides = new Ruleset(&#34;zoneLevelManagedWafWithCategoryBasedOverrides&#34;, RulesetArgs.builder()        
 *             .description(&#34;managed WAF with tag-based overrides ruleset description&#34;)
 *             .kind(&#34;zone&#34;)
 *             .name(&#34;managed WAF with tag-based overrides&#34;)
 *             .phase(&#34;http_request_firewall_managed&#34;)
 *             .rules(RulesetRuleArgs.builder()
 *                 .action(&#34;execute&#34;)
 *                 .actionParameters(RulesetRuleActionParametersArgs.builder()
 *                     .id(&#34;efb7b8c949ac4650a09736fc376e9aee&#34;)
 *                     .overrides(RulesetRuleActionParametersOverridesArgs.builder()
 *                         .categories(                        
 *                             RulesetRuleActionParametersOverridesCategoryArgs.builder()
 *                                 .action(&#34;block&#34;)
 *                                 .category(&#34;wordpress&#34;)
 *                                 .status(&#34;enabled&#34;)
 *                                 .build(),
 *                             RulesetRuleActionParametersOverridesCategoryArgs.builder()
 *                                 .action(&#34;block&#34;)
 *                                 .category(&#34;joomla&#34;)
 *                                 .status(&#34;enabled&#34;)
 *                                 .build())
 *                         .build())
 *                     .build())
 *                 .description(&#34;overrides to only enable wordpress rules to block&#34;)
 *                 .enabled(false)
 *                 .expression(&#34;(http.host eq \&#34;example.host.com\&#34;)&#34;)
 *                 .build())
 *             .zoneId(&#34;0da42c8d2132a9ddaf714f9e7c920711&#34;)
 *             .build());
 * 
 *         var transformUriRulePath = new Ruleset(&#34;transformUriRulePath&#34;, RulesetArgs.builder()        
 *             .description(&#34;change the URI path to a new static path&#34;)
 *             .kind(&#34;zone&#34;)
 *             .name(&#34;transform rule for URI path&#34;)
 *             .phase(&#34;http_request_transform&#34;)
 *             .rules(RulesetRuleArgs.builder()
 *                 .action(&#34;rewrite&#34;)
 *                 .actionParameters(RulesetRuleActionParametersArgs.builder()
 *                     .uri(RulesetRuleActionParametersUriArgs.builder()
 *                         .path(RulesetRuleActionParametersUriPathArgs.builder()
 *                             .value(&#34;/my-new-route&#34;)
 *                             .build())
 *                         .build())
 *                     .build())
 *                 .description(&#34;example URI path transform rule&#34;)
 *                 .enabled(true)
 *                 .expression(&#34;(http.host eq \&#34;example.com\&#34; and http.request.uri.path eq \&#34;/old-path\&#34;)&#34;)
 *                 .build())
 *             .zoneId(&#34;0da42c8d2132a9ddaf714f9e7c920711&#34;)
 *             .build());
 * 
 *         var transformUriRuleQuery = new Ruleset(&#34;transformUriRuleQuery&#34;, RulesetArgs.builder()        
 *             .description(&#34;change the URI query to a new static query&#34;)
 *             .kind(&#34;zone&#34;)
 *             .name(&#34;transform rule for URI query parameter&#34;)
 *             .phase(&#34;http_request_transform&#34;)
 *             .rules(RulesetRuleArgs.builder()
 *                 .action(&#34;rewrite&#34;)
 *                 .actionParameters(RulesetRuleActionParametersArgs.builder()
 *                     .uri(RulesetRuleActionParametersUriArgs.builder()
 *                         .query(RulesetRuleActionParametersUriQueryArgs.builder()
 *                             .value(&#34;old=new_again&#34;)
 *                             .build())
 *                         .build())
 *                     .build())
 *                 .description(&#34;URI transformation query example&#34;)
 *                 .enabled(true)
 *                 .expression(&#34;(http.host eq \&#34;example.host.com\&#34;)&#34;)
 *                 .build())
 *             .zoneId(&#34;0da42c8d2132a9ddaf714f9e7c920711&#34;)
 *             .build());
 * 
 *         var transformUriHttpHeaders = new Ruleset(&#34;transformUriHttpHeaders&#34;, RulesetArgs.builder()        
 *             .description(&#34;modify HTTP headers before reaching origin&#34;)
 *             .kind(&#34;zone&#34;)
 *             .name(&#34;transform rule for HTTP headers&#34;)
 *             .phase(&#34;http_request_late_transform&#34;)
 *             .rules(RulesetRuleArgs.builder()
 *                 .action(&#34;rewrite&#34;)
 *                 .actionParameters(RulesetRuleActionParametersArgs.builder()
 *                     .headers(                    
 *                         RulesetRuleActionParametersHeaderArgs.builder()
 *                             .name(&#34;example-http-header-1&#34;)
 *                             .operation(&#34;set&#34;)
 *                             .value(&#34;my-http-header-value-1&#34;)
 *                             .build(),
 *                         RulesetRuleActionParametersHeaderArgs.builder()
 *                             .expression(&#34;cf.zone.name&#34;)
 *                             .name(&#34;example-http-header-2&#34;)
 *                             .operation(&#34;set&#34;)
 *                             .build(),
 *                         RulesetRuleActionParametersHeaderArgs.builder()
 *                             .name(&#34;example-http-header-3-to-remove&#34;)
 *                             .operation(&#34;remove&#34;)
 *                             .build())
 *                     .build())
 *                 .description(&#34;example request header transform rule&#34;)
 *                 .enabled(false)
 *                 .expression(&#34;(http.host eq \&#34;example.host.com\&#34;)&#34;)
 *                 .build())
 *             .zoneId(&#34;0da42c8d2132a9ddaf714f9e7c920711&#34;)
 *             .build());
 * 
 *         var rateLimitingExample = new Ruleset(&#34;rateLimitingExample&#34;, RulesetArgs.builder()        
 *             .description(&#34;apply HTTP rate limiting for a route&#34;)
 *             .kind(&#34;zone&#34;)
 *             .name(&#34;restrict API requests count&#34;)
 *             .phase(&#34;http_ratelimit&#34;)
 *             .rules(RulesetRuleArgs.builder()
 *                 .action(&#34;block&#34;)
 *                 .description(&#34;rate limit for API&#34;)
 *                 .enabled(true)
 *                 .expression(&#34;(http.request.uri.path matches \&#34;^/api/\&#34;)&#34;)
 *                 .ratelimit(RulesetRuleRatelimitArgs.builder()
 *                     .characteristics(                    
 *                         &#34;cf.colo.id&#34;,
 *                         &#34;ip.src&#34;)
 *                     .mitigationTimeout(600)
 *                     .period(60)
 *                     .requestsPerPeriod(100)
 *                     .build())
 *                 .build())
 *             .zoneId(&#34;0da42c8d2132a9ddaf714f9e7c920711&#34;)
 *             .build());
 * 
 *         var httpOriginExample = new Ruleset(&#34;httpOriginExample&#34;, RulesetArgs.builder()        
 *             .description(&#34;Change origin for a route&#34;)
 *             .kind(&#34;zone&#34;)
 *             .name(&#34;Change to some origin&#34;)
 *             .phase(&#34;http_request_origin&#34;)
 *             .rules(RulesetRuleArgs.builder()
 *                 .action(&#34;route&#34;)
 *                 .actionParameters(RulesetRuleActionParametersArgs.builder()
 *                     .hostHeader(&#34;some.host&#34;)
 *                     .origin(RulesetRuleActionParametersOriginArgs.builder()
 *                         .host(&#34;some.host&#34;)
 *                         .port(80)
 *                         .build())
 *                     .build())
 *                 .description(&#34;change origin to some.host&#34;)
 *                 .enabled(true)
 *                 .expression(&#34;(http.request.uri.path matches \&#34;^/api/\&#34;)&#34;)
 *                 .build())
 *             .zoneId(&#34;0da42c8d2132a9ddaf714f9e7c920711&#34;)
 *             .build());
 * 
 *         var customFieldsLoggingExample = new Ruleset(&#34;customFieldsLoggingExample&#34;, RulesetArgs.builder()        
 *             .description(&#34;add custom fields to logging&#34;)
 *             .kind(&#34;zone&#34;)
 *             .name(&#34;log custom fields&#34;)
 *             .phase(&#34;http_log_custom_fields&#34;)
 *             .rules(RulesetRuleArgs.builder()
 *                 .action(&#34;log_custom_field&#34;)
 *                 .actionParameters(RulesetRuleActionParametersArgs.builder()
 *                     .cookieFields(                    
 *                         &#34;__ga&#34;,
 *                         &#34;accountNumber&#34;,
 *                         &#34;__cfruid&#34;)
 *                     .requestFields(                    
 *                         &#34;content-type&#34;,
 *                         &#34;x-forwarded-for&#34;,
 *                         &#34;host&#34;)
 *                     .responseFields(                    
 *                         &#34;server&#34;,
 *                         &#34;content-type&#34;,
 *                         &#34;allow&#34;)
 *                     .build())
 *                 .description(&#34;log custom fields rule&#34;)
 *                 .enabled(true)
 *                 .expression(&#34;(http.host eq \&#34;example.host.com\&#34;)&#34;)
 *                 .build())
 *             .zoneId(&#34;0da42c8d2132a9ddaf714f9e7c920711&#34;)
 *             .build());
 * 
 *         var cacheSettingsExample = new Ruleset(&#34;cacheSettingsExample&#34;, RulesetArgs.builder()        
 *             .description(&#34;set cache settings for the request&#34;)
 *             .kind(&#34;zone&#34;)
 *             .name(&#34;set cache settings&#34;)
 *             .phase(&#34;http_request_cache_settings&#34;)
 *             .rules(RulesetRuleArgs.builder()
 *                 .action(&#34;set_cache_settings&#34;)
 *                 .actionParameters(RulesetRuleActionParametersArgs.builder()
 *                     .browserTtl(RulesetRuleActionParametersBrowserTtlArgs.builder()
 *                         .mode(&#34;respect_origin&#34;)
 *                         .build())
 *                     .cacheKey(RulesetRuleActionParametersCacheKeyArgs.builder()
 *                         .cacheDeceptionArmor(true)
 *                         .customKey(RulesetRuleActionParametersCacheKeyCustomKeyArgs.builder()
 *                             .cookie(RulesetRuleActionParametersCacheKeyCustomKeyCookieArgs.builder()
 *                                 .checkPresence(                                
 *                                     &#34;cabc_t&#34;,
 *                                     &#34;cdef_t&#34;)
 *                                 .include(                                
 *                                     &#34;cabc&#34;,
 *                                     &#34;cdef&#34;)
 *                                 .build())
 *                             .header(RulesetRuleActionParametersCacheKeyCustomKeyHeaderArgs.builder()
 *                                 .checkPresence(                                
 *                                     &#34;habc_t&#34;,
 *                                     &#34;hdef_t&#34;)
 *                                 .excludeOrigin(true)
 *                                 .include(                                
 *                                     &#34;habc&#34;,
 *                                     &#34;hdef&#34;)
 *                                 .build())
 *                             .host(RulesetRuleActionParametersCacheKeyCustomKeyHostArgs.builder()
 *                                 .resolved(true)
 *                                 .build())
 *                             .queryString(RulesetRuleActionParametersCacheKeyCustomKeyQueryStringArgs.builder()
 *                                 .exclude(&#34;*&#34;)
 *                                 .build())
 *                             .user(RulesetRuleActionParametersCacheKeyCustomKeyUserArgs.builder()
 *                                 .deviceType(true)
 *                                 .geo(false)
 *                                 .build())
 *                             .build())
 *                         .ignoreQueryStringsOrder(false)
 *                         .build())
 *                     .edgeTtl(RulesetRuleActionParametersEdgeTtlArgs.builder()
 *                         .default_(60)
 *                         .mode(&#34;override_origin&#34;)
 *                         .statusCodeTtl(                        
 *                             %!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference),
 *                             %!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                         .build())
 *                     .originErrorPagePassthru(false)
 *                     .respectStrongEtags(true)
 *                     .serveStale(RulesetRuleActionParametersServeStaleArgs.builder()
 *                         .disableStaleWhileUpdating(true)
 *                         .build())
 *                     .build())
 *                 .description(&#34;set cache settings rule&#34;)
 *                 .enabled(true)
 *                 .expression(&#34;(http.host eq \&#34;example.host.com\&#34;)&#34;)
 *                 .build())
 *             .zoneId(&#34;0da42c8d2132a9ddaf714f9e7c920711&#34;)
 *             .build());
 * 
 *         var redirectFromListExample = new Ruleset(&#34;redirectFromListExample&#34;, RulesetArgs.builder()        
 *             .accountId(&#34;f037e56e89293a057740de681ac9abbe&#34;)
 *             .description(&#34;Redirect ruleset&#34;)
 *             .kind(&#34;root&#34;)
 *             .name(&#34;redirects&#34;)
 *             .phase(&#34;http_request_redirect&#34;)
 *             .rules(RulesetRuleArgs.builder()
 *                 .action(&#34;redirect&#34;)
 *                 .actionParameters(RulesetRuleActionParametersArgs.builder()
 *                     .fromList(RulesetRuleActionParametersFromListArgs.builder()
 *                         .key(&#34;http.request.full_uri&#34;)
 *                         .name(&#34;redirect_list&#34;)
 *                         .build())
 *                     .build())
 *                 .description(&#34;Apply redirects from redirect_list&#34;)
 *                 .enabled(true)
 *                 .expression(&#34;http.request.full_uri in $redirect_list&#34;)
 *                 .build())
 *             .build());
 * 
 *         var redirectFromValueExample = new Ruleset(&#34;redirectFromValueExample&#34;, RulesetArgs.builder()        
 *             .description(&#34;Redirect ruleset&#34;)
 *             .kind(&#34;root&#34;)
 *             .name(&#34;redirects&#34;)
 *             .phase(&#34;http_request_dynamic_redirect&#34;)
 *             .rules(RulesetRuleArgs.builder()
 *                 .action(&#34;redirect&#34;)
 *                 .actionParameters(RulesetRuleActionParametersArgs.builder()
 *                     .fromValue(RulesetRuleActionParametersFromValueArgs.builder()
 *                         .preserveQueryString(true)
 *                         .statusCode(301)
 *                         .targetUrl(RulesetRuleActionParametersFromValueTargetUrlArgs.builder()
 *                             .value(&#34;some_host.com&#34;)
 *                             .build())
 *                         .build())
 *                     .build())
 *                 .description(&#34;Apply redirect from value&#34;)
 *                 .enabled(true)
 *                 .expression(&#34;(http.request.uri.path matches \&#34;^/api/\&#34;)&#34;)
 *                 .build())
 *             .zoneId(&#34;0da42c8d2132a9ddaf714f9e7c920711&#34;)
 *             .build());
 * 
 *         var httpCustomErrorExample = new Ruleset(&#34;httpCustomErrorExample&#34;, RulesetArgs.builder()        
 *             .description(&#34;Serve some error response&#34;)
 *             .kind(&#34;zone&#34;)
 *             .name(&#34;Serve some error response&#34;)
 *             .phase(&#34;http_custom_errors&#34;)
 *             .rules(RulesetRuleArgs.builder()
 *                 .action(&#34;serve_error&#34;)
 *                 .actionParameters(RulesetRuleActionParametersArgs.builder()
 *                     .content(&#34;some error html&#34;)
 *                     .contentType(&#34;text/html&#34;)
 *                     .statusCode(&#34;530&#34;)
 *                     .build())
 *                 .description(&#34;serve some error response&#34;)
 *                 .enabled(true)
 *                 .expression(&#34;(http.request.uri.path matches \&#34;^/api/\&#34;)&#34;)
 *                 .build())
 *             .zoneId(&#34;0da42c8d2132a9ddaf714f9e7c920711&#34;)
 *             .build());
 * 
 *         var httpConfigRulesExample = new Ruleset(&#34;httpConfigRulesExample&#34;, RulesetArgs.builder()        
 *             .description(&#34;set config rules for request&#34;)
 *             .kind(&#34;zone&#34;)
 *             .name(&#34;set config rules&#34;)
 *             .phase(&#34;http_config_settings&#34;)
 *             .rules(RulesetRuleArgs.builder()
 *                 .action(&#34;set_config&#34;)
 *                 .actionParameters(RulesetRuleActionParametersArgs.builder()
 *                     .bic(true)
 *                     .emailObfuscation(true)
 *                     .build())
 *                 .description(&#34;set config rules for matching request&#34;)
 *                 .enabled(true)
 *                 .expression(&#34;(http.request.uri.path matches \&#34;^/api/\&#34;)&#34;)
 *                 .build())
 *             .zoneId(&#34;0da42c8d2132a9ddaf714f9e7c920711&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Import is not supported for this resource.
 * 
 */
@ResourceType(type="cloudflare:index/ruleset:Ruleset")
public class Ruleset extends com.pulumi.resources.CustomResource {
    /**
     * The account identifier to target for the resource. Conflicts with `zone_id`.
     * 
     */
    @Export(name="accountId", type=String.class, parameters={})
    private Output</* @Nullable */ String> accountId;

    /**
     * @return The account identifier to target for the resource. Conflicts with `zone_id`.
     * 
     */
    public Output<Optional<String>> accountId() {
        return Codegen.optional(this.accountId);
    }
    /**
     * Brief summary of the ruleset and its intended use.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Brief summary of the ruleset and its intended use.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Type of Ruleset to create. Available values: `custom`, `managed`, `root`, `schema`, `zone`.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Type of Ruleset to create. Available values: `custom`, `managed`, `root`, `schema`, `zone`.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * Name of the ruleset.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the ruleset.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Point in the request/response lifecycle where the ruleset will be created. Available values: `ddos_l4`, `ddos_l7`, `http_custom_errors`, `http_log_custom_fields`, `http_request_cache_settings`, `http_request_firewall_custom`, `http_request_firewall_managed`, `http_request_late_transform`, `http_request_late_transform_managed`, `http_request_main`, `http_request_origin`, `http_request_dynamic_redirect`, `http_request_redirect`, `http_request_sanitize`, `http_request_transform`, `http_response_firewall_managed`, `http_response_headers_transform`, `http_response_headers_transform_managed`, `magic_transit`, `http_ratelimit`, `http_request_sbfm`, `http_config_settings`.
     * 
     */
    @Export(name="phase", type=String.class, parameters={})
    private Output<String> phase;

    /**
     * @return Point in the request/response lifecycle where the ruleset will be created. Available values: `ddos_l4`, `ddos_l7`, `http_custom_errors`, `http_log_custom_fields`, `http_request_cache_settings`, `http_request_firewall_custom`, `http_request_firewall_managed`, `http_request_late_transform`, `http_request_late_transform_managed`, `http_request_main`, `http_request_origin`, `http_request_dynamic_redirect`, `http_request_redirect`, `http_request_sanitize`, `http_request_transform`, `http_response_firewall_managed`, `http_response_headers_transform`, `http_response_headers_transform_managed`, `magic_transit`, `http_ratelimit`, `http_request_sbfm`, `http_config_settings`.
     * 
     */
    public Output<String> phase() {
        return this.phase;
    }
    /**
     * List of rules to apply to the ruleset.
     * 
     */
    @Export(name="rules", type=List.class, parameters={RulesetRule.class})
    private Output</* @Nullable */ List<RulesetRule>> rules;

    /**
     * @return List of rules to apply to the ruleset.
     * 
     */
    public Output<Optional<List<RulesetRule>>> rules() {
        return Codegen.optional(this.rules);
    }
    /**
     * Name of entitlement that is shareable between entities.
     * 
     */
    @Export(name="shareableEntitlementName", type=String.class, parameters={})
    private Output</* @Nullable */ String> shareableEntitlementName;

    /**
     * @return Name of entitlement that is shareable between entities.
     * 
     */
    public Output<Optional<String>> shareableEntitlementName() {
        return Codegen.optional(this.shareableEntitlementName);
    }
    /**
     * The zone identifier to target for the resource. Conflicts with `account_id`.
     * 
     */
    @Export(name="zoneId", type=String.class, parameters={})
    private Output</* @Nullable */ String> zoneId;

    /**
     * @return The zone identifier to target for the resource. Conflicts with `account_id`.
     * 
     */
    public Output<Optional<String>> zoneId() {
        return Codegen.optional(this.zoneId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Ruleset(String name) {
        this(name, RulesetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Ruleset(String name, RulesetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Ruleset(String name, RulesetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/ruleset:Ruleset", name, args == null ? RulesetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Ruleset(String name, Output<String> id, @Nullable RulesetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/ruleset:Ruleset", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Ruleset get(String name, Output<String> id, @Nullable RulesetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Ruleset(name, id, state, options);
    }
}
