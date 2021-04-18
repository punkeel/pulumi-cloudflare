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
    'GetZonesResult',
    'AwaitableGetZonesResult',
    'get_zones',
]

@pulumi.output_type
class GetZonesResult:
    """
    A collection of values returned by getZones.
    """
    def __init__(__self__, filter=None, id=None, zones=None):
        if filter and not isinstance(filter, dict):
            raise TypeError("Expected argument 'filter' to be a dict")
        pulumi.set(__self__, "filter", filter)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if zones and not isinstance(zones, list):
            raise TypeError("Expected argument 'zones' to be a list")
        pulumi.set(__self__, "zones", zones)

    @property
    @pulumi.getter
    def filter(self) -> 'outputs.GetZonesFilterResult':
        return pulumi.get(self, "filter")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def zones(self) -> Sequence['outputs.GetZonesZoneResult']:
        """
        A list of zone objects. Object format:
        """
        return pulumi.get(self, "zones")


class AwaitableGetZonesResult(GetZonesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetZonesResult(
            filter=self.filter,
            id=self.id,
            zones=self.zones)


def get_zones(filter: Optional[pulumi.InputType['GetZonesFilterArgs']] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetZonesResult:
    """
    Use this data source to look up [Zone](https://api.cloudflare.com/#zone-properties) records.

    ## Example Usage

    Given you have the following zones in Cloudflare.

    - example.com
    - example.net
    - not-example.com

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example = cloudflare.get_zones(filter=cloudflare.GetZonesFilterArgs(
        name="example.com",
    ))
    ```

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example = cloudflare.get_zones(filter=cloudflare.GetZonesFilterArgs(
        lookup_type="contains",
        name="example",
    ))
    ```

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example = cloudflare.get_zones(filter=cloudflare.GetZonesFilterArgs(
        lookup_type="contains",
        match="^not-",
        name="example",
    ))
    ```


    :param pulumi.InputType['GetZonesFilterArgs'] filter: One or more values used to look up zone records. If more than one value is given all
           values must match in order to be included, see below for full list.
    """
    __args__ = dict()
    __args__['filter'] = filter
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getZones:getZones', __args__, opts=opts, typ=GetZonesResult).value

    return AwaitableGetZonesResult(
        filter=__ret__.filter,
        id=__ret__.id,
        zones=__ret__.zones)
