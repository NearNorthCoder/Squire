#!/usr/bin/env python3
"""
Call the Squire GetBootloadJars API directly to get signed S3 URLs.
Uses the captured authentication key.
"""

import requests
import json
import sys
from datetime import datetime

# API endpoints discovered from S3Utils
GET_BOOTLOAD_JARS_URL = "https://g0dp8zyku3.execute-api.eu-west-1.amazonaws.com/default/GetBootloadJars"
LAMBDA_URL = "https://jyb5ino5ucg4ylf6dhj7xp6lpe0fvycm.lambda-url.eu-west-1.on.aws/"

# Your authentication key (captured from Squire)
AUTH_KEY = "e8b14f67-32f3-4ea4-b172-d258b85ad29e"

def call_get_bootload_jars(auth_key):
    """Call the GetBootloadJars API to get signed S3 URLs."""
    print(f"\n{'='*70}")
    print(f"Calling GetBootloadJars API")
    print(f"{'='*70}")
    print(f"URL: {GET_BOOTLOAD_JARS_URL}")
    print(f"Auth Key: {auth_key}")
    print(f"{'='*70}\n")

    headers = {
        "x-authentication-key": auth_key,
        "x-hardware-id": "launcher_id",
        "Accept": "application/json"
    }

    try:
        response = requests.get(GET_BOOTLOAD_JARS_URL, headers=headers, timeout=30)

        print(f"Status Code: {response.status_code}")
        print(f"Response Headers: {dict(response.headers)}\n")

        if response.status_code == 200:
            data = response.json()
            print(f"SUCCESS! Got {len(data) if isinstance(data, list) else 'unknown'} items\n")

            # Save to file
            timestamp = datetime.now().strftime("%Y%m%d_%H%M%S")
            filename = f"api_response_{timestamp}.json"
            with open(filename, 'w') as f:
                json.dump(data, f, indent=2)
            print(f"Saved to: {filename}\n")

            # Print preview
            print("Response preview:")
            print("-" * 70)
            preview = json.dumps(data, indent=2)
            if len(preview) > 3000:
                print(preview[:3000] + "\n... (truncated)")
            else:
                print(preview)
            print("-" * 70)

            return data
        else:
            print(f"ERROR: {response.status_code}")
            print(f"Response: {response.text}")
            return None

    except Exception as e:
        print(f"Exception: {e}")
        return None

def call_lambda_modes(auth_key):
    """Call the Lambda URL to get bootstrap modes."""
    print(f"\n{'='*70}")
    print(f"Calling Lambda Modes API")
    print(f"{'='*70}")
    print(f"URL: {LAMBDA_URL}")
    print(f"{'='*70}\n")

    headers = {
        "auth": auth_key
    }

    try:
        response = requests.get(LAMBDA_URL, headers=headers, timeout=30)

        print(f"Status Code: {response.status_code}")

        if response.status_code == 200:
            data = response.json()
            print(f"SUCCESS!")
            print(f"Response: {json.dumps(data, indent=2)}")
            return data
        else:
            print(f"ERROR: {response.status_code}")
            print(f"Response: {response.text}")
            return None

    except Exception as e:
        print(f"Exception: {e}")
        return None

if __name__ == "__main__":
    # Allow overriding auth key from command line
    auth = sys.argv[1] if len(sys.argv) > 1 else AUTH_KEY

    print("\n" + "="*70)
    print("SQUIRE API CALLER")
    print("="*70)
    print(f"Using auth key: {auth}")
    print("="*70 + "\n")

    # First try the main GetBootloadJars API
    result = call_get_bootload_jars(auth)

    if result:
        # Extract and list any S3 URLs
        print("\n" + "="*70)
        print("EXTRACTING S3 URLs")
        print("="*70 + "\n")

        urls = []
        if isinstance(result, list):
            for item in result:
                if isinstance(item, dict):
                    for key, value in item.items():
                        if isinstance(value, str) and 's3.amazonaws.com' in value:
                            urls.append(value)
                            print(f"Found URL: {value[:100]}...")

        if urls:
            print(f"\nTotal S3 URLs found: {len(urls)}")

            # Save URLs to file
            with open("s3_urls.txt", 'w') as f:
                for url in urls:
                    f.write(url + "\n")
            print("Saved to: s3_urls.txt")
        else:
            print("No S3 URLs found in response - check api_response_*.json for raw data")

    # Also try the modes API
    print("\n")
    call_lambda_modes(auth)
