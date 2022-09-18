# Kotlin Paper Plugin Template

This is starter template for developing [Paper](https://papermc.io/) plugins in Kotlin language.

## Cloning Template

Be sure to use this template as follows:
1. Clone the repository;
2. Rename the plugin group name in [build.gradle](build.gradle) and main class in [plugin.yml](src/main/resources/plugin.yml);
3. Rename the direstory structure in [src/main/java](src/main/java) according to your changes;
4. Do not forget to change package name in [KotlinPlugin.kt](src/main/java/com/groupname/kotlinplugin/KotlinPlugin.kt);
5. That's all!

## Building Plugin

To build plugin, use `./gradlew shadowJar` command in project root.
