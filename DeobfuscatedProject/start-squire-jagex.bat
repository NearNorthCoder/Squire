@echo off
REM ============================================================================
REM Squire Local Launcher - Jagex Account Support (Windows)
REM This script launches the deobfuscated Squire client with bypassed auth
REM and supports Jagex account import/selection
REM ============================================================================

TITLE Squire Local - Jagex Account Support

echo.
echo ============================================================
echo       SQUIRE LOCAL LAUNCHER - JAGEX ACCOUNT SUPPORT
echo ============================================================
echo.

REM Get script directory
set SCRIPT_DIR=%~dp0
set REPO_DIR=%SCRIPT_DIR%repository2
set LAUNCHER_JAR=%SCRIPT_DIR%client\deobfuscated\target\squire-launcher-local.jar
set LIB_DIR=%SCRIPT_DIR%client\deobfuscated\lib
set SQUIRE_HOME=%USERPROFILE%\.squire

REM Create squire home if needed
if not exist "%SQUIRE_HOME%" mkdir "%SQUIRE_HOME%"
if not exist "%SQUIRE_HOME%\logs" mkdir "%SQUIRE_HOME%\logs"

REM Create repository2 symlink if needed (requires admin for mklink)
if not exist "%SQUIRE_HOME%\repository2" (
    echo Creating repository2 link...
    mklink /D "%SQUIRE_HOME%\repository2" "%REPO_DIR%" 2>nul
    if errorlevel 1 (
        echo Note: Could not create symlink, copying repository instead...
        xcopy /E /I /Y "%REPO_DIR%" "%SQUIRE_HOME%\repository2" >nul
    )
)

REM Check if launcher JAR exists
if not exist "%LAUNCHER_JAR%" (
    echo ERROR: Launcher JAR not found at: %LAUNCHER_JAR%
    echo Please run build.sh first in client\deobfuscated\
    pause
    exit /b 1
)

REM Check if squire-with-logging.jar exists
if not exist "%LIB_DIR%\squire-with-logging.jar" (
    echo ERROR: squire-with-logging.jar not found in lib\
    echo Please copy from dist\squire-with-logging.jar
    pause
    exit /b 1
)

REM Check Java
where java >nul 2>&1
if %ERRORLEVEL% neq 0 (
    echo ERROR: Java not found in PATH
    echo Please install Java 11 or higher from: https://adoptium.net/
    pause
    exit /b 1
)

echo Java version:
java -version 2>&1 | findstr /i "version"
echo.

REM Build classpath
set CP=%LAUNCHER_JAR%
set CP=%CP%;%REPO_DIR%\slf4j-api-1.7.32.jar
set CP=%CP%;%REPO_DIR%\logback-classic-1.2.9.jar
set CP=%CP%;%REPO_DIR%\logback-core-1.2.9.jar
set CP=%CP%;%REPO_DIR%\guava-30.1.1-jre.jar
set CP=%CP%;%REPO_DIR%\okhttp-4.10.0.jar
set CP=%CP%;%REPO_DIR%\gson-2.8.5.jar
set CP=%CP%;%REPO_DIR%\okio-jvm-3.0.0.jar
set CP=%CP%;%REPO_DIR%\kotlin-stdlib-1.6.21.jar
set CP=%CP%;%REPO_DIR%\kotlin-stdlib-common-1.6.21.jar
REM Include original Squire launcher for AccountImporter
set CP=%CP%;%LIB_DIR%\squire-with-logging.jar

REM JVM arguments
set JVM_ARGS=-Xmx4G -Xss2m -XX:CompileThreshold=1500
set JVM_ARGS=%JVM_ARGS% -Drunelite.insecure-skip-tls-verification=true
set JVM_ARGS=%JVM_ARGS% -Drunelite.launcher.nojvm=true
REM Java 17+ module access
set JVM_ARGS=%JVM_ARGS% --add-opens=java.base/java.lang=ALL-UNNAMED
set JVM_ARGS=%JVM_ARGS% --add-opens=java.base/java.lang.reflect=ALL-UNNAMED
set JVM_ARGS=%JVM_ARGS% --add-opens=java.base/java.util=ALL-UNNAMED
set JVM_ARGS=%JVM_ARGS% --add-opens=java.base/java.net=ALL-UNNAMED
set JVM_ARGS=%JVM_ARGS% --add-opens=java.base/java.io=ALL-UNNAMED
set JVM_ARGS=%JVM_ARGS% --add-opens=java.desktop/java.awt=ALL-UNNAMED
set JVM_ARGS=%JVM_ARGS% --add-opens=java.desktop/sun.awt=ALL-UNNAMED

echo Squire Home: %SQUIRE_HOME%
echo Repository:  %REPO_DIR%
echo Launcher:    %LAUNCHER_JAR%
echo.

REM Check for saved accounts
if exist "%SQUIRE_HOME%\launcher.dat" (
    echo Saved accounts found in launcher.dat
) else (
    echo No saved accounts. Use --import-accounts to add some.
)
echo.

REM Show help if requested
if "%1"=="--help" goto :help
if "%1"=="-h" goto :help
goto :run

:help
echo Usage: %~nx0 [OPTION]
echo.
echo Options:
echo   --import-accounts     Import Jagex accounts via OAuth2 browser flow
echo   --list-accounts       List all saved Jagex accounts
echo   --jagexlauncher       Show account selection dialog then launch
echo   --account ^<name^>      Launch with specific account
echo   --help                Show this help message
echo.
echo Examples:
echo   %~nx0 --import-accounts       Import accounts first
echo   %~nx0 --list-accounts         See what accounts you have
echo   %~nx0 --jagexlauncher         Select account and launch
echo   %~nx0 --account MyPlayer      Launch directly with account
echo.
echo Account data stored in: %SQUIRE_HOME%\launcher.dat
pause
exit /b 0

:run
echo ============================================================
echo Starting Squire Launcher...
echo ============================================================
echo.

REM Run the launcher
java %JVM_ARGS% -cp "%CP%" squire.launcher.SquireLauncher --local-repo "%REPO_DIR%" %*

echo.
echo ============================================================
echo Session ended.
echo ============================================================
pause
