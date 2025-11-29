@echo off
REM ============================================================================
REM Squire Launcher with Network Logging - DEBUG MODE
REM ============================================================================
REM This script launches Squire with verbose debug output and network logging.
REM ============================================================================

title Squire with Network Logging (DEBUG)

echo.
echo ============================================================================
echo         SQUIRE LAUNCHER WITH NETWORK LOGGING - DEBUG MODE
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
java -version 2>&1
echo.

REM Create logs directory
if not exist "%USERPROFILE%\.squire\logs" mkdir "%USERPROFILE%\.squire\logs"

echo Network logs will be saved to: %USERPROFILE%\.squire\logs\
echo.
echo Starting Squire in DEBUG mode...
echo.

REM Run with additional debug flags
java -Xmx512m -XX:+HeapDumpOnOutOfMemoryError -Djavax.net.debug=ssl,handshake -jar squire-with-logging.jar %*

echo.
echo ============================================================================
echo Session ended. Check logs at: %USERPROFILE%\.squire\logs\
echo ============================================================================
pause
