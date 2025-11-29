@echo off
REM Build Script for Squire Local Launcher (Windows)
REM This builds everything needed to run Squire locally without authentication

echo ==============================================
echo   SQUIRE LOCAL LAUNCHER - BUILD ALL
echo ==============================================
echo.

REM Step 1: Prepare local plugins
echo [Step 1/2] Preparing local plugins...
python prepare_local_plugins.py --source ..\downloads --output local_plugins --clean
if %ERRORLEVEL% neq 0 (
    echo [ERROR] Failed to prepare plugins
    pause
    exit /b 1
)

REM Step 2: Build local launcher JAR
echo.
echo [Step 2/2] Building local launcher...
python build_local_launcher.py --input ..\dist\squire-with-logging.jar --output ..\dist\squire-local.jar --clean
if %ERRORLEVEL% neq 0 (
    echo [ERROR] Failed to build launcher
    pause
    exit /b 1
)

echo.
echo ==============================================
echo   BUILD COMPLETE!
echo ==============================================
echo.
echo To run Squire locally:
echo   cd ..\dist
echo   java -jar squire-local.jar --plugins-dir ..\local_launcher\local_plugins
echo.
pause
