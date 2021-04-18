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

__all__ = [
    'GetWafRulesResult',
    'AwaitableGetWafRulesResult',
    'get_waf_rules',
]

@pulumi.output_type
class GetWafRulesResult:
    """
    A collection of values returned by getWafRules.
    """
    def __init__(__self__, filter=None, id=None, package_id=None, rules=None, zone_id=None):
        if filter and not isinstance(filter, dict):
            raise TypeError("Expected argument 'filter' to be a dict")
        pulumi.set(__self__, "filter", filter)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if package_id and not isinstance(package_id, str):
            raise TypeError("Expected argument 'package_id' to be a str")
        pulumi.set(__self__, "package_id", package_id)
        if rules and not isinstance(rules, list):
            raise TypeError("Expected argument 'rules' to be a list")
        pulumi.set(__self__, "rules", rules)
        if zone_id and not isinstance(zone_id, str):
            raise TypeError("Expected argument 'zone_id' to be a str")
        pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter
    def filter(self) -> Optional['outputs.GetWafRulesFilterResult']:
        return pulumi.get(self, "filter")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="packageId")
    def package_id(self) -> Optional[str]:
        """
        The ID of the WAF Rule Package that contains the WAF Rule
        """
        return pulumi.get(self, "package_id")

    @property
    @pulumi.getter
    def rules(self) -> Sequence['outputs.GetWafRulesRuleResult']:
        """
        A map of WAF Rules details. Full list below:
        """
        return pulumi.get(self, "rules")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> str:
        return pulumi.get(self, "zone_id")


class AwaitableGetWafRulesResult(GetWafRulesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetWafRulesResult(
            filter=self.filter,
            id=self.id,
            package_id=self.package_id,
            rules=self.rules,
            zone_id=self.zone_id)


def get_waf_rules(filter: Optional[pulumi.InputType['GetWafRulesFilterArgs']] = None,
                  package_id: Optional[str] = None,
                  zone_id: Optional[str] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetWafRulesResult:
    """
    Use this data source to look up [WAF Rules](https://api.cloudflare.com/#waf-rule-groups-properties).

    ## Example Usage

    The example below matches all WAF Rules that are in the group of ID `de677e5818985db1285d0e80225f06e5`, contain `example` in their description, and are currently `on`. The matched WAF Rules are then returned as output.

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    test = cloudflare.get_waf_rules(zone_id="ae36f999674d196762efcc5abb06b345",
        package_id="a25a9a7e9c00afc1fb2e0245519d725b",
        filter=cloudflare.GetWafRulesFilterArgs(
            description=".*example.*",
            mode="on",
            group_id="de677e5818985db1285d0e80225f06e5",
        ))
    pulumi.export("wafRules", test.rules)
    ```


    :param pulumi.InputType['GetWafRulesFilterArgs'] filter: One or more values used to look up WAF Rules. If more than one value is given all
           values must match in order to be included, see below for full list.
    :param str package_id: The ID of the WAF Rule Package in which to search for the WAF Rules.
    :param str zone_id: The ID of the DNS zone in which to search for the WAF Rules.
    """
    __args__ = dict()
    __args__['filter'] = filter
    __args__['packageId'] = package_id
    __args__['zoneId'] = zone_id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getWafRules:getWafRules', __args__, opts=opts, typ=GetWafRulesResult).value

    return AwaitableGetWafRulesResult(
        filter=__ret__.filter,
        id=__ret__.id,
        package_id=__ret__.package_id,
        rules=__ret__.rules,
        zone_id=__ret__.zone_id)
