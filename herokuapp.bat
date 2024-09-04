@echo off
REM Define the properties file and the key to extract (e.g., tag)
set PROPERTIES_FILE="config.properties"
set TAG_KEY="test.tag"

REM Read the properties file and find the line containing the tag key
for /f "tokens=1,2 delims==" %%a in ('findstr /r /c:"%TAG_KEY%=" %PROPERTIES_FILE%') do (
    set TAG=%%b
)

REM Check if the TAG variable was set
if "%TAG%"=="" (
    echo Tag not found in %PROPERTIES_FILE%
    exit /b 1
)

REM Print the extracted tag for verification
echo Running scenarios with tag: %TAG%

REM Run the test automation command with the extracted tag (Cucumber example)
REM Adjust this command based on your automation tool
java -cp "path\to\your\project" io.cucumber.core.cli.Main -t "%TAG%"

REM Pause the script so the output remains visible
pause
