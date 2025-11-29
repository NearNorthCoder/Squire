================================================================================
                    SQUIRE LAUNCHER WITH NETWORK LOGGING
================================================================================

This distribution includes Squire Launcher with comprehensive network logging
enabled. All HTTP requests and responses will be logged in clear text to help
you understand the network traffic.

REQUIREMENTS:
-------------
- Windows 10/11 (64-bit)
- Java 11 or higher (Download from: https://adoptium.net/)

FILES INCLUDED:
---------------
- squire-with-logging.jar  : The main launcher with network logging
- run-squire.bat           : Standard launcher script
- run-squire-debug.bat     : Debug mode with SSL handshake logging
- README.txt               : This file

HOW TO USE:
-----------
1. Make sure Java 11+ is installed and in your PATH
2. Double-click "run-squire.bat" to start the launcher
3. Network logs will be saved to: %USERPROFILE%\.squire\logs\

LOG FILE LOCATION:
------------------
All network traffic is logged to:
  C:\Users\<YourUsername>\.squire\logs\network_YYYY-MM-DD.log

Each log entry shows:
  - Request timestamp and ID
  - HTTP method and URL
  - All request headers (including auth tokens, cookies)
  - Request body (JSON formatted)
  - Response status and timing
  - All response headers
  - Response body (JSON formatted)

NETWORK ENDPOINTS MONITORED:
----------------------------
The launcher communicates with these services:

1. AWS Lambda Functions (EU-West-1):
   - Bootstrap modes retrieval
   - Authentication
   - License validation

2. API Gateway:
   - https://g0dp8zyku3.execute-api.eu-west-1.amazonaws.com/default/GetBootloadJars

3. S3 Bucket (public):
   - Bootstrap configuration files

4. GitHub:
   - Version checking
   - Update downloads

TROUBLESHOOTING:
----------------
If the launcher doesn't start:
1. Check that Java is installed: Open CMD and type "java -version"
2. Make sure you have Java 11 or higher
3. Try running "run-squire-debug.bat" for more verbose output

If network logging isn't working:
1. Check the logs directory exists: %USERPROFILE%\.squire\logs\
2. Make sure you have write permissions to that folder
3. The log file is created when the first HTTP request is made

SUPPORT:
--------
For issues, check the GitHub repository or contact the developer.

================================================================================
                         NETWORK LOGGING IS ENABLED
        All HTTP traffic will be captured and logged in clear text
================================================================================
