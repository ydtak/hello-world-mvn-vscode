# Hello World VSCode Maven Project

## Overview

This is an example Maven project to run and test a hello world Java program on VSCode. See [Extensions](#extensions) for enabling Java autocomplete in VSCode.

## Maven

We'll use Maven to compile and execute this project. Use the following command to compile and run the main Java program.

```bash
mvn exec:java -Dexec.mainClass="com.example.HelloWorld"
```

Maven commands:

* `mvn clean` will clean the `mvn-compile-target` directory containing compiled artifacts
* `mvn compile` will compile the source code
* `mvn test-compile` will compile the test code (after compiling the source code)
* `mvn test` will compile and run tests in the `javatests` directory
* `mvn exec:java -Dexec.mainClass="package.MainClass"` will compile and execute the main function located in `package.MainClass`

## Extensions

Useful extensions for VSCode in the Extensions Marketplace to enable autocomplete, linting, and more by extension ID:

* redhat.java
* vscjava.vscode-maven
* vscjava.vscode-java-pack
* vscjava.vscode-java-dependency
* vscjava.vscode-java-debug
* vscjava.vscode-java-test
* lcjuves.vscode-gjf
* VisualStudioExptTeam.vscodeintellicode
* VisualStudioExptTeam.intellicode-api-usage-examples
* redhat.vscode-xml

Example VSCode user settings (`settings.json`) - open using `Ctrl + Shift + P` > `Preferences: Open User Settings (JSON)`:

```json
{
    "liveshare.launcherClient": "web",
    "security.workspace.trust.startupPrompt": "always",
    "security.workspace.trust.banner": "always",
    "java.configuration.updateBuildConfiguration": "automatic",
    "files.autoSave": "off",
    "editor.tabSize": 2,
    "editor.insertSpaces": true,
    "vscode-gjf.execJarPath": "</path/to/google-java-format.jar>",
    "[java]": {
        "editor.defaultFormatter": "lcjuves.vscode-gjf"
    },
}
```

### Google Format Java

Recommend using the [Google Java Formatter](https://marketplace.visualstudio.com/items?itemName=lcjuves.vscode-gjf) extension to format Java code.

To use this extension, download the latest release (e.g. `google-java-format-1.17.0-all-deps.jar
`) from the [google-java-format repo](https://github.com/google/google-java-format).

Make the `jar` file executable using `sudo chmod guo+x <path/to/google-java-format.jar>`.

Finally, update the `vscode-gjf.execJarPath` setting to point to the executable `jar` file in VSCode user settings (`settings.json`).

Now, we can use the Google Java Formatter by calling `Format Document` (`Ctrl + Shift + P` > `Format Document`) in any Java files on VSCode.
