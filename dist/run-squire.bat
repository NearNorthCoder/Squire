@echo off
REM ============================================================================
REM Squire Launcher with Network Logging
REM ============================================================================
REM This script launches Squire with full network traffic logging enabled.
REM All HTTP requests and responses will be logged to:
REM   %USERPROFILE%\.squire\logs\network_YYYY-MM-DD.log
REM ============================================================================

title Squire with Network Logging

echo.
echo ============================================================================
echo              SQUIRE LAUNCHER WITH NETWORK LOGGING
echo ============================================================================
echo.

REM Check if Java is installed
where java >nul 2>&1
if %ERRORLEVEL% neq 0 (
    echo ERROR: Java is not installed or not in PATH
    echo Please install Java 11 or higher from: https://adoptium.net/
    pause
    exit /b 1
)

REM Display Java version
echo Using Java:
java -version 2>&1 | findstr /i "version"
echo.

REM Create logs directory
if not exist "%USERPROFILE%\.squire\logs" mkdir "%USERPROFILE%\.squire\logs"

echo Network logs will be saved to: %USERPROFILE%\.squire\logs\
echo.
echo Starting Squire...
echo.

REM Run the JAR with network logging
java -jar squire-with-logging.jar %*

echo.
echo ============================================================================
echo Session ended. Check logs at: %USERPROFILE%\.squire\logs\
echo ============================================================================
pause
