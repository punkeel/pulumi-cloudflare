# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetApiTokenPermissionGroupsResult',
    'AwaitableGetApiTokenPermissionGroupsResult',
    'get_api_token_permission_groups',
]

@pulumi.output_type
class GetApiTokenPermissionGroupsResult:
    """
    A collection of values returned by getApiTokenPermissionGroups.
    """
    def __init__(__self__, account=None, id=None, permissions=None, user=None, zone=None):
        if account and not isinstance(account, dict):
            raise TypeError("Expected argument 'account' to be a dict")
        pulumi.set(__self__, "account", account)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if permissions and not isinstance(permissions, dict):
            raise TypeError("Expected argument 'permissions' to be a dict")
        if permissions is not None:
            warnings.warn("""Use specific account, zone or user attributes instead.""", DeprecationWarning)
            pulumi.log.warn("""permissions is deprecated: Use specific account, zone or user attributes instead.""")

        pulumi.set(__self__, "permissions", permissions)
        if user and not isinstance(user, dict):
            raise TypeError("Expected argument 'user' to be a dict")
        pulumi.set(__self__, "user", user)
        if zone and not isinstance(zone, dict):
            raise TypeError("Expected argument 'zone' to be a dict")
        pulumi.set(__self__, "zone", zone)

    @property
    @pulumi.getter
    def account(self) -> Mapping[str, Any]:
        """
        Map of permissions for account level resources.
        """
        return pulumi.get(self, "account")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def permissions(self) -> Mapping[str, Any]:
        """
        Map of all permissions available. Should not be used as some permissions will overlap resource scope. Instead, use resource level specific attributes.
        """
        return pulumi.get(self, "permissions")

    @property
    @pulumi.getter
    def user(self) -> Mapping[str, Any]:
        """
        Map of permissions for user level resources.
        """
        return pulumi.get(self, "user")

    @property
    @pulumi.getter
    def zone(self) -> Mapping[str, Any]:
        """
        Map of permissions for zone level resources.
        """
        return pulumi.get(self, "zone")


class AwaitableGetApiTokenPermissionGroupsResult(GetApiTokenPermissionGroupsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetApiTokenPermissionGroupsResult(
            account=self.account,
            id=self.id,
            permissions=self.permissions,
            user=self.user,
            zone=self.zone)


def get_api_token_permission_groups(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetApiTokenPermissionGroupsResult:
    """
    Use this data source to look up [API Token Permission Groups](https://developers.cloudflare.com/api/tokens/create/permissions).
    Commonly used as references within [`cloudflare_token`](https://www.terraform.io/docs/providers/cloudflare/r/api_token.html) resources.
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getApiTokenPermissionGroups:getApiTokenPermissionGroups', __args__, opts=opts, typ=GetApiTokenPermissionGroupsResult).value

    return AwaitableGetApiTokenPermissionGroupsResult(
        account=__ret__.account,
        id=__ret__.id,
        permissions=__ret__.permissions,
        user=__ret__.user,
        zone=__ret__.zone)
