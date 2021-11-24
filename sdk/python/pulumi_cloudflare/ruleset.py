# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['RulesetArgs', 'Ruleset']

@pulumi.input_type
class RulesetArgs:
    def __init__(__self__, *,
                 description: pulumi.Input[str],
                 kind: pulumi.Input[str],
                 name: pulumi.Input[str],
                 phase: pulumi.Input[str],
                 account_id: Optional[pulumi.Input[str]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input['RulesetRuleArgs']]]] = None,
                 shareable_entitlement_name: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Ruleset resource.
        :param pulumi.Input[str] description: Brief summary of the ruleset rule and its intended use.
        :param pulumi.Input[str] kind: Type of Ruleset to create. Valid values are `"custom"`, `"managed"`, `"root"`, `"schema"` or `"zone"`.
        :param pulumi.Input[str] name: Name of the HTTP request header to target.
        :param pulumi.Input[str] phase: Point in the request/response lifecycle where the ruleset will be created. Valid values are `"ddos_l4"`, `"ddos_l7"`, `"http_request_firewall_custom"`, `"http_request_firewall_managed"`, `"http_request_late_transform"`, `"http_request_main"`, `"http_request_sanitize"`, `"http_request_transform"`, `"http_response_firewall_managed"`, `"magic_transit"`, or `"http_ratelimit"`.
        :param pulumi.Input[str] account_id: The ID of the account where the ruleset is being created. Conflicts with `"zone_id"`.
        :param pulumi.Input[Sequence[pulumi.Input['RulesetRuleArgs']]] rules: List of rule-based overrides (refer to the nested schema).
        :param pulumi.Input[str] shareable_entitlement_name: Name of entitlement that is shareable between entities.
        :param pulumi.Input[str] zone_id: The ID of the zone where the ruleset is being created. Conflicts with `"account_id"`.
        """
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "kind", kind)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "phase", phase)
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if rules is not None:
            pulumi.set(__self__, "rules", rules)
        if shareable_entitlement_name is not None:
            pulumi.set(__self__, "shareable_entitlement_name", shareable_entitlement_name)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Input[str]:
        """
        Brief summary of the ruleset rule and its intended use.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: pulumi.Input[str]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def kind(self) -> pulumi.Input[str]:
        """
        Type of Ruleset to create. Valid values are `"custom"`, `"managed"`, `"root"`, `"schema"` or `"zone"`.
        """
        return pulumi.get(self, "kind")

    @kind.setter
    def kind(self, value: pulumi.Input[str]):
        pulumi.set(self, "kind", value)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        Name of the HTTP request header to target.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def phase(self) -> pulumi.Input[str]:
        """
        Point in the request/response lifecycle where the ruleset will be created. Valid values are `"ddos_l4"`, `"ddos_l7"`, `"http_request_firewall_custom"`, `"http_request_firewall_managed"`, `"http_request_late_transform"`, `"http_request_main"`, `"http_request_sanitize"`, `"http_request_transform"`, `"http_response_firewall_managed"`, `"magic_transit"`, or `"http_ratelimit"`.
        """
        return pulumi.get(self, "phase")

    @phase.setter
    def phase(self, value: pulumi.Input[str]):
        pulumi.set(self, "phase", value)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the account where the ruleset is being created. Conflicts with `"zone_id"`.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['RulesetRuleArgs']]]]:
        """
        List of rule-based overrides (refer to the nested schema).
        """
        return pulumi.get(self, "rules")

    @rules.setter
    def rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['RulesetRuleArgs']]]]):
        pulumi.set(self, "rules", value)

    @property
    @pulumi.getter(name="shareableEntitlementName")
    def shareable_entitlement_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of entitlement that is shareable between entities.
        """
        return pulumi.get(self, "shareable_entitlement_name")

    @shareable_entitlement_name.setter
    def shareable_entitlement_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "shareable_entitlement_name", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the zone where the ruleset is being created. Conflicts with `"account_id"`.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


@pulumi.input_type
class _RulesetState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 phase: Optional[pulumi.Input[str]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input['RulesetRuleArgs']]]] = None,
                 shareable_entitlement_name: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Ruleset resources.
        :param pulumi.Input[str] account_id: The ID of the account where the ruleset is being created. Conflicts with `"zone_id"`.
        :param pulumi.Input[str] description: Brief summary of the ruleset rule and its intended use.
        :param pulumi.Input[str] kind: Type of Ruleset to create. Valid values are `"custom"`, `"managed"`, `"root"`, `"schema"` or `"zone"`.
        :param pulumi.Input[str] name: Name of the HTTP request header to target.
        :param pulumi.Input[str] phase: Point in the request/response lifecycle where the ruleset will be created. Valid values are `"ddos_l4"`, `"ddos_l7"`, `"http_request_firewall_custom"`, `"http_request_firewall_managed"`, `"http_request_late_transform"`, `"http_request_main"`, `"http_request_sanitize"`, `"http_request_transform"`, `"http_response_firewall_managed"`, `"magic_transit"`, or `"http_ratelimit"`.
        :param pulumi.Input[Sequence[pulumi.Input['RulesetRuleArgs']]] rules: List of rule-based overrides (refer to the nested schema).
        :param pulumi.Input[str] shareable_entitlement_name: Name of entitlement that is shareable between entities.
        :param pulumi.Input[str] zone_id: The ID of the zone where the ruleset is being created. Conflicts with `"account_id"`.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if kind is not None:
            pulumi.set(__self__, "kind", kind)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if phase is not None:
            pulumi.set(__self__, "phase", phase)
        if rules is not None:
            pulumi.set(__self__, "rules", rules)
        if shareable_entitlement_name is not None:
            pulumi.set(__self__, "shareable_entitlement_name", shareable_entitlement_name)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the account where the ruleset is being created. Conflicts with `"zone_id"`.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Brief summary of the ruleset rule and its intended use.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def kind(self) -> Optional[pulumi.Input[str]]:
        """
        Type of Ruleset to create. Valid values are `"custom"`, `"managed"`, `"root"`, `"schema"` or `"zone"`.
        """
        return pulumi.get(self, "kind")

    @kind.setter
    def kind(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kind", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the HTTP request header to target.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def phase(self) -> Optional[pulumi.Input[str]]:
        """
        Point in the request/response lifecycle where the ruleset will be created. Valid values are `"ddos_l4"`, `"ddos_l7"`, `"http_request_firewall_custom"`, `"http_request_firewall_managed"`, `"http_request_late_transform"`, `"http_request_main"`, `"http_request_sanitize"`, `"http_request_transform"`, `"http_response_firewall_managed"`, `"magic_transit"`, or `"http_ratelimit"`.
        """
        return pulumi.get(self, "phase")

    @phase.setter
    def phase(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "phase", value)

    @property
    @pulumi.getter
    def rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['RulesetRuleArgs']]]]:
        """
        List of rule-based overrides (refer to the nested schema).
        """
        return pulumi.get(self, "rules")

    @rules.setter
    def rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['RulesetRuleArgs']]]]):
        pulumi.set(self, "rules", value)

    @property
    @pulumi.getter(name="shareableEntitlementName")
    def shareable_entitlement_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of entitlement that is shareable between entities.
        """
        return pulumi.get(self, "shareable_entitlement_name")

    @shareable_entitlement_name.setter
    def shareable_entitlement_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "shareable_entitlement_name", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the zone where the ruleset is being created. Conflicts with `"account_id"`.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


class Ruleset(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 phase: Optional[pulumi.Input[str]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RulesetRuleArgs']]]]] = None,
                 shareable_entitlement_name: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        The [Cloudflare Ruleset Engine](https://developers.cloudflare.com/firewall/cf-rulesets)
        allows you to create and deploy rules and rulesets.
        The engine syntax, inspired by the Wireshark Display Filter language, is the
        same syntax used in custom Firewall Rules. Cloudflare uses the Ruleset Engine
        in different products, allowing you to configure several products using the same
        basic syntax.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        # Magic Transit
        magic_transit_example = cloudflare.Ruleset("magicTransitExample",
            account_id="d41d8cd98f00b204e9800998ecf8427e",
            description="example magic transit ruleset description",
            kind="root",
            name="account magic transit",
            phase="magic_transit",
            rules=[cloudflare.RulesetRuleArgs(
                action="allow",
                description="Allow TCP Ephemeral Ports",
                expression="tcp.dstport in { 32768..65535 }",
            )])
        # Zone-level WAF Managed Ruleset
        zone_level_managed_waf = cloudflare.Ruleset("zoneLevelManagedWaf",
            description="managed WAF ruleset description",
            kind="zone",
            name="managed WAF",
            phase="http_request_firewall_managed",
            rules=[cloudflare.RulesetRuleArgs(
                action="execute",
                action_parameters=cloudflare.RulesetRuleActionParametersArgs(
                    id="efb7b8c949ac4650a09736fc376e9aee",
                ),
                description="Execute Cloudflare Managed Ruleset on my zone-level phase entry point ruleset",
                enabled=True,
                expression="true",
            )],
            zone_id="cb029e245cfdd66dc8d2e570d5dd3322")
        # Zone-level WAF with tag-based overrides
        zone_level_managed_waf_with_category_based_overrides = cloudflare.Ruleset("zoneLevelManagedWafWithCategoryBasedOverrides",
            description="managed WAF with tag-based overrides ruleset description",
            kind="zone",
            name="managed WAF with tag-based overrides",
            phase="http_request_firewall_managed",
            rules=[cloudflare.RulesetRuleArgs(
                action="execute",
                action_parameters=cloudflare.RulesetRuleActionParametersArgs(
                    id="efb7b8c949ac4650a09736fc376e9aee",
                    overrides=cloudflare.RulesetRuleActionParametersOverridesArgs(
                        categories=[
                            cloudflare.RulesetRuleActionParametersOverridesCategoryArgs(
                                action="block",
                                category="wordpress",
                                enabled=True,
                            ),
                            cloudflare.RulesetRuleActionParametersOverridesCategoryArgs(
                                action="block",
                                category="joomla",
                                enabled=True,
                            ),
                        ],
                    ),
                ),
                description="overrides to only enable wordpress rules to block",
                enabled=False,
                expression="true",
            )],
            zone_id="cb029e245cfdd66dc8d2e570d5dd3322")
        # Rewrite the URI path component to a static path
        transform_uri_rule_path = cloudflare.Ruleset("transformUriRulePath",
            description="change the URI path to a new static path",
            kind="zone",
            name="transform rule for URI path",
            phase="http_request_transform",
            rules=[cloudflare.RulesetRuleArgs(
                action="rewrite",
                action_parameters=cloudflare.RulesetRuleActionParametersArgs(
                    uri=cloudflare.RulesetRuleActionParametersUriArgs(
                        path=cloudflare.RulesetRuleActionParametersUriPathArgs(
                            value="/my-new-route",
                        ),
                    ),
                ),
                description="example URI path transform rule",
                enabled=True,
                expression="(http.host eq \"example.com\" and http.uri.path eq \"/old-path\")",
            )],
            zone_id="cb029e245cfdd66dc8d2e570d5dd3322")
        # Rewrite the URI query component to a static query
        transform_uri_rule_query = cloudflare.Ruleset("transformUriRuleQuery",
            description="change the URI query to a new static query",
            kind="zone",
            name="transform rule for URI query parameter",
            phase="http_request_transform",
            rules=[cloudflare.RulesetRuleArgs(
                action="rewrite",
                action_parameters=cloudflare.RulesetRuleActionParametersArgs(
                    uri=cloudflare.RulesetRuleActionParametersUriArgs(
                        query=cloudflare.RulesetRuleActionParametersUriQueryArgs(
                            value="old=new_again",
                        ),
                    ),
                ),
                description="URI transformation query example",
                enabled=True,
                expression="true",
            )],
            zone_id="cb029e245cfdd66dc8d2e570d5dd3322")
        # Rewrite HTTP headers to a modified values
        transform_uri_http_headers = cloudflare.Ruleset("transformUriHttpHeaders",
            description="modify HTTP headers before reaching origin",
            kind="zone",
            name="transform rule for HTTP headers",
            phase="http_request_late_transform",
            rules=[cloudflare.RulesetRuleArgs(
                action="rewrite",
                action_parameters=cloudflare.RulesetRuleActionParametersArgs(
                    headers=[
                        cloudflare.RulesetRuleActionParametersHeaderArgs(
                            name="example-http-header-1",
                            operation="set",
                            value="my-http-header-value-1",
                        ),
                        cloudflare.RulesetRuleActionParametersHeaderArgs(
                            expression="cf.zone.name",
                            name="example-http-header-2",
                            operation="set",
                        ),
                        cloudflare.RulesetRuleActionParametersHeaderArgs(
                            name="example-http-header-3-to-remove",
                            operation="remove",
                        ),
                    ],
                ),
                description="example request header transform rule",
                enabled=False,
                expression="true",
            )],
            zone_id="cb029e245cfdd66dc8d2e570d5dd3322")
        # HTTP rate limit for an API route
        rate_limiting_example = cloudflare.Ruleset("rateLimitingExample",
            description="apply HTTP rate limiting for a route",
            kind="zone",
            name="restrict API requests count",
            phase="http_ratelimit",
            rules=[cloudflare.RulesetRuleArgs(
                action="block",
                description="rate limit for API",
                enabled=True,
                expression="(http.request.uri.path matches \"^/api/\")",
                ratelimit=cloudflare.RulesetRuleRatelimitArgs(
                    characteristics=[
                        "cf.colo.id",
                        "ip.src",
                    ],
                    mitigation_timeout=600,
                    period=60,
                    requests_per_period=100,
                ),
            )],
            zone_id="cb029e245cfdd66dc8d2e570d5dd3322")
        ```

        ## Import

        Currently, you cannot import rulesets.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The ID of the account where the ruleset is being created. Conflicts with `"zone_id"`.
        :param pulumi.Input[str] description: Brief summary of the ruleset rule and its intended use.
        :param pulumi.Input[str] kind: Type of Ruleset to create. Valid values are `"custom"`, `"managed"`, `"root"`, `"schema"` or `"zone"`.
        :param pulumi.Input[str] name: Name of the HTTP request header to target.
        :param pulumi.Input[str] phase: Point in the request/response lifecycle where the ruleset will be created. Valid values are `"ddos_l4"`, `"ddos_l7"`, `"http_request_firewall_custom"`, `"http_request_firewall_managed"`, `"http_request_late_transform"`, `"http_request_main"`, `"http_request_sanitize"`, `"http_request_transform"`, `"http_response_firewall_managed"`, `"magic_transit"`, or `"http_ratelimit"`.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RulesetRuleArgs']]]] rules: List of rule-based overrides (refer to the nested schema).
        :param pulumi.Input[str] shareable_entitlement_name: Name of entitlement that is shareable between entities.
        :param pulumi.Input[str] zone_id: The ID of the zone where the ruleset is being created. Conflicts with `"account_id"`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RulesetArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        The [Cloudflare Ruleset Engine](https://developers.cloudflare.com/firewall/cf-rulesets)
        allows you to create and deploy rules and rulesets.
        The engine syntax, inspired by the Wireshark Display Filter language, is the
        same syntax used in custom Firewall Rules. Cloudflare uses the Ruleset Engine
        in different products, allowing you to configure several products using the same
        basic syntax.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        # Magic Transit
        magic_transit_example = cloudflare.Ruleset("magicTransitExample",
            account_id="d41d8cd98f00b204e9800998ecf8427e",
            description="example magic transit ruleset description",
            kind="root",
            name="account magic transit",
            phase="magic_transit",
            rules=[cloudflare.RulesetRuleArgs(
                action="allow",
                description="Allow TCP Ephemeral Ports",
                expression="tcp.dstport in { 32768..65535 }",
            )])
        # Zone-level WAF Managed Ruleset
        zone_level_managed_waf = cloudflare.Ruleset("zoneLevelManagedWaf",
            description="managed WAF ruleset description",
            kind="zone",
            name="managed WAF",
            phase="http_request_firewall_managed",
            rules=[cloudflare.RulesetRuleArgs(
                action="execute",
                action_parameters=cloudflare.RulesetRuleActionParametersArgs(
                    id="efb7b8c949ac4650a09736fc376e9aee",
                ),
                description="Execute Cloudflare Managed Ruleset on my zone-level phase entry point ruleset",
                enabled=True,
                expression="true",
            )],
            zone_id="cb029e245cfdd66dc8d2e570d5dd3322")
        # Zone-level WAF with tag-based overrides
        zone_level_managed_waf_with_category_based_overrides = cloudflare.Ruleset("zoneLevelManagedWafWithCategoryBasedOverrides",
            description="managed WAF with tag-based overrides ruleset description",
            kind="zone",
            name="managed WAF with tag-based overrides",
            phase="http_request_firewall_managed",
            rules=[cloudflare.RulesetRuleArgs(
                action="execute",
                action_parameters=cloudflare.RulesetRuleActionParametersArgs(
                    id="efb7b8c949ac4650a09736fc376e9aee",
                    overrides=cloudflare.RulesetRuleActionParametersOverridesArgs(
                        categories=[
                            cloudflare.RulesetRuleActionParametersOverridesCategoryArgs(
                                action="block",
                                category="wordpress",
                                enabled=True,
                            ),
                            cloudflare.RulesetRuleActionParametersOverridesCategoryArgs(
                                action="block",
                                category="joomla",
                                enabled=True,
                            ),
                        ],
                    ),
                ),
                description="overrides to only enable wordpress rules to block",
                enabled=False,
                expression="true",
            )],
            zone_id="cb029e245cfdd66dc8d2e570d5dd3322")
        # Rewrite the URI path component to a static path
        transform_uri_rule_path = cloudflare.Ruleset("transformUriRulePath",
            description="change the URI path to a new static path",
            kind="zone",
            name="transform rule for URI path",
            phase="http_request_transform",
            rules=[cloudflare.RulesetRuleArgs(
                action="rewrite",
                action_parameters=cloudflare.RulesetRuleActionParametersArgs(
                    uri=cloudflare.RulesetRuleActionParametersUriArgs(
                        path=cloudflare.RulesetRuleActionParametersUriPathArgs(
                            value="/my-new-route",
                        ),
                    ),
                ),
                description="example URI path transform rule",
                enabled=True,
                expression="(http.host eq \"example.com\" and http.uri.path eq \"/old-path\")",
            )],
            zone_id="cb029e245cfdd66dc8d2e570d5dd3322")
        # Rewrite the URI query component to a static query
        transform_uri_rule_query = cloudflare.Ruleset("transformUriRuleQuery",
            description="change the URI query to a new static query",
            kind="zone",
            name="transform rule for URI query parameter",
            phase="http_request_transform",
            rules=[cloudflare.RulesetRuleArgs(
                action="rewrite",
                action_parameters=cloudflare.RulesetRuleActionParametersArgs(
                    uri=cloudflare.RulesetRuleActionParametersUriArgs(
                        query=cloudflare.RulesetRuleActionParametersUriQueryArgs(
                            value="old=new_again",
                        ),
                    ),
                ),
                description="URI transformation query example",
                enabled=True,
                expression="true",
            )],
            zone_id="cb029e245cfdd66dc8d2e570d5dd3322")
        # Rewrite HTTP headers to a modified values
        transform_uri_http_headers = cloudflare.Ruleset("transformUriHttpHeaders",
            description="modify HTTP headers before reaching origin",
            kind="zone",
            name="transform rule for HTTP headers",
            phase="http_request_late_transform",
            rules=[cloudflare.RulesetRuleArgs(
                action="rewrite",
                action_parameters=cloudflare.RulesetRuleActionParametersArgs(
                    headers=[
                        cloudflare.RulesetRuleActionParametersHeaderArgs(
                            name="example-http-header-1",
                            operation="set",
                            value="my-http-header-value-1",
                        ),
                        cloudflare.RulesetRuleActionParametersHeaderArgs(
                            expression="cf.zone.name",
                            name="example-http-header-2",
                            operation="set",
                        ),
                        cloudflare.RulesetRuleActionParametersHeaderArgs(
                            name="example-http-header-3-to-remove",
                            operation="remove",
                        ),
                    ],
                ),
                description="example request header transform rule",
                enabled=False,
                expression="true",
            )],
            zone_id="cb029e245cfdd66dc8d2e570d5dd3322")
        # HTTP rate limit for an API route
        rate_limiting_example = cloudflare.Ruleset("rateLimitingExample",
            description="apply HTTP rate limiting for a route",
            kind="zone",
            name="restrict API requests count",
            phase="http_ratelimit",
            rules=[cloudflare.RulesetRuleArgs(
                action="block",
                description="rate limit for API",
                enabled=True,
                expression="(http.request.uri.path matches \"^/api/\")",
                ratelimit=cloudflare.RulesetRuleRatelimitArgs(
                    characteristics=[
                        "cf.colo.id",
                        "ip.src",
                    ],
                    mitigation_timeout=600,
                    period=60,
                    requests_per_period=100,
                ),
            )],
            zone_id="cb029e245cfdd66dc8d2e570d5dd3322")
        ```

        ## Import

        Currently, you cannot import rulesets.

        :param str resource_name: The name of the resource.
        :param RulesetArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RulesetArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 phase: Optional[pulumi.Input[str]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RulesetRuleArgs']]]]] = None,
                 shareable_entitlement_name: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RulesetArgs.__new__(RulesetArgs)

            __props__.__dict__["account_id"] = account_id
            if description is None and not opts.urn:
                raise TypeError("Missing required property 'description'")
            __props__.__dict__["description"] = description
            if kind is None and not opts.urn:
                raise TypeError("Missing required property 'kind'")
            __props__.__dict__["kind"] = kind
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
            if phase is None and not opts.urn:
                raise TypeError("Missing required property 'phase'")
            __props__.__dict__["phase"] = phase
            __props__.__dict__["rules"] = rules
            __props__.__dict__["shareable_entitlement_name"] = shareable_entitlement_name
            __props__.__dict__["zone_id"] = zone_id
        super(Ruleset, __self__).__init__(
            'cloudflare:index/ruleset:Ruleset',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            kind: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            phase: Optional[pulumi.Input[str]] = None,
            rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RulesetRuleArgs']]]]] = None,
            shareable_entitlement_name: Optional[pulumi.Input[str]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'Ruleset':
        """
        Get an existing Ruleset resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The ID of the account where the ruleset is being created. Conflicts with `"zone_id"`.
        :param pulumi.Input[str] description: Brief summary of the ruleset rule and its intended use.
        :param pulumi.Input[str] kind: Type of Ruleset to create. Valid values are `"custom"`, `"managed"`, `"root"`, `"schema"` or `"zone"`.
        :param pulumi.Input[str] name: Name of the HTTP request header to target.
        :param pulumi.Input[str] phase: Point in the request/response lifecycle where the ruleset will be created. Valid values are `"ddos_l4"`, `"ddos_l7"`, `"http_request_firewall_custom"`, `"http_request_firewall_managed"`, `"http_request_late_transform"`, `"http_request_main"`, `"http_request_sanitize"`, `"http_request_transform"`, `"http_response_firewall_managed"`, `"magic_transit"`, or `"http_ratelimit"`.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RulesetRuleArgs']]]] rules: List of rule-based overrides (refer to the nested schema).
        :param pulumi.Input[str] shareable_entitlement_name: Name of entitlement that is shareable between entities.
        :param pulumi.Input[str] zone_id: The ID of the zone where the ruleset is being created. Conflicts with `"account_id"`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RulesetState.__new__(_RulesetState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["description"] = description
        __props__.__dict__["kind"] = kind
        __props__.__dict__["name"] = name
        __props__.__dict__["phase"] = phase
        __props__.__dict__["rules"] = rules
        __props__.__dict__["shareable_entitlement_name"] = shareable_entitlement_name
        __props__.__dict__["zone_id"] = zone_id
        return Ruleset(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[Optional[str]]:
        """
        The ID of the account where the ruleset is being created. Conflicts with `"zone_id"`.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        Brief summary of the ruleset rule and its intended use.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def kind(self) -> pulumi.Output[str]:
        """
        Type of Ruleset to create. Valid values are `"custom"`, `"managed"`, `"root"`, `"schema"` or `"zone"`.
        """
        return pulumi.get(self, "kind")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the HTTP request header to target.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def phase(self) -> pulumi.Output[str]:
        """
        Point in the request/response lifecycle where the ruleset will be created. Valid values are `"ddos_l4"`, `"ddos_l7"`, `"http_request_firewall_custom"`, `"http_request_firewall_managed"`, `"http_request_late_transform"`, `"http_request_main"`, `"http_request_sanitize"`, `"http_request_transform"`, `"http_response_firewall_managed"`, `"magic_transit"`, or `"http_ratelimit"`.
        """
        return pulumi.get(self, "phase")

    @property
    @pulumi.getter
    def rules(self) -> pulumi.Output[Optional[Sequence['outputs.RulesetRule']]]:
        """
        List of rule-based overrides (refer to the nested schema).
        """
        return pulumi.get(self, "rules")

    @property
    @pulumi.getter(name="shareableEntitlementName")
    def shareable_entitlement_name(self) -> pulumi.Output[Optional[str]]:
        """
        Name of entitlement that is shareable between entities.
        """
        return pulumi.get(self, "shareable_entitlement_name")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[Optional[str]]:
        """
        The ID of the zone where the ruleset is being created. Conflicts with `"account_id"`.
        """
        return pulumi.get(self, "zone_id")
