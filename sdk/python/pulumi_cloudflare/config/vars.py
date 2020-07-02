# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

__config__ = pulumi.Config('cloudflare')

account_id = __config__.get('accountId') or utilities.get_env('CLOUDFLARE_ACCOUNT_ID')
"""
Configure API client to always use that account.
"""

api_client_logging = __config__.get('apiClientLogging') or (utilities.get_env_bool('CLOUDFLARE_API_CLIENT_LOGGING') or False)
"""
Whether to print logs from the API client (using the default log library logger)
"""

api_key = __config__.get('apiKey') or utilities.get_env('CLOUDFLARE_API_KEY')
"""
The API key for operations.
"""

api_token = __config__.get('apiToken') or utilities.get_env('CLOUDFLARE_API_TOKEN')
"""
The API Token for operations.
"""

api_user_service_key = __config__.get('apiUserServiceKey') or utilities.get_env('CLOUDFLARE_API_USER_SERVICE_KEY')
"""
A special Cloudflare API key good for a restricted set of endpoints.
"""

email = __config__.get('email') or utilities.get_env('CLOUDFLARE_EMAIL')
"""
A registered Cloudflare email address.
"""

max_backoff = __config__.get('maxBackoff') or (utilities.get_env_int('CLOUDFLARE_MAX_BACKOFF') or 30)
"""
Maximum backoff period in seconds after failed API calls
"""

min_backoff = __config__.get('minBackoff') or (utilities.get_env_int('CLOUDFLARE_MIN_BACKOFF') or 1)
"""
Minimum backoff period in seconds after failed API calls
"""

retries = __config__.get('retries') or (utilities.get_env_int('CLOUDFLARE_RETRIES') or 3)
"""
Maximum number of retries to perform when an API request fails
"""

rps = __config__.get('rps') or (utilities.get_env_int('CLOUDFLARE_RPS') or 4)
"""
RPS limit to apply when making calls to the API
"""

