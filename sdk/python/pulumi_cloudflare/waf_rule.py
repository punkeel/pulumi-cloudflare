# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['WafRuleArgs', 'WafRule']

@pulumi.input_type
class WafRuleArgs:
    def __init__(__self__, *,
                 mode: pulumi.Input[str],
                 rule_id: pulumi.Input[str],
                 zone_id: pulumi.Input[str],
                 package_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a WafRule resource.
        :param pulumi.Input[str] mode: The mode of the rule, can be one of ["block", "challenge", "default", "disable", "simulate"] or ["on", "off"] depending on the WAF Rule type.
        :param pulumi.Input[str] rule_id: The WAF Rule ID.
        :param pulumi.Input[str] zone_id: The DNS zone ID to apply to.
        :param pulumi.Input[str] package_id: The ID of the WAF Rule Package that contains the rule.
        """
        pulumi.set(__self__, "mode", mode)
        pulumi.set(__self__, "rule_id", rule_id)
        pulumi.set(__self__, "zone_id", zone_id)
        if package_id is not None:
            pulumi.set(__self__, "package_id", package_id)

    @property
    @pulumi.getter
    def mode(self) -> pulumi.Input[str]:
        """
        The mode of the rule, can be one of ["block", "challenge", "default", "disable", "simulate"] or ["on", "off"] depending on the WAF Rule type.
        """
        return pulumi.get(self, "mode")

    @mode.setter
    def mode(self, value: pulumi.Input[str]):
        pulumi.set(self, "mode", value)

    @property
    @pulumi.getter(name="ruleId")
    def rule_id(self) -> pulumi.Input[str]:
        """
        The WAF Rule ID.
        """
        return pulumi.get(self, "rule_id")

    @rule_id.setter
    def rule_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "rule_id", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Input[str]:
        """
        The DNS zone ID to apply to.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "zone_id", value)

    @property
    @pulumi.getter(name="packageId")
    def package_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the WAF Rule Package that contains the rule.
        """
        return pulumi.get(self, "package_id")

    @package_id.setter
    def package_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "package_id", value)


@pulumi.input_type
class _WafRuleState:
    def __init__(__self__, *,
                 group_id: Optional[pulumi.Input[str]] = None,
                 mode: Optional[pulumi.Input[str]] = None,
                 package_id: Optional[pulumi.Input[str]] = None,
                 rule_id: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering WafRule resources.
        :param pulumi.Input[str] group_id: The ID of the WAF Rule Group that contains the rule.
        :param pulumi.Input[str] mode: The mode of the rule, can be one of ["block", "challenge", "default", "disable", "simulate"] or ["on", "off"] depending on the WAF Rule type.
        :param pulumi.Input[str] package_id: The ID of the WAF Rule Package that contains the rule.
        :param pulumi.Input[str] rule_id: The WAF Rule ID.
        :param pulumi.Input[str] zone_id: The DNS zone ID to apply to.
        """
        if group_id is not None:
            pulumi.set(__self__, "group_id", group_id)
        if mode is not None:
            pulumi.set(__self__, "mode", mode)
        if package_id is not None:
            pulumi.set(__self__, "package_id", package_id)
        if rule_id is not None:
            pulumi.set(__self__, "rule_id", rule_id)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the WAF Rule Group that contains the rule.
        """
        return pulumi.get(self, "group_id")

    @group_id.setter
    def group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "group_id", value)

    @property
    @pulumi.getter
    def mode(self) -> Optional[pulumi.Input[str]]:
        """
        The mode of the rule, can be one of ["block", "challenge", "default", "disable", "simulate"] or ["on", "off"] depending on the WAF Rule type.
        """
        return pulumi.get(self, "mode")

    @mode.setter
    def mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mode", value)

    @property
    @pulumi.getter(name="packageId")
    def package_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the WAF Rule Package that contains the rule.
        """
        return pulumi.get(self, "package_id")

    @package_id.setter
    def package_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "package_id", value)

    @property
    @pulumi.getter(name="ruleId")
    def rule_id(self) -> Optional[pulumi.Input[str]]:
        """
        The WAF Rule ID.
        """
        return pulumi.get(self, "rule_id")

    @rule_id.setter
    def rule_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rule_id", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        The DNS zone ID to apply to.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


class WafRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 mode: Optional[pulumi.Input[str]] = None,
                 package_id: Optional[pulumi.Input[str]] = None,
                 rule_id: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Cloudflare WAF rule resource for a particular zone. This can be used to configure firewall behaviour for pre-defined firewall rules.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        rule100000 = cloudflare.WafRule("rule100000",
            mode="simulate",
            rule_id="100000",
            zone_id="ae36f999674d196762efcc5abb06b345")
        ```

        ## Import

        Rules can be imported using a composite ID formed of zone ID and the WAF Rule ID, e.g.

        ```sh
         $ pulumi import cloudflare:index/wafRule:WafRule 100000 ae36f999674d196762efcc5abb06b345/100000
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] mode: The mode of the rule, can be one of ["block", "challenge", "default", "disable", "simulate"] or ["on", "off"] depending on the WAF Rule type.
        :param pulumi.Input[str] package_id: The ID of the WAF Rule Package that contains the rule.
        :param pulumi.Input[str] rule_id: The WAF Rule ID.
        :param pulumi.Input[str] zone_id: The DNS zone ID to apply to.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: WafRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloudflare WAF rule resource for a particular zone. This can be used to configure firewall behaviour for pre-defined firewall rules.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        rule100000 = cloudflare.WafRule("rule100000",
            mode="simulate",
            rule_id="100000",
            zone_id="ae36f999674d196762efcc5abb06b345")
        ```

        ## Import

        Rules can be imported using a composite ID formed of zone ID and the WAF Rule ID, e.g.

        ```sh
         $ pulumi import cloudflare:index/wafRule:WafRule 100000 ae36f999674d196762efcc5abb06b345/100000
        ```

        :param str resource_name: The name of the resource.
        :param WafRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(WafRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 mode: Optional[pulumi.Input[str]] = None,
                 package_id: Optional[pulumi.Input[str]] = None,
                 rule_id: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = WafRuleArgs.__new__(WafRuleArgs)

            if mode is None and not opts.urn:
                raise TypeError("Missing required property 'mode'")
            __props__.__dict__["mode"] = mode
            __props__.__dict__["package_id"] = package_id
            if rule_id is None and not opts.urn:
                raise TypeError("Missing required property 'rule_id'")
            __props__.__dict__["rule_id"] = rule_id
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__.__dict__["zone_id"] = zone_id
            __props__.__dict__["group_id"] = None
        super(WafRule, __self__).__init__(
            'cloudflare:index/wafRule:WafRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            group_id: Optional[pulumi.Input[str]] = None,
            mode: Optional[pulumi.Input[str]] = None,
            package_id: Optional[pulumi.Input[str]] = None,
            rule_id: Optional[pulumi.Input[str]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'WafRule':
        """
        Get an existing WafRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] group_id: The ID of the WAF Rule Group that contains the rule.
        :param pulumi.Input[str] mode: The mode of the rule, can be one of ["block", "challenge", "default", "disable", "simulate"] or ["on", "off"] depending on the WAF Rule type.
        :param pulumi.Input[str] package_id: The ID of the WAF Rule Package that contains the rule.
        :param pulumi.Input[str] rule_id: The WAF Rule ID.
        :param pulumi.Input[str] zone_id: The DNS zone ID to apply to.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _WafRuleState.__new__(_WafRuleState)

        __props__.__dict__["group_id"] = group_id
        __props__.__dict__["mode"] = mode
        __props__.__dict__["package_id"] = package_id
        __props__.__dict__["rule_id"] = rule_id
        __props__.__dict__["zone_id"] = zone_id
        return WafRule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> pulumi.Output[str]:
        """
        The ID of the WAF Rule Group that contains the rule.
        """
        return pulumi.get(self, "group_id")

    @property
    @pulumi.getter
    def mode(self) -> pulumi.Output[str]:
        """
        The mode of the rule, can be one of ["block", "challenge", "default", "disable", "simulate"] or ["on", "off"] depending on the WAF Rule type.
        """
        return pulumi.get(self, "mode")

    @property
    @pulumi.getter(name="packageId")
    def package_id(self) -> pulumi.Output[str]:
        """
        The ID of the WAF Rule Package that contains the rule.
        """
        return pulumi.get(self, "package_id")

    @property
    @pulumi.getter(name="ruleId")
    def rule_id(self) -> pulumi.Output[str]:
        """
        The WAF Rule ID.
        """
        return pulumi.get(self, "rule_id")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The DNS zone ID to apply to.
        """
        return pulumi.get(self, "zone_id")

