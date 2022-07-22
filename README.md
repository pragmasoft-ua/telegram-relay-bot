# Telegram relay bot

## Telegram relay bot can be used for telegram and livechat support

This bot depends on tdlib native library from telegram

Before running this project, you need to download and build tdlib for your platform as explained here

https://core.telegram.org/tdlib/getting-started

Make sure you configure tdlib build with JNI option.

Then, you need to provide path to the built tdlib shared libraries and dependencies as `java.library.path` value

Example: `java -Djava.library.path=C:/Users/zemni/Projects/td/tdlib/bin -jar target/telegram-relay-bot.jar @.args`

### Build

`./mvnw package`

### Test

`./mvnw test`

### Run

`./mvnw exec:java`

## Formatting

This project uses automatic validation of source formatting rules. Format validation is performed automatically during validation phase, that is, first phase of maven build lifecycle, so any of the commands below also performs validation.

To skip format validation, use formatter.skip system property, for example

`./mvnw -Dformatter.skip validate`

To automatically reformat all sources according to rules, you can use following command

`./mvnw formatter:format`

You can also use formatter configuration `${project.basedir}/eclipse-java-google-style.xml` to set up formatting rules in your IDE.

These rules are in the format native to Eclipse formatter, so in other IDEs like IDEA, you will need
special [plugin](https://plugins.jetbrains.com/plugin/6546-eclipse-code-formatter) installed to be able to use this configuration.

You can also copy or symlink a pre-commit git hook from `src/main/git/hooks` to `.git/hooks`, which will automatically validate formatting rules
before git commits.

Alternatively, you may wish to edit hook to automatically reformat `./mvnw formatter:format` code, instead of validation

## Checkstyle static analysis

To skip static analysis, use this option:

`./mvnw -Dcheckstyle.skip package`

## TODO

- +PicoCli
- add graalvm native build
- convert to JPMS module
- add docker build and config
- ctrl+break signal handler
- CompletableFuture
- Change AppId
- add lettuce and KeyDB as an event bus
- ddd domain
- probably use guava local event bus?
